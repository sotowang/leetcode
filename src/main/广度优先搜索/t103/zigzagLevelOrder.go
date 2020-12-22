package main

import "fmt"

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

func traversal(root *TreeNode, resList *[][]int, level int) {
	if root == nil {
		return
	}
	if len(*resList) == level {
		*resList = append(*resList, make([]int, 0))
	}
	if level&1 == 1 {
		(*resList)[level] = append([]int{root.Val}, (*resList)[level]...)
	} else {
		(*resList)[level] = append((*resList)[level], root.Val)
	}
	traversal(root.Left, resList, level+1)
	traversal(root.Right, resList, level+1)
}
func zigzagLevelOrder(root *TreeNode) [][]int {
	resList := make([][]int, 0)
	traversal(root, &resList, 0)
	return resList
}

func main() {
	t15 := TreeNode{15, nil, nil}
	t7 := TreeNode{7, nil, nil}
	t9 := TreeNode{9, nil, nil}
	t20 := TreeNode{20, &t15, &t7}
	root := TreeNode{3, &t9, &t20}

	res := zigzagLevelOrder(&root)
	fmt.Printf("%v", res)
}
