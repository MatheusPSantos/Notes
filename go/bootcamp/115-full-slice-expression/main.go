package main

import (
	"github.com/inancgumus/prettyslice"
)

func main() {
	prettyslice.PrintBacking = true
	sliceable := []byte{'f', 'u', 'l', 'l'}

	prettyslice.Show("sliceable", sliceable)
	prettyslice.Show("sliceable", sliceable[0:3:3])
	prettyslice.Show("sliceable", sliceable[2:3:4])
	prettyslice.Show("sliceable", sliceable[1:2:4])

}
