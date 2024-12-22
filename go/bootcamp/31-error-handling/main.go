package main

import (
	"fmt"
	"os"
	"strconv"
)

func main() {
	// default approach
	// err := do()

	// if err {
	// 	// handle it
	// 	// or terminate
	// }
	// // success
	// // continue program

	{
		fmt.Println("32. What is error Value")
		fmt.Println(`
			example:

			func Atoi(s String) (int, error)
				returns a value with an error type
		`)
	}
	{
		n, err := strconv.Atoi(os.Args[1])
		fmt.Println("Converted num: ", n)
		fmt.Println("error: ", err)
	}
	{
		fmt.Println("34. Error Handling example")
		age := os.Args[1]
		n, err := strconv.Atoi(age)
		if err != nil {
			fmt.Println("ERROR:", err)
			return
		}
		fmt.Printf("SUCCESS: Converted %q to %d.\n", age, n)
	} 
	{
		fmt.Println("------ 35. Solution feet to Meter ----- ")
		arg := os.Args[1]
		feet, err := strconv.ParseFloat(arg, 64)
		if err != nil {
			fmt.Printf("error: %q is not a number.\n", arg)
		}
		meters := feet * 0.3048
		fmt.Printf("%g feet is %g meters.\n", feet, meters)
	}
}
