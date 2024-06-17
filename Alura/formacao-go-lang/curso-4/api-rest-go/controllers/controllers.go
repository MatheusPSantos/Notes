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
	id := vars["id"]	// gets from route eg. api/customer/1 , then returns id = 1
	var p models.Personalidade

	database.DB.First(&p, id)
	json.NewEncoder(writer).Encode(p)
}
