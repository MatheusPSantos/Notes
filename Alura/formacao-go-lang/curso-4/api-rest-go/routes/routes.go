package routes

import (
	"log"
	"net/http"

	"github.com/gorilla/mux"
	"github.com/matheuspsantos/go-rest-api/controllers"
)

func HandleRequest() {
	// using gorilla mux
	r := mux.NewRouter()
	r.HandleFunc("/", controllers.Home)
	r.HandleFunc("/api/personalities", controllers.GetAllPersonalities).Methods("GET")
	r.HandleFunc("/api/personalities/{id}", controllers.ReturnsPersonality).Methods("GET")
	log.Fatal(http.ListenAndServe(":8080", r)) // passing r form mux to server
}
