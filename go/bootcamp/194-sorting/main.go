package main

import (
	"fmt"
	"sort"
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
	sort.Sort(store)
	fmt.Println(store)
	sort.Reverse(store)
	fmt.Println(store)
	sort.Sort(byReleaseDate(store))
	fmt.Println(store)
}
