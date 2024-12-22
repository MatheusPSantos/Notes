package main

import (
	"fmt"
	"os"
	"strings"
	"unicode/utf8"
)

func main() {
	fmt.Println("------- 11. How to get the length of a utf-8 string -------- ")
	name := "Inanç"
	fmt.Println(len(name))
	fmt.Println(utf8.RuneCountInString(name))
	fmt.Println("------ 12. Example Banger: Yell it back -------")
	msg := os.Args[1]
	l := len(msg)
	// s := msg + strings.Repeat("!", l)
	// s = strings.ToUpper(s)
	// exercise
	repeat := strings.Repeat("!", l)
	s2 := repeat + msg + repeat
	fmt.Println(s2)
}
