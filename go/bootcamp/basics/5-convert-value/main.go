package main

import "fmt"

func main() {
	fmt.Println("---- 5.Let's convert a value ----")

	speed := 100
	force := 2.5

	speed = int(float64(speed) * force)

	fmt.Println(speed)
}
