package t714

func maxProfit(prices []int, fee int) int {
	p0, p1 := 0, -prices[0]
	n := len(prices)
	for i := 2; i <= n; i++ {
		tem0 := p1 + prices[i-1] - fee
		tem1 := p0 - prices[i-1]
		if tem0 > p0 {
			p0 = tem0
		}
		if tem1 > p1 {
			p1 = tem1
		}
	}
	return p0
}
