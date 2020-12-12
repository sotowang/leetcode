package t376

func wiggleMaxLength(nums []int) int {
	len := len(nums)
	if len < 2 {
		return len
	}
	up, down := 1, 1
	for i := 1; i < len; i++ {
		if nums[i] > nums[i-1] {
			up = down + 1
		} else if nums[i] < nums[i-1] {
			down = up + 1
		}
	}
	if up > down {
		return up
	}
	return down
}
