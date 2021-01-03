package t86

type ListNode struct {
	Val  int
	Next *ListNode
}

func partition(head *ListNode, x int) *ListNode {
	if head == nil {
		return head
	}
	cur := head
	small, big := &ListNode{-1, nil}, &ListNode{-1, nil}
	p, q := small, big
	for cur != nil {
		if cur.Val < x {
			p.Next = cur
			p = p.Next
		} else {
			q.Next = cur
			q = q.Next
		}
		cur = cur.Next
	}
	p.Next = big.Next
	q.Next = nil
	return small.Next
}
