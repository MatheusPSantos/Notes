package main

import (
	"fmt"
	"time"

	"github.com/inancgumus/screen"
)

func main() {
	type placeholder [5]string
	zero := placeholder{
		"∎∎∎",
		"∎ ∎",
		"∎ ∎",
		"∎ ∎",
		"∎∎∎",
	}
	one := placeholder{
		"∎∎ ",
		" ∎ ",
		" ∎ ",
		" ∎ ",
		"∎∎∎",
	}
	two := placeholder{
		"∎∎∎",
		"  ∎",
		"∎∎∎",
		"∎  ",
		"∎∎∎",
	}
	three := placeholder{
		"∎∎∎",
		"  ∎",
		"∎∎∎",
		"  ∎",
		"∎∎∎",
	}
	four := placeholder{
		"∎ ∎",
		"∎ ∎",
		"∎∎∎",
		"  ∎",
		"  ∎",
	}
	five := placeholder{
		"∎∎∎",
		"∎  ",
		"∎∎∎",
		"  ∎",
		"∎∎∎",
	}
	six := placeholder{
		"∎∎∎",
		"∎  ",
		"∎∎∎",
		"∎ ∎",
		"∎∎∎",
	}
	seven := placeholder{
		"∎∎∎",
		"  ∎",
		"  ∎",
		"  ∎",
		"  ∎",
	}
	eigth := placeholder{
		"∎∎∎",
		"∎ ∎",
		"∎∎∎",
		"∎ ∎",
		"∎∎∎",
	}
	nine := placeholder{
		"∎∎∎",
		"∎ ∎",
		"∎∎∎",
		"  ∎",
		"∎∎∎",
	}

	separator := placeholder{
		"   ",
		" ⚅ ",
		"   ",
		" ⚅ ",
		"   ",
	}

	digits := [...]placeholder{
		zero, one, two, three, four, five, six, seven, eigth, nine,
	}
	screen.Clear()
	for {
		screen.MoveTopLeft()
		current := time.Now()
		hour, min, sec := current.Hour(), current.Minute(), current.Second()

		clock := [...]placeholder{
			digits[hour/10], digits[hour%10],
			separator,
			digits[min/10], digits[min%10],
			separator,
			digits[sec/10], digits[sec%10],
		}

		for line := range clock[0] {
			for index, digit := range clock {
				next := clock[index][line]

				if digit == separator && sec%2 == 0 {
					next = "   "
				}

				fmt.Print(next, " ")
			}
			fmt.Println()
		}
		time.Sleep(time.Second)

	}

}
