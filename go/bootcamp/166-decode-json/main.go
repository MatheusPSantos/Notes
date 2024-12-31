package main

import (
	"bufio"
	"encoding/json"
	"fmt"
	"os"
)

type Permissions map[string]bool

type user struct {
	Name        string          `json:"username"`
	Permissions map[string]bool `json:"perms"`
}

func main() {

	var input []byte

	for in := bufio.NewScanner(os.Stdin); in.Scan(); {
		input = append(input, in.Bytes()...)
	}

	var users []user

	err := json.Unmarshal(input, &users)

	if err != nil {
		fmt.Println(err)
		return
	}

	for _, u := range users {
		fmt.Print("+ ", u.Name)
		
		switch p := u.Permissions; {
		case p == nil:
			fmt.Print(" has no power.")
		case p["admin"]:
			fmt.Print(" is an admin.")
		case p["write"]:
			fmt.Print(" can write")
		}

		fmt.Println()
	}

	fmt.Println(users)
}
