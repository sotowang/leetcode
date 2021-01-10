package t228

import "strconv"

func summaryRanges(nums []int) []string {
	res := make([]string, 0)
	if nums == nil || len(nums) == 0 {
		return res
	}
	n := len(nums)
	start, end := nums[0], nums[n-1]
	for i := 0; i < n-1; i++ {
		if nums[i]+1 == nums[i+1] {
			continue
		}
		end = nums[i]
		if start == end {
			res = append(res, strconv.Itoa(start))
		} else {
			res = append(res, strconv.Itoa(start)+"->"+strconv.Itoa(end))
		}
		start = nums[i+1]
		end = nums[n-1]
	}
	if start == end {
		res = append(res, strconv.Itoa(start))
	} else {
		res = append(res, strconv.Itoa(start)+"->"+strconv.Itoa(end))
	}
	return res
}
