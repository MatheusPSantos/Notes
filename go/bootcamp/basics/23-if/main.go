package main

import (
	"fmt"
	"os"
)

const (
	usage       = "Usage: [username] [password]"
	errMsg      = "Access denied for %q.\n"
	invalidPass = "Invalid password for user %q\n"
	garented    = "Access garanted to %q.\n"
	pass        = "1888"
	user        = "user"
)

func main() {
	score, valid := 3, true

	if score > 3 && valid {
		fmt.Println("good")
	} else if score == 3 {
		fmt.Println("on the edge")
	} else if score == 2 {
		fmt.Println("meh ...")
	} else {
		fmt.Println("low")
	}

	fmt.Println("------ PASSME PROGRAM -----")
	args := os.Args
	if len(args) != 3 {
		fmt.Println(usage)
		return
	}

	u, p := args[1], args[2]

	if u != user {
		fmt.Printf(errMsg, u)
	} else if p != pass {
		fmt.Printf(invalidPass, u)
	} else {
		fmt.Printf(garented, u)
	}

}
