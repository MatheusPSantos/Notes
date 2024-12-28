package main

import (
	"bufio"
	"fmt"
	"os"
	"regexp"
	"strings"
)

func main() {

	args := os.Args[1:]
	
	if len(args) != 1 {
		fmt.Println("Please type a serach word.")
		return
	}

	rx := regexp.MustCompile(`[^a-z]+`)

	in := bufio.NewScanner(os.Stdin)
	in.Split(bufio.ScanWords)

	words := make(map[string]bool)

	for in.Scan() {
		word := strings.ToLower(in.Text())
		word = rx.ReplaceAllString(word, "")
		
		if len(word) > 2 {
			words[word] = true
		}
	}

	query := args[0]


	if _, ok := words[query]; ok {
		fmt.Printf("The input contains %q.\n", query)
		return
	}
	fmt.Printf("The input does not contains %q.\n", query)

}
