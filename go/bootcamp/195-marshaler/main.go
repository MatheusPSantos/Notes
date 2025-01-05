package main

import (
	"encoding/json"
	"fmt"
	"log"
)

const msg = `
[
{
"Title": "minecraft",
"Price": 20,
"Released": 914337490
},
{
"Title": "odyssey",
"Price": 15,
"Released": 814337490
},
{
"Title": "hobbit",
"Price": 25,
"Released": -62135596800
},
{
"Title": "tetris",
"Price": 14,
"Released": 914327490
},
{
"Title": "rubik",
"Price": 5,
"Released": -62135596800
},
{
"Title": "yoda",
"Price": 150,
"Released": -62135596800
}
]`

func main() {
	store := list{
		{Title: "minecraft", Price: 20, Released: toTimestamp(914337490)},
		{Title: "odyssey", Price: 15, Released: toTimestamp("814337490")},
		{Title: "hobbit", Price: 25},
		{Title: "tetris", Price: 14, Released: toTimestamp(914327490)},
		{Title: "rubik", Price: 5},
		{Title: "yoda", Price: 150},
	}

	data, err := json.MarshalIndent(store, "", "")
	if err != nil {
		log.Fatal(err)
	}
	fmt.Println(string(data))

	var l list
	err = json.Unmarshal([]byte(msg), &l)

	if err != nil {
		log.Fatal(err)
	}
	fmt.Print(l)
}
