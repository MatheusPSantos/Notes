package main

import "fmt"

func main() {

	var (
		minecraft = game{"minecraft", 20}
		tetris    = game{"tetris", 10}
		mobyDick  = book{"moby dick", 15}
		rubik     = puzzle{"rubik", 99}
		yoda      = toy{"yoda", 88.0}
	)

	var store list

	minecraft.print()
	tetris.print()
	mobyDick.print()
	rubik.print()

	fmt.Println("---- store -----")
	store = append(store, &minecraft, &tetris, mobyDick, &rubik, &yoda)

	store.discount(0.5)

	store.print()

}

type printer interface {
	print()
}

type list []printer

func (l list) discount(ratio float64) {
	type discounter interface {
		discount(float64)
	}
	for _, it := range l {
		g, ok := it.(discounter)
		if !ok {
			continue
		}
		g.discount(ratio)
	}
}

type money float64

type game struct {
	title string
	price money
}

type book struct {
	title string
	price float64
}

type puzzle struct {
	title string
	price float64
}

type toy struct {
	name  string
	price money
}

func (m *money) string() string {
	return fmt.Sprintf("$%2.f", *m)
}

func (g *game) print() {
	fmt.Printf("%-15s: %s\n", g.title, g.price.string())
}

func (g *game) discount(ratio float64) {
	g.price *= money(1 - ratio)
}

func (b book) print() {
	fmt.Printf("%-15s: $%.2f\n", b.title, b.price)
}

func (l list) print() {
	if len(l) == 0 {
		fmt.Println("Sorry. We are waiting for delivery.")
	}

	for _, it := range l {
		it.print()
	}
}

func (p *puzzle) print() {
	fmt.Printf("%-15s: $%.2f\n", p.title, p.price)
}

func (t *toy) print() {
	fmt.Printf("%-15s: %s\n", t.name, t.price.string())
}

func (t *toy) discount(ratio float64) {
	t.price *= money(1 - ratio)
}
