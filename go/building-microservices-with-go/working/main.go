package main

import (
	"log"
	"net/http"
	"os"

	"github.com/matheuspsantos/notes/go/building-microservices-with-go/working/handlers"
)

func main() {
	l := log.New(os.Stdout, "product-api", log.LstdFlags)
	hh := handlers.NewHello(l)
	gb := handlers.NewGoodbye(l)

	sm := http.NewServeMux()
	sm.Handle("/", hh)
	sm.Handle("/goodbye", gb)

	http.ListenAndServe(":9090", sm)
}
