package main

import (
  "encoding/json"
  "fmt"
)

type Permissions map[string]bool

type user struct {
  Name    string  `json:"username"`
  Password  string `json:"-"`
  Permissions   `json:"perms,omitempty"`
}

func main() {
	users := []user{
    {"messi", "12345", nil},
    {"ronaldo", "1abcd", Permissions{"admin": true}},
    {"neymar", "braz1", Permissions{"write": true}},
  }

  out, err := json.MarshalIndent(users, "", "\t")

  if err != nil {
    fmt.Println("Error when marsheling data")
    return
  }
  
  fmt.Println(string(out))
}