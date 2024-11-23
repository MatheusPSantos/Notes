package main

import (
	"fmt"
	"os"
)

func main() {
	fmt.Println("--------- 7. Learn the basics of os.Args -------")
	fmt.Printf("%#v\n", os.Args)
	fmt.Println(os.Args)

	fmt.Println(os.Args[1])
	fmt.Println(os.Args[2])
}
