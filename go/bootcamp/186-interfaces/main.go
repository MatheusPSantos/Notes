package main

func main() {

	var (
		mobydick  = book{"moby dick", 10}
		minecraft = game{"minecraft", 20}
		tetris    = game{"tetris", 15}
		rubik     = puzzle{"rubik", 99}
	)

	var store list
	store = append(store, &minecraft, &tetris, &mobydick, &rubik)
	store.print()
}
