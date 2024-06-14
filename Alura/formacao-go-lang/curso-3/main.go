package main

import (
	"net/http"
	"webapp/routes"
)

func main() {
	// lida com server mux
	routes.CarregaRotas()
	// subindo servidor
	http.ListenAndServe(":8000", nil)
}
