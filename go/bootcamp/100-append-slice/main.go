package main

import (
	"fmt"

	s "github.com/inancgumus/prettyslice"
)

func main() {
	var todo []string

	todo = append(todo, "sing")
	todo = append(todo, "run")
	todo = append(todo, "code")
	todo = append(todo, "play")

	s.Show("todo", todo)
	fmt.Println(todo[3])

	nums := []int{9, 7, 5}
	evens := append(nums, []int{2, 4, 6}...)

	fmt.Println(nums, evens)
}
