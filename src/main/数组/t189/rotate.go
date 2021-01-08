package t189

func rotate(nums []int, k int) {
	if nums == nil || len(nums) == 0 {
		return
	}
	n := len(nums)
	k = k % n
	reverse := func(nums []int, start, end int) {
		for start < end {
			nums[start], nums[end] = nums[end], nums[start]
			start++
			end--
		}
	}
	reverse(nums, 0, n-1)
	reverse(nums, 0, k-1)
	reverse(nums, k, n-1)
}
