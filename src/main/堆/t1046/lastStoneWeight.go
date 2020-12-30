package t1046

import "sort"

func abs(a, b int) int {
	if a > b {
		return a - b
	}
	return b - a
}
func lastStoneWeight(stones []int) int {
	n := len(stones)
	if n == 1 {
		return stones[0]
	}
	if n == 2 {
		return abs(stones[0], stones[1])
	}
	sort.Ints(stones)
	if stones[n-3] == 0 {
		return stones[n-1] - stones[n-2]
	}
	stones[n-1] -= stones[n-2]
	stones[n-2] = 0
	return lastStoneWeight(stones)
}
