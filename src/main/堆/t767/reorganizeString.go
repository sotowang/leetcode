package main

import (
	"container/heap"
	"sort"
)

var cnt [26]int

type MaxHeap struct {
	sort.IntSlice
}

func (h MaxHeap) Less(i, j int) bool {
	return cnt[h.IntSlice[i]] > cnt[h.IntSlice[j]]
}

func (h *MaxHeap) Push(v interface{}) {
	h.IntSlice = append(h.IntSlice, v.(int))
}
func (h *MaxHeap) Pop() interface{} {
	a := h.IntSlice
	v := a[len(a)-1]
	h.IntSlice = a[:len(a)-1]
	return v
}
func (h *MaxHeap) push(v int) { heap.Push(h, v) }
func (h *MaxHeap) pop() int   { return heap.Pop(h).(int) }

func reorganizeString(S string) string {
	n := len(S)
	if n <= 1 {
		return S
	}
	cnt = [26]int{}
	for _, ch := range S {
		cnt[ch-'a']++
	}
	h := &MaxHeap{}
	for i, c := range cnt {
		if c > 0 {
			h.IntSlice = append(h.IntSlice, i)
		}
	}
	heap.Init(h)
	if cnt[h.IntSlice[0]] > (n+1)/2 {
		return ""
	}
	ans := make([]byte, 0, n)
	for len(h.IntSlice) > 1 {
		i, j := h.pop(), h.pop()
		ans = append(ans, byte('a'+i), byte('a'+j))
		if cnt[i]--; cnt[i] > 0 {
			h.push(i)
		}
		if cnt[j]--; cnt[j] > 0 {
			h.push(j)
		}
	}
	if len(h.IntSlice) > 0 {
		ans = append(ans, byte('a'+h.IntSlice[0]))
	}
	return string(ans)

}
func main() {
	print(reorganizeString("vvvlo"))
}
