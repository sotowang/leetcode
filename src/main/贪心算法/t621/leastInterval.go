package main

import "sort"

func leastInterval(tasks []byte, n int) int {
	if n == 0 {
		return len(tasks)
	}
	types := make([]int, 26)
	for _, v := range tasks {
		types[v-'A']++
	}
	sort.Ints(types)
	maxCount := types[25]
	minTime := (maxCount-1)*(n+1) + 1
	index := 24
	for index >= 0 && types[index] == maxCount {
		minTime++
		index--
	}
	if minTime > len(tasks) {
		return minTime
	}
	return len(tasks)
}
func main() {
	tasks := []byte{'A', 'A', 'A', 'B', 'B', 'B'}
	println(leastInterval(tasks, 2))

}
