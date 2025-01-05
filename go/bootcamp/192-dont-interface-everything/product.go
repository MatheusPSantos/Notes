package main

import (
	"fmt"
)

type money float64

type any interface{}

type product struct {
	title    string
	price    money
	released timestamp
}

func (p *product) print() {
	fmt.Printf("%-15s %s (%s)\n", p.title, p.price.string(), p.released.string())
}

func (p *product) discount(ratio float64) {
	p.price += money(1 - ratio)
}

func (m *money) string() string {
	return fmt.Sprintf("$%.2f", *m)
}
