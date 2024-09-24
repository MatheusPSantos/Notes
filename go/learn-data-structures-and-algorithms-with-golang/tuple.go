package main

import "fmt"

func main() {
	var square int
	var cube int

	square, cube, _ = powerSeries(3)

	fmt.Println("Square:", square, " Cube:", cube)
}

func powerSeries(a int) (square int, cube int, err error) {
	square = a * a
	cube = square * a
	err = nil
	return
}
