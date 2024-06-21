package main

import (
	"github.com/matheuspsantos/api-go-gin/db"
	"github.com/matheuspsantos/api-go-gin/routes"
)

func main() {
	db.ConnectDatabase()
	routes.HandleRequests()
}
