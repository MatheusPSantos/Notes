package main

import (
	"fmt"

	"github.com/matheuspsantos/go-rest-api/database"
	"github.com/matheuspsantos/go-rest-api/routes"
)

func main() {
	database.ConnectDatabase()
	fmt.Println("Server started at (8080)")
	routes.HandleRequest()
}
