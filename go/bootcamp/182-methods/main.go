package main

func main() {
	mobyDick := book{title: "moby dick", price: 10}
	minecraft := game{"minecraft", 11}
	tetris := game{"tetris", 8}

	mobyDick.print()
	minecraft.print()
	tetris.print()

	minecraft.discount(0.5)

	book.print(mobyDick)
	
	var h huge
	for i := 0; i < 10; i++ {	
		h.addr()
	}
}
