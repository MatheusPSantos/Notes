package main

import "fmt"

func main() {
	var sum int

	for i := 1; i <= 1000; i++ {
		sum += i
	}
	fmt.Println(sum)
	fmt.Println("--- infinite declaration ----")
	sum = 0
	i := 0
	for {
		if i > 5 {
			break
		}

		sum += i
		i++
	}
	fmt.Println(sum)
}
