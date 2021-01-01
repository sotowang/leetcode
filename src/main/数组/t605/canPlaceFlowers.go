package t605

func canPlaceFlowers(flowerbed []int, n int) bool {
	cntOfZero, lens := 0, len(flowerbed)
	newFlowerbed := make([]int, lens+2)
	for i := 0; i < lens; i++ {
		newFlowerbed[i+1] = flowerbed[i]
	}
	for i := 0; i < lens+2 && n > 0; i++ {
		if newFlowerbed[i] == 0 {
			if i > 0 && newFlowerbed[i-1] == 1 {
				cntOfZero = 0
			}
			cntOfZero++
			if cntOfZero == 3 {
				cntOfZero = 1
				n--
			}
		}
	}
	return n == 0
}
