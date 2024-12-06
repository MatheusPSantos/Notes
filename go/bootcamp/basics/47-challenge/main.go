package main

import (
	"fmt"
	"time"
)

func main() {
	current := time.Now().Hour()

	switch {
	case current >= 18:
		fmt.Println("good evening")
	case current >= 12:
		fmt.Println("good afternoon")
	case current >= 6:
		fmt.Println("good morning")
	default:
		fmt.Println("good nigth")
	}

	fmt.Println(current)
}
