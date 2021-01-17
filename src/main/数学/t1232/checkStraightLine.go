package t1232

func checkStraightLine(coordinates [][]int) bool {
	x, y := coordinates[0][0]-coordinates[1][0], coordinates[0][1]-coordinates[1][1]
	for i := 2; i < len(coordinates); i++ {
		if x*(coordinates[i][1]-coordinates[i-1][1]) != y*(coordinates[i][0]-coordinates[i-1][0]) {
			return false
		}
	}
	return true
}
