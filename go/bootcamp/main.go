package main

import (
	"fmt"
	"unicode/utf8"
)

func main() {
	// Code points:
	// g => 103
	// o => 111
	fmt.Println(string(103), string(111))

	const word = "gökyüzü"
	bword := []byte(word)

	// ö => 2 bytes
	// ü => 2 bytes
	fmt.Println(utf8.RuneCount(bword), len(word), len(string(word[1])))

}
