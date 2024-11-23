package main

import "fmt"

func main() {
	fmt.Println("-------- 10.What is a Raw String Literal -------")
	var s string
	s = "how area you?"
	s = `how are you?`
	fmt.Println(s)

	s = "<html>\n\t<body>\"Hello\"</body>\n</html>"
	fmt.Println(s)
	s = `
		<html>
			<body>"Hello"</body>
		</html>
	`
	fmt.Println(s)
	s = "c:\\dir\\my\\folder"
	fmt.Println(s)
	s = `c:\dir\my\folder`
	fmt.Println(s)

}
