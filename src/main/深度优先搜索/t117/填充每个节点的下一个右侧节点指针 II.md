# [填充每个节点的下一个右侧节点指针 II](https://leetcode-cn.com/problems/populating-next-right-pointers-in-each-node-ii/)

给定一个二叉树

```
struct Node {
  int val;
  Node *left;
  Node *right;
  Node *next;
}
```

 填充它的每个 next 指针，让这个指针指向其下一个右侧节点。如果找不到下一个右侧节点，则将 next 指针设置为 `NULL`。 

 初始状态下，所有 next 指针都被设置为 `NULL`。 

 **示例：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2019/02/15/117_sample.png)

```
输入：{"$id":"1","left":{"$id":"2","left":{"$id":"3","left":null,"next":null,"right":null,"val":4},"next":null,"right":{"$id":"4","left":null,"next":null,"right":null,"val":5},"val":2},"next":null,"right":{"$id":"5","left":null,"next":null,"right":{"$id":"6","left":null,"next":null,"right":null,"val":7},"val":3},"val":1}

输出：{"$id":"1","left":{"$id":"2","left":{"$id":"3","left":null,"next":{"$id":"4","left":null,"next":{"$id":"5","left":null,"next":null,"right":null,"val":7},"right":null,"val":5},"right":null,"val":4},"next":{"$id":"6","left":null,"next":null,"right":{"$ref":"5"},"val":3},"right":{"$ref":"4"},"val":2},"next":null,"right":{"$ref":"6"},"val":1}

解释：给定二叉树如图 A 所示，你的函数应该填充它的每个 next 指针，以指向其下一个右侧节点，如图 B 所示。

```

**提示：**

- 你只能使用常量级额外空间。
- 使用递归解题也符合要求，本题中递归程序占用的栈空间不算做额外的空间复杂度。

---

 https://leetcode-cn.com/problems/populating-next-right-pointers-in-each-node-ii/solution/c-o1kong-jian-jian-ji-di-gui-by-qqqun902025048/ 

* 对于任意一次递归，只考虑如何设置子节点的 next 属性,分为三种情况：
* 没有子节点：直接返回
* 有一个子节点：将这个子节点的 `next `属性设置为同层的下一个节点，即为 `root.next` 的最左边的一个节点，如果 `root.next` 没有子节点，则考虑 `root.next.next`，依次类推
* 有两个节点：左子节点指向右子节点，然后右子节点同第二种情况的做法

*  注意递归的顺序需要从右到左 

