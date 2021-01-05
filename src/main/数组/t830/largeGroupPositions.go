package main

import "fmt"

func largeGroupPositions(s string) [][]int {
	res := make([][]int, 0)
	n, start := len(s), 0
	var tem byte = ' '
	for i := range s {
		if s[i] != tem {
			if i-start >= 3 {
				res = append(res, []int{start, i - 1})
			}
			start = i
			tem = s[i]
		}
	}
	if n-start >= 3 {
		res = append(res, []int{start, n - 1})
	}
	return res
}
func main() {
	fmt.Printf("%v", largeGroupPositions("abbxxxxzzy"))
}
