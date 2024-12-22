package main

import "fmt"

func main() {
	blue := [3]int{6, 9, 3}
	red := blue

	fmt.Printf("%v\n", red)
	fmt.Printf("%v\n", blue)

	red[0] = 10
	fmt.Printf("blue: %v\n", blue)
	fmt.Printf("red: %v\n", red)
}
