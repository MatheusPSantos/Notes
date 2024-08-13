package main

import (
  "fmt"
)

func my_append(array []int, value int)[]int {
  var length = len(array)
  var tempArray = make([]int, length+1)
  
  for i := 0; i < length; i++ {
    tempArray[i] = array[i]
  }

  tempArray[length] = value
  return tempArray
}


func main() {
  var scores = []int{90,70,50,80,60,85}
  scores = my_append(scores, 75)
  var length = len(scores)

  for i := 0; i < length; i++ {
    fmt.Println(scores[i])
  }
}