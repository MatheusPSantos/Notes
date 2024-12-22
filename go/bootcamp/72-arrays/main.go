package main

import "fmt"

const (
	winter = 1
	summer = 3

	yearly = winter + summer
)

func main() {
	var books [yearly]string

	books[0] = "Kafka's revenge"
	books[1] = "Domain Driven Design"
	books[2] = "Everythingship"
	books[3] = books[0] + " 2nd edition"

	fmt.Printf("books : %T\n", books)
	fmt.Println("books :", books)
	fmt.Printf("books : %q\n", books)

	var (
		wBooks [winter]string
		sBooks [summer]string
	)

	wBooks[0] = books[0]

	for i := range sBooks {
		sBooks[i] = books[i+1]
	}

	fmt.Printf("\nwinter books : %#v", wBooks)
	fmt.Printf("\nsummer books : %#v", sBooks)

	var published [len(books)]bool

	published[0] = true
	published[len(books)-1] = true

	for i, ok := range published {
		if ok {
			fmt.Printf("\n%-2d: %#v - %s", i, ok, books[i])
		}
	}
	fmt.Println()
	var names [3]string

	names[len(names)-1] = "!"
	names[1] = "think" + names[2]
	names[0] = "Don't"
	names[0] += " "

	fmt.Println(names[0] + names[1] + names[2])

	fmt.Println("------- array literals --------")

	books2 := [4]string {
		"Kafka",
		"Everythingship",
		"Stay Golden",
		"Kafka's revenge",
	}

	fmt.Printf("%q", books2)

	fmt.Println()
	fmt.Println("----- elipses sintax ...")

	books3 := [...]string{"Kafka", "Software Engineering"}

	fmt.Printf("\n%q\n", books3)
}
