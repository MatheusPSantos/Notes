package main

import (
	"fmt"

	s "github.com/inancgumus/prettyslice"
)

type collection []string

func main() {
	s.PrintElementAddr = true

	data := collection{"slices", "are", "awesome", "period"}

	change(data)
	s.Show("main data", data)
	fmt.Println("------------")
	ages := []int{35, 15, 25}
	s.Show("ages", ages)
	s.Show("ages[2:3]", ages[2:3])
	ages2 := ages[2:3]
	s.Show("ages2", ages2)

}

func change(data collection) {
	data[2] = "brilliant"
	s.Show("changed data ", data)
}
