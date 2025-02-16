package handlers

import (
	"net/http"

	"github.com/matheuspsantos/notes/go/building-microservices-with-go/product-api/data"
)

// AddProduct insert a new product in the data store
func (p *Products) AddProduct(rw http.ResponseWriter, r *http.Request) {
	p.l.Print("Handle POST product")
	prod := data.Product{}
	prod = r.Context().Value(KeyProduct{}).(data.Product)
	p.l.Printf("Product: %#v", prod)
	data.AddProduct(&prod)
}
