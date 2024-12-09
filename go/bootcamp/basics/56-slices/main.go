package main

import (
	"fmt"
	"os"
	"strings"
)

func main() {

	for i := 0; i < len(os.Args); i++ {
		fmt.Printf("%q\n", os.Args[i])
	}

	phrase := "Lazy cats jumps again and again and again."
	words := strings.Fields(phrase)

	for i := 0; i < len(words); i++ {
		fmt.Printf("#%-2d: %q\n", i+1, words[i])
	}

	fmt.Println("----- loop over slice using range() ------ ")
	for i, v := range os.Args {
		if i == 0 {
			continue
		}
		fmt.Printf("%q\n", v)
	}

	fmt.Println("----- loop over slice using range of os.Args[1:] ------ ")
	for _, v := range os.Args[1:] {
		fmt.Printf("%q\n", v)
	}

	for i, v := range words {
		fmt.Printf("#%-2d: %q\n", i+1, v)
	}
}
