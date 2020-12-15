package t738

import "strconv"

func monotoneIncreasingDigits(N int) int {
	if N < 10 {
		return N
	}
	nums := []byte(strconv.Itoa(N))
	len, index := len(nums), -1
	for i := len - 1; i > 0; i-- {
		if nums[i] < nums[i-1] {
			index = i
			nums[i-1]--
		}
	}
	if index != -1 {
		for i := index; i < len; i++ {
			nums[i] = '9'
		}
	}
	res, _ := strconv.Atoi(string(nums))
	return res
}
