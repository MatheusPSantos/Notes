package main

import (
	"fmt"
)

func main() {
	type text struct {
		title string
		words int
	}

	type book struct {
		text
		isbn string
	}

	moby := book{
		text: text{title: "moby dick", words: 206502},
		isbn: "102030",
	}

	fmt.Printf("%+v\n", moby)

	fmt.Println("Title > ", moby.title)

	var arsene book

	arsene.title = "Arsene Lupin"

	fmt.Printf("\n%#v\n", arsene)

}
