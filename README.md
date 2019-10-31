### 2 两数相加

### 4 寻找两个有序数组的中位数

# 链表

## 19 删除链表的倒数第N个节点

* 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。

## 21 合并两个有序链表

* 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。

## 23 合并k个排序链表

* 合并 *k* 个排序链表，返回合并后的排序链表。请分析和描述算法的复杂度。  

---

## 24 两两交换链表中的节点

* 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。

* 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。

## 25 K个一组翻转链表

* 给你一个链表，每 k 个节点一组进行翻转，请你返回翻转后的链表。

* k 是一个正整数，它的值小于或等于链表的长度。

* 如果节点总数不是 k 的整数倍，那么请将最后剩余的节点保持原有顺序。

## 61 旋转链表

* 给定一个链表，旋转链表，将链表每个节点向右移动 k 个位置，其中 k 是非负数。

## 82 删除排序链表中的重复元素

* 给定一个排序链表，删除所有含有重复数字的节点，只保留原始链表中 *没有重复出现* 的数字

## 83 删除排序链表中的重复元素

* 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次

## 86 分隔链表

* 给定一个链表和一个特定值 x，对链表进行分隔，使得所有小于 x 的节点都在大于或等于 x 的节点之前。

* 你应当保留两个分区中每个节点的初始相对位置。

## 92 反转链表 II

* 反转从位置 `m `到 `n `的链表。请使用一趟扫描完成反转。

* 1 ≤ *m* ≤ *n* ≤ 链表长度。

## 109 有序链表转换二叉搜索树

* 给定一个单链表，其中的元素按升序排序，将其转换为高度平衡的二叉搜索树。

* 本题中，一个高度平衡二叉树是指一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1。

## 138 复制带随机指针的链表

* 给定一个链表，每个节点包含一个额外增加的随机指针，该指针可以指向链表中的任何节点或空节点。

* 要求返回这个链表的深拷贝。 

## 141 环形链表

* 给定一个链表，判断链表中是否有环。

* 为了表示给定链表中的环，我们使用整数 `pos` 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 `pos` 是 -1，则在该链表中没有环。

## 142 环形链表 II

* 给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null。
* 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。
* 说明：不允许修改给定的链表。

## 147 对链表进行插入排序

