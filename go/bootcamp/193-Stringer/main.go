package main

import (
	"fmt"
	"strings"
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

	//store.print()
	fmt.Println(store)
	store.discount(0.5)
	//store.print()
	fmt.Println(store)
}

type list []*product

func (l list) String() string {

	if len(l) == 0 {
		return "Sorry. We are waiting for delivery."
	}

	var str strings.Builder

	for _, p := range l {
		//p.print()
		//fmt.Printf("%s\n", p)
		str.WriteString("* ")
		str.WriteString(p.String())
		str.WriteRune('\n')
	}

	return str.String()
}

func (l list) discount(ratio float64) {
	for _, p := range l {
		p.discount(ratio)
	}
}
