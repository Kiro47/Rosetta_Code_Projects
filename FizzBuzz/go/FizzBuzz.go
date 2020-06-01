package main

import "fmt"

// Normal fizzbuzz based on 3 and 5

func main() {
	var max = 100
	var min = 0

	for i := min; i <= max; i++ {
		if i % 15 == 0 {
			fmt.Println(i,"FizzBuzz")
		} else if  i % 5 == 0 {
			fmt.Println(i,"Buzz")
		} else if i % 3 == 0 {
			fmt.Println(i,"Fizz")
		}
	}

}
