package main

func minCostClimbingStairs(cost []int) int {
	min := func(a, b int) int {
		if a > b {
			return b
		}
		return a
	}
	n := len(cost)
	for i := 2; i < n; i++ {
		cost[i] += min(cost[i-1], cost[i-2])
	}
	return min(cost[n-1], cost[n-2])
}
