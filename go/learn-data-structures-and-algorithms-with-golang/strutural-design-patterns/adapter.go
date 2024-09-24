package main

import "fmt"

type IProcess interface {
	process()
}

type Adapter struct {
	adaptee Adaptee
}

type Adaptee struct {
	adapterType int
}

func (adapter Adapter) process() {
	adapter.adaptee.convert()
}

func (adaptee Adaptee) convert() {
	fmt.Println("Adaptee convert method")
}

func main() {
	var processor IProcess = Adapter{}
	processor.process()
}
