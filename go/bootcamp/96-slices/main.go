package main

import "fmt"

func main() {
	var books [5]string
	books[0] = "Arquitetura de Software"
	books[1] = "Domain Driven Design"
	books[2] = "Clean Architecture"
	books[3] = "Java Efetivo"

	fmt.Printf("books:   %#v\n", books)

	games := []string{"League of Legends", "Dota 2", "Cod"}

	fmt.Printf("games:   %#v\n", games)
	fmt.Printf("length:   %d\n", len(games))
	fmt.Printf("nil? %t\n", games == nil)

	games2 := []string{}
	fmt.Printf("games 2:  %#v\n", games2)
}
