package main

func fourSumCount(A []int, B []int, C []int, D []int) int {
	m := make(map[int]int)
	count := 0
	for _, av := range A {
		for _, bv := range B {
			m[av+bv] += 1
		}
	}
	for _, cv := range C {
		for _, dv := range D {
			count += m[-(cv + dv)]
		}
	}
	return count
}
