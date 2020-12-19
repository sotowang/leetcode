package t48

func rotate(matrix [][]int) {
	rows, cols := len(matrix), len(matrix[0])
	start, end := 0, cols-1
	for start < end {
		for i := 0; i < cols; i++ {
			matrix[start][i], matrix[end][i] = matrix[end][i], matrix[start][i]
		}
		start++
		end--
	}
	for i := 0; i < rows; i++ {
		for j := 0; j < i; j++ {
			matrix[i][j], matrix[j][i] = matrix[j][i], matrix[i][j]
		}
	}
}
