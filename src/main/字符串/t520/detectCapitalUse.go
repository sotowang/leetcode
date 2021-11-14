package t520

func detectCapitalUse(word string) bool {
	upperLen := 0
	for i := 0; i < len(word); i++ {
		if checkIsUpper(string(word[i])) {
			upperLen++
		}
	}
	if len(word) == upperLen || (upperLen == 1 && checkIsUpper(string(word[0])) || upperLen == 0) {
		return true
	}
	return false
}
func checkIsUpper(c string) bool {
	if c >= "A" && c <= "Z" {
		return true
	}
	return false
}
