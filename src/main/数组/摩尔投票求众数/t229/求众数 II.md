# [求众数 II](https://leetcode-cn.com/problems/majority-element-ii/)

给定一个大小为 *n* 的数组，找出其中所有出现超过 `⌊ n/3 ⌋` 次的元素。

**说明:** 要求算法的时间复杂度为 O(n)，空间复杂度为 O(1)。

**示例 1:**

```
输入: [3,2,3]
输出: [3]
```

**示例 2:**

```
输入: [1,1,1,3,3,2,2,2]
输出: [1,2]
```

---

https://leetcode-cn.com/problems/majority-element-ii/comments/

【笔记】摩尔投票法。该算法用于1/2情况，它说：“在任何数组中，出现次数大于该数组长度一半的值只能有一个。”

那么，改进一下用于1/3。可以着么说：“在任何数组中，出现次数大于该数组长度1/3的值最多只有两个。”

于是，需要定义两个变量。空间复杂度为O(1)。

https://www.zhihu.com/question/49973163