package t435

import "sort"

func eraseOverlapIntervals(intervals [][]int) int {
	if intervals == nil || len(intervals) == 0 {
		return 0
	}
	n := len(intervals)
	sort.Slice(intervals, func(i, j int) bool {
		return intervals[i][1] < intervals[j][1]
	})
	right, count := intervals[0][1], 1
	for i := 0; i < n; i++ {
		if right > intervals[i][0] {
			continue
		} else {
			count++
			right = intervals[i][1]
		}

	}
	return n - count
}
