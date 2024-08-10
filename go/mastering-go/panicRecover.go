package main

import (
	"fmt"
)

func a() {
	fmt.Println("inside a() ")
	defer func() {
		if c := recover(); c != nil {
			fmt.Println("recover inside a()!")
		}
	}()

	fmt.Println("About to call b()")
	b()
	fmt.Println("b() exited!")
	fmt.Println("Exiting a()")
}

func b() {
	fmt.Println("inside b()")
	panic("Panic in b()")
	fmt.Println("Exiting b()")
}

func main() {
	a()
	fmt.Println("main() ended!")
}
