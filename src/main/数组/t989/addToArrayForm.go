package main

import "fmt"

func addToArrayForm(A []int, K int) []int {
	n := len(A)
	lastNum := K
	res := make([]int, 0)
	i := n - 1
	for i >= 0 || lastNum > 0 {
		if i >= 0 {
			lastNum += A[i]
		}
		res = append(res, lastNum%10)
		lastNum /= 10
		i--
	}
	reverse(res)
	return res
}
func reverse(res []int) {
	n := len(res)
	for i := 0; i < n/2; i++ {
		res[i], res[n-i-1] = res[n-i-1], res[i]
	}
}

func main() {
	A := []int{9, 9, 9, 9}
	fmt.Println(addToArrayForm(A, 1))
}
