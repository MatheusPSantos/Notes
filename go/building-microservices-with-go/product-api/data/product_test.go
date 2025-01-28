package data

import "testing"

func TestChecksValidation(t *testing.T) {
	p := &Product{
		Name: "Test Name",
		Price: 1.1,
		SKU: "abc-def-ghj",
	}
	err := p.Validate()

	if err != nil {
		t.Fatal(err)
	}
}
