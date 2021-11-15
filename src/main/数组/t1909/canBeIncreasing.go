package t1909

func canBeIncreasing(nums []int) bool {
	count := 0
	leftMax := nums[0]
	rightMin := nums[len(nums)-1]
	for i := 1; i < len(nums); i++ {
		if nums[i] <= leftMax {
			count++
			if count > 1 {
				break
			}
		} else {
			leftMax = nums[i]
		}
	}
	if count <= 1 {
		return true
	}
	count = 0
	for i := len(nums) - 2; i >= 0; i-- {
		if nums[i] >= rightMin {
			count++
			if count > 1 {
				return false
			}
		} else {
			rightMin = nums[i]
		}
	}
	return true
}
