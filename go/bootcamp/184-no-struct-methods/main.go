package main

func main() {
	minecraft := game{"minecraft", 11}
	tetris := game{"tetris", 8}
	minecraft.print()
	minecraft.discount(0.3)
	minecraft.print()
	var items []*game

	items = append(items, &minecraft, &tetris)

	my := list(items)
	my = nil
	my.print()
}
