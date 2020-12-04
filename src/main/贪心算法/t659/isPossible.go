package t659

func isPossible(nums []int) bool {
	if len(nums) < 3 {
		return false
	}
	cntMap, endMap := make(map[int]int, len(nums)), make(map[int]int, len(nums))
	for i := range nums {
		cntMap[nums[i]]++
	}
	for _, n := range nums {
		if cntMap[n] == 0 {
			continue
		}
		cntMap[n]--
		if endMap[n-1] > 0 {
			endMap[n]++
			endMap[n-1]--
		} else if cntMap[n+1] > 0 && cntMap[n+2] > 0 {
			endMap[n+2]++
			cntMap[n+1]--
			cntMap[n+2]--
		} else {
			return false
		}
	}
	return true
}
