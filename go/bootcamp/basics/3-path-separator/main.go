package main

import (
	"fmt"
	"path"
)

func main() {
	/*
		aula 3.Example: Path Separator
	*/
	/* using normal declaration */
	// var dir, file string
	// dir, file = path.Split("css/main.css")
	// fmt.Println("dir: ", dir)
	// fmt.Println("file: ", file)
	/** Output
		dir:  css/
		file:  main.css
	**/
	/** Using the short declaration */
	_, file := path.Split("css/main.css")
	fmt.Println(file)

}
