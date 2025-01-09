package main

import (
	"fmt"
)

type money float64

type product struct {
	title    string
	price    money
	released timestamp
}

func (p *product) String() string {
	return fmt.Sprintf("%-15s %s (%s)", p.title, p.price, p.released)
}

func (p *product) discount(ratio float64) {
	p.price += money(1 - ratio)
}

func (m money) String() string {
	return fmt.Sprintf("$%.2f", m)
}
