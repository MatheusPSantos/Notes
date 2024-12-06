package main

import (
	"fmt"
	"os"
)

func main() {
	city := os.Args[1]

	switch city {
	case "Paris":
		fmt.Println("France")
	case "Tokyo":
		fmt.Println("Japan")
	case "Munbai":
		fmt.Println("India")
	}

	fmt.Println("--- 42 default clause ------")
	city2 := "Limbo"

	switch city2 {
	case "Tokyo":
		fmt.Println("Japan")
	default:
		fmt.Println("Where?")
	}

	fmt.Println("--- 43. use bool expression in case conditions -----")
	var i int = 12

	switch true {
	case i > 0:
		fmt.Println("positive")
	case i < 0:
		fmt.Println("negative")
	default:
		fmt.Println("zero")
	}

	fmt.Println("----- 45. fallthrough statement ----- ")

	i2 := 142

	switch {
	case i2 > 100:
		fmt.Println("Big positive number")
	case i2 > 0:
		fmt.Println("positive number")
	default:
		fmt.Println("number")
	}

	switch {
	case i2 > 100:
		fmt.Print("Big ")
		fallthrough
	case i2 > 0:
		fmt.Print("positive ")
		fallthrough
	default:
		fmt.Print("number")
	}
	fmt.Println()

	fmt.Println("------- 46. what is short switch ------")
	switch i3 := 10; true {
	case i3 > 0:
		fmt.Println("positive")
	case i3 < 0:
		fmt.Println("negative")
	default:
		fmt.Println("zero")
	}
}
