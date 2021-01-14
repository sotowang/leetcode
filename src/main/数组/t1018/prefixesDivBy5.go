package t1018

func prefixesDivBy5(A []int) []bool {
	n := len(A)
	res := make([]bool, n)
	num := 0
	for i := range A {
		num <<= 1
		num += A[i]
		num %= 10
		res[i] = num%5 == 0
	}
	return res
}
