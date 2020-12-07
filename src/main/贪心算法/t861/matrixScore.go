package t861

func matrixScore(A [][]int) int {
	rows, cols := len(A), len(A[0])
	for i := 0; i < rows; i++ {
		if A[i][0] == 0 {
			for j := 0; j < cols; j++ {
				A[i][j] ^= 1
			}
		}
	}
	res := 0
	for i := 0; i < cols; i++ {
		count := 0
		for j := 0; j < rows; j++ {
			count += A[j][i]
		}
		if rows-count > count {
			count = rows - count
		}
		res += count * (1 << (cols - i - 1))
	}
	return res
}
