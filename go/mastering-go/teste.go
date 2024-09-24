package main

import (
	"fmt"
	"unsafe"
)

func main() {

	slice1 := []int64{1, 2, 3, 4}
	array := [5]int{1, 2, 3, 4, 5}

	fmt.Println(unsafe.Sizeof(slice1))
	fmt.Println(unsafe.Sizeof(array))
}
