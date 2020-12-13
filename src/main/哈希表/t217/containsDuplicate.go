package t217

func containsDuplicate(nums []int) bool {
	n := len(nums)
	if n < 2 {
		return false
	}
	set := make(map[int]int)
	for _, v := range nums {
		if _, ok := set[v]; ok {
			return true
		}
		set[v] = 1
	}
	return false
}
