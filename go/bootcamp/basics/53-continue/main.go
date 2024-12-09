package main

import "fmt"

func main() {

	i := 0
	sum := 0

	for {
		if i > 5 {
			break
		}

		if i%2 != 0 {
			i++
			continue
		}

		sum += i
		fmt.Printf("%d --> %d\n", i, sum)
		i++
	}
}
