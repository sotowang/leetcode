package main

import (
	"fmt"
	"sort"
)

func searchRange(nums []int, target int) []int {
	n := len(nums)
	left, right, low, high := -1, -1, 0, n-1
	for low <= high {
		mid := low + (high-low)>>1
		if nums[mid] == target {
			left, right = mid, mid
			for left >= 0 && nums[left] == target {
				left--
			}
			if left+1 > 0 {
				left++
			} else {
				left = 0
			}
			for right < n && nums[right] == target {
				right++
			}
			if right-1 < n-1 {
				right--
			} else {
				right = n - 1
			}
			break
		} else if nums[mid] > target {
			high = mid - 1
		} else {
			low = mid + 1
		}
	}
	return []int{left, right}

}

func searchRange2(nums []int, target int) []int {
	leftmost := sort.SearchInts(nums, target)
	if leftmost == len(nums) || nums[leftmost] != target {
		return []int{-1, -1}
	}
	rightmost := sort.SearchInts(nums, target+1) - 1
	return []int{leftmost, rightmost}
}
func main() {
	nums := []int{5, 7, 7, 8, 8, 10}
	for _, v := range searchRange2(nums, 8) {
		fmt.Printf("%v , ", v)
	}
}
