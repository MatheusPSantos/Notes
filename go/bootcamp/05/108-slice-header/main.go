package main

import s "github.com/inancgumus/prettyslice"

type collection []string

func main() {
	s.PrintElementAddr = true

	data := collection{"slices", "are", "awesome", "period"}

	change(data)
	s.Show("main data", data)
}

func change(data collection) {
	data[2] = "brilliant"
	s.Show("changed data ", data)
}
