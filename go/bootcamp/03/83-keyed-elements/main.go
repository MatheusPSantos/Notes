package main

import "fmt"

const (
	ETH = 9- iota
	WAN
	ICX
)

func main() {
	rates := [3]float64{
		1: 2.5,
		0: 0.5,
		2: 1.5,
	}

	fmt.Println(rates)

	rates2 := [...]float64{
		5: 1.5,
		7: 1.2,
	}

	fmt.Println(rates2)

	rates3 := [...]float64{
		5: 1.5,
		2.5,
		0: 1.1,
	}

	fmt.Println(rates3)

	r := [...]float64{
		ETH: 25.5,
		WAN: 120.5,
		ICX: 20.9,
	}

	fmt.Printf("1 BTC is %g ETH\n", r[ETH])
	fmt.Printf("1 BTC is %g WAN\n", r[WAN])
	fmt.Printf("%#v\n", r)
}
