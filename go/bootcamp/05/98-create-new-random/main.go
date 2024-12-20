package main

import (
	"fmt"
	"math/rand"
	"os"
	"sort"
	"strconv"
	"time"
)

func main() {

	rand.New(rand.NewSource(time.Now().UnixNano()))

	max, err := strconv.Atoi(os.Args[1])
	if err != nil {
		fmt.Printf("%v is not a number. Please, provide one.", os.Args[1])
	}

	var uniques []int
loop:
	for len(uniques) < max {
		n := rand.Intn(max) + 1
		fmt.Print(n, " ")

		for _, u := range uniques {
			if u == n {
				continue loop
			}
		}
		uniques = append(uniques, n)
	}
	fmt.Println("\n\nuniques: ", uniques)
	sort.Ints(uniques)
	fmt.Println("\n\n[SORTED] uniques: ", uniques)

	var tasks []string
	fmt.Println("tasks : ", len(tasks))

	primos := [] int{0, 1, 2, 5, 7}

	fmt.Printf("primos: %#v \n", primos)
}
