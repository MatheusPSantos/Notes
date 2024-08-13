package main

import "fmt"

func insere_mesa_linear(array []int, valor int, indice int) []int {
	length := len(array)
	var tempArray = make([]int, length + 1)
	for i := 0; i < length; i++ {
		if i < indice {
			tempArray[i] = array[i]
		} else {
			tempArray[i + 1] = array[i]
		}
	}
	tempArray[indice] = valor
	return tempArray
}

func main() {
	var array = []int{10,20,30,40,50}
	fmt.Println(array)

	array = insere_mesa_linear(array, 23, 2)

	fmt.Println(array)
}