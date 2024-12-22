package main

import "fmt"

func main() {

	type integer int
	type bookcase [5]int
	type cabinet [5]int

	blue := bookcase{6, 9, 3, 2, 1}
	red := cabinet{6, 9, 3, 2, 1}

	fmt.Print("Are they equal? ")

	if blue == bookcase(red) {
		fmt.Println("✅")
	} else {
		fmt.Println("❌")
	}

	fmt.Printf("blue: %#v\n", blue)
	fmt.Printf("red: %#v\n", red)

	g := [3]string{"A"}
	fmt.Printf("%#v\n", g)

	gadgets := [3]string{"Confused Drone"}
	gears := [...]string{"Confused Drone"}

	fmt.Println(gadgets == gears)

}
