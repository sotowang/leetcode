package main

import "fmt"

func maxNumber(nums1 []int, nums2 []int, k int) []int {
	res := make([]int, k)
	for i := 0; i <= k && i <= len(nums1); i++ {
		if k-i >= 0 && k-i <= len(nums2) {
			tem := merge(subMaxNum(nums1, i), subMaxNum(nums2, k-i))
			if compare(tem, 0, res, 0) {
				res = tem
			}
		}
	}
	return res
}
func subMaxNum(num []int, size int) []int {
	n := len(num)
	dropCount, cur := n-size, 0
	res := make([]int, size)
	for _, v := range num {
		for cur > 0 && res[cur-1] < v && dropCount > 0 {
			dropCount--
			cur--
		}
		if cur < size {
			res[cur] = v
			cur++
		} else {
			dropCount--
		}
	}
	return res
}

func merge(nums1, nums2 []int) []int {
	res := make([]int, len(nums2)+len(nums1))
	len, cur, p1, p2 := len(res), 0, 0, 0
	for cur < len {
		if compare(nums1, p1, nums2, p2) {
			res[cur] = nums1[p1]
			cur++
			p1++
		} else {
			res[cur] = nums2[p2]
			cur++
			p2++
		}
	}
	return res

}
func compare(nums1 []int, p1 int, nums2 []int, p2 int) bool {
	if p2 >= len(nums2) {
		return true
	}
	if p1 >= len(nums1) {
		return false
	}
	if nums1[p1] > nums2[p2] {
		return true
	} else if nums1[p1] < nums2[p2] {
		return false
	} else {
		p1++
		p2++
		return compare(nums1, p1, nums2, p2)
	}
}

func main() {
	nums1 := []int{3, 4, 6, 5}
	nums2 := []int{9, 1, 2, 5, 8, 3}
	for _, v := range maxNumber(nums1, nums2, 5) {
		fmt.Println(v)
	}
}
