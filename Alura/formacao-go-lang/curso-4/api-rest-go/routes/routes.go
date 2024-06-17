package routes

import (
	"log"
	"net/http"

	"github.com/gorilla/handlers"
	"github.com/gorilla/mux"
	"github.com/matheuspsantos/go-rest-api/controllers"
	"github.com/matheuspsantos/go-rest-api/middleware"
)

func HandleRequest() {
	// using gorilla mux
	r := mux.NewRouter()
	// using middleware
	r.Use(middleware.SetHeaderContentTypeJson)
	r.HandleFunc("/", controllers.Home)
	r.HandleFunc("/api/personalities", controllers.GetAllPersonalities).Methods("GET")
	r.HandleFunc("/api/personalities/{id}", controllers.ReturnsPersonality).Methods("GET")
	r.HandleFunc("/api/personalities", controllers.CreateNewPersonality).Methods("POST")
	r.HandleFunc("/api/personalities/{id}", controllers.Delete).Methods("DELETE")
	r.HandleFunc("/api/personalities/{id}", controllers.Edit).Methods("PUT")
	// passing r form mux to server
	log.Fatal(http.ListenAndServe(
		":8080",
		handlers.CORS(handlers.AllowedOrigins([]string{"*"}))(r)))
}
