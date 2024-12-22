package main

import (
	"fmt"
	"strings"

	"github.com/inancgumus/prettyslice"
)

func main() {
	prettyslice.PrintBacking = true
	prettyslice.MaxPerLine = 10

	tasks := []string{"jump", "run", "read"}
	upTasks := make([]string, 0, len(tasks))
	prettyslice.Show("upTasks", upTasks)

	for _, task := range tasks {
		upTasks = append(upTasks, strings.ToUpper(task))
		prettyslice.Show("upTasks", upTasks)
	}

	lyric := []string{"show", "me", "my", "silver", "lining"}
	part := lyric[1:3:5]

	prettyslice.Show("part", part)

	t := make([]string, 0, 5)
	t = append(t, "hello", "world")
	prettyslice.Show("t", t)

	l := []string{"le", "vent", "nous", "portera"}
	n := copy(l, make([]string, 4))

	fmt.Printf("%d %q\n", n, l)

}
