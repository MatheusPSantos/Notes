package main

import (
	"fmt"
	"unicode"
)

func main() {
	text := ``

	const maxWidth = 40

	var lw int

	for _, r := range text {
		fmt.Printf("%c", r)

		switch lw++; {
		case lw > maxWidth && r != '\n' && unicode.IsSpace(r):
			fmt.Println()
			fallthrough
		case r == '\n':
			lw = 0
		}
	}
}
