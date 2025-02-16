package handlers

import (
	"net/http"
	"strconv"

	"github.com/gorilla/mux"
	"github.com/matheuspsantos/notes/go/building-microservices-with-go/product-api/data"
)

/*
*
  swagger:route	DELETE	/products/{id}	products	deleteProduct
  Returns a list of products
  responses:
    201: noContent
*/

// DeleteProduct deletes a product from data source using id
func (p *Products) DeleteProduct(rw http.ResponseWriter, r *http.Request) {
	vars := mux.Vars(r)
	id, _ := strconv.Atoi(vars["id"])
	p.l.Println("Handle DELETE Product ", id)
	err := data.DeleteProduct(id)
	if err == data.ErrProductNotFound {
		http.Error(rw, "Product not found", http.StatusNotFound)
		return
	}
	if err != nil {
		http.Error(rw, "Product not found", http.StatusInternalServerError)
		return
	}
}
