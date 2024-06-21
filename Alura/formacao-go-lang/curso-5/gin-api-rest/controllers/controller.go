package controllers

import (
	"net/http"

	"github.com/gin-gonic/gin"
	"github.com/matheuspsantos/api-go-gin/db"
	"github.com/matheuspsantos/api-go-gin/models"
)

func ListAllAlumns(c *gin.Context) {
	var alunos []models.Aluno
	db.DB.Find(&alunos)
	c.JSON(200, alunos)
}

func Create(c *gin.Context) {
	var aluno models.Aluno

	if err := c.ShouldBindJSON(&aluno); err != nil {
		c.JSON(http.StatusBadRequest, gin.H{
			"error": err.Error()})
		return
	}

	db.DB.Create(&aluno)
	c.JSON(http.StatusOK, aluno)
}

func Find(c *gin.Context) {
	var aluno models.Aluno
	id := c.Params.ByName("id")
	db.DB.First(&aluno, id)
	if aluno.ID == 0 {
		c.JSON(http.StatusNotFound, gin.H{
			"Not Found": "Alumn not found"})
		return
	}
	c.JSON(http.StatusOK, aluno)
}

func Delete(c *gin.Context) {
	var aluno models.Aluno
	id := c.Params.ByName("id")
	db.DB.Delete(&aluno, id)
	c.JSON(http.StatusOK, gin.H{
		"data": "Alumn deleted successfully"})
}

func Edit(c *gin.Context) {
	var aluno models.Aluno
	id := c.Params.ByName("id")
	db.DB.First(&aluno, id)
	if err := c.ShouldBindJSON(&aluno); err != nil {
		c.JSON(http.StatusBadRequest, gin.H{
			"Bad Request": err.Error()})
		return
	}
	db.DB.Model(&aluno).UpdateColumns(aluno)
	c.JSON(http.StatusOK, aluno)
}

func FindByCpf(c *gin.Context) {
	var aluno models.Aluno
	cpf := c.Params.ByName("cpf")
	db.DB.Where(&models.Aluno{CPF: cpf}).First(&aluno)
	if aluno.ID == 0 {
		c.JSON(http.StatusNotFound, gin.H{
			"Not Found": "Alumn not found"})
		return
	}
	c.JSON(http.StatusOK, aluno)
}
