# [复原IP地址](https://leetcode-cn.com/problems/restore-ip-addresses/)

给定一个只包含数字的字符串，复原它并返回所有可能的 IP 地址格式。

示例:

输入: "25525511135"

输出: ["255.255.11.135", "255.255.111.35"]

---

https://www.nowcoder.com/questionTerminal/ce73540d47374dbe85b3125f57727e1e?orderByHotValue=1&difficulty=11110&mutiTagIds=591&page=2&onlyReference=false

思路：递归每次获取一段，获取每一段时都遍历，因为每一段都可能是1到3个长度。

然后有一些提前终止的条件，包括：1.获取了某一段，它的值大于255或者长度大于1但是不为0

2.剩下的长度不够后面的人分，或者没人三个数字还有剩余

3.剩下的长度不够该段（特指最后一段）

