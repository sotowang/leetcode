# 最长连续递增序列

给定一个未经排序的整数数组，找到最长且**连续**的的递增序列。

**示例 1:**

```
输入: [1,3,5,4,7]
输出: 3
解释: 最长连续递增序列是 [1,3,5], 长度为3。
尽管 [1,3,5,7] 也是升序的子序列, 但它不是连续的，因为5和7在原数组里被4隔开。 
```

**示例 2:**

```
输入: [2,2,2,2,2]
输出: 1
解释: 最长连续递增序列是 [2], 长度为1。
```

**注意：**数组长度不会超过10000。

---

https://leetcode-cn.com/problems/longest-continuous-increasing-subsequence/solution/hua-jie-suan-fa-674-zui-chang-lian-xu-di-zeng-xu-l/

过程：

* count 为当前元素峰值，ans为最大峰值
* 初始化 count = 1
* 从 0 位置开始遍历，遍历时根据前后元素状态判断是否递增递增则 count++，递减则 count=1
* 如果 count>ans，则更新 ans
* 直到循环结束
* 时间复杂度：O(N)O(N)

