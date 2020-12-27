package t205

func isIsomorphic(s string, t string) bool {
	lens, lent := len(s), len(t)
	if lens != lent {
		return false
	}
	keyMap := make(map[byte]byte)
	valMap := make(map[byte]byte)
	for i := 0; i < lens; i++ {
		if _, ok := keyMap[s[i]]; !ok {
			if _, ok := valMap[t[i]]; ok {
				return false
			}
			keyMap[s[i]] = t[i]
			valMap[t[i]] = s[i]
		} else if keyMap[s[i]] != t[i] {
			return false
		}
	}
	return true
}
