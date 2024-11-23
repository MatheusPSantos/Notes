package main

import "fmt"

func main() {
	const (
		monday = iota
		tuesday
		wednesday
		thursday
		friday
		saturday
		sunday
	)

	fmt.Println(monday, tuesday, wednesday, thursday, friday, saturday, sunday)

	fmt.Println("--- timezones ----")
	const (
		EST = -(5 + iota)
		_
		MST 
		PST
	)

	fmt.Println(EST, MST, PST)

}
