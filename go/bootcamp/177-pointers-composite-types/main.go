package main

import (
	"fmt"
	"strings"
)

func main() {
	fmt.Println("**** ARRAYS")
	arrays()

	fmt.Println("**** SLICES")
	slices()

	fmt.Println("**** MAPS")
	maps()

	fmt.Println("**** STRUCTS")
	structs()
}

func arrays() {
	nums := [...]int{1, 2, 3}
	incr(nums)
	fmt.Printf("array nums: %p\n", &nums)
	fmt.Println(nums)

	incrByPtr(&nums)
	fmt.Printf("array nums: %p\n", &nums)
	fmt.Println(nums)

}

func slices() {
	dirs := []string{"up", "down", "left", "rigth"}
	fmt.Printf("up list: %p %q\n", &dirs, dirs)
	up(dirs)
	fmt.Println(dirs)
}

func up(dirs []string) {
	for i := range dirs {
		dirs[i] = strings.ToUpper(dirs[i])
	}

	dirs = append(dirs, "HEISEN BUG")
	fmt.Printf("up list: %p %q\n", &dirs, dirs)

	upPtr(&dirs)
}

func upPtr(dirs *[]string) {
	lv := *dirs

	for i := range lv {
		lv[i] = strings.ToUpper(lv[i])
	}

	*dirs = append(*dirs, "HEISEN BUG")
	fmt.Printf("up list: %p %q\n", dirs, dirs)
}

func incr(nums [3]int) {
	fmt.Printf("array nums: %p\n", &nums)
	for i := range nums {
		nums[i]++
	}
}

func incrByPtr(nums *[3]int) {
	fmt.Printf("array nums: %p\n", &nums)
	for i := range nums {
		nums[i]++
	}
}

func maps() {
	confused := map[string]int{"one": 2, "two": 1}
	fix(confused)
	fmt.Println(confused)
}

func fix(m map[string]int) {
	m["one"] = 1
	m["two"] = 2
	m["three"] = 3
}

type house struct {
	name  string
	rooms int
}

func structs() {
	myHouse := house{"My House", 5}
	addRoom(myHouse)
	fmt.Printf("%v\n", myHouse)

	addRoomPtr(&myHouse)
	fmt.Printf("%v\n", myHouse)
}

func addRoom(h house) {
	h.rooms++
}

func addRoomPtr(h *house) {
	h.rooms++
}
