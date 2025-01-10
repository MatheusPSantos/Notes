package main

import (
	"fmt"

	"01.packages.imports.exports/math"
)

func main() {
	xs := []float64{1, 2, 3, 4}
	avg := math.Average(xs)
	fmt.Println(avg)
}
