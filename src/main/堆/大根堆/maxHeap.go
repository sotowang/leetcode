package main

import (
	"container/heap"
	"fmt"
)

var cnt [26]int

type MaxHeap []int

func (h MaxHeap) Len() int {
	return len(h)
}
func (h MaxHeap) Less(i, j int) bool {
	return cnt[h[i]] > cnt[h[j]]
}
func (h MaxHeap) Swap(i, j int) {
	h[i], h[j] = h[j], h[i]
}
func (h *MaxHeap) Push(x interface{}) {
	*h = append(*h, x.(int))
}

// Pop 弹出最后一个元素
func (h *MaxHeap) Pop() interface{} {
	res := (*h)[len(*h)-1]
	*h = (*h)[:len(*h)-1]
	return res
}
func main() {
	h := make(MaxHeap, 0)
	heap.Init(&h)
	cnt = [26]int{}
	cnt[8] = 5
	cnt[1] = 4
	cnt[4] = 3
	cnt[5] = 2
	cnt[2] = 1

	heap.Push(&h, 8)
	heap.Push(&h, 1)
	heap.Push(&h, 4)
	heap.Push(&h, 5)
	heap.Push(&h, 2)

	fmt.Println(heap.Pop(&h))
	fmt.Println(heap.Pop(&h))
	fmt.Println(heap.Pop(&h))
	fmt.Println(heap.Pop(&h))
	fmt.Println(heap.Pop(&h))

}
