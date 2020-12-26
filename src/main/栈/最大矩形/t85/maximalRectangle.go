package main

func max(a, b int) int {
	if a > b {
		return a
	}
	return b
}
func maximalRectangle(matrix [][]byte) int {
	if matrix == nil || len(matrix) == 0 {
		return 0
	}
	rows, cols := len(matrix), len(matrix[0])
	rec := make([]int, cols)
	maxVal := 0
	for i := 0; i < rows; i++ {
		for j := 0; j < cols; j++ {
			if matrix[i][j] == '0' {
				rec[j] = 0
			} else {
				rec[j]++
			}
		}
		maxVal = max(calculateLargestArea(rec), maxVal)
	}
	return maxVal
}
func calculateLargestArea(matrix []int) int {
	stack := []int{0}
	maxVal, n := 0, len(matrix)
	for i := 1; i < n; i++ {
		for len(stack) > 0 && matrix[i] < matrix[stack[len(stack)-1]] {
			popIndex, topIndex := stack[len(stack)-1], -1
			stack = stack[:len(stack)-1]
			if len(stack) != 0 {
				topIndex = stack[len(stack)-1]
			}
			maxVal = max((i-topIndex-1)*matrix[popIndex], maxVal)
		}
		stack = append(stack, i)

	}
	for len(stack) > 0 {
		popIndex, topIndex := stack[len(stack)-1], -1
		stack = stack[:len(stack)-1]
		if len(stack) != 0 {
			topIndex = stack[len(stack)-1]
		}
		maxVal = max((len(matrix)-topIndex-1)*matrix[popIndex], maxVal)
	}
	return maxVal
}

func main() {
	matrix := [][]byte{{'1', '0', '1', '0', '0'},
		{'1', '0', '1', '1', '1'},
		{'1', '1', '1', '1', '1'},
		{'1', '0', '0', '1', '0'}}
	maximalRectangle(matrix)
}