![img](https://upload.wikimedia.org/wikipedia/commons/0/0f/Insertion-sort-example-300px.gif)

* 从第一个元素开始，该链表可以被认为已经部分排序（用黑色表示）。

* 每次迭代时，从输入数据中移除一个元素（用红色表示），并原地将其插入到已排好序的链表中。

* 插入排序算法
  * 插入排序是迭代的，每次只移动一个元素，直到所有元素可以形成一个有序的输出列表。
  * 每次迭代中，插入排序只从输入数据中移除一个待排序的元素，找到它在序列中适当的位置，并将其插入。
  * 重复直到所有输入数据插入完为止。

## 148 排序链表

* 在` O(nlogn) `时间复杂度和常数级空间复杂度下，对链表进行排序。

## 160 相交链表

* 编写一个程序，找到两个单链表相交的起始节点。

## 203 移除链表元素

* 删除链表中等于给定值 `val` 的所有节点。

## 206 反转链表

*  反转一个单链表。 

## 234 回文链表

* 请判断一个链表是否为回文链表。

## 237 删除链表中的节点

* 请编写一个函数，使其可以删除某个链表中给定的（非末尾）节点，你将只被给定要求被删除的节点。

# 栈

## 20 有效的括号

* 给定一个只包括` '('`，`')'`，`'{'`，`'}'`，`'['`，`']'` 的字符串，判断字符串是否有效。

* 有效字符串需满足：
  * 左括号必须用相同类型的右括号闭合。
  * 左括号必须以正确的顺序闭合。

* 注意空字符串可被认为是有效字符串。

## 42 接雨水

* 给定` n` 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水。

# 双指针

## 3 无重复字符的最长子串

*  给定一个字符串，请你找出其中不含有重复字符的 **最长子串** 的长度 

## 11 盛最多水的容器

* 给定` n `个非负整数` a1，a2，...，an`，每个数代表坐标中的一个点` (i, ai) `。在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为` (i, ai) `和 `(i, 0)`。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。

* 说明：你不能倾斜容器，且` n `的值至少为 `2`。

## 15 三数之和

* 给定一个包含 n 个整数的数组 `nums`，判断 `nums` 中是否存在三个元素 a，b，c ，使得 `a + b + c = 0` ？找出所有满足条件且不重复的三元组。   

## 16 最接近的三数之和

* 给定一个包括` n` 个整数的数组 `nums` 和 一个目标值 `target`。找出 `nums` 中的三个整数，使得它们的和与` target `最接近。返回这三个数的和。假定每组输入只存在唯一答案。

## 18 四数之和

* 给定一个包含` n `个整数的数组` nums `和一个目标值 `target`，判断 `nums` 中是否存在四个元素 a，b，c 和 d ，使得 `a + b + c + d `的值与` target `相等？找出所有满足条件且不重复的四元组。

* **注意**：
  * 答案中不可以包含重复的四元组。

# 排序

## 56 合并区间

* 给出一个区间的集合，请合并所有重叠的区间。

## 57 插入区间

* 给出一个无重叠的 ，按照区间起始端点排序的区间列表。

* 在列表中插入一个新的区间，你需要确保列表中的区间仍然有序且不重叠（如果有必要的话，可以合并区间）。

## 75 颜色分类

* 给定一个包含红色、白色和蓝色，一共 n 个元素的数组，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。

* 此题中，我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。

* 不能使用代码库中的排序函数来解决这道题。

## 164 最大间距

* 给定一个无序的数组，找出数组在排序之后，相邻元素之间最大的差值。
* 如果数组元素个数小于 2，则返回 0

## 179 最大数

* 给定一组非负整数，重新排列它们的顺序使之组成一个最大的整数。

## 220 存在重复元素 III

* 给定一个整数数组，判断数组中是否有两个不同的索引` i `和` j`，使得 `nums [i]` 和 `nums [j]` 的差的绝对值最大为 `t`，并且 `i` 和 `j `之间的差的绝对值最大为 `ķ`。

## 242 有效的字母异位词

* 给定两个字符串 `s` 和 `t` ，编写一个函数来判断 `t` 是否是 `s` 的字母异位词。

## 274 H指数

* 给定一位研究者论文被引用次数的数组（被引用次数是非负整数）。编写一个方法，计算出研究者的 h 指数。

* `h 指数的定义`: “h 代表“高引用次数”（high citations），一名科研人员的 h 指数是指他（她）的 （N 篇论文中）至多有 h 篇论文分别被引用了至少 h 次。（其余的 N - h 篇论文每篇被引用次数不多于 h 次。）”

# 回溯算法

## 39 组合总和

* 给定一个无重复元素的数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。

* candidates 中的数字可以无限制重复被选取。


## 46 全排列

* 给定一个没有重复数字的序列，返回其所有可能的全排列。

## 47 全排列2

* 给定一个可包含重复数字的序列，返回所有不重复的全排列

## 60 第k个排列

* 给定 *n* 和 *k*，返回第 *k* 个排列。

## 77 组合

* 给定两个整数 n 和 k，返回 1 ... n 中所有可能的 k 个数的组合。

## 78 子集

* 给定一组**不含重复元素**的整数数组` nums`，返回该数组所有可能的子集（幂集）。
* **说明：**解集不能包含重复的子集。

## 131 分割回文串

* 给定一个字符串 s，将 s 分割成一些子串，使每个子串都是回文串。

* 返回 s 所有可能的分割方案。

# 动态规划

## 5 最长回文子串

* 给定一个字符串 `s`，找到 `s` 中最长的回文子串。你可以假设 `s` 的最大长度为 1000。

## 53 最大子序和

* 给定一个整数数组 `nums` ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。

## 62 不同路径

* 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为“Start” ）。

* 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）。

* 问总共有多少条不同的路径？

## 63 不同路径2

* 一个机器人位于一个 `m x n `网格的左上角 （起始点在下图中标记为“Start” ）。

* 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）。

* 现在考虑网格中有障碍物。那么从左上角到右下角将会有多少条不同的路径？

## 64 最小路径和

* 给定一个包含非负整数的 *m* x *n* 网格，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。
* **说明：**每次只能向下或者向右移动一步。

## 95 不同的二叉搜索树2

* 给定一个整数 *n*，生成所有由 `1 ... *n`* 为节点所组成的**二叉搜索树**。

## 96 不同的二叉搜索树

* 给定一个整数` n`，求以  ` 1 ... n `为节点组成的二叉搜索树有多少种？

## 120 三角形最小路径和

* 给定一个三角形，找出自顶向下的最小路径和。每一步只能移动到下一行中相邻的结点上。

## 121 买卖股票的最佳时机

* 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。

* 如果你最多只允许完成一笔交易（即买入和卖出一支股票），设计一个算法来计算你所能获取的最大利润。

* 注意你不能在买入股票前卖出股票。

## 122 买卖股票的最佳时机2

* 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。

* 设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。

* 注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。

## 123 买卖股票的最佳时机3

* 给定一个数组，它的第 i 个元素是一支给定的股票在第 i 天的价格。

* 设计一个算法来计算你所能获取的最大利润。你最多可以完成 两笔 交易。

* **注意**: 你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。

---

# 字节跳动

## 字符串

### 3 无重复字符的最长子串

### 14 最长公共前缀

### 43 字符串相乘

* 给定两个以字符串形式表示的非负整数 `num1` 和 `num2`，返回 `num1` 和 `num2` 的乘积，它们的乘积也表示为字符串形式。

### 71 简化路径

* 给定一个字符串，简化为`linux`路径

### 93 复原IP地址

* 给定一个只包含数字的字符串，复原它并返回所有可能的 `IP` 地址格式。

### 151 翻转字符串里的单词

* 给定一个字符串，逐个翻转字符串中的每个单词。

### 567 字符串的排列

* 第一个字符串的子串的排列之一为每二个字符串的子串

 ## 数组与排序

### 15 三数之和

* 给定一个包含 n 个整数的数组 `nums`，判断 `nums` 中是否存在三个元素 a，b，c ，使得 `a + b + c = 0` ？找出所有满足条件且不重复的三元组。   

### 9 搜索旋转排序数组

*  假设按照升序排序的数组在预先未知的某个点上进行了旋转。   
   ( 例如，数组` [0,1,2,4,5,6,7] `可能变为` [4,5,6,7,0,1,2]` )。 
   搜索一个给定的目标值，如果数组中存在这个目标值，则返回它的索引，否则返回 -1 。

### 10 最长连续递增序列

* 给定一个未经排序的整数数组，找到最长且**连续**的的递增序列。

### 11  数组中的第K个最大元素

* 在未排序的数组中找到第 **k** 个最大的元素。请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。

### 12 最长连续序列

* 给定一个未排序的整数数组，找出最长连续序列的长度。
* 要求算法的时间复杂度为 *O(n)*。

### 60 第k个排列