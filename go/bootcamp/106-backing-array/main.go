package main

import (
	"fmt"
	"sort"

	s "github.com/inancgumus/prettyslice"
)

func main() {
	grades := []float64{40, 10, 20, 50, 60, 70}

	//var newGrades []float64
	//newGrades = append(newGrades, grades...)
	newGrades := append([]float64(nil), grades...)

	front := newGrades[0:3]
	front2 := front[:3]
	front3 := front

	sort.Float64s(front)

	s.PrintBacking = true
	s.MaxPerLine = 7
	s.Show("grades ", grades[:])
	s.Show("newGrades ", newGrades[:])
	s.Show("front ", front)
	s.Show("front2 ", front2)
	s.Show("front3 ", front3)

	fmt.Println(cap(front))
	fmt.Println(len(front))
	
}
