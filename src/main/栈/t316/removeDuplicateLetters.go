package main

func removeDuplicateLetters(s string) string {
	var stack []byte
	n := len(s)
	contians := func(stack []byte, key byte) bool {
		for _, v := range stack {
			if v == key {
				return true
			}
		}
		return false
	}
	indexOf := func(s string, fromIndex int, key byte) int {
		n := len(s)
		for i := fromIndex; i < n; i++ {
			if s[i] == key {
				return i
			}
		}
		return -1
	}
	for i := 0; i < n; i++ {
		if contians(stack, s[i]) {
			continue
		}
		for slen := len(stack); slen > 0 && stack[slen-1] > s[i] && indexOf(s, i, stack[slen-1]) != -1; {
			stack = stack[:slen-1]
			slen = len(stack)
		}
		stack = append(stack, s[i])
	}
	res := ""
	for _, v := range stack {
		res += string(v)
	}
	return res

}
func main() {
	s := "cbacdcbc"
	removeDuplicateLetters(s)
}
