package main

import (
	"fmt"
	"strings"
)

func wordPattern(pattern string, s string) bool {
	ss := strings.Fields(s)
	pLen, sLen := len(pattern), len(ss)
	if pLen != sLen {
		return false
	}
	keyMap := make(map[byte]string)
	valueMap := make(map[string]byte)
	for i := 0; i < pLen; i++ {
		if _, ok := keyMap[pattern[i]]; !ok {
			if _, ok := valueMap[ss[i]]; ok {
				return false
			}
			keyMap[pattern[i]] = ss[i]
			valueMap[ss[i]] = pattern[i]
		} else if val, _ := keyMap[pattern[i]]; val != ss[i] {
			return false
		}
	}
	return true
}

func main() {
	s := "dog cat cat dog"
	pattern := "abba"
	fmt.Print(wordPattern(pattern, s))
}
