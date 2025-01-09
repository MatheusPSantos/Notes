package main

import (
	"fmt"
)

func main() {
	// Code points:
	// g => 103
	// o => 111
	// fmt.Println(string(103), string(111))

	// const word = "gökyüzü"
	// bword := []byte(word)

	// ö => 2 bytes
	// ü => 2 bytes
	// fmt.Println(utf8.RuneCount(bword), len(word), len(string(word[1])))

	// in := bufio.NewScanner(os.Stdin)
	// in.Scan()
	// in.Scan()
	// fmt.Println(in.Text())

	// avengers := struct {
	// 	title, genre string
	// 	rating       float64
	// 	released     bool
	// }{
	// 	"avengers: end game", "sci-fi", 8.9, true,
	// }

	// fmt.Printf("%T\n", avengers)
	p := n()
	a(p)

	fmt.Println("---------")
	type computer struct {
		brand string
	}

	type person struct {
		name string
		age int
	}

	n := &person{name: "mat", age: 27}

	fmt.Println(*n)

	var a, b *computer
	fmt.Print(a == b)

	a = &computer{"Apple"}
	b = &computer{"Apple"}
	fmt.Print(" ", a == b, " ", *a == *b)

	fmt.Println(a)
	fmt.Println(b)
	fmt.Println(*a, "\t", *b)

	m := make(map[string]int)
	m["a"] = 1
	fmt.Print(m)

	t := []int{1,2,3,4,5}
	t = nil
	fmt.Println(len(t), cap(t), t)
}

type pa struct {
	name string
}

func n() *pa {
	return &pa{name: "teste"}
}

func a(p *pa) {
	fmt.Println(p.name)
}
