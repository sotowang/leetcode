package t204

func countPrimes(n int) int {
	isNotPrim := make([]bool, n)
	for i := 2; i*i <= n; i++ {
		if !isNotPrim[i] {
			for j := i * i; j < n; j += i {
				isNotPrim[j] = true
			}
		}
	}
	count := 0
	for i := 2; i < n; i++ {
		if !isNotPrim[i] {
			count++
		}
	}
	return count
}
