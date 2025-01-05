package main

import (
	"sort"
	"strings"
)

type list []*product

func (l list) String() string {

	if len(l) == 0 {
		return "Sorry. We are waiting for delivery."
	}

	var str strings.Builder

	for _, p := range l {
		//p.print()
		//fmt.Printf("%s\n", p)
		str.WriteString("* ")
		str.WriteString(p.String())
		str.WriteRune('\n')
	}

	return str.String()
}

func (l list) discount(ratio float64) {
	for _, p := range l {
		p.discount(ratio)
	}
}

func (l list) Len() int { return len(l) }

func (l list) Less(i, j int) bool {
	return l[i].Title < l[j].Title
}

func (l list) Swap(i, j int) {
	l[i], l[j] = l[j], l[i]
}

type byRelease struct {
	list
}

func (b byRelease) Less(i, j int) bool {
	return b.list[i].Released.Before(b.list[j].Released.Time)
}

func byReleaseDate(l list) sort.Interface {
	return &byRelease{l}
}
