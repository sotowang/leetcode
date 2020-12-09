package main

import (
	"fmt"
	"math"
	"strconv"
)

func splitIntoFibonacci(S string) (res []int) {
	var backTrace func(s string, index int) bool
	backTrace = func(s string, index int) bool {
		if index == len(s) {
			return len(res) > 2
		}
		for i := index + 1; i <= len(s); i++ {
			tem := s[index:i]
			j, _ := strconv.ParseInt(tem, 10, 64)
			if j > math.MaxInt32 || (len(tem) != 1 && tem[0] == '0') {
				return false
			}
			str, _ := strconv.Atoi(tem)
			var one, two int
			if len(res) >= 2 {
				one = res[len(res)-1]
				two = res[len(res)-2]
			} else {
				one = -1
				two = -1
			}
			if one != -1 && two != -1 && one+two < str {
				break
			}

			res = append(res, str)
			if (one == -1 && two == -1 || one+two == str) && backTrace(s, i) {
				return true
			}
			res = res[:len(res)-1]
		}
		return false

	}
	//var res []int
	backTrace(S, 0)
	return res
}

func main() {
	fmt.Print(splitIntoFibonacci("123456579"))
}
