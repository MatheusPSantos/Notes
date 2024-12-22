package main

import (
	"fmt"

	s "github.com/inancgumus/prettyslice"
)

func main() {

	s.PrintBacking = true
	var games []string
	s.Show("games", games)
	games = []string{}
	s.Show("games", games)
	s.Show("another empty", []int{})
	games = []string{"pacman", "mario", "tetris", "doom"}
	s.Show("games", games)
	part := games
	part = games[:0]
	s.Show("part", part)

	words := []string{"lucy", "in", "the", "sky", "with", "diamonds"}
	words = words[0:]
	s.Show("words", words)

	a := []int{35, 15, 12, 13, 4}
	s.Show("a", a)
	a = append(a, 5)
	s.Show("a", a)
	fmt.Println()
	words_ := []string{1022: ""}
	words_ = append(words_, "boom!")

	s.Show("words", words_)
}
