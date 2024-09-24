package main

import (
	"container/heap"
	"fmt"
)

func main() {
	var intHeap *IntegerHeap = &IntegerHeap{1, 1, 2, 3, 5, 8, 13, 21, 34, 55}

	heap.Init(intHeap)
	heap.Push(intHeap, 89)
	fmt.Printf("minimum: %d\n", (*intHeap)[0])

	for intHeap.Len() > 0{
		fmt.Printf("%d\n", heap.Pop(intHeap))
	}
}

type IntegerHeap []int

func (iHeap IntegerHeap) Len() int { return len(iHeap) }

func (iheap IntegerHeap) Less(i, j int) bool { return iheap[i] < iheap[j] }

func (iHeap IntegerHeap) Swap(i, j int) { iHeap[i], iHeap[j] = iHeap[j], iHeap[i] }

func (iheap *IntegerHeap) Push(heapintf interface{}) {
	*iheap = append(*iheap, heapintf.(int))
}

func (iheap *IntegerHeap) Pop() interface{} {
	var n int
	var x1 int

	previous := *iheap

	n = len(previous)
	x1 = previous[n-1]

	*iheap = previous[0 : n-1]
	return x1
}
