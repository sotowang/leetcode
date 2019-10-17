### 2 两数相加

### 3 无重复字符的最长子串

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

## 82 删除旋转链表中的重复元素

* 给定一个排序链表，删除所有含有重复数字的节点，只保留原始链表中 *没有重复出现* 的数字

# 字节跳动

## 字符串
### 1 无重复字符的最长子串

### 2 最长公共前缀

### 3 字符串的排列

* 第一个字符串的子串的排列之一为每二个字符串的子串

### 4 字符串相乘

* 给定两个以字符串形式表示的非负整数 num1 和 num2，返回 num1 和 num2 的乘积，它们的乘积也表示为字符串形式。

### 5 翻转字符串里的单词

* 给定一个字符串，逐个翻转字符串中的每个单词。

### 6 简化路径

* 给定一个字符串，简化为linux路径

### 7 复原IP地址

* 给定一个只包含数字的字符串，复原它并返回所有可能的 IP 地址格式。

 ## 数组与排序
### 8 三数之和

* 给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组。   

### 9 搜索旋转排序数组

*  假设按照升序排序的数组在预先未知的某个点上进行了旋转。   
     ( 例如，数组 [0,1,2,4,5,6,7] 可能变为 [4,5,6,7,0,1,2] )。 
     搜索一个给定的目标值，如果数组中存在这个目标值，则返回它的索引，否则返回 -1 。

### 10 最长连续递增序列

* 给定一个未经排序的整数数组，找到最长且**连续**的的递增序列。

### 11  数组中的第K个最大元素

* 在未排序的数组中找到第 **k** 个最大的元素。请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。

### 12 最长连续序列

* 给定一个未排序的整数数组，找出最长连续序列的长度。
* 要求算法的时间复杂度为 *O(n)*。

### 60 第k个排列

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



## 