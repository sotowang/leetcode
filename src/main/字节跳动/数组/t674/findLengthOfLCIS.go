package t674

func findLengthOfLCIS(nums []int) int {
	n := len(nums)
	if n < 2 {
		return n
	}
	peak, count := 0, 1
	for i := 0; i < n-1; i++ {
		if nums[i+1] > nums[i] {
			count++
		} else {
			count = 1
		}
		if count > peak {
			peak = count
		}
	}
	return peak
}
