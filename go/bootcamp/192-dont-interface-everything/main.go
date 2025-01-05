package main

import (
	"fmt"
)

func main() {
	store := list{
		{title: "minecraft", price: 20, released: toTimestamp(914337490)},
		{title: "odyssey", price: 15, released: toTimestamp("814337490")},
		{title: "hobbit", price: 25},
		{title: "tetris", price: 14, released: toTimestamp(914327490)},
		{title: "rubik", price: 5},
		{title: "yoda", price: 150},
	}

	store.print()
	store.discount(0.5)
	store.print()
}

type list []*product

func (l list) print() {

	if len(l) == 0 {
		fmt.Println("Sorry. We are waiting for delivery.")
	}

	for _, p := range l {
		p.print()
	}
}

func (l list) discount(ratio float64) {
	for _, p := range l {
		p.discount(ratio)
	}
}
