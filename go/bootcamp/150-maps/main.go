package main

import (
	"fmt"
	"os"
)

func main() {
	args := os.Args[1:]

	if len(args) != 1 {
		fmt.Println("[english word] -> [turkish word]")
		return
	}

	query := args[0]

	//var dict map[string]string
	dict := map[string]string{
		"good":    "køtu",
		"great":   "harika",
		"perfect": "mükemmel",
	}

	dict["up"] = "yukari"
	dict["down"] = "asagi"

	turkish := make(map[string]string, len(dict))

	for k, v := range dict {
		turkish[v] = k
	}

	fmt.Printf("english: %q\n---\nturkish: %q\n----\n", dict, turkish)

	value, ok := dict[query]
	if !ok {
		fmt.Printf("%q not found\n", query)
		return
	}

	fmt.Printf("%q means %q\n", query, value)
	fmt.Printf("Zero value: %#v\n", dict)
	fmt.Printf("# of keys: %d\n", len(dict))

	for k, v := range dict {
		fmt.Printf("%q means %#v\n", k, v)
	}

}
