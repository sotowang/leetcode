package t493

func reversePairs(nums []int) int {
	if len(nums) < 2 {
		return 0
	}
	count := 0
	mergeSort(nums, 0, len(nums)-1, &count)
	return count
}
func mergeSort(nums []int, start, end int, count *int) {
	if start == end {
		return
	}
	mid := start + (end-start)>>1
	mergeSort(nums, start, mid, count)
	mergeSort(nums, mid+1, end, count)
	left, right := start, mid+1
	for left <= mid && right <= end {
		if nums[left] > 2*nums[right] {
			*count += mid - left + 1
			right++
		} else {
			left++
		}
	}
	left, right = start, mid+1
	tem := make([]int, end-start+1)
	index := 0
	for left <= mid && right <= end {
		if nums[left] < nums[right] {
			tem[index] = nums[left]
			index++
			left++
		} else {
			tem[index] = nums[right]
			index++
			right++
		}
	}
	for left <= mid {
		tem[index] = nums[left]
		index++
		left++
	}
	for right <= end {
		tem[index] = nums[right]
		index++
		right++
	}
	index = 0
	for i := start; i <= end; i++ {
		nums[i] = tem[index]
		index++
	}
}
