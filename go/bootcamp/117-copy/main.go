package main

import (
	"fmt"

	"github.com/inancgumus/prettyslice"
)

func main() {
	data := []float64{10, 25, 30, 50}

	newData := []float64{99, 100}

	copy(data, newData)
	
	saved := make([]float64, len(data))
	copy(saved, data)
	data[0] = -1

	prettyslice.Show("data", data)
	prettyslice.Show("saved", saved)
	fmt.Printf("Is it gonna rain? %.f%% chance.\n", (data[0]+data[1]+data[2]+data[3])/float64(len(data)))
}
