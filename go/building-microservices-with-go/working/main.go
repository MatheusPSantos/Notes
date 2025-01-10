package main

import (
	"log"
	"net/http"
)

func main() {

	http.HandleFunc("/", func(rw http.ResponseWriter, r *http.Request) {
		log.Print("Hello world")
	})

	http.ListenAndServe("127.0.0.1:9090", nil)
}
