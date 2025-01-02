package main

import (
	"fmt"
	"strconv"
	"time"
)

type money float64

type any interface{}

type book struct {
	title     string
	price     money
	published any
}

func (m *money) string() string {
	return fmt.Sprintf("$%.2f", *m)
}

func (b *book) print() {
	p := format(b.published)
	fmt.Printf("%-15s %s %s\n", b.title, b.price.string(), p)
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

func main() {
	// var v interface{}

	books := []book{
		book{"moby dick", 19, "914337490"},
		book{"arsene lupin", 22, nil},
		book{"peter pan", 22, 914137490},
	}

	for _, b := range books {
		b.print()
	}

	// switch e := v.(type) {
	// case int:

	// case string:

	// default:

	// }
}
