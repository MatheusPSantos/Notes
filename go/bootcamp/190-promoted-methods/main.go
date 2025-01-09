package main

import (
	"fmt"
	"strconv"
	"time"
)

func main() {
	store := list{
		&book{product{"minecraft", 20}, 914337490},
		&book{product{"odyssey", 15}, "814337490"},
		&book{product{"hobbit", 25}, nil},
		&game{product{"tetris", 14}, 914327490},
		&puzzle{product{"rubik", 5}},
		&toy{product{"yoda", 150}},
	}

	t := &toy{product{"yoda", 150}}
	fmt.Printf("%#v\n", t)

	for _, s := range store {
		fmt.Printf("%q\n", s)
	}
}

type list []item

type money float64

type any interface{}

type book struct {
	product
	published any
}

type toy struct {
	product
}

type product struct {
	title string
	price money
}

type game struct {
	product
	published any
}

type item interface {
	print()
	discount(float64)
}
type puzzle struct {
	product
}

func (p puzzle) print() {
	fmt.Printf("%-15s: $%.2f\n", p.title, p.price.string())
}

func (g *game) print() {
	fmt.Printf("%-15s: %s\n", g.title, g.price.string())
}

func (g *game) discount(ratio float64) {
	g.price *= money(1 - ratio)
}

func (l list) print() {

	if len(l) == 0 {
		fmt.Println("Sorry. We are waiting for delivery.")
	}

	for _, it := range l {
		it.print()
	}
}

func (p *product) print() {
	fmt.Printf("%-15s %s\n", p.title, p.price.string())
}

func (p *product) discount(ratio float64) {
	p.price += money(1 - ratio)
}

func (t *toy) print() {
	fmt.Printf("%-15s %s\n", t.title, t.price.string())
}

func (t *toy) discount(ratio float64) {
	t.price *= money(1 - ratio)
}

func (m *money) string() string {
	return fmt.Sprintf("$%.2f", *m)
}

func (b *book) print() {
	p := format(b.published)
	fmt.Printf("%-15s %s %s\n", b.title, b.price.string(), p)
}

func (b *book) discount(ratio float64) {
	b.price *= money(1 - ratio)
}

func format(o any) string {
	var t int

	switch e := o.(type) {

	case int:
		t = e

	case string:
		t, _ = strconv.Atoi(e)

	default:
		return "unknown"
	}
	const layout = "2006, Jan"
	u := time.Unix(int64(t), 0)
	return u.Format(layout)
}
