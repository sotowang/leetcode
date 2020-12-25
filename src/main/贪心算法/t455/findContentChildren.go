package t455

import "sort"

func findContentChildren(g []int, s []int) int {
	sort.Ints(g)
	sort.Ints(s)
	index, count := 0, 0
	gLen, sLen := len(g), len(s)
	for i := 0; i < gLen; i++ {
		for index < sLen && s[index] < g[i] {
			index++
		}
		if index < sLen && count <= sLen {
			count++
			index++
		} else {
			break
		}
	}
	return count
}
