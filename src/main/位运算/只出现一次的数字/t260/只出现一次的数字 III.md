# [只出现一次的数字 III](https://leetcode-cn.com/problems/single-number-iii/)

 给定一个整数数组 `nums`，其中恰好有两个元素只出现一次，其余所有元素均出现两次。 找出只出现一次的那两个元素。 

 **示例 :** 

```
输入: [1,2,1,3,2,5]
输出: [3,5]
```

 **注意：** 

1. 结果输出的顺序并不重要，对于上面的例子， `[5, 3]` 也是正确答案。 

2.  你的算法应该具有线性时间复杂度。你能否仅使用常数空间复杂度来实现？ 

---

 https://leetcode-cn.com/problems/single-number-iii/solution/zhi-chu-xian-yi-ci-de-shu-zi-iiixiang-jie-pai-xu-h/ 

 https://leetcode-cn.com/problems/single-number-iii/solution/java-yi-dong-yi-jie-xiao-lu-gao-by-spirit-9-9/ 

| 值       | 二进制   | 不同位   |
| -------- | -------- | -------- |
| 8        | 00001000 | 00001000 |
| 3        | 00000011 | 00000011 |
| 按位异或 | 00001011 | 00001011 |
| 13       | 00001101 | 00000100 |
| 9        | 00001001 | 00000000 |
| 按位异或 | 00000100 | 00000100 |

通过表格可知，任意两值的异或结果于二进制表达上，恰好包含了两值的不同值为一的位。所以，通过取得异或结果中任意值为一的比特位，判断每个数是否含有这个位（且位上的值为一）进行分组运算（包含与不包含的关系必然将数组区分为分别包含一个唯一数的两部分，并且，两部分除去唯一数后，其剩余元素均有重复），这样便可以得到不同的两个数了。

可是如何得到两个数按位异或结果的不同位呢？

显然，如保留一个位的话，必须要确保其它所有的位的值均为零。而使得所有位均为零的操作便是将值所有位经行取反操作，然后进行按位与（and）操作。

| 运算\值          | 10       | 9        |
| ---------------- | -------- | -------- |
| 二进制           | 00001010 | 00001001 |
| 取反             | 11110101 | 11110110 |
| 初值与取反按位与 | 00000000 | 00000000 |

但是这还是不够的。按位与操作后所得值为零，不含任何一个值。但是，通过观察可以发现，如果将某一个值得取反值加一个一后，在进行按位与操作，所得位恰好为初始值的最低位为所代表得值。

| 运算\值                    | 10       | 9        |
| -------------------------- | -------- | -------- |
| 二进制                     | 00001010 | 00001001 |
| 取反                       | 11110101 | 11110110 |
| 取反后加一                 | 11110110 | 11110111 |
| 原值和取反加一的按位与结果 | 00000010 | 00000001 |

（这里不知道怎么说才好，可以观察一下 10 和 9 二进制上得末位（最右边），然后再观察下取反值的末位。取反加一的话便要么末位由 0 变 1，要么进位。）

终于，通过一系列操作取得了异或结果中某一比特位所代表的值。并且，**以上操作正好是计算机中正数到负数的转换过程。**

| 运算\值    | 10       | 9        |
| ---------- | -------- | -------- |
| 二进制     | 00001010 | 00001001 |
| 取反       | 11110101 | 11110110 |
| 取反后加一 | 11110110 | 11110111 |
| 0 - 值     | 11110110 | 11110111 |