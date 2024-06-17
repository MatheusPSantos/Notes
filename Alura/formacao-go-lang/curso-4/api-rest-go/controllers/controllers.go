package controllers

import (
	"encoding/json"
	"fmt"
	"net/http"

	"github.com/gorilla/mux"
	"github.com/matheuspsantos/go-rest-api/database"
	"github.com/matheuspsantos/go-rest-api/models"
)

func Home(writer http.ResponseWriter, request *http.Request) {
	fmt.Fprint(writer, "Home page")
}

func GetAllPersonalities(write http.ResponseWriter, request *http.Request) {
	var p []models.Personalidade
	database.DB.Find(&p)
	json.NewEncoder(write).Encode(p)
}

func ReturnsPersonality(writer http.ResponseWriter, request *http.Request) {
	vars := mux.Vars(request)
	id := vars["id"] // gets from route eg. api/customer/1 , then returns id = 1
	var p models.Personalidade

	database.DB.First(&p, id)
	json.NewEncoder(writer).Encode(p)
}

func CreateNewPersonality(writer http.ResponseWriter, req *http.Request) {
	var newPersonality models.Personalidade
	json.NewDecoder(req.Body).Decode(&newPersonality)
	database.DB.Create(&newPersonality)
	json.NewEncoder(writer).Encode(newPersonality)
}

func Delete(writer http.ResponseWriter, req *http.Request) {
	vars := mux.Vars(req)
	id := vars["id"]
	var personality models.Personalidade
	database.DB.Delete(&personality, id)
	json.NewEncoder(writer).Encode(personality)
}

func Edit(writer http.ResponseWriter, req *http.Request) {
	vars := mux.Vars(req)
	id := vars["id"]
	var personality models.Personalidade
	database.DB.First(&personality, id)
	json.NewDecoder(req.Body).Decode(&personality)
	database.DB.Save(&personality)
	json.NewEncoder(writer).Encode(personality)
}
