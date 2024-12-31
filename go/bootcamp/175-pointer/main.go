package main

import (
	"fmt"
	"time"
)

func main() {
	var counter byte = 100

	P := &counter

	fmt.Println("counter: ", counter)
	fmt.Println("P: ", P)
	fmt.Printf("\"%%T\": %T\n", P)
	fmt.Println("*P: ", *P)

	*P++

	fmt.Println(P)
	fmt.Println(*P)

	P = nil
	fmt.Println(P)
	fmt.Println(*P)

	age := 17
	age2 := 17
	p := &age

	var L *int

	for age < 30 && age2 < 30 {
		*p++
		a := age2 + 1
		age2 = a
		l := &a
		if age2 == 18 {
			L = l
		}
		fmt.Println(*p, "\t", p, "\t", age2, "\t", l)
	}

	fmt.Println("L: ", L)
	fmt.Println("*L: ", *L)

	time.Sleep(time.Second * 15)
	fmt.Println("*L: ", *L)
}
