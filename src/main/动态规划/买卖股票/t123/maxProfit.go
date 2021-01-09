package t123

func maxProfit(prices []int) int {
	if prices == nil || len(prices) == 0 {
		return 0
	}
	n := len(prices)
	dp := make([][3][2]int, n)
	dp[0][0][1] = -prices[0]
	dp[0][1][0] = -10086
	dp[0][2][0] = -10086
	dp[0][1][1] = -10086
	max := func(a, b int) int {
		if a > b {
			return a
		}
		return b
	}
	for i := 1; i < n; i++ {
		dp[i][0][0] = 0
		dp[i][1][0] = max(dp[i-1][0][1]+prices[i], dp[i-1][1][0])
		dp[i][2][0] = max(dp[i-1][1][1]+prices[i], dp[i-1][2][0])
		dp[i][0][1] = max(dp[i-1][0][1], dp[i-1][0][0]-prices[i])
		dp[i][1][1] = max(dp[i-1][1][1], dp[i-1][1][0]-prices[i])
		dp[i][2][1] = -10086
	}

	return max(max(dp[n-1][1][0], dp[n-1][2][0]), 0)
}
