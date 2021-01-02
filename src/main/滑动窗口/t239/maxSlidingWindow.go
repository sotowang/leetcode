package main

import "fmt"

func maxSlidingWindow(nums []int, k int) []int {
	if nums == nil || len(nums) < 2 {
		return nums
	}
	n := len(nums)
	res, win := make([]int, n-k+1), make([]int, 0)

	for i := range nums {
		for len(win) > 0 && nums[win[len(win)-1]] <= nums[i] {
			win = win[:len(win)-1]
		}
		win = append(win, i)
		if win[0] <= i-k {
			win = win[1:]
		}
		if i+1 >= k {
			res[i+1-k] = nums[win[0]]
		}
	}
	return res

}

func main() {
	nums := []int{1, 3, 1, 2, 0, 5}
	res := maxSlidingWindow(nums, 3)
	fmt.Printf("%v ", res)
}
