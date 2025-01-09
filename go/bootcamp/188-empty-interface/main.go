package main

import "fmt"

func main() {
	var any interface{}

	any = []int{1, 2, 3}
	any = map[int]bool{1: true, 2: false}
	any = "hello"
	any = 2

	any = any.(int) * 2
	fmt.Println(any)

	nums := []int{1, 2, 3}

	any = nums
	_ = len(any)

	var many []interface{}
	for _, n := range nums {
		many = append(many, n)
	}
}
