# [杨辉三角 II](https://leetcode-cn.com/problems/pascals-triangle-ii/)

给定一个非负索引 *k*，其中 *k* ≤ 33，返回杨辉三角的第 *k* 行。

![img](https://upload.wikimedia.org/wikipedia/commons/0/0d/PascalTriangleAnimated2.gif)

在杨辉三角中，每个数是它左上方和右上方的数的和。

**示例:**

```
输入: 3
输出: [1,3,3,1]
```

**进阶：**

你可以优化你的算法到  `O(k) `空间复杂度吗？

---

https://leetcode-cn.com/problems/pascals-triangle-ii/solution/js-yang-hui-san-jiao-ii-972-shi-suan-he-tu-suan-si/

```angelscript
/**
 * 获取杨辉三角的指定行
 * 直接使用组合公式C(n,i) = n!/(i!*(n-i)!)
 * 则第(i+1)项是第i项的倍数=(n-i)/(i+1);
 */
```