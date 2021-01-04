package t509

func fib(n int) int {
	if n <= 1 {
		return n
	}
	count, one, two, three := 3, 1, 1, 1
	for count <= n {
		three = one + two
		one, two = two, three
		count++
	}
	return three
}
