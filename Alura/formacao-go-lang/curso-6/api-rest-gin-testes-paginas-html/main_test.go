package main

import (
	"bytes"
	"encoding/json"
	"fmt"
	"io/ioutil"
	"net/http"
	"net/http/httptest"
	"strconv"
	"testing"

	"github.com/gin-gonic/gin"
	"github.com/guilhermeonrails/api-go-gin/controllers"
	"github.com/guilhermeonrails/api-go-gin/database"
	"github.com/guilhermeonrails/api-go-gin/models"
	"github.com/stretchr/testify/assert"
)

var ID int
var Nome = "Test"
var CPF = "12345678901"
var RG = "123456789"

func SetUpRotasTeste() *gin.Engine {
	// gin.SetMode(gin.ReleaseMode)
	rotas := gin.Default()
	return rotas
}

func CreateMockAlumn() {
	aluno := models.Aluno{Nome: Nome, CPF: CPF, RG: RG}
	database.DB.Create(&aluno)
	ID = int(aluno.ID)
}

func DeleteAlumnMock() {
	var aluno models.Aluno
	database.DB.Delete(&aluno, ID)
}

func TestVerificaStatusCodeDaSaudacaoComParametro(t *testing.T) {
	r := SetUpRotasTeste()
	r.GET("/:nome", controllers.Saudacao)
	req, _ := http.NewRequest("GET", "/jhon", nil)
	response := httptest.NewRecorder()
	r.ServeHTTP(response, req)

	assert.Equal(t, http.StatusOK, response.Code)

	mockDaResposta := `{"API diz:":"E ai jhon, tudo beleza?"}`

	responseBody, _ := ioutil.ReadAll(response.Body)
	assert.Equal(t, mockDaResposta, string(responseBody))
}

func TestListingAllAlumns(t *testing.T) {
	database.ConectaComBancoDeDados()
	CreateMockAlumn()
	defer DeleteAlumnMock()
	r := SetUpRotasTeste()
	r.GET("/alunos", controllers.ExibeTodosAlunos)
	req, _ := http.NewRequest("GET", "/alunos", nil)
	res := httptest.NewRecorder()
	r.ServeHTTP(res, req)
	assert.Equal(t, http.StatusOK, res.Code)
	fmt.Println(res.Body)
}

func TestSearchByCPF(t *testing.T) {
	database.ConectaComBancoDeDados()
	CreateMockAlumn()
	defer DeleteAlumnMock()
	r := SetUpRotasTeste()
	r.GET("/alunos/cpf/:cpf", controllers.BuscaAlunoPorCPF)
	req, _ := http.NewRequest("GET", "/alunos/cpf/12345678901", nil)
	res := httptest.NewRecorder()
	r.ServeHTTP(res, req)
	assert.Equal(t, http.StatusOK, res.Code)
}

func TestSearchAlumnByID(t *testing.T) {
	database.ConectaComBancoDeDados()
	CreateMockAlumn()
	defer DeleteAlumnMock()
	r := SetUpRotasTeste()
	r.GET("/alunos/:id", controllers.BuscaAlunoPorID)

	path := "/alunos/" + strconv.Itoa(ID)
	req, _ := http.NewRequest("GET", path, nil)
	res := httptest.NewRecorder()

	r.ServeHTTP(res, req)

	var alumnMock models.Aluno
	json.Unmarshal(res.Body.Bytes(), &alumnMock)

	assert.Equal(t, Nome, alumnMock.Nome)
	assert.Equal(t, CPF, alumnMock.CPF)
	assert.Equal(t, RG, alumnMock.RG)
}

func TestDeleteAlumn(t *testing.T) {
	database.ConectaComBancoDeDados()
	CreateMockAlumn()

	r := SetUpRotasTeste()
	r.DELETE("/alunos/:id", controllers.DeletaAluno)
	path := "/alunos/" + strconv.Itoa(ID)
	req, _ := http.NewRequest("DELETE", path, nil)
	res := httptest.NewRecorder()

	r.ServeHTTP(res, req)

	assert.Equal(t, http.StatusOK, res.Code)
}

func TestUpdateAlumn(t *testing.T) {
	database.ConectaComBancoDeDados()
	CreateMockAlumn()
	defer DeleteAlumnMock()

	r := SetUpRotasTeste()
	r.PATCH("/alunos/:id", controllers.EditaAluno)
	path := "/alunos/" + strconv.Itoa(ID)
	alumn := models.Aluno{Nome: "Jhon Doe"}
	toJSON, _ := json.Marshal(alumn)
	req, _ := http.NewRequest("PATCH", path, bytes.NewBuffer(toJSON))
	res := httptest.NewRecorder()

	r.ServeHTTP(res, req)
	var alumnUpdated models.Aluno
	json.Unmarshal(res.Body.Bytes(), &alumnUpdated)

	assert.Equal(t, http.StatusOK, res.Code)
	assert.Equal(t, "Jhon Doe", alumnUpdated.Nome)
	assert.Equal(t, "12345678900", alumnUpdated.CPF)
	assert.Equal(t, "123456789", alumnUpdated.RG)
}
