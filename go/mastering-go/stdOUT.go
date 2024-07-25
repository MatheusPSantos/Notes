package main

import (
	"io"
	"os"
	"strings"
)

func main() {
	myString := ""
	arguments := os.Args

	if len(arguments) == 1 {
		myString = "Please give me one more argument!"
	} else {
		myString = strings.Join((arguments[1 : len(arguments)-1]), " ")
	}

	io.WriteString(os.Stdout, myString)
	io.WriteString(os.Stdout, "\n")
}
