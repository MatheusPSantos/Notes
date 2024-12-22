package main

import (
	"fmt"
	"math/rand"
	"os"
	"time"
)

const (
	sizeOfFeelings = 5
)

func main() {

	feelings := [sizeOfFeelings]string{
		"feels sad 😞",
		"feels terrible 😩",
		"feels happy 😃",
		"feels awesome 😎",
		"feels good 👍"}

	args := os.Args[1:]

	if len(args) == 0 {
		fmt.Println("[your name]")
		return
	}

	name := args[0]

	t := time.Now()
	rand.New(rand.NewSource(t.UnixNano()))
	random := rand.Intn(len(feelings))

	fmt.Printf("%s %s\n", name, feelings[random])

}
