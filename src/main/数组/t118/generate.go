package t118

/**
https://leetcode-cn.com/problems/pascals-triangle/solution/go-shuang-bai-by-ba-xiang-6/
*/
func generate(numRows int) [][]int {
	if numRows == 0 {
		return [][]int{}
	}
	var res [][]int
	res = append(res, []int{1})
	for i := 1; i < numRows; i++ {
		m := []int{0}
		m = append(m, res[i-1]...)
		for j := 0; j < len(m)-1; j++ {
			m[j] += m[j+1]
		}
		res = append(res, m)
	}
	return res
}
