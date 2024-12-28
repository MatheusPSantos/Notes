package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
	"strings"
)

func main() {

	var sum map[string]int
	var domains []string
	var total int
	var lines int

	sum = make(map[string]int)

	in := bufio.NewScanner(os.Stdin)

	for in.Scan() {
		lines++
		fields := strings.Fields(in.Text())

		if len(fields) != 2 {
			fmt.Printf("Wrong input: %v (line: %#d)\n", fields, lines)
			return
		}

		domain := fields[0]

		visits, err := strconv.Atoi(fields[1])
		if visits < 0 || err != nil {
			fmt.Printf("Wrong input %q (line: %#d)\n", fields[1], lines)
		}

		if _, ok := sum[domain]; !ok {
			domains = append(domains, domain)
		}
		total++
		sum[domain] += visits
	}

	fmt.Printf("%-30s %10s\n", "DOMAIN", "VISITS")
	fmt.Println(strings.Repeat("-", 45))

	for _, domain := range domains {
		visits := sum[domain]
		fmt.Printf("%-30s %10d\n", domain, visits)
	}
	fmt.Printf("\n%-30s %10d\n", "TOTAL", total)

	if err := in.Err(); err != nil {
		fmt.Println("> Error: ", err)
	}
}
