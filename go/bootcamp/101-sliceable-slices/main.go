package main

import "fmt"

func main() {
	msg := []string{"h", "e", "l", "l", "o"}

	fmt.Println(msg)
	fmt.Println(msg[1:3])
	nmsg := append(msg[1:3], "!")
	fmt.Println(msg)
	fmt.Println(nmsg)
}
