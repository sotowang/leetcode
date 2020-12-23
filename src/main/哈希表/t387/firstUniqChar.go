package t387

func firstUniqChar(s string) int {
	chars := make([]int, 26)
	for _, v := range s {
		chars[v-'a']++
	}
	for i := range s {
		if chars[s[i]-'a'] == 1 {
			return i
		}
	}
	return -1
}
