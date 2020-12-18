package t389

func findTheDifference(s string, t string) byte {
	arr := make([]int, 26)
	n := len(s)
	for i := 0; i < n; i++ {
		arr[s[i]-'a']++
	}
	n = len(t)
	for i := 0; i < n; i++ {
		if arr[t[i]-'a'] == 0 {
			return t[i]
		}
		arr[t[i]-'a']--
	}
	return ' '
}
