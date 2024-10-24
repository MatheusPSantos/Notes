package main

import (
	"errors"
	"fmt"
)

func returnError(a, b int) error {
	if a == b {
		err := errors.New("Error in returnError() function")
		return err
	}
	return nil
}

func main() {
	err := returnError(1, 2)
	if err != nil {
		fmt.Println("returnError() ended normally!")
	} else {
		fmt.Println("err: ", err)
	}

	err = returnError(0, 0)
	if err != nil {
		fmt.Println("returnError() ended normally!")
	} else {
		fmt.Println(err)
	}

	if err.Error() == "Error in returnError() function" {
		fmt.Println("!!")
	}
}
