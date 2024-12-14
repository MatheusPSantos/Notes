package main

import "fmt"

func main() {
	multi := [2][3]int{
		[3]int{2, 5, 6},
		[3]int{1, 5, 9},
	}

	fmt.Println(multi)

	student1 := [3]float64{5, 6, 1}
	student2 := [3]float64{9, 8, 4}

	var sum float64
	sum += student1[0] + student1[1] + student1[2]
	sum += student2[0] + student2[1] + student2[2]

	const N = float64(len(student1) * 2)

	fmt.Printf("Avg Grade: %g\n", sum/N)

	nStudents := [2][3]float64{
		[3]float64{5, 6, 7},
		[3]float64{8, 9, 4},
	}

	var sum2 float64

	for _, grades := range nStudents {
		for _, grade := range grades {
			sum2 += grade
		}
	}

	fmt.Printf("%g\n", sum2)
}
