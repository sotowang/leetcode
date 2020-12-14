package main

import (
	"fmt"
	"sort"
)

func groupAnagrams(strs []string) [][]string {
	if strs == nil || len(strs) == 0 {
		return [][]string{}
	}
	n := len(strs)
	getKey := func(byteArray []byte) string {
		sort.Slice(byteArray, func(i, j int) bool {
			return byteArray[i] < byteArray[j]
		})
		return string(byteArray)
	}
	hashMap := make(map[string][]string)
	for i := 0; i < n; i++ {
		bytes := []byte(strs[i])
		key := getKey(bytes)
		hashMap[key] = append(hashMap[key], strs[i])
	}
	res := make([][]string, 0, len(hashMap))
	for _, v := range hashMap {
		res = append(res, v)
	}
	return res
}
func main() {
	strs := []string{"eat", "tea", "tan", "ate", "nat", "bat"}
	fmt.Printf("%v", groupAnagrams(strs))

}
