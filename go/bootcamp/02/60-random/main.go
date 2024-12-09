package main

import (
	"fmt"
	"math/rand"
	"os"
	"strconv"
	"time"
)

const (
	maxTimes = 5

	usage = `Welcome to the Luck Number Game! 🍀
The program will pick %d random numbers.
Your mission is to guess one those numbers.

The greater you numbers is, the harder it gets.

Wanna play?`
)

func main() {
	t := time.Now()

	rand.New(rand.NewSource(t.UnixNano()))

	args := os.Args[1:]

	if len(args) != 1 {
		fmt.Println(usage, maxTimes)
		return
	}

	guess, err := strconv.Atoi(args[0])

	if err != nil {
		fmt.Println("Not a number")
		return
	}

	if guess < 0 {
		fmt.Println("Please pick a positive number.")
		return
	}

	for turn := 0; turn < maxTimes; turn++ {
		n := rand.Intn(guess + 1)

		if n == guess {
			if turn == 0 {
				fmt.Println("SPECIAL BONUS!!! Congratulations")
			}
			fmt.Println("🥳 YOU WIN!")
			return
		}
	}
	fmt.Println("☠️YOU LOST ... Try again?")
}
