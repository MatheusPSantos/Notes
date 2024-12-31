package main

import "fmt"

type huge struct {
	games [10_000_000]game
}

func (h *huge) addr() {
	fmt.Printf("%p\n", h)
}
