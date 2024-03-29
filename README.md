[TOC]

# 链表

## 2 [两数相加](https://leetcode-cn.com/problems/add-two-numbers/)

* 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。

* 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。

* 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。

## 19 删除链表的倒数第N个节点

* 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。

## 21 合并两个有序链表

* 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。

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

## 328 [奇偶链表](https://leetcode-cn.com/problems/odd-even-linked-list/)

* 给定一个单链表，把所有的奇数节点和偶数节点分别排在一起。请注意，这里的奇数节点和偶数节点指的是节点编号的奇偶性，而不是节点的值的奇偶性。
* 请尝试使用原地算法完成。你的算法的空间复杂度应为 O(1)，时间复杂度应为 O(nodes)，nodes 为节点总数。

## 445 [两数相加 II](https://leetcode-cn.com/problems/add-two-numbers-ii/)

* 给定两个**非空**链表来代表两个非负整数。数字最高位位于链表开始位置。它们的每个节点只存储单个数字。将这两数相加会返回一个新的链表。
* 你可以假设除了数字 0 之外，这两个数字都不会以零开头。

## 面试题02.01 [移除重复节点](https://leetcode-cn.com/problems/remove-duplicate-node-lcci/)

* 编写代码，移除未排序链表中的重复节点。保留最开始出现的节点。

## 面试题06 [从尾到头打印链表](https://leetcode-cn.com/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/)

* 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。

## 面试题66 [构建乘积数组](https://leetcode-cn.com/problems/gou-jian-cheng-ji-shu-zu-lcof/)

* 给定一个数组 `A[0,1,…,n-1]`，请构建一个数组 `B[0,1,…,n-1]`，其中 `B` 中的元素 `B[i]=A[0]×A[1]×…×A[i-1]×A[i+1]×…×A[n-1]`。不能使用除法。

---

# 字符串

## 6 [ Z 字形变换](https://leetcode-cn.com/problems/zigzag-conversion/)

* 将一个给定字符串根据给定的行数，以从上往下、从左到右进行 Z 字形排列。

## 8 [字符串转换整数 (atoi)](https://leetcode-cn.com/problems/string-to-integer-atoi/)

* 请你来实现一个 `atoi` 函数，使其能将字符串转换成整数。

* 首先，该函数会根据需要丢弃无用的开头空格字符，直到寻找到第一个非空格的字符为止。

* 当我们寻找到的第一个非空字符为正或者负号时，则将该符号与之后面尽可能多的连续数字组合起来，作为该整数的正负号；假如第一个非空字符是数字，则直接将其与之后连续的数字字符组合起来，形成整数。

* 该字符串除了有效的整数部分之后也可能会存在多余的字符，这些字符可以被忽略，它们对于函数不应该造成影响。

* 注意：假如该字符串中的第一个非空格字符不是一个有效整数字符、字符串为空或字符串仅包含空白字符时，则你的函数不需要进行转换。

* 在任何情况下，若函数不能进行有效的转换时，请返回 0。

* **说明：** 
  * 假设我们的环境只能存储 32 位大小的有符号整数，那么其数值范围为`[−231,  231 − 1]`。如果数值超过这个范围，请返回  `INT_MAX (231 − 1)` 或 `INT_MIN (−231)` 。

## 12 [整数转罗马数字](https://leetcode-cn.com/problems/integer-to-roman/)

* 罗马数字包含以下七种字符： `I`， `V`， `X`， `L`，`C`，`D` 和 `M`。 

```
字符          数值
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
```

* 例如， 罗马数字 2 写做` II` ，即为两个并列的 1。12 写做 `XII` ，即为 `X + II` 。 27 写做 ` XXVII`, 即为 `XX + V + II `。

* 通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 `IIII`，而是` IV`。数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为`IX`。这个特殊的规则只适用于以下六种情况：
  * `I` 可以放在 `V` (5) 和 `X` (10) 的左边，来表示 4 和 9。
  * `X` 可以放在 `L` (50) 和 `C` (100) 的左边，来表示 40 和 90。 
  * `C` 可以放在 `D` (500) 和 `M` (1000) 的左边，来表示 400 和 900。

* 给定一个整数，将其转为罗马数字。输入确保在 1 到 3999 的范围内。

## 13 [罗马数字转整数](https://leetcode-cn.com/problems/roman-to-integer/)

* 罗马数字包含以下七种字符: `I`， `V`， `X`， `L`，`C`，`D` 和 `M`。 

```
字符          数值
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
```

* 通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 `IIII`，而是 `IV`。数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为` IX`。这个特殊的规则只适用于以下六种情况：
  * `I` 可以放在 `V` (5) 和 `X` (10) 的左边，来表示 4 和 9。
  * `X` 可以放在 `L` (50) 和 `C` (100) 的左边，来表示 40 和 90。 
  * `C` 可以放在 `D` (500) 和 `M` (1000) 的左边，来表示 400 和 900。

* 给定一个罗马数字，将其转换成整数。输入确保在 1 到 3999 的范围内。 

## 17  [电话号码的字母组合](https://leetcode-cn.com/problems/letter-combinations-of-a-phone-number/)

* 给定一个仅包含数字 `2-9` 的字符串，返回所有它能表示的字母组合。 

* 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。

 ![img](https://assets.leetcode-cn.com/aliyun-lc-upload/original_images/17_telephone_keypad.png)

* **说明:**
  * 尽管上面的答案是按字典序排列的，但是你可以任意选择答案输出的顺序。 



## 38 [报数](https://leetcode-cn.com/problems/count-and-say/)

* 报数序列是一个整数序列，按照其中的整数的顺序进行报数，得到下一个数。其前五项如下：

```
1.     1
2.     11
3.     21
4.     1211
5.     111221
```

* `1` 被读作 `"one 1"` (`"一个一"`) , 即 `11`。 

* `11` 被读作 `"two 1s"` (`"两个一"`）, 即 `21`。 

* `21` 被读作 `"one 2"`,  "`one 1"` （`"一个二"` , `"一个一"`) , 即 `1211`。
* 给定一个正整数 *n*（1 ≤ *n* ≤ 30），输出报数序列的第 *n* 项。

* 注意：
  * 整数顺序将表示为一个字符串。

## 58 [最后一个单词的长度](https://leetcode-cn.com/problems/length-of-last-word/)

* 给定一个仅包含大小写字母和空格 `' '` 的字符串，返回其最后一个单词的长度。

* 如果不存在最后一个单词，请返回 0 。

* **说明：**
  * 一个单词是指由字母组成，但不包含任何空格的字符串。

## 65 [有效数字](https://leetcode-cn.com/problems/valid-number/)

* 验证给定的字符串是否可以解释为十进制数字。

* **说明:** 我们有意将问题陈述地比较模糊。在实现代码之前，你应当事先思考所有可能的情况。这里给出一份可能存在于有效十进制数字中的字符列表：

  - 数字 0-9
  - 指数 - "e"
  - 正/负号 - "+"/"-"
  - 小数点 - "."

* 当然，在输入中，这些字符的上下文也很重要。
  
* **更新于 2015-02-10:**
  * `C++`函数的形式已经更新了。如果你仍然看见你的函数接收 `const char *` 类型的参数，请点击重载按钮重置你的代码。

## 67 [二进制求和](https://leetcode-cn.com/problems/add-binary/)

* 给定两个二进制字符串，返回他们的和（用二进制表示）。

* 输入为**非空**字符串且只包含数字 `1` 和 `0`。

## 68 [文本左右对齐](https://leetcode-cn.com/problems/text-justification/)

* 给定一个单词数组和一个长度 `maxWidth`，重新排版单词，使其成为每行恰好有 `maxWidth` 个字符，且左右两端对齐的文本。

* 你应该使用“贪心算法”来放置给定的单词；也就是说，尽可能多地往每行中放置单词。必要时可用空格 ' ' 填充，使得每行恰好有 `maxWidth` 个字符。

* 要求尽可能均匀分配单词间的空格数量。如果某一行单词间的空格不能均匀分配，则左侧放置的空格数要多于右侧的空格数。

* 文本的最后一行应为左对齐，且单词之间不插入额外的空格。

* 说明:
  * 单词是指由非空格字符组成的字符序列。
  * 每个单词的长度大于 `0`，小于等于 `maxWidth`。
  * 输入单词数组 `words` 至少包含一个单词。

## 87 [扰乱字符串](https://leetcode-cn.com/problems/scramble-string/)

- 给定一个字符串 *s1*，我们可以把它递归地分割成两个非空子字符串，从而将其表示为二叉树。
- 下图是字符串 *s1* = `"great"` 的一种可能的表示形式。

```
    great
   /    \
  gr    eat
 / \    /  \
g   r  e   at
           / \
          a   t
```

- 在扰乱这个字符串的过程中，我们可以挑选任何一个非叶节点，然后交换它的两个子节点。
- 例如，如果我们挑选非叶节点 `"gr"` ，交换它的两个子节点，将会产生扰乱字符串 `"rgeat"` 。

```
    rgeat
   /    \
  rg    eat
 / \    /  \
r   g  e   at
           / \
          a   t
```

- 我们将 `"rgeat”` 称作 `"great"` 的一个扰乱字符串。
- 同样地，如果我们继续交换节点 `"eat"` 和 `"at"` 的子节点，将会产生另一个新的扰乱字符串 `"rgtae"` 。

```
    rgtae
   /    \
  rg    tae
 / \    /  \
r   g  ta  e
       / \
      t   a
```

- 我们将 `"rgtae”` 称作 `"great"` 的一个扰乱字符串。
- 给出两个长度相等的字符串 *s1* 和 *s2*，判断 *s2* 是否是 *s1* 的扰乱字符串。

## 165 [比较版本号](https://leetcode-cn.com/problems/compare-version-numbers/)

* 比较两个版本号` version1` 和 `version2`。

* 如果 `version1 > version2` 返回 `1`，如果 `version1 < version2` 返回 `-1`， 除此之外返回 `0`。

* 你可以假设版本字符串非空，并且只包含数字和 `.` 字符。

* `.` 字符不代表小数点，而是用于分隔数字序列。
  * 例如，`2.5` 不是“两个半”，也不是“差一半到三”，而是第二版中的第五个小版本。

* 你可以假设版本号的每一级的默认修订版号为 `0`。例如，版本号 `3.4` 的第一级（大版本）和第二级（小版本）修订号分别为 `3` 和 `4`。其第三级和第四级修订号均为 `0`。
* **提示：**
  1. 版本字符串由以点 （.） 分隔的数字字符串组成。这个数字字符串可能有前导零。
  2. 版本字符串不以点开始或结束，并且其中不会有两个连续的点。

## 344 [反转字符串](https://leetcode-cn.com/problems/reverse-string/)

* 编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 `char[]` 的形式给出。

* 不要给另外的数组分配额外的空间，你必须**[原地](https://baike.baidu.com/item/原地算法)修改输入数组**、使用`O(1)`的额外空间解决这一问题。

* 你可以假设数组中的所有字符都是 [ASCII](https://baike.baidu.com/item/ASCII) 码表中的可打印字符。

## [389. 找不同](https://leetcode-cn.com/problems/find-the-difference/)

* 给定两个字符串 ***s*** 和 ***t***，它们只包含小写字母。 

* 字符串 ***t\*** 由字符串 ***s\*** 随机重排，然后在随机位置添加一个字母。 

* 请找出在 ***t*** 中被添加的字母。  

## 402 [移掉K位数字](https://leetcode-cn.com/problems/remove-k-digits/)

* 给定一个以字符串表示的非负整数?*num*，移除这个数中的 *k* 位数字，使得剩下的数字最小。

* **注意:**
  * *num* 的长度小于 10002 且?≥ *k。*
  * *num* 不会包含任何前导零。

## 415 [字符串相加](https://leetcode-cn.com/problems/add-strings/)

* 给定两个字符串形式的非负整数 `num1`和`num2` ，计算它们的和。

* **注意：**

1. `num1` 和`num2` 的长度都小于 5100.
2. `num1` 和`num2` 都只包含数字 `0-9`.
3. `num1` 和`num2` 都不包含任何前导零。
4. **你不能使用任何內建 BigInteger 库， 也不能直接将输入的字符串转换为整数形式。**

## [520. 检测大写字母](https://leetcode-cn.com/problems/detect-capital/)

* 我们定义，在以下情况时，单词的大写用法是正确的： 

* 全部字母都是大写，比如 "USA" 。
  单词中所有字母都不是大写，比如 "leetcode" 。
  如果单词不只含有一个字母，只有首字母大写， 比如 "Google" 。
  给你一个字符串 word 。如果大写用法正确，返回 true ；否则，返回 false 。 

## 541 [反转字符串 II](https://leetcode-cn.com/problems/reverse-string-ii/)

* 给定一个字符串和一个整数 k，你需要对从字符串开头算起的每个 2k 个字符的前k个字符进行反转。如果剩余少于 k 个字符，则将剩余的所有全部反转。如果有小于 2k 但大于或等于 k 个字符，则反转前 k 个字符，并将剩余的字符保持原样。

## 557 [反转字符串中的单词 III](https://leetcode-cn.com/problems/reverse-words-in-a-string-iii/)

- 给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
- 注意
  - 在字符串中，每个单词由单个空格分隔，并且字符串中不会有任何额外的空格。

## 657 [机器人能否返回原点](https://leetcode-cn.com/problems/robot-return-to-origin/)

* 在二维平面上，有一个机器人从原点 (0, 0) 开始。给出它的移动顺序，判断这个机器人在完成移动后是否在**?(0, 0) 处结束**。

* 移动顺序由字符串表示。字符 move[i] 表示其第 i 次移动。机器人的有效动作有?`R`（右），`L`（左），`U`（上）和 `D`（下）。如果机器人在完成所有动作后返回原点，则返回 true。否则，返回 false。

* **注意：**机器人“面朝”的方向无关紧要。 “R” 将始终使机器人向右移动一次，“L” 将始终向左移动等。此外，假设每次移动机器人的移动幅度相同。

## 696 [计数二进制子串](https://leetcode-cn.com/problems/count-binary-substrings/)

* 给定一个字符串 `s`，计算具有相同数量0和1的非空(连续)子字符串的数量，并且这些子字符串中的所有0和所有1都是组合在一起的。

* 重复出现的子串要计算它们出现的次数。
* **注意：**
  - `s.length` 在1到50,000之间。
  - `s` 只包含“0”或“1”字符。

## 709 [转换成小写字母](https://leetcode-cn.com/problems/to-lower-case/)

* 实现函数 ToLowerCase()，该函数接收一个字符串参数 str，并将该字符串中的大写字母转换成小写字母，之后返回新的字符串。

## 916 [单词子集](https://leetcode-cn.com/problems/word-subsets/)

* 我们给出两个单词数组 `A` 和 `B`。每个单词都是一串小写字母。

* 现在，如果 `b` 中的每个字母都出现在 `a`中，**包括重复出现的字母**，那么称单词 `b` 是单词 `a` 的子集。 例如，“wrr” 是 “warrior” 的子集，但不是 “world” 的子集。

* 如果对 `B` 中的每一个单词 `b`，`b` 都是 `a`的子集，那么我们称 `A` 中的单词 `a` 是*通用的*。

* 你可以按任意顺序以列表形式返回 `A` 中所有的通用单词。

## 1016 [子串能表示从 1 到 N 数字的二进制串](https://leetcode-cn.com/problems/binary-string-with-substrings-representing-1-to-n/)

* 给定一个二进制字符串 S（一个仅由若干 '0' 和 '1' 构成的字符串）和一个正整数 N，如果对于从 1 到 N 的每个整数 X，其二进制表示都是 S 的子串，就返回 true，否则返回 false。

## 1324 [竖直打印单词](https://leetcode-cn.com/problems/print-words-vertically/)

* 给你一个字符串 `s`。请你按照单词在 `s` 中的出现顺序将它们全部竖直返回。 单词应该以字符串列表的形式返回，必要时用空格补位，但输出尾部的空格需要删除（不允许尾随空格）。 每个单词只能放在一列上，每一列中也只能有一个单词。

## 面试题01.06 [字符串压缩](https://leetcode-cn.com/problems/compress-string-lcci/)

* 字符串压缩。利用字符重复出现的次数，编写一种方法，实现基本的字符串压缩功能。比如，字符串`aabcccccaaa`会变为`a2b1c5a3`。若“压缩”后的字符串没有变短，则返回原先的字符串。你可以假设字符串中只包含大小写英文字母（a至z）。

## 面试题01.09 [字符串轮转](https://leetcode-cn.com/problems/string-rotation-lcci/)

* <p>字符串轮转。给定两个字符串<code>s1</code>和<code>s2</code>，请编写代码检查<code>s2</code>是否为<code>s1</code>旋转而成（比如，<code>waterbottle</code>是<code>erbottlewat</code>旋转后的字符串）。</p>

## 面试题50 [第一个只出现一次的字符](https://leetcode-cn.com/problems/di-yi-ge-zhi-chu-xian-yi-ci-de-zi-fu-lcof/)

* 在字符串 s 中找出第一个只出现一次的字符。如果没有，返回一个单空格。

# 数组

## 1 [两数之和](https://leetcode-cn.com/problems/two-sum/)

* 给定一个整数数组 `nums` 和一个目标值 `target`，请你在该数组中找出和为目标值的那 **两个** 整数，并返回他们的数组下标。

* 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。

## 31 [下一个排列](https://leetcode-cn.com/problems/next-permutation/)

* 实现获取下一个排列的函数，算法需要将给定数字序列重新排列成字典序中下一个更大的排列。

* 如果不存在下一个更大的排列，则将数字重新排列成最小的排列（即升序排列）。

* 必须**[原地](https://baike.baidu.com/item/原地算法)**修改，只允许使用额外常数空间。

* 以下是一些例子，输入位于左侧列，其相应输出位于右侧列。

  ```
  1,2,3 → 1,3,2
  3,2,1 → 1,2,3
  1,1,5 → 1,5,1
  ```

## 41 [缺失的第一个正数](https://leetcode-cn.com/problems/first-missing-positive/)

- 给定一个未排序的整数数组，找出其中没有出现的最小的正整数。
- **说明:**
  - 你的算法的时间复杂度应为O(*n*)，并且只能使用常数级别的空间。

## 48 [旋转图像](https://leetcode-cn.com/problems/rotate-image/)

* 给定一个 `n × n` 的二维矩阵表示一个图像。

* 将图像顺时针旋转 90 度。

* **说明：**
  * 你必须在**[原地](https://baike.baidu.com/item/原地算法)**旋转图像，这意味着你需要直接修改输入的二维矩阵。**请不要**使用另一个矩阵来旋转图像。

## 54 [螺旋矩阵](https://leetcode-cn.com/problems/spiral-matrix/)

* 给定一个包含 *m* x *n* 个元素的矩阵（*m* 行, *n* 列），请按照顺时针螺旋顺序，返回矩阵中的所有元素。

## 55 [跳跃游戏](https://leetcode-cn.com/problems/jump-game/)

* 给定一个非负整数数组，你最初位于数组的第一个位置。
* 数组中的每个元素代表你在该位置可以跳跃的最大长度。
* 判断你是否能够到达最后一个位置。

## 59 [螺旋矩阵 II](https://leetcode-cn.com/problems/spiral-matrix-ii/)

* 给定一个正整数 *n*，生成一个包含 `1 `到 `n^2` 所有元素，且元素按顺时针顺序螺旋排列的正方形矩阵。

## 66 [加一](https://leetcode-cn.com/problems/plus-one/)

* 给定一个由**整数**组成的**非空**数组所表示的非负整数，在该数的基础上加一。

* 最高位数字存放在数组的首位， 数组中每个元素只存储**单个**数字。

* 你可以假设除了整数 0 之外，这个整数不会以零开头。

## 73 [矩阵置零](https://leetcode-cn.com/problems/set-matrix-zeroes/)

* 给定一个 *m* x *n* 的矩阵，如果一个元素为 0，则将其所在行和列的所有元素都设为 0。请使用**[原地](http://baike.baidu.com/item/原地算法)**算法**。**
* **进阶:**
  * 一个直接的解决方案是使用  `O(mn) `的额外空间，但这并不是一个好的解决方案。
  * 一个简单的改进方案是使用 `O(m + n) `的额外空间，但这仍然不是最好的解决方案。
  * 你能想出一个常数空间的解决方案吗？

## 79 [单词搜索](https://leetcode-cn.com/problems/word-search/)

* 给定一个二维网格和一个单词，找出该单词是否存在于网格中。
* 单词必须按照字母顺序，通过相邻的单元格内的字母构成，其中“相邻”单元格是那些水平相邻或垂直相邻的单元格。同一个单元格内的字母不允许被重复使用

## 90 [子集 II](https://leetcode-cn.com/problems/subsets-ii/)

* 给定一个可能包含重复元素的整数数组 ***`nums`***，返回该数组所有可能的子集（幂集）。

* **说明：**解集不能包含重复的子集。

## 118 [杨辉三角](https://leetcode-cn.com/problems/pascals-triangle/)

* 给定一个非负整数 *`numRows`，*生成杨辉三角的前 *`numRows`* 行。

![img](https://upload.wikimedia.org/wikipedia/commons/0/0d/PascalTriangleAnimated2.gif)

* 在杨辉三角中，每个数是它左上方和右上方的数的和。

## 119 [杨辉三角 II](https://leetcode-cn.com/problems/pascals-triangle-ii/)

* 给定一个非负索引 *k*，其中 *k* ≤ 33，返回杨辉三角的第 *k* 行。

![img](https://upload.wikimedia.org/wikipedia/commons/0/0d/PascalTriangleAnimated2.gif)

* 在杨辉三角中，每个数是它左上方和右上方的数的和。

## 128 [最长连续序列](https://leetcode-cn.com/problems/longest-consecutive-sequence/)

* 给定一个未排序的整数数组，找出最长连续序列的长度。
* 要求算法的时间复杂度为 *O(n)*。

## 152 [乘积最大子序列](https://leetcode-cn.com/problems/maximum-product-subarray/)

* 给定一个整数数组 `nums` ，找出一个序列中乘积最大的连续子序列（该序列至少包含一个数）。

## 189 [旋转数组](https://leetcode-cn.com/problems/rotate-array/)

* 给定一个数组，将数组中的元素向右移动 *k* 个位置，其中 *k* 是非负数。

## 216 [组合总和 III](https://leetcode-cn.com/problems/combination-sum-iii/)

* 找出所有相加之和为 ***n*** 的 **k** 个数的组合**。**组合中只允许含有 1 - 9 的正整数，并且每种组合中不存在重复的数字。

* **说明：**
  * 所有数字都是正整数。
  * 解集不能包含重复的组合。 

## 228 [汇总区间](https://leetcode-cn.com/problems/summary-ranges/)

* 给定一个无重复元素的有序整数数组，返回数组区间范围的汇总。

## 229 [求众数 II](https://leetcode-cn.com/problems/majority-element-ii/)

* 给定一个大小为 *n* 的数组，找出其中所有出现超过 `⌊ n/3 ⌋` 次的元素。

* **说明:** 要求算法的时间复杂度为 O(n)，空间复杂度为 O(1)。

## 238 [除自身以外数组的乘积](https://leetcode-cn.com/problems/product-of-array-except-self/)

* 给定长度为 n 的整数数组 `nums`，其中 `n > 1`，返回输出数组` output` ，其中 `output[i]` 等于` nums `中除 `nums[i] `之外其余各元素的乘积。
* **说明:** 请**不要使用除法，**且在 `O(*n*) `时间复杂度内完成此题。
* **进阶：**
  * 你可以在常数空间复杂度内完成这个题目吗？（ 出于对空间复杂度分析的目的，输出数组**不被视为**额外空间。）

## 289 [生命游戏](https://leetcode-cn.com/problems/game-of-life/)

* 根据[百度百科](https://baike.baidu.com/item/生命游戏/2926434?fr=aladdin)，生命游戏，简称为生命，是英国数学家约翰·何顿·康威在1970年发明的细胞自动机。
* 给定一个包含` m × n` 个格子的面板，每一个格子都可以看成是一个细胞。每个细胞具有一个初始状态 `live（1`）即为活细胞， 或 `dead（0）`即为死细胞。每个细胞与其八个相邻位置（水平，垂直，对角线）的细胞都遵循以下四条生存定律：

	1. 如果活细胞周围八个位置的活细胞数少于两个，则该位置活细胞死亡；
	2. 如果活细胞周围八个位置有两个或三个活细胞，则该位置活细胞仍然存活；
	3. 如果活细胞周围八个位置有超过三个活细胞，则该位置活细胞死亡；
	4. 如果死细胞周围正好有三个活细胞，则该位置死细胞复活；
* 根据当前状态，写一个函数来计算面板上细胞的下一个（一次更新后的）状态。下一个状态是通过将上述规则同时应用于当前状态下的每个细胞所形成的，其中细胞的出生和死亡是同时发生的。
* **进阶:**
  * 你可以使用原地算法解决本题吗？请注意，面板上所有格子需要同时被更新：你不能先更新某些格子，然后使用它们的更新后的值再更新其他格子。
  * 本题中，我们使用二维数组来表示面板。原则上，面板是无限的，但当活细胞侵占了面板边界时会造成问题。你将如何解决这些问题？

## 334 [递增的三元子序列](https://leetcode-cn.com/problems/increasing-triplet-subsequence/)

* 给定一个未排序的数组，判断这个数组中是否存在长度为 3 的递增子序列。

* 数学表达式如下:

> 如果存在这样的 *i, j, k,* 且满足 0 ≤ *i* < *j* < *k* ≤ *n*-1， 使得 *arr[i]* < *arr[j]* < *arr[k]* ，返回 true ; 否则返回 false 。

**说明:** 

​	要求算法的时间复杂度为 O(*n*)，空间复杂度为 O(*1*) 。

## 349 [两个数组的交集](https://leetcode-cn.com/problems/intersection-of-two-arrays/)

* 给定两个数组，编写一个函数来计算它们的交集。

## 350 [两个数组的交集 II](https://leetcode-cn.com/problems/intersection-of-two-arrays-ii/)

* 给定两个数组，编写一个函数来计算它们的交集。

## 409 [最长回文串](https://leetcode-cn.com/problems/longest-palindrome/)

* 给定一个包含大写字母和小写字母的字符串，找到通过这些字母构造成的最长的回文串。

* 在构造过程中，请注意区分大小写。比如 `"Aa"` 不能当做一个回文字符串。

* *注意:**
  * 假设字符串的长度不会超过 1010。

## 414 [第三大的数](https://leetcode-cn.com/problems/third-maximum-number/)

* 给定一个非空数组，返回此数组中第三大的数。如果不存在，则返回数组中最大的数。要求算法时间复杂度必须是O(n)。

## 442 [数组中重复的数据](https://leetcode-cn.com/problems/find-all-duplicates-in-an-array/)

* 给定一个整数数组 a，其中`1 ≤ a[i] ≤ n`*（*n为数组长度）, 其中有些元素出现**两次**而其他元素出现**一次**。

* 找到所有出现**两次**的元素。

* 你可以不用到任何额外空间并在O(*n*)时间复杂度内解决这个问题吗？

## 443 [压缩字符串](https://leetcode-cn.com/problems/string-compression/)

* 给定一组字符，使用[原地算法](https://baike.baidu.com/item/原地算法)将其压缩。
* 压缩后的长度必须始终小于或等于原数组长度。
* 数组的每个元素应该是长度为1 的**字符**（不是 int 整数类型）。
* 在完成[原地](https://baike.baidu.com/item/原地算法)**修改输入数组**后，返回数组的新长度。

## 448 [找到所有数组中消失的数字](https://leetcode-cn.com/problems/find-all-numbers-disappeared-in-an-array/)

* 给定一个范围在 1 ≤ a[i] ≤ *n* ( *n* = 数组大小 ) 的 整型数组，数组中的元素一些出现了两次，另一些只出现一次。

* 找到所有在 [1, *n*] 范围之间没有出现在数组中的数字。

* 您能在不使用额外空间且时间复杂度为*O(n)*的情况下完成这个任务吗? 你可以假定返回的数组不算在额外空间内。

## 523 [连续的子数组和](https://leetcode-cn.com/problems/continuous-subarray-sum/)

* 给定一个包含**非负数**的数组和一个目标**整数** k，编写一个函数来判断该数组是否含有连续的子数组，其大小至少为 2，总和为 **k**的倍数，即总和为 n*k，其中 n 也是一个**整数**。

## 561 [数组拆分 I](https://leetcode-cn.com/problems/array-partition-i/)

* 给定长度为 **2n** 的数组, 你的任务是将这些数分成 **n** 对, 例如 (a1, b1), (a2, b2), ..., (an, bn) ，使得从1 到 n 的 min(ai, bi) 总和最大。

## 581 [ 最短无序连续子数组](https://leetcode-cn.com/problems/shortest-unsorted-continuous-subarray/)

* 给定一个整数数组，你需要寻找一个**连续的子数组**，如果对这个子数组进行升序排序，那么整个数组都会变为升序排序。

* 你找到的子数组应是**最短**的，请输出它的长度。

## 605 [种花问题](https://leetcode-cn.com/problems/can-place-flowers/)

* 假设你有一个很长的花坛，一部分地块种植了花，另一部分却没有。可是，花卉不能种植在相邻的地块上，它们会争夺水源，两者都会死去。
* 给定一个花坛（表示为一个数组包含0和1，其中0表示没种植花，1表示种植了花），和一个数 **n** 。能否在不打破种植规则的情况下种入 **n** 朵花？能则返回True，不能则返回False。

## 628 [三个数的最大乘积](https://leetcode-cn.com/problems/maximum-product-of-three-numbers/)

* 给定一个整型数组，在数组中找出由三个数组成的最大乘积，并输出这个乘积。

## 645 [错误的集合](https://leetcode-cn.com/problems/set-mismatch/)

* 集合 `S` 包含从1到 `n` 的整数。不幸的是，因为数据错误，导致集合里面某一个元素复制了成了集合里面的另外一个元素的值，导致集合丢失了一个整数并且有一个元素重复。

* 给定一个数组 `nums` 代表了集合 `S` 发生错误后的结果。你的任务是首先寻找到重复出现的整数，再找到丢失的整数，将它们以数组的形式返回。

## 665 [非递减数列](https://leetcode-cn.com/problems/non-decreasing-array/)

* 给你一个长度为 `n` 的整数数组，请你判断在 **最多** 改变 `1` 个元素的情况下，该数组能否变成一个非递减数列。

* 我们是这样定义一个非递减数列的： 对于数组中所有的 `i` `(0 <= i <= n-2)`，总满足 `nums[i] <= nums[i + 1]`。

## 713 [乘积小于K的子数组](https://leetcode-cn.com/problems/subarray-product-less-than-k/)

* 给定一个正整数数组 `nums`。

* 找出该数组内乘积小于 `k` 的连续的子数组的个数。

## 825 [适龄的朋友](https://leetcode-cn.com/problems/friends-of-appropriate-ages/)

* 人们会互相发送好友请求，现在给定一个包含有他们年龄的数组，`ages[i]` 表示第 i 个人的年龄。

当满足以下条件时，A 不能给 B（A、B不为同一人）发送好友请求：

- `age[B] <= 0.5 * age[A] + 7`
- `age[B] > age[A]`
- `age[B] > 100 && age[A] < 100`

* 否则，A 可以给 B 发送好友请求。

* 注意如果 A 向 B 发出了请求，不等于 B 也一定会向 A 发出请求。而且，人们不会给自己发送好友请求。 

* 求总共会发出多少份好友请求?

## 830 [较大分组的位置](https://leetcode-cn.com/problems/positions-of-large-groups/)

* 在一个由小写字母构成的字符串 `s` 中，包含由一些连续的相同字符所构成的分组。

* 例如，在字符串 `s = "abbxxxxzyy"` 中，就含有 `"a"`, `"bb"`, `"xxxx"`, `"z"` 和 `"yy"` 这样的一些分组。

* 分组可以用区间 `[start, end]` 表示，其中 `start` 和 `end` 分别表示该分组的起始和终止位置的下标。上例中的 `"xxxx"` 分组用区间表示为 `[3,6]` 。

* 我们称所有包含大于或等于三个连续字符的分组为 **较大分组** 。

* 找到每一个 **较大分组** 的区间，**按起始位置下标递增顺序排序后**，返回结果。

## 915 [分割数组](https://leetcode-cn.com/problems/partition-array-into-disjoint-intervals/)

给定一个数组 `A`，将其划分为两个不相交（没有公共元素）的连续子数组 `left` 和 `right`， 使得：

- `left` 中的每个元素都小于或等于 `right` 中的每个元素。
- `left` 和 `right` 都是非空的。
- `left` 要尽可能小。

在完成这样的分组后返回 `left` 的**长度**。可以保证存在这样的划分方法。

## 922 [按奇偶排序数组 II](https://leetcode-cn.com/problems/sort-array-by-parity-ii/)

* <p>给定一个非负整数数组&nbsp;<code>A</code>， A 中一半整数是奇数，一半整数是偶数。</p>

  <p>对数组进行排序，以便当&nbsp;<code>A[i]</code> 为奇数时，<code>i</code>&nbsp;也是奇数；当&nbsp;<code>A[i]</code>&nbsp;为偶数时， <code>i</code> 也是偶数。</p>

  <p>你可以返回任何满足上述条件的数组作为答案。</p>

## 945 [使数组唯一的最小增量](https://leetcode-cn.com/problems/minimum-increment-to-make-array-unique/)

* 给定整数数组 A，每次 *move* 操作将会选择任意 `A[i]`，并将其递增 `1`。

* 返回使 `A` 中的每个值都是唯一的最少操作次数。

## 989 [数组形式的整数加法](https://leetcode-cn.com/problems/add-to-array-form-of-integer/)

* 对于非负整数 `X` 而言，*`X`* 的*数组形式*是每位数字按从左到右的顺序形成的数组。例如，如果 `X = 1231`，那么其数组形式为 `[1,2,3,1]`。

* 给定非负整数 `X` 的数组形式 `A`，返回整数 `X+K` 的数组形式。

## 1013 [将数组分成和相等的三个部分](https://leetcode-cn.com/problems/partition-array-into-three-parts-with-equal-sum/)

* 给你一个整数数组 `A`，只有可以将其划分为三个和相等的非空部分时才返回 `true`，否则返回 `false`。

* 形式上，如果可以找出索引 `i+1 < j` 且满足 `(A[0] + A[1] + ... + A[i] == A[i+1] + A[i+2] + ... + A[j-1] == A[j] + A[j-1] + ... + A[A.length - 1])` 就可以将数组三等分。

## 1018 [可被 5 整除的二进制前缀](https://leetcode-cn.com/problems/binary-prefix-divisible-by-5/)

* 给定由若干 `0` 和 `1` 组成的数组 `A`。我们定义 `N_i`：从 `A[0]` 到 `A[i]` 的第 `i` 个子数组被解释为一个二进制数（从最高有效位到最低有效位）。

* 返回布尔值列表 `answer`，只有当 `N_i` 可以被 `5` 整除时，答案 `answer[i]` 为 `true`，否则为 `false`。

## 1053 [交换一次的先前排列](https://leetcode-cn.com/problems/previous-permutation-with-one-swap/)

* <p>给你一个正整数的数组 <code>A</code>（其中的元素不一定完全不同），请你返回可在&nbsp;<strong>一次交换</strong>（交换两数字 <code>A[i]</code> 和 <code>A[j]</code> 的位置）后得到的、按字典序排列小于 <code>A</code> 的最大可能排列。</p>

* <p>如果无法这么操作，就请返回原数组。</p>

## 1103 [分糖果 II](https://leetcode-cn.com/problems/distribute-candies-to-people/)

* 排排坐，分糖果。

* 我们买了一些糖果 `candies`，打算把它们分给排好队的 **n = num_people** 个小朋友。

* 给第一个小朋友 1 颗糖果，第二个小朋友 2 颗，依此类推，直到给最后一个小朋友 `n` 颗糖果。

* 然后，我们再回到队伍的起点，给第一个小朋友 `n + 1` 颗糖果，第二个小朋友 `n + 2` 颗，依此类推，直到给最后一个小朋友 `2 * n` 颗糖果。

* 重复上述过程（每次都比上一次多给出一颗糖果，当到达队伍终点后再次从队伍起点开始），直到我们分完所有的糖果。注意，就算我们手中的剩下糖果数不够（不比前一次发出的糖果多），这些糖果也会全部发给当前的小朋友。

* 返回一个长度为 `num_people`、元素之和为 `candies` 的数组，以表示糖果的最终分发情况（即 `ans[i]` 表示第 `i` 个小朋友分到的糖果数）。

## 1122 [数组的相对排序](https://leetcode-cn.com/problems/relative-sort-array/)

* 给你两个数组，`arr1` 和 `arr2`，
  * `arr2` 中的元素各不相同
  * `arr2` 中的每个元素都出现在 `arr1` 中

* 对 `arr1` 中的元素进行排序，使 `arr1` 中项的相对顺序和 `arr2` 中的相对顺序相同。未在 `arr2` 中出现过的元素需要按照升序放在 `arr1` 的末尾。

## 1128 [等价多米诺骨牌对的数量](https://leetcode-cn.com/problems/number-of-equivalent-domino-pairs/)

* 给你一个由一些多米诺骨牌组成的列表 `dominoes`。
* 如果其中某一张多米诺骨牌可以通过旋转 `0` 度或 `180` 度得到另一张多米诺骨牌，我们就认为这两张牌是等价的。
* 形式上，`dominoes[i] = [a, b]` 和 `dominoes[j] = [c, d]` 等价的前提是 `a==c` 且 `b==d`，或是 `a==d` 且 `b==c`。
* 在 `0 <= i < j < dominoes.length` 的前提下，找出满足 `dominoes[i]` 和 `dominoes[j]` 等价的骨牌对 `(i, j)` 的数量。

## 1300 [转变数组后最接近目标值的数组和](https://leetcode-cn.com/problems/sum-of-mutated-array-closest-to-target/)

* 给你一个整数数组 `arr` 和一个目标值 `target` ，请你返回一个整数 `value` ，使得将数组中所有大于 `value` 的值变成 `value` 后，数组的和最接近 `target` （最接近表示两者之差的绝对值最小）。

* 如果有多种使得和最接近 `target` 的方案，请你返回这些整数中的最小值。

* 请注意，答案不一定是 `arr` 中的数字。

## 1341 [方阵中战斗力最弱的 K 行](https://leetcode-cn.com/problems/the-k-weakest-rows-in-a-matrix/)

* 给你一个大小为 `m * n` 的方阵 `mat`，方阵由若干军人和平民组成，分别用 0 和 1 表示。
* 请你返回方阵中战斗力最弱的 `k` 行的索引，按从最弱到最强排序。
* 如果第 ***i*** 行的军人数量少于第 ***j*** 行，或者两行军人数量相同但 ***i*** 小于 ***j***，那么我们认为第 ***i*** 行的战斗力比第 ***j*** 行弱。
* 军人 **总是** 排在一行中的靠前位置，也就是说 1 总是出现在 0 之前。

## 1365 [有多少小于当前数字的数字](https://leetcode-cn.com/problems/how-many-numbers-are-smaller-than-the-current-number/)

* 给你一个数组?`nums`，对于其中每个元素?`nums[i]`，请你统计数组中比它小的所有数字的数目。

* 换而言之，对于每个?`nums[i]`?你必须计算出有效的?`j`?的数量，其中 `j` 满足?`j != i` **且** `nums[j] < nums[i]`?。

* 以数组形式返回答案。

## 1395 [统计作战单位数](https://leetcode-cn.com/problems/count-number-of-teams/)

* `n` 名士兵站成一排。每个士兵都有一个 **独一无二** 的评分 `rating` 。

* 每 **3** 个士兵可以组成一个作战单位，分组规则如下：
  * 从队伍中选出下标分别为 `i`、`j`、`k`的 3 名士兵，他们的评分分别为 `rating[i]`、`rating[j]`、`rating[k]`
  * 作战单位需满足： `rating[i] < rating[j] < rating[k]` 或者 `rating[i] > rating[j] > rating[k]` ，其中 `0 <= i < j < k < n`

* 请你返回按上述条件可以组建的作战单位数量。每个士兵都可以是多个作战单位的一部分。

## 1431 [拥有最多糖果的孩子](https://leetcode-cn.com/problems/kids-with-the-greatest-number-of-candies/)

* <p>给你一个数组&nbsp;<code>candies</code>&nbsp;和一个整数&nbsp;<code>extraCandies</code>&nbsp;，其中&nbsp;<code>candies[i]</code>&nbsp;代表第 <code>i</code> 个孩子拥有的糖果数目。</p>

*  <p>对每一个孩子，检查是否存在一种方案，将额外的&nbsp;<code>extraCandies</code>&nbsp;个糖果分配给孩子们之后，此孩子有 <strong>最多</strong>&nbsp;的糖果。注意，允许有多个孩子同时拥有 <strong>最多</strong>&nbsp;的糖果数目。</p>

## [面试题01.07 旋转矩阵](https://leetcode-cn.com/problems/rotate-matrix-lcci/)

给你一幅由 `N × N` 矩阵表示的图像，其中每个像素的大小为 4 字节。请你设计一种算法，将图像旋转 90 度。

不占用额外内存空间能否做到？

##  面试题08.03 [魔术索引](https://leetcode-cn.com/problems/magic-index-lcci/)

* 魔术索引。 在数组`A[0...n-1]`中，有所谓的魔术索引，满足条件`A[i] = i`。给定一个有序整数数组，编写一种方法找出魔术索引，若有的话，在数组A中找出一个魔术索引，如果没有，则返回-1。若有多个魔术索引，返回索引值最小的一个。

## 面试题13 [机器人的运动范围](https://leetcode-cn.com/problems/ji-qi-ren-de-yun-dong-fan-wei-lcof/)

* 地上有一个m行n列的方格，从坐标 `[0,0]` 到坐标 `[m-1,n-1]` 。一个机器人从坐标 `[0, 0] `的格子开始移动，它每次可以向左、右、上、下移动一格（不能移动到方格外），也不能进入行坐标和列坐标的数位之和大于k的格子。例如，当k为18时，机器人能够进入方格 [35, 37] ，因为3+5+3+7=18。但它不能进入方格 [35, 38]，因为3+5+3+8=19。请问该机器人能够到达多少个格子？

## 面试题16.16 [部分排序](https://leetcode-cn.com/problems/sub-sort-lcci/)

* 给定一个整数数组，编写一个函数，找出索引`m`和`n`，只要将索引区间`[m,n]`的元素排好序，整个数组就是有序的。注意：`n-m`尽量最小，也就是说，找出符合条件的最短序列。函数返回值为`[m,n]`，若不存在这样的`m`和`n`（例如整个数组是有序的），请返回`[-1,-1]`。

## 面试题56-I [数组中数字出现的次数](https://leetcode-cn.com/problems/shu-zu-zhong-shu-zi-chu-xian-de-ci-shu-lcof/)

* 一个整型数组 `nums` 里除两个数字之外，其他数字都出现了两次。请写程序找出这两个只出现一次的数字。要求时间复杂度是O(n)，空间复杂度是O(1)。

## [面试题57 - II. 和为s的连续正数序列](https://leetcode-cn.com/problems/he-wei-sde-lian-xu-zheng-shu-xu-lie-lcof/)

* 输入一个正整数 `target` ，输出所有和为 `target` 的连续正整数序列（至少含有两个数）。

* 序列内的数字由小到大排列，不同序列按照首个数字从小到大排列。

---

# 栈

## 20 有效的括号

* 给定一个只包括` '('`，`')'`，`'{'`，`'}'`，`'['`，`']'` 的字符串，判断字符串是否有效。
* 有效字符串需满足：
  * 左括号必须用相同类型的右括号闭合。
  * 左括号必须以正确的顺序闭合。
* 注意空字符串可被认为是有效字符串。

## 84 [柱状图中最大的矩形](https://leetcode-cn.com/problems/largest-rectangle-in-histogram/)

* 给定 *n* 个非负整数，用来表示柱状图中各个柱子的高度。每个柱子彼此相邻，且宽度为 1 。

* 求在该柱状图中，能够勾勒出来的矩形的最大面积。

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2018/10/12/histogram.png)

* 以上是柱状图的示例，其中每个柱子的宽度为 1，给定的高度为 `[2,1,5,6,2,3]`。

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2018/10/12/histogram_area.png)

* 图中阴影部分为所能勾勒出的最大矩形面积，其面积为 `10` 个单位。

## 85 [最大矩形](https://leetcode-cn.com/problems/maximal-rectangle/)

* 给定一个仅包含 0 和 1 的二维二进制矩阵，找出只包含 1 的最大矩形，并返回其面积。

## 150 [逆波兰表达式求值](https://leetcode-cn.com/problems/evaluate-reverse-polish-notation/)

* 根据[逆波兰表示法](https://baike.baidu.com/item/逆波兰式/128437)，求表达式的值。 

* 有效的运算符包括 `+`, `-`, `*`, `/` 。每个运算对象可以是整数，也可以是另一个逆波兰表达式。

* **说明：** 
  * 整数除法只保留整数部分。
  * 给定逆波兰表达式总是有效的。换句话说，表达式总会得出有效数值且不存在除数为 0 的情况。

## 155 [最小栈](https://leetcode-cn.com/problems/min-stack/)

* 设计一个支持 push，pop，top 操作，并能在常数时间内检索到最小元素的栈。
  * `push(x)` -- 将元素 x 推入栈中。 
  * `pop()` -- 删除栈顶的元素。
  * `top() `-- 获取栈顶元素。
  * `getMin() `-- 检索栈中的最小元素。

## 225 [用队列实现栈](https://leetcode-cn.com/problems/implement-stack-using-queues/)

* 使用队列实现栈的下列操作： 
  * `push(x)` -- 元素 x 入栈
  * `pop()` -- 移除栈顶元素
  * `top()` -- 获取栈顶元素
  * `empty() `-- 返回栈是否为空

* **注意:** 
  * 你只能使用队列的基本操作-- 也就是 `push to back`, `peek/pop from front`, `size`, 和 `is empty` 这些操作是合法的。
  * 你所使用的语言也许不支持队列。 你可以使用 `list` 或者 `deque`（双端队列）来模拟一个队列 , 只要是标准的队列操作即可。
  * 你可以假设所有操作都是有效的（例如, 对一个空的栈不会调用`pop` 或者 `top` 操作）。

## 316 [去除重复字母](https://leetcode-cn.com/problems/remove-duplicate-letters/)

* 给定一个仅包含小写字母的字符串，去除字符串中重复的字母，使得每个字母只出现一次。需保证返回结果的字典序最小（要求不能打乱其他字符的相对位置）。

## 321 [拼接最大数](https://leetcode-cn.com/problems/create-maximum-number/)

* 给定长度分别为 `m` 和 `n` 的两个数组，其元素由 `0-9` 构成，表示两个自然数各位上的数字。现在从这两个数组中选出 `k (k <= m + n)` 个数字拼接成一个新的数，要求从同一个数组中取出的数字保持其在原数组中的相对顺序。

* 求满足该条件的最大数。结果返回一个表示该最大数的长度为 `k` 的数组。

* **说明:** 请尽可能地优化你算法的时间和空间复杂度。

## 394 [字符串解码](https://leetcode-cn.com/problems/decode-string/)

* 给定一个经过编码的字符串，返回它解码后的字符串。

* 编码规则为: `k[encoded_string]`，表示其中方括号内部的 *encoded_string* 正好重复 *k*次。注意 *k* 保证为正整数。

* 你可以认为输入字符串总是有效的；输入字符串中没有额外的空格，且输入的方括号总是符合格式要求的。

* 此外，你可以认为原始数据不包含数字，所有的数字只表示重复的次数 *k* ，例如不会出现像 `3a` 或 `2[4]` 的输入。

## 456 [132模式](https://leetcode-cn.com/problems/132-pattern/)

* 给定一个整数序列：a1, a2, ..., an，一个132模式的子序列 a**i**, a**j**, a**k** 被定义为：当 **i** < **j** < **k** 时，a**i** < a**k** < a**j**。设计一个算法，当给定有 n 个数字的序列时，验证这个序列中是否含有132模式的子序列。

* *注意：**n 的值小于15000。

## 498 [对角线遍历](https://leetcode-cn.com/problems/diagonal-traverse/)

* 给定一个含有 M x N 个元素的矩阵（M 行，N 列），请以对角线遍历的顺序返回这个矩阵中的所有元素，对角线遍历如下图所示。

## 739 [每日温度](https://leetcode-cn.com/problems/daily-temperatures/)

* 根据每日 `气温` 列表，请重新生成一个列表，对应位置的输入是你需要再等待多久温度才会升高超过该日的天数。如果之后都不会升高，请在该位置用 `0` 来代替。

* **提示：
  * `气温` 列表长度的范围是 `[1, 30000]`。每个气温的值的均为华氏度，都是在 `[30, 100]` 范围内的整数。

## 747 [至少是其他数字两倍的最大数](https://leetcode-cn.com/problems/largest-number-at-least-twice-of-others/)

* 在一个给定的数组`nums`中，总是存在一个最大元素 。

* 查找数组中的最大元素是否至少是数组中每个其他数字的两倍。

* 如果是，则返回最大元素的索引，否则返回-1。

## 946 [验证栈序列](https://leetcode-cn.com/problems/validate-stack-sequences/)

* <p>给定&nbsp;<code>pushed</code>&nbsp;和&nbsp;<code>popped</code>&nbsp;两个序列，每个序列中的 <strong>值都不重复</strong>，只有当它们可能是在最初空栈上进行的推入 push 和弹出 pop 操作序列的结果时，返回 <code>true</code>；否则，返回 <code>false</code>&nbsp;。</p>

## 962 [最大宽度坡](https://leetcode-cn.com/problems/maximum-width-ramp/)

* 给定一个整数数组 `A`，*坡*是元组 `(i, j)`，其中 `i < j` 且 `A[i] <= A[j]`。这样的坡的宽度为 `j - i`。

* 找出 `A` 中的坡的最大宽度，如果不存在，返回 0 。

## 1019 [链表中的下一个更大节点](https://leetcode-cn.com/problems/next-greater-node-in-linked-list/)

* 给出一个以头节点 `head` 作为第一个节点的链表。链表中的节点分别编号为：`node_1, node_2, node_3, ...` 。

* 每个节点都可能有下一个更大值（*next larger* **value**）：对于 `node_i`，如果其 `next_larger(node_i)` 是 `node_j.val`，那么就有 `j > i` 且 `node_j.val > node_i.val`，而 `j` 是可能的选项中最小的那个。如果不存在这样的 `j`，那么下一个更大值为 `0` 。

* 返回整数答案数组 `answer`，其中 `answer[i] = next_larger(node_{i+1})` 。

* ***注意：***在下面的示例中，诸如 `[2,1,5]` 这样的**输入**（不是输出）是链表的序列化表示，其头节点的值为 2，第二个节点值为 1，第三个节点值为 5 。

## 1081 [不同字符的最小子序列](https://leetcode-cn.com/problems/smallest-subsequence-of-distinct-characters/)

* 返回字符串 `text` 中按字典序排列最小的子序列，该子序列包含 `text` 中所有不同字符一次。

## 1111 [有效括号的嵌套深度](https://leetcode-cn.com/problems/maximum-nesting-depth-of-two-valid-parentheses-strings/)

* **有效括号字符串** 仅由 `"("` 和 `")"` 构成，并符合下述几个条件之一：
  * 空字符串
  * 连接，可以记作 `AB`（`A` 与 `B` 连接），其中 `A` 和 `B` 都是有效括号字符串
  * 嵌套，可以记作 `(A)`，其中 `A` 是有效括号字符串

  类似地，我们可以定义任意有效括号字符串 `s` 的 **嵌套深度** `depth(S)`：

  * `s` 为空时，`depth("") = 0`
  * `s` 为 `A` 与 `B` 连接时，`depth(A + B) = max(depth(A), depth(B))`，其中 `A` 和 `B` 都是有效括号字符串
  * `s` 为嵌套情况，`depth("(" + A + ")") = 1 + depth(A)`，其中 A 是有效括号字符串

* 例如：`""`，`"()()"`，和 `"()(()())"` 都是有效括号字符串，嵌套深度分别为 0，1，2，而 `")("` 和 `"(()"` 都不是有效括号字符串。

* 给你一个有效括号字符串 `seq`，将其分成两个不相交的子序列 `A` 和 `B`，且 `A` 和 `B` 满足有效括号字符串的定义（注意：`A.length + B.length = seq.length`）。

* 现在，你需要从中选出 **任意** 一组有效括号字符串 `A` 和 `B`，使 `max(depth(A), depth(B))` 的可能取值最小。

* 返回长度为 `seq.length` 答案数组 `answer` ，选择 `A` 还是 `B` 的编码规则是：如果 `seq[i]` 是 `A` 的一部分，那么 `answer[i] = 0`。否则，`answer[i] = 1`。即便有多个满足要求的答案存在，你也只需返回 **一个**。

## 1124 [表现良好的最长时间段](https://leetcode-cn.com/problems/longest-well-performing-interval/)

* 给你一份工作时间表 `hours`，上面记录着某一位员工每天的工作小时数。
* 我们认为当员工一天中的工作小时数大于 `8`小时的时候，那么这一天就是「**劳累的一天**」。
* 所谓「表现良好的时间段」，意味在这段时间内，「劳累的天数」是严格 **大于**「不劳累的天数」。
* 请你返回「表现良好时间段」的最大长度。

## 剑指offer09 [用两个栈实现队列](https://leetcode-cn.com/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof/)

*  用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead 操作返回 -1 )

# 堆

## 23 合并k个排序链表

- 合并 *k* 个排序链表，返回合并后的排序链表。请分析和描述算法的复杂度。  

## 295 [数据流的中位数](https://leetcode-cn.com/problems/find-median-from-data-stream/)

* 中位数是有序列表中间的数。如果列表长度是偶数，中位数则是中间两个数的平均值。

```
例如，
[2,3,4] 的中位数是 3
[2,3] 的中位数是 (2 + 3) / 2 = 2.5
```

* 设计一个支持以下两种操作的数据结构：
  * `void addNum(int num)` - 从数据流中添加一个整数到数据结构中。
  * `double findMedian()` - 返回目前所有元素的中位数。

## 347 [前 K 个高频元素](https://leetcode-cn.com/problems/top-k-frequent-elements/)

* 给定一个非空的整数数组，返回其中出现频率前 **k** 高的元素。

* **说明：**
  * 你可以假设给定的 *k* 总是合理的，且 1 ≤ k ≤ 数组中不相同的元素的个数。
  * 你的算法的时间复杂度**必须**优于 O(*n*log *n*) , *n* 是数组的大小。

## 355 [设计推特](https://leetcode-cn.com/problems/design-twitter/)

* 设计一个简化版的推特(Twitter)，可以让用户实现发送推文，关注/取消关注其他用户，能够看见关注人（包括自己）的最近十条推文。你的设计需要支持以下的几个功能：

1. **postTweet(userId, tweetId)**: 创建一条新的推文
2. **getNewsFeed(userId)**: 检索最近的十条推文。每个推文都必须是由此用户关注的人或者是用户自己发出的。推文必须按照时间顺序由最近的开始排序。
3. **follow(followerId, followeeId)**: 关注一个用户
4. **unfollow(followerId, followeeId)**: 取消关注一个用户

## 378 [有序矩阵中第K小的元素](https://leetcode-cn.com/problems/kth-smallest-element-in-a-sorted-matrix/)

* 给定一个 *n x n* 矩阵，其中每行和每列元素均按升序排序，找到矩阵中第k小的元素。 请注意，它是排序后的第k小元素，而不是第k个元素。

## 692 [前K个高频单词](https://leetcode-cn.com/problems/top-k-frequent-words/)

* 给一非空的单词列表，返回前 *k* 个出现次数最多的单词。

* 返回的答案应该按单词出现频率由高到低排序。如果不同的单词有相同出现频率，按字母顺序排序。

## 703 [两个数组的交集](https://leetcode-cn.com/problems/intersection-of-two-arrays/)

* 设计一个找到数据流中第K大元素的类（class）。注意是排序后的第K大元素，不是第K个不同的元素。

* 你的 `KthLargest` 类需要一个同时接收整数 `k` 和整数数组`nums` 的构造器，它包含数据流中的初始元素。每次调用 `KthLargest.add`，返回当前数据流中第K大的元素。

## 767 [重构字符串](https://leetcode-cn.com/problems/reorganize-string/)

* 给定一个字符串`S`，检查是否能重新排布其中的字母，使得两相邻的字符不同。

* 若可行，输出任意可行的结果。若不可行，返回空字符串。

## 778 [水位上升的泳池中游泳](https://leetcode-cn.com/problems/swim-in-rising-water/)

* 在一个 N x N 的坐标方格 `grid` 中，每一个方格的值 `grid[i][j]` 表示在位置 `(i,j)` 的平台高度。

* 现在开始下雨了。当时间为 `t` 时，此时雨水导致水池中任意位置的水位为 `t` 。你可以从一个平台游向四周相邻的任意一个平台，但是前提是此时水位必须同时淹没这两个平台。假定你可以瞬间移动无限距离，也就是默认在方格内部游动是不耗时的。当然，在你游泳的时候你必须待在坐标方格里面。

* 你从坐标方格的左上平台 (0，0) 出发。最少耗时多久你才能到达坐标方格的右下平台 `(N-1, N-1)`？

## 973 [最接近原点的 K 个点](https://leetcode-cn.com/problems/k-closest-points-to-origin/)

* 我们有一个由平面上的点组成的列表 `points`。需要从中找出 `K` 个距离原点 `(0, 0)` 最近的点。

* （这里，平面上两点之间的距离是欧几里德距离。）

* 你可以按任何顺序返回答案。除了点坐标的顺序之外，答案确保是唯一的。

## 1046 [ 最后一块石头的重量](https://leetcode-cn.com/problems/last-stone-weight/)

* 有一堆石头，每块石头的重量都是正整数。

* 每一回合，从中选出两块 **最重的** 石头，然后将它们一起粉碎。假设石头的重量分别为 `x` 和 `y`，且 `x <= y`。那么粉碎的可能结果如下：
  * 如果 `x == y`，那么两块石头都会被完全粉碎；
  * 如果 `x != y`，那么重量为 `x` 的石头将会完全粉碎，而重量为 `y` 的石头新重量为 `y-x`。

* 最后，最多只会剩下一块石头。返回此石头的重量。如果没有石头剩下，就返回 `0`。

# 图

## 207 [课程表](https://leetcode-cn.com/problems/course-schedule/)

- 现在你总共有 *n* 门课需要选，记为 `0` 到 `n-1`。
- 在选修某些课程之前需要一些先修课程。 例如，想要学习课程 0 ，你需要先完成课程 1 ，我们用一个匹配来表示他们: `[0,1]` 
- 给定课程总量以及它们的先决条件，判断是否可能完成所有课程的学习？ 

## 310 [最小高度树](https://leetcode-cn.com/problems/minimum-height-trees/)

* 对于一个具有树特征的无向图，我们可选择任何一个节点作为根。图因此可以成为树，在所有可能的树中，具有最小高度的树被称为最小高度树。给出这样的一个图，写出一个函数找到所有的最小高度树并返回他们的根节点。

* **格式**

* 该图包含 `n` 个节点，标记为 `0` 到 `n - 1`。给定数字 `n` 和一个无向边 `edges` 列表（每一个边都是一对标签）。

* 你可以假设没有重复的边会出现在 `edges` 中。由于所有的边都是无向边， `[0, 1]`和 `[1, 0]` 是相同的，因此不会同时出现在 `edges` 里。

# 哈希表

## 36 [有效的数独](https://leetcode-cn.com/problems/valid-sudoku/)

* 判断一个  `9x9` 的数独是否有效。只需要**根据以下规则**，验证已经填入的数字是否有效即可。 
  * 数字 `1-9` 在每一行只能出现一次。
  * 数字 `1-9` 在每一列只能出现一次。
  * 数字 `1-9` 在每一个以粗实线分隔的 `3x3` 宫内只能出现一次。

* **说明:** 
  * 一个有效的数独（部分已被填充）不一定是可解的。
  * 只需要根据以上规则，验证已经填入的数字是否有效即可。
  * 给定数独序列只包含数字 `1-9` 和字符 `'.'` 。
  * 给定数独永远是 `9x9` 形式的。

## 49 [字母异位词分组](https://leetcode-cn.com/problems/group-anagrams/)

* 给定一个字符串数组，将字母异位词组合在一起。字母异位词指字母相同，但排列不同的字符串。
* **说明：**
  - 所有输入均为小写字母。
  - 不考虑答案输出的顺序。

## 94 [二叉树的中序遍历](https://leetcode-cn.com/problems/binary-tree-inorder-traversal/)

* 给定一个二叉树，返回它的*中序* 遍历。 
*  **进阶:** 
  * 递归算法很简单，你可以通过迭代算法完成吗？ 

## 166 [分数到小数](https://leetcode-cn.com/problems/fraction-to-recurring-decimal/)

* 给定两个整数，分别表示分数的分子`numerator `和分母 `denominator`，以字符串形式返回小数。

* 如果小数部分为循环小数，则将循环的部分括在括号内。

## 202 [快乐数](https://leetcode-cn.com/problems/happy-number/)

* 编写一个算法来判断一个数是不是“快乐数”。 

* 一个“快乐数”定义为：
  * 对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和，然后重复这个过程直到这个数变为 1，也可能是无限循环但始终变不到 1。如果可以变为 1，那么这个数就是快乐数。

## 205 [同构字符串](https://leetcode-cn.com/problems/isomorphic-strings/)

* 给定两个字符串 ***s*** 和 ***t\***，判断它们是否是同构的。 

* 如果 ***s*** 中的字符可以被替换得到 ***t\*** ，那么这两个字符串是同构的。 

* 所有出现的字符都必须用另一个字符替换，同时保留字符的顺序。两个字符不能映射到同一个字符上，但字符可以映射自己本身。 
*  **说明:**
  * 你可以假设 ***s*** 和 **t** 具有相同的长度 

## 217 [存在重复元素](https://leetcode-cn.com/problems/contains-duplicate/)

* 给定一个整数数组，判断是否存在重复元素。

* 如果任何值在数组中出现至少两次，函数返回 `true`。如果数组中每个元素都不相同，则返回` false`。 

## 219 [存在重复元素 II](https://leetcode-cn.com/problems/contains-duplicate-ii/)

* 给定一个整数数组和一个整数 *k*，判断数组中是否存在两个不同的索引 *i* 和 *j*，  使得` nums [i] = nums [j]`，并且` i` 和` j`的差的绝对值最大为 `k`。 

## 290 [单词规律](https://leetcode-cn.com/problems/word-pattern/)

* 给定一种规律 `pattern` 和一个字符串 `str` ，判断 `str` 是否遵循相同的规律。 

* 这里的 **遵循** 指完全匹配，例如， `pattern` 里的每个字母和字符串 `str` 中的每个非空单词之间存在着双向连接的对应规律。 
*  **说明:** 
  * 你可以假设 `pattern` 只包含小写字母， `str` 包含了由单个空格分隔的小写字母。  

## 299 [猜数字游戏](https://leetcode-cn.com/problems/bulls-and-cows/)

* 你正在和你的朋友玩 猜数字（Bulls and Cows）游戏：你写下一个数字让你的朋友猜。每次他猜测后，你给他一个提示，告诉他有多少位数字和确切位置都猜对了（称为“Bulls”, 公牛），有多少位数字猜对了但是位置不对（称为“Cows”, 奶牛）。你的朋友将会根据提示继续猜，直到猜出秘密数字。

* 请写出一个根据秘密数字和朋友的猜测数返回提示的函数，用 ` A` 表示公牛，用 `B `表示奶牛。

* 请注意秘密数字和朋友的猜测数都可能含有重复数字。 
*  **说明:** 
  * 你可以假设秘密数字和朋友的猜测数都只包含数字，并且它们的长度永远相等。 

## 387 [字符串中的第一个唯一字符](https://leetcode-cn.com/problems/first-unique-character-in-a-string/)

* 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。

## 454 [四数相加 II](https://leetcode-cn.com/problems/4sum-ii/)

* 给定四个包含整数的数组列表?A , B , C , D ,计算有多少个元组 `(i, j, k, l)`?，使得?`A[i] + B[j] + C[k] + D[l] = 0`。

* 为了使问题简单化，所有的 A, B, C, D 具有相同的长度?N，且 0 ≤ N ≤ 500 。所有整数的范围在 -228 到 228 - 1 之间，最终结果不会超过?231 - 1 。

## 463 [岛屿的周长](https://leetcode-cn.com/problems/island-perimeter/)

* 给定一个包含 0 和 1 的二维网格地图，其中 1 表示陆地 0 表示水域。

* 网格中的格子水平和垂直方向相连（对角线方向不相连）。整个网格被水完全包围，但其中恰好有一个岛屿（或者说，一个或多个表示陆地的格子相连组成的岛屿）。

* 岛屿中没有“湖”（“湖” 指水域在岛屿内部且不和岛屿周围的水相连）。格子是边长为 1 的正方形。网格为长方形，且宽度和高度均不超过 100 。计算这个岛屿的周长。

## 560 [和为K的子数组](https://leetcode-cn.com/problems/subarray-sum-equals-k/)

* 给定一个整数数组和一个整数 **k，**你需要找到该数组中和为 **k** 的连续的子数组的个数。
* **说明 :**
  1. 数组的长度为 `[1, 20,000]`。
  2. 数组中元素的范围是 `[-1000, 1000]` ，且整数 **k** 的范围是 `[-1e7, 1e7]`。

## 974 [和可被 K 整除的子数组](https://leetcode-cn.com/problems/subarray-sums-divisible-by-k/)

* <p>给定一个整数数组 <code>A</code>，返回其中元素之和可被 <code>K</code>&nbsp;整除的（连续、非空）子数组的数目。</p>

## 1207 [独一无二的出现次数](https://leetcode-cn.com/problems/unique-number-of-occurrences/)

* 给你一个整数数组 `arr`，请你帮忙统计数组中每个数的出现次数。

* 如果每个数的出现次数都是独一无二的，就返回 `true`；否则返回 `false`。

## 1218 [最长定差子序列](https://leetcode-cn.com/problems/longest-arithmetic-subsequence-of-given-difference/)

* 给你一个整数数组 `arr` 和一个整数 `difference`，请你找出 `arr` 中所有相邻元素之间的差等于给定 `difference` 的等差子序列，并返回其中最长的等差子序列的长度。

## 1248 [ 统计「优美子数组」](https://leetcode-cn.com/problems/count-number-of-nice-subarrays/)

* 给你一个整数数组 `nums` 和一个整数 `k`。

* 如果某个 **连续** 子数组中恰好有 `k` 个奇数数字，我们就认为这个子数组是「**优美子数组**」。

* 请返回这个数组中「优美子数组」的数目。

## 1296 [划分数组为连续数字的集合](https://leetcode-cn.com/problems/divide-array-in-sets-of-k-consecutive-numbers/)

* 给你一个整数数组 `nums` 和一个正整数 `k`，请你判断是否可以把这个数组划分成一些由 `k` 个连续数字组成的集合。
  如果可以，请返回 `True`；否则，返回 `False`。

## 1342 [数组大小减半](https://leetcode-cn.com/problems/reduce-array-size-to-the-half/)

* 给你一个整数数组 `arr`。你可以从中选出一个整数集合，并删除这些整数在数组中的每次出现。
* 返回 **至少** 能删除数组中的一半整数的整数集合的最小大小。

## 5332 [检查整数及其两倍数是否存在](https://leetcode-cn.com/problems/check-if-n-and-its-double-exist/)

* 给你一个整数数组 `arr`，请你检查是否存在两个整数 `N` 和 `M`，满足 `N` 是 `M` 的两倍（即，`N = 2 * M`）。

* 更正式地，检查是否存在两个下标 `i` 和 `j` 满足：
  * `	i != j`

  - `0 <= i, j < arr.length`
  - `arr[i] == 2 * arr[j]`

## 5333 [制造字母异位词的最小步骤数](https://leetcode-cn.com/problems/minimum-number-of-steps-to-make-two-strings-anagram/)

* 给你两个长度相等的字符串 `s` 和 `t`。每一个步骤中，你可以选择将 `t` 中的 **任一字符** 替换为 **另一个字符**。

* 返回使 `t` 成为 `s` 的字母异位词的最小步骤数。

* **字母异位词** 指字母相同，但排列不同的字符串。

 

---

# 树

## 95 [不同的二叉搜索树 II](https://leetcode-cn.com/problems/unique-binary-search-trees-ii/)

* 给定一个整数 *n*，生成所有由 1 ... *n* 为节点所组成的**二叉搜索树**。 

## 144 [二叉树的前序遍历](https://leetcode-cn.com/problems/binary-tree-preorder-traversal/)

* 给定一个二叉树，返回它的 *前序* 遍历。 
*  **进阶:**
  * 递归算法很简单，你可以通过迭代算法完成吗？ 

## 145 [二叉树的后序遍历](https://leetcode-cn.com/problems/binary-tree-postorder-traversal/)

* 给定一个二叉树，返回它的 *后序* 遍历。 
*  **进阶:**
  *  递归算法很简单，你可以通过迭代算法完成吗？ 

## 173 [二叉搜索树迭代器](https://leetcode-cn.com/problems/binary-search-tree-iterator/)

* 实现一个二叉搜索树迭代器。你将使用二叉搜索树的根节点初始化迭代器。 

* 调用 `next()` 将返回二叉搜索树中的下一个最小的数。 
*  **提示：** 
  * `next()` 和 `hasNext()` 操作的时间复杂度是 O(1)，并使用 O(*h*) 内存，其中 *h* 是树的高度。 
  *  你可以假设 `next()` 调用总是有效的，也就是说，当调用 `next()` 时，`BST` 中至少存在一个下一个最小的数。 

## 226 [翻转二叉树](https://leetcode-cn.com/problems/invert-binary-tree/)

* 翻转一棵二叉树。 

*  **备注:**

  * 这个问题是受到 [Max Howell ](https://twitter.com/mxcl)的 [原问题](https://twitter.com/mxcl/status/608682016205344768) 启发的 ： 

  >  谷歌：我们90％的工程师使用您编写的软件(Homebrew)，但是您却无法在面试时在白板上写出翻转二叉树这道题，这太糟糕了。 

## 235 [二叉搜索树的最近公共祖先](https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-search-tree/)

* 给定一个二叉搜索树, 找到该树中两个指定节点的最近公共祖先。 

* 百度百科中最近公共祖先的定义为：“对于有根树 T 的两个结点 p、q，最近公共祖先表示为一个结点 x，满足 x 是 p、q 的祖先且 x 的深度尽可能大（一个节点也可以是它自己的祖先）。”
*  **说明:** 
  - 所有节点的值都是唯一的。
  - p、q 为不同节点且均存在于给定的二叉搜索树中。

## 236 [二叉树的最近公共祖先](https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-tree/)

*  给定一个二叉树, 找到该树中两个指定节点的最近公共祖先。 
* 百度百科中最近公共祖先的定义为：“对于有根树 T 的两个结点 p、q，最近公共祖先表示为一个结点 x，满足 x 是 p、q 的祖先且 x 的深度尽可能大（一个节点也可以是它自己的祖先）。”
*  **说明:** 
  - 所有节点的值都是唯一的。
  - p、q 为不同节点且均存在于给定的二叉树中。

## 404 [左叶子之和](https://leetcode-cn.com/problems/sum-of-left-leaves/)

* 计算给定二叉树的所有左叶子之和。

## 429 [N叉树的层序遍历](https://leetcode-cn.com/problems/n-ary-tree-level-order-traversal/)

* 给定一个 N 叉树，返回其节点值的层序遍历。 (即从左到右，逐层遍历)。

## 440 [字典序的第K小数字](https://leetcode-cn.com/problems/k-th-smallest-in-lexicographical-order/)

* 给定整数 `n` 和 `k`，找到 `1` 到 `n` 中字典序第 `k` 小的数字。

* 注意：1 ≤ k ≤ n ≤ 109。

## 513 [找树左下角的值](https://leetcode-cn.com/problems/find-bottom-left-tree-value/)

* 给定一个二叉树，在树的最后一行找到最左边的值。

## 538 [把二叉搜索树转换为累加树](https://leetcode-cn.com/problems/convert-bst-to-greater-tree/)

* 给定一个二叉搜索树（Binary Search Tree），把它转换成为累加树（Greater Tree)，使得每个节点的值是原来的节点值加上所有大于它的节点值之和。

## 543 [二叉树的直径](https://leetcode-cn.com/problems/diameter-of-binary-tree/)

* 给定一棵二叉树，你需要计算它的直径长度。一棵二叉树的直径长度是任意两个结点路径长度中的最大值。这条路径可能穿过根结点。

## 563 [二叉树的坡度](https://leetcode-cn.com/problems/binary-tree-tilt/)

* 给定一个二叉树，计算**整个树**的坡度。

* 一个树的**节点的坡度**定义即为，该节点左子树的结点之和和右子树结点之和的**差的绝对值**。空结点的的坡度是0。

* **整个树**的坡度就是其所有节点的坡度之和。

## 572 [另一个树的子树](https://leetcode-cn.com/problems/subtree-of-another-tree/)

* 给定两个非空二叉树 **s** 和 **t**，检验 **s** 中是否包含和 **t** 具有相同结构和节点值的子树。**s** 的一个子树包括 **s** 的一个节点和这个节点的所有子孙。**s** 也可以看做它自身的一棵子树。

## 589 [N叉树的前序遍历](https://leetcode-cn.com/problems/n-ary-tree-preorder-traversal/)

* 给定一个 N 叉树，返回其节点值的*前序遍历*。

## 590 [N叉树的后序遍历](https://leetcode-cn.com/problems/n-ary-tree-postorder-traversal/)

* 给定一个 N 叉树，返回其节点值的*后序遍历*。

## 617 [合并二叉树](https://leetcode-cn.com/problems/merge-two-binary-trees/)

* 给定两个二叉树，想象当你将它们中的一个覆盖到另一个上时，两个二叉树的一些节点便会重叠。

* 你需要将他们合并为一个新的二叉树。合并的规则是如果两个节点重叠，那么将他们的值相加作为节点合并后的新值，否则**不为** NULL 的节点将直接作为新二叉树的节点。
* **注意:** 合并必须从两个树的根节点开始。

## 654 [最大二叉树](https://leetcode-cn.com/problems/maximum-binary-tree/)

* 给定一个不含重复元素的整数数组。一个以此数组构建的最大二叉树定义如下：

    1. 二叉树的根是数组中的最大元素。
    2. 左子树是通过数组中最大值左边部分构造出的最大二叉树。
    3. 右子树是通过数组中最大值右边部分构造出的最大二叉树。

* 通过给定的数组构建最大二叉树，并且输出这个树的根节点。

## 637 [二叉树的层平均值](https://leetcode-cn.com/problems/average-of-levels-in-binary-tree/)

* 给定一个非空二叉树, 返回一个由每层节点平均值组成的数组。

## 655 [输出二叉树](https://leetcode-cn.com/problems/print-binary-tree/)

* 在一个 `m*n` 的二维字符串数组中输出二叉树，并遵守以下规则：

  1. 行数 `m` 应当等于给定二叉树的高度。
  2. 列数 `n` 应当总是奇数。
  3. 根节点的值（以字符串格式给出）应当放在可放置的第一行正中间。根节点所在的行与列会将剩余空间划分为两部分（**左下部分和右下部分**）。你应该将左子树输出在左下部分，右子树输出在右下部分。左下和右下部分应当有相同的大小。即使一个子树为空而另一个非空，你不需要为空的子树输出任何东西，但仍需要为另一个子树留出足够的空间。然而，如果两个子树都为空则不需要为它们留出任何空间。
  4. 每个未使用的空间应包含一个空的字符串`""`。
  5. 使用相同的规则输出子树。

## 938 [二叉搜索树的范围和](https://leetcode-cn.com/problems/range-sum-of-bst/)

* <p>给定二叉搜索树的根结点&nbsp;<code>root</code>，返回 <code>L</code> 和 <code>R</code>（含）之间的所有结点的值的和。</p>

* <p>二叉搜索树保证具有唯一的值。</p>

## 951 [翻转等价二叉树](https://leetcode-cn.com/problems/flip-equivalent-binary-trees/)

* <p>我们可以为二叉树 T 定义一个翻转操作，如下所示：选择任意节点，然后交换它的左子树和右子树。</p>

* <p>只要经过一定次数的翻转操作后，能使 X 等于 Y，我们就称二叉树 X <em>翻转等价</em>于二叉树 Y。</p>

* <p>编写一个判断两个二叉树是否是<em>翻转等价</em>的函数。这些树由根节点&nbsp;<code>root1</code> 和 <code>root2</code>&nbsp;给出。</p>

## 993 [二叉树的堂兄弟节点](https://leetcode-cn.com/problems/cousins-in-binary-tree/)

* 在二叉树中，根节点位于深度 `0` 处，每个深度为 `k`的节点的子节点位于深度 `k+1` 处。

* 如果二叉树的两个节点深度相同，但**父节点不同**，则它们是一对*堂兄弟节点*。

* 我们给出了具有唯一值的二叉树的根节点 `root`，以及树中两个不同节点的值 `x` 和 `y`。

* 只有与值 `x` 和 `y` 对应的节点是堂兄弟节点时，才返回 `true`。否则，返回 `false`。

## 1008 [先序遍历构造二叉树](https://leetcode-cn.com/problems/construct-binary-search-tree-from-preorder-traversal/)

* 返回与给定先序遍历 `preorder` 相匹配的二叉搜索树（binary **search** tree）的根结点。

*  (回想一下，二叉搜索树是二叉树的一种，其每个节点都满足以下规则，对于 `node.left` 的任何后代，值总 `<` `node.val`，而 `node.right` 的任何后代，值总 `>` `node.val`。此外，先序遍历首先显示节点的值，然后遍历 `node.left`，接着遍历 `node.right`。）

## 1028 [从先序遍历还原二叉树](https://leetcode-cn.com/problems/recover-a-tree-from-preorder-traversal/)
* 我们从二叉树的根节点 `root` 开始进行深度优先搜索。在遍历中的每个节点处，我们输出 `D` 条短划线（其中 `D` 是该节点的深度），然后输出该节点的值。（*如果节点的深度为 `D`，则其直接子节点的深度为 `D + 1`。根节点的深度为 `0`）。*
* 如果节点只有一个子节点，那么保证该子节点为左子节点。给出遍历输出 `S`，还原树并返回其根节点 `root`。

## 1305 [两棵二叉搜索树中的所有元素](https://leetcode-cn.com/problems/all-elements-in-two-binary-search-trees/)

* 给你 `root1` 和 `root2` 这两棵二叉搜索树。

* 请你返回一个列表，其中包含 **两棵树** 中的所有整数并按 **升序** 排序。.

## 1302 [层数最深叶子节点的和](https://leetcode-cn.com/problems/deepest-leaves-sum/)

* 给你一棵二叉树，请你返回层数最深的叶子节点的和。

## 1325 [删除给定值的叶子节点](https://leetcode-cn.com/problems/delete-leaves-with-a-given-value/)

* 给你一棵以 `root` 为根的二叉树和一个整数 `target` ，请你删除所有值为 `target` 的 **叶子节点** 。
* 注意，一旦删除值为 `target` 的叶子节点，它的父节点就可能变成叶子节点；如果新叶子节点的值恰好也是 `target` ，那么这个节点也应该被删除。
* 也就是说，你需要重复此过程直到不能继续删除。

## 1339 [分裂二叉树的最大乘积](https://leetcode-cn.com/problems/maximum-product-of-splitted-binary-tree/)

* 给你一棵二叉树，它的根为 `root` 。请你删除 1 条边，使二叉树分裂成两棵子树，且它们子树和的乘积尽可能大。
* 由于答案可能会很大，请你将结果对 10^9 + 7 取模后再返回。

## 1379 [找出克隆二叉树中的相同节点](https://leetcode-cn.com/problems/find-a-corresponding-node-of-a-binary-tree-in-a-clone-of-that-tree/)

* <p>给你两棵二叉树，原始树 <code>original</code> 和克隆树 <code>cloned</code>，以及一个位于原始树 <code>original</code>&nbsp;中的目标节点&nbsp;<code>target</code>。</p>

* <p>其中，克隆树 <code>cloned</code>&nbsp;是原始树 <code>original</code>&nbsp;的一个<strong> 副本 </strong>。</p>

* <p>请找出在树&nbsp;<code>cloned</code>&nbsp;中，与&nbsp;<code>target</code>&nbsp;<strong>相同&nbsp;</strong>的节点，并返回对该节点的引用（在 C/C++ 等有指针的语言中返回 节点指针，其他语言返回节点本身）。</p>

## 面试题04.08 [首个共同祖先](https://leetcode-cn.com/problems/first-common-ancestor-lcci/)

* 设计并实现一个算法，找出二叉树中某两个节点的第一个共同祖先。不得将其他的节点存储在另外的数据结构中。注意：这不一定是二叉搜索树。

## 面试题04.10 [检查子树](https://leetcode-cn.com/problems/check-subtree-lcci/)

* 检查子树。你有两棵非常大的二叉树：T1，有几万个节点；T2，有几万个节点。设计一个算法，判断 T2 是否为 T1 的子树。

* <p>如果 T1 有这么一个节点 n，其子树与 T2 一模一样，则 T2 为 T1 的子树，也就是说，从节点 n 处把树砍断，得到的树与 T2 完全相同。</p>

## 面试题28 对称的二叉树](https://leetcode-cn.com/problems/dui-cheng-de-er-cha-shu-lcof/)

* 请实现一个函数，用来判断一棵二叉树是不是对称的。如果一棵二叉树和它的镜像一样，那么它是对称的。

## 面试题32-III  [上到下打印二叉树 III](https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-iii-lcof/)

* 请实现一个函数按照之字形顺序打印二叉树，即第一行按照从左到右的顺序打印，第二层按照从右到左的顺序打印，第三行再按照从左到右的顺序打印，其他行以此类推。

## 面试题36 [二叉搜索树与双向链表](https://leetcode-cn.com/problems/er-cha-sou-suo-shu-yu-shuang-xiang-lian-biao-lcof/)

* 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的循环双向链表。要求不能创建任何新的节点，只能调整树中节点指针的指向。



---

# 并查集

## 399 [除法求值](https://leetcode-cn.com/problems/evaluate-division/)

* 给出方程式 `A / B = k`, 其中 `A` 和 `B` 均为代表字符串的变量， `k` 是一个浮点型数字。根据已知方程式求解问题，并返回计算结果。如果结果不存在，则返回 `-1.0`。

## 547 [朋友圈](https://leetcode-cn.com/problems/friend-circles/)

* 班上有 **N** 名学生。其中有些人是朋友，有些则不是。他们的友谊具有是传递性。如果已知 A 是 B 的朋友，B 是 C 的朋友，那么我们可以认为 A 也是 C 的朋友。所谓的朋友圈，是指所有朋友的集合。
* 给定一个 **N \* N** 的矩阵 **M**，表示班级中学生之间的朋友关系。如果`M[i][j] = 1`，表示已知第 i 个和 j 个学生**互为**朋友关系，否则为不知道。你必须输出所有学生中的已知的朋友圈总数。

## 947 [移除最多的同行或同列石头](https://leetcode-cn.com/problems/most-stones-removed-with-same-row-or-column/)

* 在二维平面上，我们将石头放置在一些整数坐标点上。每个坐标点上最多只能有一块石头。

* 现在，*move* 操作将会移除与网格上的某一块石头共享一列或一行的一块石头。

* 我们最多能执行多少次 *move* 操作？

## 959 [由斜杠划分区域](https://leetcode-cn.com/problems/regions-cut-by-slashes/)

* 在由 1 x 1 方格组成的 N x N 网格 `grid` 中，每个 1 x 1 方块由 `/`、`` 或空格构成。这些字符会将方块划分为一些共边的区域。
* （请注意，反斜杠字符是转义的，因此 `` 用 `"\\"` 表示。）。
* 返回区域的数目。

## 990 [等式方程的可满足性](https://leetcode-cn.com/problems/satisfiability-of-equality-equations/)

* <p>给定一个由表示变量之间关系的字符串方程组成的数组，每个字符串方程 <code>equations[i]</code> 的长度为 <code>4</code>，并采用两种不同的形式之一：<code>&quot;a==b&quot;</code> 或&nbsp;<code>&quot;a!=b&quot;</code>。在这里，a 和 b 是小写字母（不一定不同），表示单字母变量名。</p>

  <p>只有当可以将整数分配给变量名，以便满足所有给定的方程时才返回&nbsp;<code>true</code>，否则返回 <code>false</code>。&nbsp;</p>

---

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

## 19 删除链表的倒数第N个节点

* 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。

## 26 删除排序数组中的重复项

* 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
* 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。

## 27 移除元素

* 给定一个数组 `nums `和一个值` val`，你需要原地移除所有数值等于` val `的元素，返回移除后数组的新长度。

* 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 `O(1) `额外空间的条件下完成。
  * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。

## 28 实现`strStr()`

* 实现 `strStr()` 函数。
* 给定一个` haystack`字符串和一个 needle 字符串，在` haystack `字符串中找出` needle` 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  `-1`。

## 30  串联所有单词的子串

* 给定一个字符串` s` 和一些长度相同的单词 `words`。找出 `s` 中恰好可以由` words` 中所有单词串联形成的子串的起始位置。
* 注意子串要与 `words` 中的单词完全匹配，中间不能有其他字符，但不需要考虑 `words` 中单词串联的顺序。

## 80 删除排序数组中的重复项 II

* 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素最多出现两次，返回移除后数组的新长度。
* 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。

## 88 合并两个有序数组

* 给定两个有序整数数组  `nums1 `和 `nums2`，将 `nums2` 合并到 `nums1` 中，使得 `num1` 成为一个有序数组。

* **说明**:
  * 初始化` nums1` 和 `nums2 `的元素数量分别为 `m` 和 `n`。
  * 你可以假设 `nums1 `有足够的空间（空间大小大于或等于 m + n）来保存 `nums2` 中的元素。

## 125 验证回文串

* 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。

* **说明**：本题中，我们将空字符串定义为有效的回文串。

## 167 两数之和 II - 输入有序数组

* 给定一个已按照升序排列 的有序数组，找到两个数使得它们相加之和等于目标数。

* 函数应该返回这两个下标值` index1` 和 `index2`，其中 `index1` 必须小于` index2`。

* **说明**:
  * 返回的下标值（`index1` 和` index2`）不是从零开始的。

  * 你可以假设每个输入只对应唯一的答案，而且你不可以重复使用相同的元素。

## 209 长度最小的子数组

* 给定一个含有 `n `个正整数的数组和一个正整数 `s` ，找出该数组中满足其和 `≥ s` 的长度最小的连续子数组。如果不存在符合条件的连续子数组，返回` 0`。

## 283 移动零

* 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。

* **说明**:

  * 必须在原数组上操作，不能拷贝额外的数组。

  * 尽量减少操作次数。

## 287 寻找重复数

* 给定一个包含 `n + 1` 个整数的数组` nums`，其数字都在 `1` 到 `n `之间（包括 `1 `和 `n`），可知至少存在一个重复的整数。假设只有一个重复的整数，找出这个重复的数。
* 说明：
  * 不能更改原数组（假设数组是只读的）。
  * 只能使用额外的 `O(1) `的空间。
  * 时间复杂度小于 `O(n2)` 。
  * 数组中只有一个重复的数字，但它可能不止重复出现一次。

## 392 [判断子序列](https://leetcode-cn.com/problems/is-subsequence/)

* 给定字符串 **s** 和 **t** ，判断 **s** 是否为 **t** 的子序列。

* 你可以认为 **s** 和 **t** 中仅包含英文小写字母。字符串 **t** 可能会很长（长度 ~= 500,000），而 **s**是个短字符串（长度 <=100）。

* 字符串的一个子序列是原始字符串删除一些（也可以不删除）字符而不改变剩余字符相对位置形成的新字符串。（例如，`"ace"`是`"abcde"`的一个子序列，而`"aec"`不是）。

## 658 [找到 K 个最接近的元素](https://leetcode-cn.com/problems/find-k-closest-elements/)

* 给定一个排序好的数组，两个整数 `k` 和 `x`，从数组中找到最靠近 `x`（两数之差最小）的 `k` 个数。返回的结果必须要是按升序排好的。如果有两个数与 `x`的差值一样，优先选择数值较小的那个数。

## 821 [字符的最短距离](https://leetcode-cn.com/problems/shortest-distance-to-a-character/)

* 给定一个字符串 `S` 和一个字符 `C`。返回一个代表字符串 `S` 中每个字符到字符串 `S` 中的字符 `C` 的最短距离的数组。

## 845 [数组中的最长山脉](https://leetcode-cn.com/problems/longest-mountain-in-array/)

* <p>我们把数组 A 中符合下列属性的任意连续子数组 B 称为 &ldquo;<em>山脉&rdquo;</em>：</p>

* <ul>
	  <li><code>B.length &gt;= 3</code></li>
	  <li>存在 <code>0 &lt; i&nbsp;&lt; B.length - 1</code> 使得 <code>B[0] &lt; B[1] &lt; ... B[i-1] &lt; B[i] &gt; B[i+1] &gt; ... &gt; B[B.length - 1]</code></li>
</ul>


* <p>（注意：B 可以是 A 的任意子数组，包括整个数组 A。）</p>

* <p>给出一个整数数组 <code>A</code>，返回最长 <em>&ldquo;山脉&rdquo;</em>&nbsp;的长度。</p>

* <p>如果不含有 &ldquo;<em>山脉&rdquo;&nbsp;</em>则返回 <code>0</code>。</p>

## 876 [链表的中间结点](https://leetcode-cn.com/problems/middle-of-the-linked-list/)

* 给定一个带有头结点 `head` 的非空单链表，返回链表的中间结点。
* 如果有两个中间结点，则返回第二个中间结点。

## 925 [长按键入](https://leetcode-cn.com/problems/long-pressed-name/)

* 你的朋友正在使用键盘输入他的名字?`name`。偶尔，在键入字符?`c`?时，按键可能会被*长按*，而字符可能被输入 1 次或多次。

* 你将会检查键盘输入的字符?`typed`。如果它对应的可能是你的朋友的名字（其中一些字符可能被长按），那么就返回?`True`。

## 941 [有效的山脉数组](https://leetcode-cn.com/problems/valid-mountain-array/)

* 给定一个整数数组?`A`，如果它是有效的山脉数组就返回?`true`，否则返回 `false`。

## 1095 [山脉数组中查找目标值](https://leetcode-cn.com/problems/find-in-mountain-array/)

* （这是一个 **交互式问题** ）

* 给你一个 **山脉数组** `mountainArr`，请你返回能够使得 `mountainArr.get(index)` **等于** `target` **最小** 的下标 `index` 值。

* 如果不存在这样的下标 `index`，就请返回 `-1`。

## 面试题16.06 [最小差](https://leetcode-cn.com/problems/smallest-difference-lcci/)

* 给定两个整数数组`a`和`b`，计算具有最小差绝对值的一对数值（每个数组中取一个值），并返回该对数值的差

## 面试题17.11 [单词距离](https://leetcode-cn.com/problems/find-closest-lcci/)

* 有个内含单词的超大文本文件，给定任意两个单词，找出在这个文件中这两个单词的最短距离(相隔单词数)。如果寻找过程在这个文件中会重复多次，而每次寻找的单词不同，你能对此优化吗?

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

## 315 [计算右侧小于当前元素的个数](https://leetcode-cn.com/problems/count-of-smaller-numbers-after-self/)

* 给定一个整数数组 `nums`，按要求返回一个新数组` counts`。数组 `counts` 有该性质：` counts[i] `的值是  `nums[i]` 右侧小于 `nums[i]` 的元素的数量。

## 435 [无重叠区间](https://leetcode-cn.com/problems/non-overlapping-intervals/)

* <p>给定一个区间的集合，找到需要移除区间的最小数量，使剩余区间互不重叠。</p>

  <p><strong>注意:</strong></p>

  <ol>
  	<li>可以认为区间的终点总是大于它的起点。</li>
  	<li>区间 [1,2] 和 [2,3] 的边界相互&ldquo;接触&rdquo;，但没有相互重叠。</li>
  </ol>

## 493 [翻转对](https://leetcode-cn.com/problems/reverse-pairs/)

* 给定一个数组?`nums`?，如果?`i < j`?且?`nums[i] > 2*nums[j]`?我们就将?`(i, j)`?称作一个***重要翻转对\***。
* 你需要返回给定数组中的重要翻转对的数量。

## 763 [划分字母区间](https://leetcode-cn.com/problems/partition-labels/)

* 字符串 `S` 由小写字母组成。我们要把这个字符串划分为尽可能多的片段，同一个字母只会出现在其中的一个片段。返回一个表示每个字符串片段的长度的列表。

## 986 [区间列表的交集](https://leetcode-cn.com/problems/interval-list-intersections/)

* 给定两个由一些**闭区间**组成的列表，每个区间列表都是成对不相交的，并且已经排序。

* 返回这两个区间列表的交集。

* （形式上，闭区间 [a, b]（其中 a <= b）表示实数 x 的集合，而 a <= x <= b。两个闭区间的交集是一组实数，要么为空集，要么为闭区间。例如，[1, 3] 和 [2, 4] 的交集为 [2, 3]。）

## 1030 [距离顺序排列矩阵单元格](https://leetcode-cn.com/problems/matrix-cells-in-distance-order/)

* 给出 `R` 行 `C` 列的矩阵，其中的单元格的整数坐标为 `(r, c)`，满足 `0 <= r < R` 且 `0 <= c < C`。

* 另外，我们在该矩阵中给出了一个坐标为?`(r0, c0)` 的单元格。

* 返回矩阵中的所有单元格的坐标，并按到 `(r0, c0)` 的距离从最小到最大的顺序排，其中，两单元格`(r1, c1)` 和 `(r2, c2)` 之间的距离是曼哈顿距离，`|r1 - r2| + |c1 - c2|`。（你可以按任何满足此条件的顺序返回答案。）

## 1288 [删除被覆盖区间](https://leetcode-cn.com/problems/remove-covered-intervals/)

* 给你一个区间列表，请你删除列表中被其他区间所覆盖的区间。

* 只有当 `c <= a` 且 `b <= d` 时，我们才认为区间 `[a,b)`被区间 `[c,d)` 覆盖。

* 在完成所有删除操作后，请你返回列表中剩余区间的数目。

## 1329 [ 将矩阵按对角线排序](https://leetcode-cn.com/problems/sort-the-matrix-diagonally/)

* 给你一个 `m * n` 的整数矩阵 `mat` ，请你将同一条对角线上的元素（从左上到右下）按升序排序后，返回排好序的矩阵。

## 面试题51 [数组中的逆序对](https://leetcode-cn.com/problems/shu-zu-zhong-de-ni-xu-dui-lcof/)

* 在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。输入一个数组，求出这个数组中的逆序对的总数。

# 位运算

## 136  [只出现一次的数字](https://leetcode-cn.com/problems/single-number/)

* 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。

* **说明**：
  * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？

## 137 [只出现一次的数字 II](https://leetcode-cn.com/problems/single-number-ii/)

* 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现了三次。找出那个只出现了一次的元素。

* **说明**：
  * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？

## 169 [求众数](https://leetcode-cn.com/problems/majority-element/)

* 给定一个大小为` n `的数组，找到其中的众数。众数是指在数组中出现次数大于 `⌊ n/2 ⌋` 的元素。

* 你可以假设数组是非空的，并且给定的数组总是存在众数。

## 190 [颠倒二进制位](https://leetcode-cn.com/problems/reverse-bits/)

* 颠倒给定的 32 位无符号整数的二进制位。 
*  **提示：** 
  * 请注意，在某些语言（如 Java）中，没有无符号整数类型。在这种情况下，输入和输出都将被指定为有符号整数类型，并且不应影响您的实现，因为无论整数是有符号的还是无符号的，其内部的二进制表示形式都是相同的。
  * 在 Java 中，编译器使用二进制补码记法来表示有符号整数。因此，在上面的 示例 2 中，输入表示有符号整数 -3，输出表示有符号整数 -1073741825。

## 191 [位1的个数](https://leetcode-cn.com/problems/number-of-1-bits/)

* 编写一个函数，输入是一个无符号整数，返回其二进制表达式中数字位数为 ‘1’ 的个数（也被称为[汉明重量](https://baike.baidu.com/item/汉明重量)）。 
* 提示：

  * 请注意，在某些语言（如 Java）中，没有无符号整数类型。在这种情况下，输入和输出都将被指定为有符号整数类型，并且不应影响您的实现，因为无论整数是有符号的还是无符号的，其内部的二进制表示形式都是相同的。
  * 在 Java 中，编译器使用二进制补码记法来表示有符号整数。因此，在上面的 示例 3 中，输入表示有符号整数 -3。

## 201 [数字范围按位与](https://leetcode-cn.com/problems/bitwise-and-of-numbers-range/)

* 给定范围` [m, n]`，其中` 0 <= m <= n <= 2147483647`，返回此范围内所有数字的按位与（包含 m, n 两端点）。

## 231 [2的幂](https://leetcode-cn.com/problems/power-of-two/)

* 给定一个整数，编写一个函数来判断它是否是 2 的幂次方。

## 260 [只出现一次的数字 III](https://leetcode-cn.com/problems/single-number-iii/)

* 给定一个整数数组 `nums`，其中恰好有两个元素只出现一次，其余所有元素均出现两次。 找出只出现一次的那两个元素。 

*  **注意：** 

  1. 结果输出的顺序并不重要，对于上面的例子， `[5, 3]` 也是正确答案。 

  2.  你的算法应该具有线性时间复杂度。你能否仅使用常数空间复杂度来实现？ 

## 268 [缺失数字](https://leetcode-cn.com/problems/missing-number/)

*  给定一个包含 `0, 1, 2, ..., n` 中 *n* 个数的序列，找出 0 .. *n* 中没有出现在序列中的那个数。
*  **说明:**
  * 你的算法应具有线性时间复杂度。你能否仅使用额外常数空间来实现? 

## 318 [最大单词长度乘积](https://leetcode-cn.com/problems/maximum-product-of-word-lengths/)

* 给定一个字符串数组 `words`，找到 `length(word[i]) * length(word[j])` 的最大值，并且这两个单词不含有公共字母。你可以认为每个单词只包含小写字母。如果不存在这样的两个单词，返回 0。

## 371 [两整数之和](https://leetcode-cn.com/problems/sum-of-two-integers/)

* **不使用**运算符 `+` 和 `-` ，计算两整数 `a` 、`b` 之和。

## 393 [UTF-8 编码验证](https://leetcode-cn.com/problems/utf-8-validation/)

* UTF-8 中的一个字符可能的长度为 **1 到 4 字节**，遵循以下的规则：

1. 对于 1 字节的字符，字节的第一位设为0，后面7位为这个符号的unicode码。
2. 对于 n 字节的字符 (n > 1)，第一个字节的前 n 位都设为1，第 n+1 位设为0，后面字节的前两位一律设为10。剩下的没有提及的二进制位，全部为这个符号的unicode码。

* 这是 UTF-8 编码的工作方式：

```
   Char. number range  |        UTF-8 octet sequence
      (hexadecimal)    |              (binary)
   --------------------+---------------------------------------------
   0000 0000-0000 007F | 0xxxxxxx
   0000 0080-0000 07FF | 110xxxxx 10xxxxxx
   0000 0800-0000 FFFF | 1110xxxx 10xxxxxx 10xxxxxx
   0001 0000-0010 FFFF | 11110xxx 10xxxxxx 10xxxxxx 10xxxxxx
```

* 给定一个表示数据的整数数组，返回它是否为有效的 utf-8 编码。

* **注意:**
  * 输入是整数数组。只有每个整数的**最低 8 个有效位**用来存储数据。这意味着每个整数只表示 1 字节的数据。

## 405 [数字转换为十六进制数](https://leetcode-cn.com/problems/convert-a-number-to-hexadecimal/)

* 给定一个整数，编写一个算法将这个数转换为十六进制数。对于负整数，我们通常使用 补码运算 方法。

## 476 [数字的补数](https://leetcode-cn.com/problems/number-complement/)

* 给定一个正整数，输出它的补数。补数是对该数的二进制表示取反。

## 538 [汉明距离](https://leetcode-cn.com/problems/hamming-distance/)

* 两个整数之间的[汉明距离](https://baike.baidu.com/item/汉明距离)指的是这两个数字对应二进制位不同的位置的数目。

* 给出两个整数 `x` 和 `y`，计算它们之间的汉明距离。

* **注意：** 0 ≤ `x`, `y` < 231.

## 540 [有序数组中的单一元素](https://leetcode-cn.com/problems/single-element-in-a-sorted-array/)

* 给定一个只包含整数的有序数组，每个元素都会出现两次，唯有一个数只会出现一次，找出这个数。

## 912 [排序数组](https://leetcode-cn.com/problems/sort-an-array/)

* 给你一个整数数组 `nums`，请你将该数组升序排列。

## 1009 [十进制整数的反码](https://leetcode-cn.com/problems/complement-of-base-10-integer/)

* 每个非负整数 `N` 都有其二进制表示。例如， `5` 可以被表示为二进制 `"101"`，`11` 可以用二进制 `"1011"` 表示，依此类推。注意，除 `N = 0` 外，任何二进制表示中都不含前导零。
* 二进制的反码表示是将每个 `1` 改为 `0` 且每个 `0` 变为 `1`。例如，二进制数 `"101"` 的二进制反码为 `"010"`。
* 给你一个十进制数 `N`，请你返回其二进制表示的反码所对应的十进制整数。

## 1017 [负二进制转换](https://leetcode-cn.com/problems/convert-to-base-2/)

* 给定一个整数数组 `A`，返回 `A` 中最长等差子序列的**长度**。

* 回想一下，`A` 的子序列是列表 `A[i_1], A[i_2], ..., A[i_k]`其中 `0 <= i_1 < i_2 < ... < i_k <= A.length - 1`。并且如果 `B[i+1] - B[i]`( `0 <= i < B.length - 1`) 的值都相同，那么序列 `B` 是等差的。

## 1025 [除数博弈](https://leetcode-cn.com/problems/divisor-game/)

* 爱丽丝和鲍勃一起玩游戏，他们轮流行动。爱丽丝先手开局。

* 最初，黑板上有一个数字 `N` 。在每个玩家的回合，玩家需要执行以下操作：
  * 选出任一 `x`，满足 `0 < x < N` 且 `N % x == 0` 。
  * 用 `N - x` 替换黑板上的数字 `N` 。

* 如果玩家无法执行这些操作，就会输掉游戏。

* 只有在爱丽丝在游戏中取得胜利时才返回 `True`，否则返回 `false`。假设两个玩家都以最佳状态参与游戏。

## 1356 [根据数字二进制下 1 的数目排序](https://leetcode-cn.com/problems/sort-integers-by-the-number-of-1-bits/)

* 给你一个整数数组?`arr`?。请你将数组中的元素按照其二进制表示中数字 **1** 的数目升序排序。

* 如果存在多个数字二进制中?**1**?的数目相同，则必须将它们按照数值大小升序排列。

* 请你返回排序后的数组。

## 1404 [将二进制表示减到 1 的步骤数](https://leetcode-cn.com/problems/number-of-steps-to-reduce-a-number-in-binary-representation-to-one/)

* 给你一个以二进制形式表示的数字 `s` 。请你返回按下述规则将其减少到 1 所需要的步骤数：
  * 如果当前数字为偶数，则将其除以 2 。
  * 如果当前数字为奇数，则将其加上 1 。
* 题目保证你总是可以按上述规则将测试用例变为 1 。

## 面试题01.01  [判定字符是否唯一](https://leetcode-cn.com/problems/is-unique-lcci/)

* 实现一个算法，确定一个字符串 <code>s</code> 的所有字符是否全都不同。

## 面试题05.06 [ 整数转换](https://leetcode-cn.com/problems/convert-integer-lcci/)

* 整数转换。编写一个函数，确定需要改变几个位才能将整数A转成整数B。

## 面试题17.01 [不用加号的加法](https://leetcode-cn.com/problems/add-without-plus-lcci/)

- 设计一个函数把两个数字相加。不得使用 + 或者其他算术运算符。

## 面试题17.10 [主要元素](https://leetcode-cn.com/problems/find-majority-element-lcci/)

* 如果数组中多一半的数都是同一个，则称之为主要元素。给定一个**整数**数组，找到它的主要元素。若没有，返回-1

## 面试题64 [求1+2+…+n](https://leetcode-cn.com/problems/qiu-12n-lcof/)

* 求 `1+2+...+n` ，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。

# 二分查找

## 4 [寻找两个有序数组的中位数](https://leetcode-cn.com/problems/median-of-two-sorted-arrays/)

* 给定两个大小为 `m `和 `n` 的有序数组 `nums1` 和 `nums2`。

* 请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 `O(log(m + n))`。

* 你可以假设 `nums1` 和 `nums2` 不会同时为空。

## 29 [两数相除](https://leetcode-cn.com/problems/divide-two-integers/)

* 给定两个整数，被除数 `dividend` 和除数 `divisor`。将两数相除，要求不使用乘法、除法和 mod 运算符。 

*  返回被除数 `dividend` 除以除数 `divisor` 得到的商。
*  **说明:** 
  * 被除数和除数均为 32 位有符号整数。
  * 除数不为 0。
  * 假设我们的环境只能存储 32 位有符号整数，其数值范围是 `[−2^31,  2^31 − 1]`。本题中，如果除法结果溢出，则返回` 2^31 − 1`。

## 34 [在排序数组中查找元素的第一个和最后一个位置](https://leetcode-cn.com/problems/find-first-and-last-position-of-element-in-sorted-array/)

* 给定一个按照升序排列的整数数组 `nums`，和一个目标值 `target`。找出给定目标值在数组中的开始位置和结束位置。 

* 你的算法时间复杂度必须是 *O*(log *n*) 级别。 

* 如果数组中不存在目标值，返回 `[-1, -1]`。 

## 35 [搜索插入位置](https://leetcode-cn.com/problems/search-insert-position/)

* 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。 

* 你可以假设数组中无重复元素。 

## 50 [Pow(x, n)](https://leetcode-cn.com/problems/powx-n/)

* 实现 [pow(*x*, *n*)](https://www.cplusplus.com/reference/valarray/pow/) ，即计算 x 的 n 次幂函数。 
* **说明:**
  - `-100.0 < x < 100.0`
  - *n* 是 32 位有符号整数，其数值范围是`[−2^31, 2^31 − 1] `。

## 69 [x 的平方根](https://leetcode-cn.com/problems/sqrtx/)

* 实现 `int sqrt(int x)` 函数。 

* 计算并返回 *x* 的平方根，其中 *x* 是非负整数。 

* 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。 

## 74 [搜索二维矩阵](https://leetcode-cn.com/problems/search-a-2d-matrix/)

* 编写一个高效的算法来判断 *m* x *n* 矩阵中，是否存在一个目标值。该矩阵具有如下特性： 
  * 每行中的整数从左到右按升序排列。
  * 每行的第一个整数大于前一行的最后一个整数。

## 81 [ 搜索旋转排序数组 II](https://leetcode-cn.com/problems/search-in-rotated-sorted-array-ii/)

* 假设按照升序排序的数组在预先未知的某个点上进行了旋转。 

* ( 例如，数组 `[0,0,1,2,2,5,6]` 可能变为 `[2,5,6,0,0,1,2]` )。 

* 编写一个函数来判断给定的目标值是否存在于数组中。若存在返回 `true`，否则返回 `false`。 
*  **进阶:** 
  * 这是 [搜索旋转排序数组](https://leetcode-cn.com/problems/search-in-rotated-sorted-array/description/) 的延伸题目，本题中的 `nums` 可能包含重复元素。
  * 这会影响到程序的时间复杂度吗？会有怎样的影响，为什么？

## 153 [寻找旋转排序数组中的最小值](https://leetcode-cn.com/problems/find-minimum-in-rotated-sorted-array/)

* 假设按照升序排序的数组在预先未知的某个点上进行了旋转。 

* ( 例如，数组 `[0,1,2,4,5,6,7]` 可能变为 `[4,5,6,7,0,1,2]` )。 

* 请找出其中最小的元素。 

* 你可以假设数组中不存在重复元素。

## 154 [寻找旋转排序数组中的最小值 II](https://leetcode-cn.com/problems/find-minimum-in-rotated-sorted-array-ii/)

* 假设按照升序排序的数组在预先未知的某个点上进行了旋转。

* ( 例如，数组 `[0,1,2,4,5,6,7]` 可能变为 `[4,5,6,7,0,1,2]` )。

* 请找出其中最小的元素。

* 注意数组中可能存在重复的元素。

## 162 [寻找峰值](https://leetcode-cn.com/problems/find-peak-element/)

* 峰值元素是指其值大于左右相邻值的元素。 

* 给定一个输入数组 `nums`，其中 `nums[i] ≠ nums[i+1]`，找到峰值元素并返回其索引。 

* 数组可能包含多个峰值，在这种情况下，返回任何一个峰值所在位置即可。 

* 你可以假设 `nums[-1] = nums[n] = -∞`。

* **说明:**

  你的解法应该是` O(logN) `时间复杂度的。

## 222 [完全二叉树的节点个数](https://leetcode-cn.com/problems/count-complete-tree-nodes/)

* 给出一个**完全二叉树**，求出该树的节点个数。 

* **说明：** 
  * 完全二叉树的定义如下：在完全二叉树中，除了最底层节点可能没填满外，其余每层节点数都达到最大值，并且最下面一层的节点都集中在该层最左边的若干位置。若最底层为第 h 层，则该层包含` 1~ 2h` 个节点。

## 230 [二叉搜索树中第K小的元素](https://leetcode-cn.com/problems/kth-smallest-element-in-a-bst/)

* 给定一个二叉搜索树，编写一个函数 `kthSmallest` 来查找其中第 **k** 个最小的元素。 

* **说明：**
  * 你可以假设 k 总是有效的，1 ≤ k ≤ 二叉搜索树元素个数。 

## 240 [搜索二维矩阵 II](https://leetcode-cn.com/problems/search-a-2d-matrix-ii/)

* 编写一个高效的算法来搜索 *m* x *n* 矩阵 matrix 中的一个目标值 target。该矩阵具有以下特性： 
  * 每行的元素从左到右升序排列。
  * 每列的元素从上到下升序排列。

## 275 [H指数 II](https://leetcode-cn.com/problems/h-index-ii/)

* 给定一位研究者论文被引用次数的数组（被引用次数是非负整数），数组已经按照**升序排列**。编写一个方法，计算出研究者的 *h* 指数。 

* h 指数的定义: “h 代表“高引用次数”（high citations），一名科研人员的 h 指数是指他（她）的 （N 篇论文中）至多有 h 篇论文分别被引用了至少 h 次。（其余的 N - h 篇论文每篇被引用次数不多于 h 次。）"

* **说明:**

  * 如果 *h* 有多有种可能的值 ，*h* 指数是其中最大的那个。
* **进阶：**
- 这是 [H指数](https://leetcode-cn.com/problems/h-index/description/) 的延伸题目，本题中的 `citations` 数组是保证有序的。
  - 你可以优化你的算法到对数时间复杂度吗？

## 278 [第一个错误的版本](https://leetcode-cn.com/problems/first-bad-version/)

* 你是产品经理，目前正在带领一个团队开发新的产品。不幸的是，你的产品的最新版本没有通过质量检测。由于每个版本都是基于之前的版本开发的，所以错误的版本之后的所有版本都是错的。

* 假设你有 `n` 个版本 `[1, 2, ..., n]`，你想找出导致之后所有版本出错的第一个错误的版本。 

* 你可以通过调用 `bool isBadVersion(version)` 接口来判断版本号 `version` 是否在单元测试中出错。实现一个函数来查找第一个错误的版本。你应该尽量减少对调用 `API` 的次数。  

## 367 [有效的完全平方数](https://leetcode-cn.com/problems/valid-perfect-square/)

* 给定一个正整数 *`num`*，编写一个函数，如果 *`num`* 是一个完全平方数，则返回 True，否则返回 False。
* **说明：**不要使用任何内置的库函数，如  `sqrt`。

## 410 [分割数组的最大值](https://leetcode-cn.com/problems/split-array-largest-sum/)

* 给定一个非负整数数组和一个整数 *m*，你需要将这个数组分成 *m* 个非空的连续子数组。设计一个算法使得这 *m* 个子数组各自和的最大值最小。

* **注意:**
  * 数组长度 *n* 满足以下条件:
    * 1 ≤ *n* ≤ 1000
    * 1 ≤ *m* ≤ min(50, *n*)

## 668 [乘法表中第k小的数](https://leetcode-cn.com/problems/kth-smallest-number-in-multiplication-table/)

* 几乎每一个人都用 [乘法表](https://baike.baidu.com/item/乘法表)。但是你能在乘法表中快速找到第`k`小的数字吗？

* 给定高度`m` 、宽度`n` 的一张 `m * n`的乘法表，以及正整数`k`，你需要返回表中第`k` 小的数字。

## 719 [找出第 k 小的距离对](https://leetcode-cn.com/problems/find-k-th-smallest-pair-distance/)

* 给定一个整数数组，返回所有数对之间的第 k 个最小**距离**。一对 (A, B) 的距离被定义为 A 和 B 之间的绝对差值。

## 1011 [在 D 天内送达包裹的能力](https://leetcode-cn.com/problems/capacity-to-ship-packages-within-d-days/)

* 传送带上的包裹必须在 D 天内从一个港口运送到另一个港口。

* 传送带上的第 `i` 个包裹的重量为 `weights[i]`。每一天，我们都会按给出重量的顺序往传送带上装载包裹。我们装载的重量不会超过船的最大运载重量。

* 返回能在 `D` 天内将传送带上的所有包裹送达的船的最低运载能力。

## 875 [爱吃香蕉的珂珂](https://leetcode-cn.com/problems/koko-eating-bananas/)

* 珂珂喜欢吃香蕉。这里有 `N` 堆香蕉，第 `i` 堆中有 `piles[i]` 根香蕉。警卫已经离开了，将在 `H` 小时后回来。

* 珂珂可以决定她吃香蕉的速度 `K` （单位：根/小时）。每个小时，她将会选择一堆香蕉，从中吃掉 `K` 根。如果这堆香蕉少于 `K` 根，她将吃掉这堆的所有香蕉，然后这一小时内不会再吃更多的香蕉。 

* 珂珂喜欢慢慢吃，但仍然想在警卫回来前吃掉所有的香蕉。

* 返回她可以在 `H` 小时内吃掉所有香蕉的最小速度 `K`（`K` 为整数）。

## 剑指offer 11 [旋转数组的最小数字](https://leetcode-cn.com/problems/xuan-zhuan-shu-zu-de-zui-xiao-shu-zi-lcof/)

* 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素。例如，数组 `[3,4,5,1,2]` 为 `[1,2,3,4,5]` 的一个旋转，该数组的最小值为1。 

# 深度优先搜索

## 98 验证二叉搜索树

* 给定一个二叉树，判断其是否是一个有效的二叉搜索树。

* 假设一个二叉搜索树具有如下特征：
  * 节点的左子树只包含小于当前节点的数。
  * 节点的右子树只包含大于当前节点的数。
  * 所有左子树和右子树自身必须也是二叉搜索树。

## 99 恢复二叉搜索树

* 二叉搜索树中的两个节点被错误地交换。
* 请在不改变其结构的情况下，恢复这棵树。

## 100 相同的树

* 给定两个二叉树，编写一个函数来检验它们是否相同。
* 如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。

## 101 对称二叉树

* 给定一个二叉树，检查它是否是镜像对称的。

## 104 二叉树的最大尝试

* 给定一个二叉树，找出其最大深度。

* 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。

* **说明**: 叶子节点是指没有子节点的节点。

## 105 从前序与中序遍历序列构造二叉树

* 根据一棵树的前序遍历与中序遍历构造二叉树。

* **注意**: 你可以假设树中没有重复的元素。

## 106 从中序与后序遍历序列构造二叉树

* 根据一棵树的中序遍历与后序遍历构造二叉树。
* **注意**:
  * 你可以假设树中没有重复的元素。

## 108 将有序数组转换为二叉搜索树

* 将一个按照升序排列的有序数组，转换为一棵高度平衡二叉搜索树。

* 本题中，一个高度平衡二叉树是指一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 `1`。

## 109 有序链表转换二叉搜索树

* 给定一个单链表，其中的元素按升序排序，将其转换为高度平衡的二叉搜索树。

* 本题中，一个高度平衡二叉树是指一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1。

## 110 平衡二叉树

* 给定一个二叉树，判断它是否是高度平衡的二叉树。

* 本题中，一棵高度平衡二叉树定义为：

   > 一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过1。

## 111 二叉树的最小深度

* 给定一个二叉树，找出其最小深度。

* 最小深度是从根节点到最近叶子节点的最短路径上的节点数量。

* **说明:** 叶子节点是指没有子节点的节点。

## 112 路径总和

* 给定一个二叉树和一个目标和，判断该树中是否存在根节点到叶子节点的路径，这条路径上所有节点值相加等于目标和。

* **说明:** 叶子节点是指没有子节点的节点。

## 113 路径总和 II

* 给定一个二叉树和一个目标和，找到所有从根节点到叶子节点路径总和等于给定目标和的路径。
* **说明:** 叶子节点是指没有子节点的节点。

## 114 二叉树展开为链表

* 给定一个二叉树，[原地](https://baike.baidu.com/item/原地算法/8010757)将它展开为链表。

## 116 填充每个节点的下一个右侧节点指针

* 给定一个**完美二叉树**，其所有叶子节点都在同一层，每个父节点都有两个子节点。

* 填充它的每个 next 指针，让这个指针指向其下一个右侧节点。如果找不到下一个右侧节点，则将 next 指针设置为 `NULL`。 

* 初始状态下，所有 next 指针都被设置为 `NULL`。 

* 提示：
  * 你只能使用常量级额外空间。
  * 使用递归解题也符合要求，本题中递归程序占用的栈空间不算做额外的空间复杂度。

## 117 填充每个节点的下一个右侧节点指针 II

*  填充它的每个 next 指针，让这个指针指向其下一个右侧节点。如果找不到下一个右侧节点，则将 next 指针设置为 `NULL`。 
* 初始状态下，所有 next 指针都被设置为 `NULL`。 
* **提示：**
  - 你只能使用常量级额外空间。
  - 使用递归解题也符合要求，本题中递归程序占用的栈空间不算做额外的空间复杂度。

## 124 [二叉树中的最大路径和](https://leetcode-cn.com/problems/binary-tree-maximum-path-sum/)

* 给定一个**非空**二叉树，返回其最大路径和。
* 本题中，路径被定义为一条从树中任意节点出发，达到任意节点的序列。该路径**至少包含一个**节点，且不一定经过根节点。

## 129 求根到叶子节点数字之和

* 给定一个二叉树，它的每个结点都存放一个 `0-9` 的数字，每条从根到叶子节点的路径都代表一个数字。 
* 例如，从根到叶子节点路径 `1->2->3` 代表数字 `123`。
* 计算从根到叶子节点生成的所有数字之和
* **说明:** 叶子节点是指没有子节点的节点。 

## 130 被围绕的区域

* 给定一个二维的矩阵，包含 'X' 和 'O'（字母 O）。

* 找到所有被 'X' 围绕的区域，并将这些区域里所有的 'O' 用 'X' 填充。

## 133 克隆图

*  给定无向[**连通**](https://baike.baidu.com/item/连通图/6460995?fr=aladdin)图中一个节点的引用，返回该图的[**深拷贝**](https://baike.baidu.com/item/深拷贝/22785317?fr=aladdin)（克隆）。图中的每个节点都包含它的值 `val`（`Int`） 和其邻居的列表（`list[Node]`）。 
* **提示**：
  * 节点数介于 1 到 100 之间。
  * 无向图是一个简单图，这意味着图中没有重复的边，也没有自环。
  * 由于图是无向的，如果节点 p 是节点 q 的邻居，那么节点 q 也必须是节点 p 的邻居。
  * 必须将给定节点的拷贝作为对克隆图的引用返回。

## 200 岛屿数量

*  给定一个由 `'1'`（陆地）和 `'0'`（水）组成的的二维网格，计算岛屿的数量。 一个岛被水包围，并且它是通过水平方向或垂直方向上相邻的陆地连接而成的。你可以假设网格的四个边均被水包围。 

## 257 [二叉树的所有路径](https://leetcode-cn.com/problems/binary-tree-paths/)

* 给定一个二叉树，返回所有从根节点到叶子节点的路径。
* **说明:** 叶子节点是指没有子节点的节点。

## 329 [矩阵中的最长递增路径](https://leetcode-cn.com/problems/longest-increasing-path-in-a-matrix/)

* 给定一个整数矩阵，找出最长递增路径的长度。

* 对于每个单元格，你可以往上，下，左，右四个方向移动。 你不能在对角线方向上移动或移动到边界外（即不允许环绕）。

## 386 [字典序排数](https://leetcode-cn.com/problems/lexicographical-numbers/)

* 给定一个整数 *n*, 返回从 *1* 到 *n* 的字典顺序。

* 例如，
  * 给定 *n* =1 3，返回 [1,10,11,12,13,2,3,4,5,6,7,8,9] 。

* 请尽可能的优化算法的时间复杂度和空间复杂度。 输入的数据 *n* 小于等于 5,000,000。

## 430 [平化多级双向链表](https://leetcode-cn.com/problems/flatten-a-multilevel-doubly-linked-list/)

* 多级双向链表中，除了指向下一个节点和前一个节点指针之外，它还有一个子链表指针，可能指向单独的双向链表。这些子列表也可能会有一个或多个自己的子项，依此类推，生成多级数据结构，如下面的示例所示。

* 给你位于列表第一级的头节点，请你扁平化列表，使所有结点出现在单级双链表中。

## 695 [岛屿的最大面积](https://leetcode-cn.com/problems/max-area-of-island/)

* 给定一个包含了一些 0 和 1的非空二维数组 `grid` , 一个 **岛屿** 是由四个方向 (水平或垂直) 的 `1` (代表土地) 构成的组合。你可以假设二维矩阵的四个边缘都被水包围着。

* 找到给定的二维数组中最大的岛屿面积。(如果没有岛屿，则返回面积为0。)

## 733 [图像渲染](https://leetcode-cn.com/problems/flood-fill/)

* 有一幅以二维整数数组表示的图画，每一个整数表示该图画的像素值大小，数值在 0 到 65535 之间。

* 给你一个坐标?`(sr, sc)`?表示图像渲染开始的像素值（行 ，列）和一个新的颜色值?`newColor`，让你重新上色这幅图像。

* 为了完成上色工作，从初始坐标开始，记录初始坐标的上下左右四个方向上像素值与初始坐标相同的相连像素点，接着再记录这四个方向上符合条件的像素点与他们对应四个方向上像素值与初始坐标相同的相连像素点，……，重复该过程。将所有有记录的像素点的颜色值改为新的颜色值。

* 最后返回经过上色渲染后的图像。

## 934 [最短的桥](https://leetcode-cn.com/problems/shortest-bridge/)

* 在给定的二维二进制数组 `A` 中，存在两座岛。（岛是由四面相连的 `1` 形成的一个最大组。）

* 现在，我们可以将 `0` 变为 `1`，以使两座岛连接起来，变成一座岛。

* 返回必须翻转的 `0` 的最小数目。（可以保证答案至少是 1。）
* **提示：**
  1. `1 <= A.length = A[0].length <= 100`
  2. `A[i][j] == 0` 或 `A[i][j] == 1`

## 1080 [根到叶路径上的不足节点](https://leetcode-cn.com/problems/insufficient-nodes-in-root-to-leaf-paths/)

* 给定一棵二叉树的根 `root`，请你考虑它所有 **从根到叶的路径**：从根到任何叶的路径。（所谓一个叶子节点，就是一个没有子节点的节点）

* 假如通过节点 `node` 的每种可能的 “根-叶” 路径上值的总和全都小于给定的 `limit`，则该节点被称之为「不足节点」，需要被删除。

* 请你删除所有不足节点，并返回生成的二叉树的根。

## 1123 [最深叶节点的最近公共祖先](https://leetcode-cn.com/problems/lowest-common-ancestor-of-deepest-leaves/)

* 给你一个有根节点的二叉树，找到它最深的叶节点的最近公共祖先。

* 回想一下：
  * **叶节点** 是二叉树中没有子节点的节点
  * 树的根节点的 **深度** 为 `0`，如果某一节点的深度为 `d`，那它的子节点的深度就是 `d+1`
  * 如果我们假定 `A` 是一组节点 `S` 的 **最近公共祖先**，<font color="#c7254e" face="Menlo, Monaco, Consolas, Courier New, monospace">S</font> 中的每个节点都在以 `A` 为根节点的子树中，且 `A` 的深度达到此条件下可能的最大值。

## 1315 [祖父节点值为偶数的节点和](https://leetcode-cn.com/problems/sum-of-nodes-with-even-valued-grandparent/)

* <p>给你一棵二叉树，请你返回满足以下条件的所有节点的值之和：</p>

  <ul>
  	<li>该节点的祖父节点的值为偶数。（一个节点的祖父节点是指该节点的父节点的父节点。）</li>
  </ul>


  <p>如果不存在祖父节点值为偶数的节点，那么返回&nbsp;<code>0</code> 。</p>

# 拓扑排序

## 210 [课程表 II](https://leetcode-cn.com/problems/course-schedule-ii/)

* 现在你总共有 *n* 门课需要选，记为 `0` 到 `n-1`。 

* 在选修某些课程之前需要一些先修课程。 例如，想要学习课程 0 ，你需要先完成课程 1 ，我们用一个匹配来表示他们: `[0,1]` 

* 给定课程总量以及它们的先决条件，返回你为了学完所有课程所安排的学习顺序。

* 可能会有多个正确的顺序，你只要返回一种就可以了。如果不可能完成所有课程，返回一个空数组。

# 快速幂

## [372 超级次方](https://leetcode-cn.com/problems/super-pow/)

* 你的任务是计算 *a**b* 对 1337 取模，*a* 是一个正整数，*b* 是一个非常大的正整数且会以数组形式给出。

# 广度优先搜索

## 102 [二叉树的层次遍历](https://leetcode-cn.com/problems/binary-tree-level-order-traversal/)

*  给定一个二叉树，返回其按层次遍历的节点值。 （即逐层地，从左到右访问所有节点）。 

## 103 [二叉树的锯齿形层次遍历](https://leetcode-cn.com/problems/binary-tree-zigzag-level-order-traversal/)

* 给定一个二叉树，返回其节点值的锯齿形层次遍历。（即先从左往右，再从右往左进行下一层遍历，以此类推，层与层之间交替进行）。 

## 107 [二叉树的层次遍历 II](https://leetcode-cn.com/problems/binary-tree-level-order-traversal-ii/)

*  给定一个二叉树，返回其节点值自底向上的层次遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历） 

## 126 [单词接龙 II](https://leetcode-cn.com/problems/word-ladder-ii/)

* 给定两个单词（`beginWord` 和 `endWord`）和一个字典 `wordList`，找出所有从` beginWord` 到 `endWord` 的最短转换序列。转换需遵循如下规则：

	1. 每次转换只能改变一个字母。
	2. 转换过程中的中间单词必须是字典中的单词。

* **说明:** 
  * 如果不存在这样的转换序列，返回一个空列表。
  * 所有单词具有相同的长度。
  * 所有单词只由小写字母组成。
  * 字典中不存在重复的单词。
  * 你可以假设 `beginWord` 和 `endWord` 是非空的，且二者不相同。

## 127 [单词接龙](https://leetcode-cn.com/problems/word-ladder/)

* 给定两个单词（`beginWord` 和 *`endWord`*）和一个字典，找到从 *`beginWord`* 到 *`endWord`* 的最短转换序列的长度。转换需遵循如下规则：

  1. 每次转换只能改变一个字母。
  2. 转换过程中的中间单词必须是字典中的单词。

* **说明:**
  * 如果不存在这样的转换序列，返回 0。
  * 所有单词具有相同的长度。
  * 所有单词只由小写字母组成。
  * 字典中不存在重复的单词。
  * 你可以假设 `beginWord `和 `endWord` 是非空的，且二者不相同。

## 199 二叉树的右视图

*  给定一棵二叉树，想象自己站在它的右侧，按照从顶部到底部的顺序，返回从右侧所能看到的节点值。 

## 301 [删除无效的括号](https://leetcode-cn.com/problems/remove-invalid-parentheses/)

* 删除最小数量的无效括号，使得输入的字符串有效，返回所有可能的结果。

* **说明:** 输入可能包含了除 `(` 和 `)` 以外的字符。

## 542 [01 矩阵](https://leetcode-cn.com/problems/01-matrix/)

* 给定一个由 0 和 1 组成的矩阵，找出每个元素到最近的 0 的距离。

* 两个相邻元素间的距离为 1 。

## 817 [打开转盘锁](https://leetcode-cn.com/problems/open-the-lock/)

* 你有一个带有四个圆形拨轮的转盘锁。每个拨轮都有10个数字： `'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'` 。每个拨轮可以自由旋转：例如把 `'9'` 变为  `'0'`，`'0'` 变为 `'9'` 。每次旋转都只能旋转一个拨轮的一位数字。

* 锁的初始数字为 `'0000'` ，一个代表四个拨轮的数字的字符串。

* 列表 `deadends` 包含了一组死亡数字，一旦拨轮的数字和列表里的任何一个元素相同，这个锁将会被永久锁定，无法再被旋转。

* 字符串 `target` 代表可以解锁的数字，你需要给出最小的旋转次数，如果无论如何不能解锁，返回 -1

## 994 [腐烂的橘子](https://leetcode-cn.com/problems/rotting-oranges/)

* 在给定的网格中，每个单元格可以有以下三个值之一：
  * 值 `0` 代表空单元格；
  * 值 `1` 代表新鲜橘子；
  * 值 `2` 代表腐烂的橘子。

* 每分钟，任何与腐烂的橘子（在 4 个正方向上）相邻的新鲜橘子都会腐烂。

* 返回直到单元格中没有新鲜橘子为止所必须经过的最小分钟数。如果不可能，返回 `-1`。

## 1162 [地图分析](https://leetcode-cn.com/problems/as-far-from-land-as-possible/)

* 你现在手里有一份大小为 N x N 的『地图』（网格） `grid`，上面的每个『区域』（单元格）都用 `0` 和 `1` 标记好了。其中 `0` 代表海洋，`1` 代表陆地，你知道距离陆地区域最远的海洋区域是是哪一个吗？请返回该海洋区域到离它最近的陆地区域的距离。

* 我们这里说的距离是『曼哈顿距离』（ Manhattan Distance）：`(x0, y0)` 和 `(x1, y1)`这两个区域之间的距离是 `|x0 - x1| + |y0 - y1|` 。

* 如果我们的地图上只有陆地或者海洋，请返回 `-1`。

## 面试题04.03 [特定深度节点链表](https://leetcode-cn.com/problems/list-of-depth-lcci/)

* 给定一棵二叉树，设计一个算法，创建含有某一深度上所有节点的链表（比如，若一棵树的深度为 `D`，则会创建出 `D` 个链表）。返回一个包含所有深度的链表的数组。

# 滑动窗口

## 30  串联所有单词的子串

* 给定一个字符串` s` 和一些长度相同的单词 `words`。找出 `s` 中恰好可以由` words` 中所有单词串联形成的子串的起始位置。
* 注意子串要与 `words` 中的单词完全匹配，中间不能有其他字符，但不需要考虑 `words` 中单词串联的顺序。

## 76 最小覆盖子串

* 给你一个字符串 `S`、一个字符串 `T`，请在字符串` S` 里面找出：包含` T `所有字母的最小子串。

## 187 [重复的DNA序列](https://leetcode-cn.com/problems/repeated-dna-sequences/)

* 所有 DNA 都由一系列缩写为 A，C，G 和 T 的核苷酸组成，例如：`“ACGAATTCCG”`。在研究 DNA 时，识别 DNA 中的重复序列有时会对研究非常有帮助。

* 编写一个函数来查找 DNA 分子中所有出现超过一次的 10 个字母长的序列（子串）。

## 239 [滑动窗口最大值](https://leetcode-cn.com/problems/sliding-window-maximum/)

* 给定一个数组 *`nums`*，有一个大小为 *k* 的滑动窗口从数组的最左侧移动到数组的最右侧。你只可以看到在滑动窗口内的 *k* 个数字。滑动窗口每次只向右移动一位。

* 返回滑动窗口中的最大值。

* **提示：**

  * 你可以假设 *k* 总是有效的，在输入数组不为空的情况下，1 ≤ k ≤ 输入数组的大小。

**进阶：**

* 你能在线性时间复杂度内解决此题吗？

## 438 找到字符串中所有字母异位词

* 给定一个字符串 `s` 和一个非空字符串` p`，找到 `s` 中所有是 `p` 的字母异位词的子串，返回这些子串的起始索引。

* 字符串只包含小写英文字母，并且字符串 `s `和`p` 的长度都不超过 `20100`。

* **说明**：
  * 字母异位词指字母相同，但排列不同的字符串。
  * 不考虑答案输出的顺序。

## 1438 [对差不超过限制的最长连续子数组](https://leetcode-cn.com/problems/longest-continuous-subarray-with-absolute-diff-less-than-or-equal-to-limit/)

* <p>给你一个整数数组 <code>nums</code> ，和一个表示限制的整数 <code>limit</code>，请你返回最长连续子数组的长度，该子数组中的任意两个元素之间的绝对差必须小于或者等于 <code>limit</code><em> 。</em></p>

* <p>如果不存在满足条件的子数组，则返回 <code>0</code> 。</p>

## 面试题17.18 [ 最短超串](https://leetcode-cn.com/problems/shortest-supersequence-lcci/)

* <p>假设你有两个数组，一个长一个短，短的元素均不相同。找到长数组中包含短数组所有的元素的最短子数组，其出现顺序无关紧要。</p>

* <p>返回最短子数组的左端点和右端点，如有多个满足条件的子数组，返回左端点最小的一个。若不存在，返回空数组。</p>

# 回溯算法

## 22 [括号生成](https://leetcode-cn.com/problems/generate-parentheses/)

* 给出 *n* 代表生成括号的对数，请你写出一个函数，使其能够生成所有可能的并且**有效的**括号组合。

## 37 [解数独](https://leetcode-cn.com/problems/sudoku-solver/)

* 编写一个程序，通过已填充的空格来解决数独问题。

* 一个数独的解法需**遵循如下规则**：

1. 数字 `1-9` 在每一行只能出现一次。
2. 数字 `1-9` 在每一列只能出现一次。
3. 数字 `1-9` 在每一个以粗实线分隔的 `3x3` 宫内只能出现一次。

空白格用 `'.'` 表示。

![img](http://upload.wikimedia.org/wikipedia/commons/thumb/f/ff/Sudoku-by-L2G-20050714.svg/250px-Sudoku-by-L2G-20050714.svg.png)

一个数独。

![img](http://upload.wikimedia.org/wikipedia/commons/thumb/3/31/Sudoku-by-L2G-20050714_solution.svg/250px-Sudoku-by-L2G-20050714_solution.svg.png)

* 答案被标成红色。

* **Note:**
  * 给定的数独序列只包含数字 `1-9` 和字符 `'.'` 。
  * 你可以假设给定的数独只有唯一解。
  * 给定数独永远是 `9x9` 形式的。

## 39 组合总和

* 给定一个无重复元素的数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。

* candidates 中的数字可以无限制重复被选取。


## 46 全排列

* 给定一个没有重复数字的序列，返回其所有可能的全排列。

## 47 全排列2

* 给定一个可包含重复数字的序列，返回所有不重复的全排列

## 51 [N皇后](https://leetcode-cn.com/problems/n-queens/)

- *n* 皇后问题研究的是如何将 *n* 个皇后放置在 *n*×*n* 的棋盘上，并且使皇后彼此之间不能相互攻击。

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2018/10/12/8-queens.png)

- 上图为 8 皇后问题的一种解法。

- 给定一个整数 *n*，返回所有不同的 *n* 皇后问题的解决方案。

- 每一种解法包含一个明确的 *n* 皇后问题的棋子放置方案，该方案中 `'Q'` 和 `'.'` 分别代表了皇后和空位。

## 52 [N皇后 II](https://leetcode-cn.com/problems/n-queens-ii/)

* *n* 皇后问题研究的是如何将 *n* 个皇后放置在 *n*×*n* 的棋盘上，并且使皇后彼此之间不能相互攻击。

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2018/10/12/8-queens.png)

* 上图为 8 皇后问题的一种解法。

* 给定一个整数 *n*，返回 *n* 皇后不同的解决方案的数量。

## 60 第k个排列

* 给定 *n* 和 *k*，返回第 *k* 个排列。

## 77 组合

* 给定两个整数 n 和 k，返回 1 ... n 中所有可能的 k 个数的组合。

## 78 子集

* 给定一组**不含重复元素**的整数数组` nums`，返回该数组所有可能的子集（幂集）。
* **说明：**解集不能包含重复的子集。

## 79 [单词搜索](https://leetcode-cn.com/problems/word-search/)

* 给定一个二维网格和一个单词，找出该单词是否存在于网格中。
* 单词必须按照字母顺序，通过相邻的单元格内的字母构成，其中“相邻”单元格是那些水平相邻或垂直相邻的单元格。同一个单元格内的字母不允许被重复使用

## 90 [子集 II](https://leetcode-cn.com/problems/subsets-ii/)

* 给定一个可能包含重复元素的整数数组 ***`nums`***，返回该数组所有可能的子集（幂集）。

* **说明：**解集不能包含重复的子集。

## 93 [复原IP地址](https://leetcode-cn.com/problems/restore-ip-addresses/)

* 给定一个只包含数字的字符串，复原它并返回所有可能的 IP 地址格式。

## 113 路径总和 II

* 给定一个二叉树和一个目标和，找到所有从根节点到叶子节点路径总和等于给定目标和的路径。

* **说明:** 叶子节点是指没有子节点的节点。

## 131 分割回文串

* 给定一个字符串 s，将 s 分割成一些子串，使每个子串都是回文串。
* 返回 s 所有可能的分割方案。

## 216 [组合总和 III](https://leetcode-cn.com/problems/combination-sum-iii/)

* 找出所有相加之和为 ***n*** 的 **k** 个数的组合**。**组合中只允许含有 1 - 9 的正整数，并且每种组合中不存在重复的数字。

* **说明：**
  * 所有数字都是正整数。
  * 解集不能包含重复的组合。 

## 257 [二叉树的所有路径](https://leetcode-cn.com/problems/binary-tree-paths/)

* 给定一个二叉树，返回所有从根节点到叶子节点的路径。

* **说明:** 叶子节点是指没有子节点的节点。

## 306 [累加数](https://leetcode-cn.com/problems/additive-number/)

* 累加数是一个字符串，组成它的数字可以形成累加序列。

* 一个有效的累加序列必须**至少**包含 3 个数。除了最开始的两个数以外，字符串中的其他数都等于它之前两个数相加的和。

* 给定一个只包含数字 `'0'-'9'` 的字符串，编写一个算法来判断给定输入是否是累加数。

* **说明:** 累加序列里的数不会以 0 开头，所以不会出现 `1, 2, 03`或者 `1, 02, 3` 的情况。

## 332 [重新安排行程](https://leetcode-cn.com/problems/reconstruct-itinerary/)

* 给定一个机票的字符串二维数组 `[from, to]`，子数组中的两个成员分别表示飞机出发和降落的机场地点，对该行程进行重新规划排序。所有这些机票都属于一个从 JFK（肯尼迪国际机场）出发的先生，所以该行程必须从 JFK 开始。

## 491 [递增子序列](https://leetcode-cn.com/problems/increasing-subsequences/)

* 给定一个整型数组, 你的任务是找到所有该数组的递增子序列，递增子序列的长度至少是2。

## 526 [优美的排列](https://leetcode-cn.com/problems/beautiful-arrangement/)

* <p>假设有从 1 到 N 的&nbsp;<strong>N&nbsp;</strong>个整数，如果从这&nbsp;<strong>N&nbsp;</strong>个数字中成功构造出一个数组，使得数组的第 <strong>i</strong>&nbsp;位 (1 &lt;= i &lt;= N) 满足如下两个条件中的一个，我们就称这个数组为一个优美的排列。条件：</p>

  <ol>
  	<li>第&nbsp;<strong>i&nbsp;</strong>位的数字能被&nbsp;<strong>i&nbsp;</strong>整除</li>
  	<li><strong>i</strong> 能被第 <strong>i</strong> 位上的数字整除</li>
  </ol>

* <p>现在给定一个整数 N，请问可以构造多少个优美的排列？</p>

## 698 [分为k个相等的子集](https://leetcode-cn.com/problems/partition-to-k-equal-sum-subsets/)

* 给定一个整数数组  `nums` 和一个正整数 `k`，找出是否有可能把这个数组分成 `k` 个非空子集，其总和都相等。

* **注意:**
  * `1 <= k <= len(nums) <= 16`
  * `0 < nums[i] < 10000`

## 967 [连续差相同的数字](https://leetcode-cn.com/problems/numbers-with-same-consecutive-differences/)

* 返回所有长度为 `N` 且满足其每两个连续位上的数字之间的差的绝对值为 `K` 的**非负整数**。

* 请注意，**除了**数字 `0` 本身之外，答案中的每个数字都**不能**有前导零。例如，`01` 因为有一个前导零，所以是无效的；但 `0` 是有效的。

* 你可以按任何顺序返回答案。

## 面试题08.02 [迷路的机器人](https://leetcode-cn.com/problems/robot-in-a-grid-lcci/)

* 设想有个机器人坐在一个网格的左上角，网格 r 行 c 列。机器人只能向下或向右移动，但不能走到一些被禁止的网格（有障碍物）。设计一种算法，寻找机器人从左上角移动到右下角的路径。

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2018/10/22/robot_maze.png)

* 网格中的障碍物和空位置分别用 `1` 和 `0` 来表示。

* 返回一条可行的路径，路径由经过的网格的行号和列号组成。左上角为 0 行 0 列。

## 面试题38 [字符串的排列](https://leetcode-cn.com/problems/zi-fu-chuan-de-pai-lie-lcof/)

* 输入一个字符串，打印出该字符串中字符的所有排列。

* 你可以以任意顺序返回这个字符串数组，但里面不能有重复元素。

# 贪心算法

## 45 [跳跃游戏 II](https://leetcode-cn.com/problems/jump-game-ii/)

* 给定一个非负整数数组，你最初位于数组的第一个位置。

* 数组中的每个元素代表你在该位置可以跳跃的最大长度。

* 你的目标是使用最少的跳跃次数到达数组的最后一个位置。
* **说明:**
  * 假设你总是可以到达数组的最后一个位置。

## 135 [分发糖果](https://leetcode-cn.com/problems/candy/)

* 老师想给孩子们分发糖果，有 *N* 个孩子站成了一条直线，老师会根据每个孩子的表现，预先给他们评分。

* 你需要按照以下要求，帮助老师给这些孩子分发糖果：
  * 每个孩子至少分配到 1 个糖果。
  * 相邻的孩子中，评分高的孩子必须获得更多的糖果。

* 那么这样下来，老师至少需要准备多少颗糖果呢？

## 376 [摆动序列](https://leetcode-cn.com/problems/wiggle-subsequence/)

* 如果连续数字之间的差严格地在正数和负数之间交替，则数字序列称为**摆动序列。**第一个差（如果存在的话）可能是正数或负数。少于两个元素的序列也是摆动序列。

* 例如， `[1,7,4,9,2,5]` 是一个摆动序列，因为差值 `(6,-3,5,-7,3)` 是正负交替出现的。相反, `[1,4,7,2,5]` 和 `[1,7,4,5,5]` 不是摆动序列，第一个序列是因为它的前两个差值都是正数，第二个序列是因为它的最后一个差值为零。

* 给定一个整数序列，返回作为摆动序列的最长子序列的长度。 通过从原始序列中删除一些（也可以不删除）元素来获得子序列，剩下的元素保持其原始顺序。

## 406 [根据身高重建队列](https://leetcode-cn.com/problems/queue-reconstruction-by-height/)

* 假设有打乱顺序的一群人站成一个队列。 每个人由一个整数对`(h, k)`表示，其中`h`是这个人的身高，`k`是排在这个人前面且身高大于或等于`h`的人数。 编写一个算法来重建这个队列。

* **注意：** 总人数少于1100人。

## 455 [分发饼干](https://leetcode-cn.com/problems/assign-cookies/)

* 假设你是一位很棒的家长，想要给你的孩子们一些小饼干。但是，每个孩子最多只能给一块饼干。对每个孩子 i ，都有一个胃口值 gi ，这是能让孩子们满足胃口的饼干的最小尺寸；并且每块饼干 j ，都有一个尺寸 sj 。如果 sj >= gi ，我们可以将这个饼干 j 分配给孩子 i ，这个孩子会得到满足。你的目标是尽可能满足越多数量的孩子，并输出这个最大数值。

* **注意：**
  * 你可以假设胃口值为正。
  * 一个小朋友最多只能拥有一块饼干。

## 621 [任务调度器](https://leetcode-cn.com/problems/task-scheduler/)

* 给定一个用字符数组表示的 CPU 需要执行的任务列表。其中包含使用大写的 A - Z 字母表示的26 种不同种类的任务。任务可以以任意顺序执行，并且每个任务都可以在 1 个单位时间内执行完。CPU 在任何一个单位时间内都可以执行一个任务，或者在待命状态。

* 然而，两个**相同种类**的任务之间必须有长度为 **n** 的冷却时间，因此至少有连续 n 个单位时间内 CPU 在执行不同的任务，或者在待命状态。

* 你需要计算完成所有任务所需要的**最短时间**。

## 659 [分割数组为连续子序列](https://leetcode-cn.com/problems/split-array-into-consecutive-subsequences/)

* 输入一个按升序排序的整数数组（可能包含重复数字），你需要将它们分割成几个子序列，其中每个子序列至少包含三个连续整数。返回你是否能做出这样的分割？

## 738 [单调递增的数字](https://leetcode-cn.com/problems/monotone-increasing-digits/)

* 给定一个非负整数 `N`，找出小于或等于 `N` 的最大的整数，同时这个整数需要满足其各个位数上的数字是单调递增。

* （当且仅当每个相邻位数上的数字 `x` 和 `y` 满足 `x <= y` 时，我们称这个整数是单调递增的。）

## 861 [ 翻转矩阵后的得分](https://leetcode-cn.com/problems/score-after-flipping-matrix/)

* 有一个二维矩阵 `A` 其中每个元素的值为 `0` 或 `1` 。

* 移动是指选择任一行或列，并转换该行或列中的每一个值：将所有 `0` 都更改为 `1`，将所有 `1` 都更改为 `0`。

* 在做出任意次数的移动后，将该矩阵的每一行都按照二进制数来解释，矩阵的得分就是这些数字的总和。

* 返回尽可能高的分数。

## 881 [救生艇](https://leetcode-cn.com/problems/boats-to-save-people/)

* 第 `i` 个人的体重为 `people[i]`，每艘船可以承载的最大重量为 `limit`。

* 每艘船最多可同时载两人，但条件是这些人的重量之和最多为 `limit`。

* 返回载到每一个人所需的最小船数。(保证每个人都能被船载)。

## 984 [不含 AAA 或 BBB 的字符串](https://leetcode-cn.com/problems/string-without-aaa-or-bbb/)

* 给定两个整数 `A` 和 `B`，返回**任意**字符串 `S`，要求满足：
  * `S` 的长度为 `A + B`，且正好包含 `A` 个 `'a'` 字母与 `B` 个 `'b'` 字母；
  * 子串 `'aaa'` 没有出现在 `S` 中；
  * 子串 `'bbb'` 没有出现在 `S` 中。

## 1029 [两地调度](https://leetcode-cn.com/problems/two-city-scheduling/)

* 公司计划面试 `2N` 人。第 `i` 人飞往 `A` 市的费用为 `costs[i][0]`，飞往 `B` 市的费用为 `costs[i][1]`。

* 返回将每个人都飞到某座城市的最低费用，要求每个城市都有 `N` 人抵达**。**
* **提示：**
  1. `1 <= costs.length <= 100`
  2. `costs.length` 为偶数
  3. `1 <= costs[i][0], costs[i][1] <= 1000`

## 1353 [最多可以参加的会议数目](https://leetcode-cn.com/problems/maximum-number-of-events-that-can-be-attended/)

* 给你一个数组 `events`，其中 `events[i] = [startDayi, endDayi]` ，表示会议` i `开始于 `startDayi `，结束于 `endDayi` 。

* 你可以在满足 `startDayi <= d <= endDayi `中的任意一天 d 参加会议`i `。注意，一天只能参加一个会议。

* 请你返回你可以参加的 **最大** 会议数目。

# 分治算法

## 241 [为运算表达式设计优先级](https://leetcode-cn.com/problems/different-ways-to-add-parentheses/)

* 给定一个含有数字和运算符的字符串，为表达式添加括号，改变其运算优先级以求出不同的结果。你需要给出所有可能的组合的结果。有效的运算符号包含` +`, `-` 以及 `*` 。

## 312 [戳气球](https://leetcode-cn.com/problems/burst-balloons/)

* 有 `n` 个气球，编号为`0` 到 `n-1`，每个气球上都标有一个数字，这些数字存在数组 `nums` 中。

* 现在要求你戳破所有的气球。每当你戳破一个气球 `i` 时，你可以获得 `nums[left] * nums[i] * nums[right]` 个硬币。 这里的 `left` 和 `right` 代表和 `i` 相邻的两个气球的序号。注意当你戳破了气球 `i` 后，气球 `left` 和气球 `right` 就变成了相邻的气球。

* 求所能获得硬币的最大数量。

* **说明:**
  * 你可以假设 `nums[-1] = nums[n] = 1`，但注意它们不是真实存在的所以并不能被戳破。
  * 0 ≤ `n` ≤ 500, 0 ≤ `nums[i]` ≤ 100

## 395 [至少有K个重复字符的最长子串](https://leetcode-cn.com/problems/longest-substring-with-at-least-k-repeating-characters/)

* 找到给定字符串（由小写字符组成）中的最长子串 **T** ， 要求 **T** 中的每一字符出现次数都不少于 *k* 。输出 **T** 的长度。

# 动态规划

## 5 最长回文子串

* 给定一个字符串 `s`，找到 `s` 中最长的回文子串。你可以假设 `s` 的最大长度为 1000。

## 10 [正则表达式匹配](https://leetcode-cn.com/problems/regular-expression-matching/)

* 给你一个字符串 `s` 和一个字符规律 `p`，请你来实现一个支持 `'.'` 和 `'*'` 的正则表达式匹配。

	```'.' 匹配任意单个字符
'.' 匹配任意单个字符
'*' 匹配零个或多个前面的那一个元素
	```

* 所谓匹配，是要涵盖 **整个** 字符串 `s`的，而不是部分字符串。

* **说明:**
  * `s` 可能为空，且只包含从 `a-z` 的小写字母。
  * `p` 可能为空，且只包含从 `a-z` 的小写字母，以及字符 `.` 和 `*`。

## 32 [最长有效括号](https://leetcode-cn.com/problems/longest-valid-parentheses/)

* 给定一个只包含 `'('` 和 `')'` 的字符串，找出最长的包含有效括号的子串的长度。

## 42 [接雨水](https://leetcode-cn.com/problems/trapping-rain-water/)

* 给定` n` 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水。

## 44 [通配符匹配](https://leetcode-cn.com/problems/wildcard-matching/)

* 给定一个字符串 (`s`) 和一个字符模式 (`p`) ，实现一个支持 `'?'` 和 `'*'` 的通配符匹配。 

  ```
  '?' 可以匹配任何单个字符。
  '*' 可以匹配任意字符串（包括空字符串）。
  ```

* 两个字符串**完全匹配**才算匹配成功。 

* **说明:** 

  * `s` 可能为空，且只包含从 `a-z` 的小写字母。
  * `p` 可能为空，且只包含从 `a-z` 的小写字母，以及字符 `?` 和 `*`。

## 53 最大子序和

* 给定一个整数数组 `nums` ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。

## 55 [跳跃游戏](https://leetcode-cn.com/problems/jump-game/)

* 给定一个非负整数数组，你最初位于数组的第一个位置。

* 数组中的每个元素代表你在该位置可以跳跃的最大长度。

* 判断你是否能够到达最后一个位置。

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

## 72 [编辑距离](https://leetcode-cn.com/problems/edit-distance/)

* 给定两个单词 *`word1`* 和 *`word2`*，计算出将 *`word1`* 转换成 *`word2`* 所使用的最少操作数 。

* 你可以对一个单词进行如下三种操作：

1. 插入一个字符
2. 删除一个字符
3. 替换一个字符

## 91 [解码方法](https://leetcode-cn.com/problems/decode-ways/)

一条包含字母 `A-Z` 的消息通过以下方式进行了编码：

```
'A' -> 1
'B' -> 2
...
'Z' -> 26
```

* 给定一个只包含数字的**非空**字符串，请计算解码方法的总数。

## 96 不同的二叉搜索树

* 给定一个整数` n`，求以  ` 1 ... n `为节点组成的二叉搜索树有多少种？

## 97 [交错字符串](https://leetcode-cn.com/problems/interleaving-string/)

* 给定三个字符串 *`s1`*, *`s2`*, *`s3`*, 验证 *`s3`* 是否是由 *`s1`* 和 *`s2`* 交错组成的。

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

## 139 [单词拆分](https://leetcode-cn.com/problems/word-break/)

* 给定一个**非空**字符串 *s* 和一个包含**非空**单词列表的字典 *wordDict*，判定 *s* 是否可以被空格拆分为一个或多个在字典中出现的单词。

* **说明：**
  * 拆分时可以重复使用字典中的单词。
  * 你可以假设字典中没有重复的单词。

## 174 [地下城游戏](https://leetcode-cn.com/problems/dungeon-game/)

* 一些恶魔抓住了公主（**P**）并将她关在了地下城的右下角。地下城是由 M x N 个房间组成的二维网格。我们英勇的骑士（**K**）最初被安置在左上角的房间里，他必须穿过地下城并通过对抗恶魔来拯救公主。

* 骑士的初始健康点数为一个正整数。如果他的健康点数在某一时刻降至 0 或以下，他会立即死亡。

* 有些房间由恶魔守卫，因此骑士在进入这些房间时会失去健康点数（若房间里的值为*负整数*，则表示骑士将损失健康点数）；其他房间要么是空的（房间里的值为 *0*），要么包含增加骑士健康点数的魔法球（若房间里的值为*正整数*，则表示骑士将增加健康点数）。

* 为了尽快到达公主，骑士决定每次只向右或向下移动一步。

## 198 [打家劫舍](https://leetcode-cn.com/problems/house-robber/)

* 你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。

* 给定一个代表每个房屋存放金额的非负整数数组，计算你**在不触动警报装置的情况下，**能够偷窃到的最高金额。

##  213 [打家劫舍 II](https://leetcode-cn.com/problems/house-robber-ii/)

* 你是一个专业的小偷，计划偷窃沿街的房屋，每间房内都藏有一定的现金。这个地方所有的房屋都围成一圈，这意味着第一个房屋和最后一个房屋是紧挨着的。同时，相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。

* 给定一个代表每个房屋存放金额的非负整数数组，计算你**在不触动警报装置的情况下，**能够偷窃到的最高金额。

## 221 [最大正方形](https://leetcode-cn.com/problems/maximal-square/)

* 在一个由 0 和 1 组成的二维矩阵内，找到只包含 1 的最大正方形，并返回其面积。

## 279 [完全平方数](https://leetcode-cn.com/problems/perfect-squares/)

* 给定正整数 *n*，找到若干个完全平方数（比如 `1, 4, 9, 16, ...`）使得它们的和等于 *n*。你需要让组成和的完全平方数的个数最少。

## 300 [最长上升子序列](https://leetcode-cn.com/problems/longest-increasing-subsequence/)

* 给定一个无序的整数数组，找到其中最长上升子序列的长度。 
* **说明:** 
  - 可能会有多种最长上升子序列的组合，你只需要输出对应的长度即可。
  - 你算法的时间复杂度应该为 `O(n^2)` 。
* **进阶:** 
  * 你能将算法的时间复杂度降低到 `O(*n* log *n*)` 吗? 

## 303 [区域和检索 - 数组不可变](https://leetcode-cn.com/problems/range-sum-query-immutable/)

* 给定一个整数数组  *`nums`*，求出数组从索引 *`i`* 到 *`j`* (*i* ≤ *j*) 范围内元素的总和，包含 *i, j* 两点。
* **说明:**
  1. 你可以假设数组不可变。
  2. 会多次调用 *`sumRange`* 方法。

## 304 [二维区域和检索 - 矩阵不可变](https://leetcode-cn.com/problems/range-sum-query-2d-immutable/)

* 给定一个二维矩阵，计算其子矩形范围内元素的总和，该子矩阵的左上角为` (row1, col1)` ，右下角为` (row2, col2)`。

  ![Range Sum Query 2D](https://assets.leetcode-cn.com/aliyun-lc-upload/images/304.png)

* 上图子矩阵左上角` (row1, col1) = (2, 1)` ，右下角`(row2, col2) `= **`(4, 3)`，**该子矩形内元素的总和为 8。

* **说明:**

  1. 你可以假设矩阵不可变。
  2. 会多次调用` sumRegion `方法。
  3. 你可以假设 `row1 ≤ row2` 且` col1 ≤ col2`。

## 309 [最佳买卖股票时机含冷冻期](https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/)

* 给定一个整数数组，其中第 *`i`* 个元素代表了第 *i* 天的股票价格 。

* 设计一个算法计算出最大利润。在满足以下约束条件下，你可以尽可能地完成更多的交易（多次买卖一支股票）:
  * 你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
  * 卖出股票后，你无法在第二天买入股票 (即冷冻期为 1 天)。

## 322 [零钱兑换](https://leetcode-cn.com/problems/coin-change/)

* 给定不同面额的硬币 `coins `和一个总金额` amount`。编写一个函数来计算可以凑成总金额所需的最少的硬币个数。如果没有任何一种硬币组合能组成总金额，返回`-1`。

* **说明**:
  * 你可以认为每种硬币的数量是无限的。

## 327 [区间和的个数](https://leetcode-cn.com/problems/count-of-range-sum/)

* 给定一个整数数组?`nums`，返回区间和在?`[lower, upper]`?之间的个数，包含?`lower`?和?`upper`。
  区间和?`S(i, j)`?表示在?`nums`?中，位置从?`i`?到?`j`?的元素之和，包含?`i`?和?`j`?(`i` ≤ `j`)。

## 337 [打家劫舍 III](https://leetcode-cn.com/problems/house-robber-iii/)

* 在上次打劫完一条街道之后和一圈房屋后，小偷又发现了一个新的可行窃的地区。这个地区只有一个入口，我们称之为“根”。 除了“根”之外，每栋房子有且只有一个“父“房子与之相连。一番侦察之后，聪明的小偷意识到“这个地方的所有房屋的排列类似于一棵二叉树”。 如果两个直接相连的房子在同一天晚上被打劫，房屋将自动报警。
* 计算在不触动警报的情况下，小偷一晚能够盗取的最高金额。

## 338 [比特位计数](https://leetcode-cn.com/problems/counting-bits/)

* 给定一个非负整数 **`num`**。对于 **`0 ≤ i ≤ num`** 范围中的每个数字 **i** ，计算其二进制数中的 1 的数目并将它们作为数组返回。
* **进阶:**
  * 给出时间复杂度为`O(n*sizeof(integer))`的解答非常容易。但你可以在线性时间O(n)内用一趟扫描做到吗？
  * 要求算法的空间复杂度为`O(n)`。
  * 你能进一步完善解法吗？要求在C++或任何其他语言中不使用任何内置函数（如 C++ 中的 `__builtin_popcount`）来执行此操作。

## 368 [最大整除子集](https://leetcode-cn.com/problems/largest-divisible-subset/)

* 给出一个由**无重复的**正整数组成的集合，找出其中最大的整除子集，子集中任意一对 (Si，Sj) 都要满足：Si % Sj = 0 或 Sj % Si = 0。

* 如果有多个目标子集，返回其中任何一个均可。

## 416 [分割等和子集](https://leetcode-cn.com/problems/partition-equal-subset-sum/)

* 给定一个**只包含正整数**的**非空**数组。是否可以将这个数组分割成两个子集，使得两个子集的元素和相等。

* **注意:**

1. 每个数组中的元素不会超过 100
2. 数组的大小不会超过 200

## 494 [目标和](https://leetcode-cn.com/problems/target-sum/)

* 给定一个非负整数数组，a1, a2, ..., an, 和一个目标数，S。现在你有两个符号 `+` 和 `-`。对于数组中的任意一个整数，你都可以从 `+` 或 `-`中选择一个符号添加在前面。
* 返回可以使最终数组和为目标数 S 的所有添加符号的方法数。

## 509 [斐波那契数](https://leetcode-cn.com/problems/fibonacci-number/)

* *斐波那契数**，通常用 `F(n)` 表示，形成的序列称为**斐波那契数列**。该数列由 `0` 和 `1` 开始，后面的每一项数字都是前面两项数字的和。也就是：

```
F(0) = 0,   F(1) = 1
F(N) = F(N - 1) + F(N - 2), 其中 N > 1.
```

* 给定 `N`，计算 `F(N)`。

## 516 [最长回文子序列](https://leetcode-cn.com/problems/longest-palindromic-subsequence/)

* 给定一个字符串`s`，找到其中最长的回文子序列。可以假设`s`的最大长度为`1000`。

## 583 [两个字符串的删除操作](https://leetcode-cn.com/problems/delete-operation-for-two-strings/)

* 给定两个单词 *word1* 和 *word2*，找到使得 *word1* 和 *word2* 相同所需的最小步数，每步可以删除任意一个字符串中的一个字符。

## 647 [回文子串](https://leetcode-cn.com/problems/palindromic-substrings/)

* 给定一个字符串，你的任务是计算这个字符串中有多少个回文子串。
* 具有不同开始位置或结束位置的子串，即使是由相同的字符组成，也会被计为是不同的子串。

## 673 [最长递增子序列的个数](https://leetcode-cn.com/problems/number-of-longest-increasing-subsequence/)

* 给定一个未排序的整数数组，找到最长递增子序列的个数。

## 680 [验证回文字符串 Ⅱ](https://leetcode-cn.com/problems/valid-palindrome-ii/)

* 给定一个非空字符串 `s`，**最多**删除一个字符。判断是否能成为回文字符串。

## 714 [买卖股票的最佳时机含手续费](https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/)

* 给定一个整数数组 `prices`，其中第 `i` 个元素代表了第 `i` 天的股票价格 ；非负整数 `fee` 代表了交易股票的手续费用。

* 你可以无限次地完成交易，但是你每笔交易都需要付手续费。如果你已经购买了一个股票，在卖出它之前你就不能再继续购买股票了。

* 返回获得利润的最大值。

* **注意：**这里的一笔交易指买入持有并卖出股票的整个过程，每笔交易你只需要为支付一次手续费。

## 718 [最长重复子数组](https://leetcode-cn.com/problems/maximum-length-of-repeated-subarray/)

* 给两个整数数组 `A` 和 `B` ，返回两个数组中公共的、长度最长的子数组的长度。

## 746 [使用最小花费爬楼梯](https://leetcode-cn.com/problems/min-cost-climbing-stairs/)

* 数组的每个索引作为一个阶梯，第 `i`个阶梯对应着一个非负数的体力花费值 `cost[i]`(索引从0开始)。

* 每当你爬上一个阶梯你都要花费对应的体力花费值，然后你可以选择继续爬一个阶梯或者爬两个阶梯。

* 您需要找到达到楼层顶部的最低花费。在开始时，你可以选择从索引为 0 或 1 的元素作为初始阶梯。

## 764 [最大加号标志](https://leetcode-cn.com/problems/largest-plus-sign/)

* 在一个大小在 (0, 0) 到 (N-1, N-1) 的2D网格 `grid`中，除了在 `mines` 中给出的单元为 `0`，其他每个单元都是 `1`。网格中包含 `1` 的最大的轴对齐加号标志是多少阶？返回加号标志的阶数。如果未找到加号标志，则返回 0。
* 一个 **k**" 阶由 *`1`* 组成的“轴对称”加号标志具有中心网格 `grid[x][y] = 1` ，以及4个从中心向上、向下、向左、向右延伸，长度为 `k-1`，由 `1` 组成的臂。下面给出 **k**" 阶“轴对称”加号标志的示例。注意，只有加号标志的所有网格要求为 1，别的网格可能为 0 也可能为 1。

## 873 [最长的斐波那契子序列的长度](https://leetcode-cn.com/problems/length-of-longest-fibonacci-subsequence/)

* 如果序列 `X_1, X_2, ..., X_n` 满足下列条件，就说它是 *斐波那契式* 的：
  * `n >= 3`
  * 对于所有 `i + 2 <= n`，都有 `X_i + X_{i+1} = X_{i+2}`

* 给定一个**严格递增**的正整数数组形成序列，找到 `A` 中最长的斐波那契式的子序列的长度。如果一个不存在，返回  0 。

* *（回想一下，子序列是从原序列 A 中派生出来的，它从 A 中删掉任意数量的元素（也可以不删），而不改变其余元素的顺序。例如， [3, 5, 8] 是 [3, 4, 5, 6, 7, 8] 的一个子序列）*

## 983 [最低票价](https://leetcode-cn.com/problems/minimum-cost-for-tickets/)

* 在一个火车旅行很受欢迎的国度，你提前一年计划了一些火车旅行。在接下来的一年里，你要旅行的日子将以一个名为 `days` 的数组给出。每一项是一个从 `1` 到 `365` 的整数。

* 火车票有三种不同的销售方式：
  * 一张为期一天的通行证售价为 `costs[0]` 美元；
  * 一张为期七天的通行证售价为 `costs[1]` 美元；
  * 一张为期三十天的通行证售价为 `costs[2]` 美元。

  * 通行证允许数天无限制的旅行。 例如，如果我们在第 2 天获得一张为期 7 天的通行证，那么我们可以连着旅行 7 天：第 2 天、第 3 天、第 4 天、第 5 天、第 6 天、第 7 天和第 8 天。

* 返回你想要完成在给定的列表 `days` 中列出的每一天的旅行所需要的最低消费。

## 1014  [最佳观光组合](https://leetcode-cn.com/problems/best-sightseeing-pair/)

* 给定正整数数组 `A`，`A[i]` 表示第 `i` 个观光景点的评分，并且两个景点 `i` 和 `j` 之间的距离为 `j - i`。一对景点（`i < j`）组成的观光组合的得分为（`A[i] + A[j] + i - j`）：景点的评分之和**减去**它们两者之间的距离。返回一对观光景点能取得的最高分。

## 1048 [最长字符串链](https://leetcode-cn.com/problems/longest-string-chain/)

* 给出一个单词列表，其中每个单词都由小写英文字母组成。

* 如果我们可以在 `word1` 的任何地方添加一个字母使其变成 `word2`，那么我们认为 `word1` 是 `word2` 的前身。例如，`"abc"` 是 `"abac"` 的前身。

* **词链**是单词 `[word_1, word_2, ..., word_k]` 组成的序列，`k >= 1`，其中 `word_1` 是 `word_2` 的前身，`word_2` 是 `word_3` 的前身，依此类推。

* 从给定单词列表 `words` 中选择单词组成词链，返回词链的最长可能长度。

## 1139 [最大的以 1 为边界的正方形](https://leetcode-cn.com/problems/largest-1-bordered-square/)

* 给你一个由若干 `0` 和 `1` 组成的二维网格 `grid`，请你找出边界全部由 `1` 组成的最大 **正方形** 子网格，并返回该子网格中的元素数量。如果不存在，则返回 `0`。

 

## 1312 [让字符串成为回文串的最少插入次数](https://leetcode-cn.com/problems/minimum-insertion-steps-to-make-a-string-palindrome/)

* 给定一个字符串`s`，找到其中最长的回文子序列。可以假设`s`的最大长度为`1000`。

## 1326 [灌溉花园的最少水龙头数目](https://leetcode-cn.com/problems/minimum-number-of-taps-to-open-to-water-a-garden/)

* 在 x 轴上有一个一维的花园。花园长度为 `n`，从点 `0` 开始，到点 `n` 结束。
* 花园里总共有 `n + 1` 个水龙头，分别位于 `[0, 1, ..., n]` 。
* 给你一个整数 `n` 和一个长度为 `n + 1` 的整数数组 `ranges` ，其中 `ranges[i]` （下标从 0 开始）表示：如果打开点 `i` 处的水龙头，可以灌溉的区域为 `[i -  ranges[i], i + ranges[i]]` 。
* 请你返回可以灌溉整个花园的 **最少水龙头数目** 。如果花园始终存在无法灌溉到的地方，请你返回 **-1** 。

## 面试题10-I [斐波那契数列](https://leetcode-cn.com/problems/fei-bo-na-qi-shu-lie-lcof/)

* 写一个函数，输入 `n` ，求斐波那契（Fibonacci）数列的第 `n` 项。斐波那契数列的定义如下：

```
F(0) = 0,   F(1) = 1
F(N) = F(N - 1) + F(N - 2), 其中 N > 1.
```

* 斐波那契数列由 0 和 1 开始，之后的斐波那契数就是由之前的两数相加而得出。

* 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。

## 面试题01.05 [一次编辑](https://leetcode-cn.com/problems/one-away-lcci/)

* 字符串有三种编辑操作:插入一个字符、删除一个字符或者替换一个字符。 给定两个字符串，编写一个函数判定它们是否只需要一次(或者零次)编辑。

## 面试题08.11 [硬币](https://leetcode-cn.com/problems/coin-lcci/)

* 硬币。给定数量不限的硬币，币值为25分、10分、5分和1分，编写代码计算n分有几种表示法。(结果可能会很大，你需要将结果模上1000000007)

## 面试题10-II [青蛙跳台阶问题](https://leetcode-cn.com/problems/qing-wa-tiao-tai-jie-wen-ti-lcof/)

* 一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个 `n` 级的台阶总共有多少种跳法。

* 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。

## [面试题 17.16. 按摩师](https://leetcode-cn.com/problems/the-masseuse-lcci/)

* 一个有名的按摩师会收到源源不断的预约请求，每个预约都可以选择接或不接。在每次预约服务之间要有休息时间，因此她不能接受相邻的预约。给定一个预约请求序列，替按摩师找到最优的预约集合（总预约时间最长），返回总的分钟数。
* 注意：本题相对原题稍作改动

## [面试题 17.13. 恢复空格](https://leetcode-cn.com/problems/re-space-lcci/)

哦，不！你不小心把一个长篇文章中的空格、标点都删掉了，并且大写也弄成了小写。像句子`"I reset the computer. It still didn’t boot!"`已经变成了`"iresetthecomputeritstilldidntboot"`。在处理标点符号和大小写之前，你得先把它断成词语。当然了，你有一本厚厚的词典`dictionary`，不过，有些词没在词典里。假设文章用`sentence`表示，设计一个算法，把文章断开，要求未识别的字符最少，返回未识别的字符数。

## 面试题46 [把数字翻译成字符串](https://leetcode-cn.com/problems/ba-shu-zi-fan-yi-cheng-zi-fu-chuan-lcof/)

*  <p>给定一个数字，我们按照如下规则把它翻译为字符串：0 翻译成 &ldquo;a&rdquo; ，1 翻译成 &ldquo;b&rdquo;，&hellip;&hellip;，11 翻译成 &ldquo;l&rdquo;，&hellip;&hellip;，25 翻译成 &ldquo;z&rdquo;。一个数字可能有多个翻译。请编程实现一个函数，用来计算一个数字有多少种不同的翻译方法。</p>

---

# 设计

## 146 [LRU缓存机制](https://leetcode-cn.com/problems/lru-cache/)

* 运用你所掌握的数据结构，设计和实现一个 [LRU (最近最少使用) 缓存机制](https://baike.baidu.com/item/LRU)。它应该支持以下操作： 获取数据 `get` 和 写入数据 `put` 。

* 获取数据 `get(key)` - 如果密钥 (key) 存在于缓存中，则获取密钥的值（总是正数），否则返回 -1。

* 写入数据 `put(key, value)` - 如果密钥不存在，则写入其数据值。当缓存容量达到上限时，它应该在写入新数据之前删除最近最少使用的数据值，从而为新的数据值留出空间。

* **进阶:**
  * 你是否可以在 **O(1)** 时间复杂度内完成这两种操作？

## 208  [实现 Trie (前缀树)](https://leetcode-cn.com/problems/implement-trie-prefix-tree/)

* 实现一个 `Trie` (前缀树)，包含 `insert`, `search`, 和 `startsWith` 这三个操作。
* **说明:**
- 你可以假设所有的输入都是由小写字母 `a-z` 构成的。
  - 保证所有输入均为非空字符串。

## 211 [添加与搜索单词 - 数据结构设计](https://leetcode-cn.com/problems/add-and-search-word-data-structure-design/)

* 设计一个支持以下两种操作的数据结构：

```java
void addWord(word)
bool search(word)
```

* `search(word)` 可以搜索文字或正则表达式字符串，字符串只包含字母 `.` 或 `a-z` 。 `.` 可以表示任何一个字母。
* **说明:**
  * 你可以假设所有单词都是由小写字母 `a-z` 组成的。

## 212 [单词搜索 II](https://leetcode-cn.com/problems/word-search-ii/)

* 给定一个二维网格 **board** 和一个字典中的单词列表 **words**，找出所有同时在二维网格和字典中出现的单词。

* 单词必须按照字母顺序，通过相邻的单元格内的字母构成，其中“相邻”单元格是那些水平相邻或垂直相邻的单元格。同一个单元格内的字母在一个单词中不允许被重复使用。

## 284 [顶端迭代器](https://leetcode-cn.com/problems/peeking-iterator/)

* 给定一个迭代器类的接口，接口包含两个方法： `next()` 和 `hasNext()`。设计并实现一个支持 `peek() `操作的顶端迭代器 -- 其本质就是把原本应由 `next()` 方法返回的元素 `peek()` 出来。
* **进阶：**
  * 你将如何拓展你的设计？使之变得通用化，从而适应所有的类型，而不只是整数型？

## 297 [二叉树的序列化与反序列化](https://leetcode-cn.com/problems/serialize-and-deserialize-binary-tree/)

* 序列化是将一个数据结构或者对象转换为连续的比特位的操作，进而可以将转换后的数据存储在一个文件或者内存中，同时也可以通过网络传输到另一个计算机环境，采取相反方式重构得到原数据。

* 请设计一个算法来实现二叉树的序列化与反序列化。这里不限定你的序列 / 反序列化算法执行逻辑，你只需要保证一个二叉树可以被序列化为一个字符串并且将这个字符串反序列化为原始的树结构。

## 380 [常数时间插入、删除和获取随机元素](https://leetcode-cn.com/problems/insert-delete-getrandom-o1/)

* <p>设计一个支持在<em>平均&nbsp;</em>时间复杂度 <strong>O(1)</strong>&nbsp;下，执行以下操作的数据结构。</p>

  <ol>
  	<li><code>insert(val)</code>：当元素 val 不存在时，向集合中插入该项。</li>
  	<li><code>remove(val)</code>：元素 val 存在时，从集合中移除该项。</li>
  	<li><code>getRandom</code>：随机返回现有集合中的一项。每个元素应该有<strong>相同的概率</strong>被返回。</li>
  </ol>

## 622 [设计循环队列](https://leetcode-cn.com/problems/design-circular-queue/)

* 设计你的循环队列实现。 循环队列是一种线性数据结构，其操作表现基于 FIFO（先进先出）原则并且队尾被连接在队首之后以形成一个循环。它也被称为“环形缓冲器”。

* 循环队列的一个好处是我们可以利用这个队列之前用过的空间。在一个普通队列里，一旦一个队列满了，我们就不能插入下一个元素，即使在队列前面仍有空间。但是使用循环队列，我们能使用这些空间去存储新的值。

* 你的实现应该支持如下操作：
  * `MyCircularQueue(k)`: 构造器，设置队列长度为 k 。
  * `Front`: 从队首获取元素。如果队列为空，返回 -1 。
  * `Rear`: 获取队尾元素。如果队列为空，返回 -1 。
  * `enQueue(value)`: 向循环队列插入一个元素。如果成功插入则返回真。
  * `deQueue()`: 从循环队列中删除一个元素。如果成功删除则返回真。
  * `isEmpty()`: 检查循环队列是否为空。
  * `isFull()`: 检查循环队列是否已满。

## 707 [设计链表](https://leetcode-cn.com/problems/design-linked-list/)

* 设计链表的实现。您可以选择使用单链表或双链表。单链表中的节点应该具有两个属性：`val` 和 `next`。`val` 是当前节点的值，`next` 是指向下一个节点的指针/引用。如果要使用双向链表，则还需要一个属性 `prev` 以指示链表中的上一个节点。假设链表中的所有节点都是 0-index 的。

* 在链表类中实现这些功能：
  * `get(index)`：获取链表中第 `index` 个节点的值。如果索引无效，则返回`-1`。
  * `addAtHead(val)`：在链表的第一个元素之前添加一个值为 `val` 的节点。插入后，新节点将成为链表的第一个节点。
  * `addAtTail(val)`：将值为 `val` 的节点追加到链表的最后一个元素。
  * `addAtIndex(index,val)`：在链表中的第 `index` 个节点之前添加值为 `val`的节点。如果 `index` 等于链表的长度，则该节点将附加到链表的末尾。如果 `index` 大于链表长度，则不会插入节点。如果`index`小于0，则在头部插入节点。
  * `deleteAtIndex(index)`：如果索引 `index` 有效，则删除链表中的第 `index`个节点。

## 1114 [按序打印](https://leetcode-cn.com/problems/print-in-order/)

* 我们提供了一个类：

```
public class Foo {
  public void one() { print("one"); }
  public void two() { print("two"); }
  public void three() { print("three"); }
}
```

* 三个不同的线程将会共用一个 `Foo` 实例。
  * 线程 A 将会调用 `one()` 方法
  * 线程 B 将会调用 `two()` 方法
  * 线程 C 将会调用 `three()` 方法

* 请设计修改程序，以确保 `two()` 方法在 `one()` 方法之后被执行，`three()` 方法在 `two()` 方法之后被执行。

## 1268 [搜索推荐系统](https://leetcode-cn.com/problems/search-suggestions-system/)

* 给你一个产品数组 `products` 和一个字符串 `searchWord` ，`products`  数组中每个产品都是一个字符串。

* 请你设计一个推荐系统，在依次输入单词 `searchWord`的每一个字母后，推荐 `products` 数组中前缀与 `searchWord` 相同的最多三个产品。如果前缀相同的可推荐产品超过三个，请按字典序返回最小的三个。

* 请你以二维列表的形式，返回在输入 `searchWord` 每个字母后相应的推荐产品的列表。

## 5341 [最后 K 个数的乘积](https://leetcode-cn.com/problems/product-of-the-last-k-numbers/)

* 请你实现一个「数字乘积类」`ProductOfNumbers`，要求支持下述两种方法：

* 1.` add(int num)`
  * 将数字 `num` 添加到当前数字列表的最后面。

* 2.` getProduct(int k)`
  * 返回当前数字列表中，最后 `k` 个数字的乘积。
  * 你可以假设当前列表中始终 **至少** 包含 `k` 个数字。

* 题目数据保证：任何时候，任一连续数字序列的乘积都在 32-bit 整数范围内，不会溢出。

## 面试题16.25 [ LRU缓存](https://leetcode-cn.com/problems/lru-cache-lcci/)

#  队列

## 649 [Dota2 参议院](https://leetcode-cn.com/problems/dota2-senate/)

## 933 [最近的请求次数](https://leetcode-cn.com/problems/number-of-recent-calls/)

* 写一个 `RecentCounter` 类来计算最近的请求。

* 它只有一个方法：`ping(int t)`，其中 `t` 代表以毫秒为单位的某个时间。
* 　返回从 3000 毫秒前到现在的 `ping` 数。

* 任何处于 `[t - 3000, t]` 时间范围之内的 `ping` 都将会被计算在内，包括当前（指 `t` 时刻）的 `ping`。

* 保证每次对 `ping` 的调用都使用比之前更大的 `t` 值。

## [面试题59 - II. 队列的最大值](https://leetcode-cn.com/problems/dui-lie-de-zui-da-zhi-lcof/)

* 请定义一个队列并实现函数 `max_value` 得到队列里的最大值，要求函数`max_value`、`push_back` 和 `pop_front` 的**均摊**时间复杂度都是O(1)。

* 若队列为空，`pop_front` 和 `max_value` 需要返回 -1

---

# 递归 

## 面试题16.11 [跳水板](https://leetcode-cn.com/problems/diving-board-lcci/)

* 你正在使用一堆木板建造跳水板。有两种类型的木板，其中长度较短的木板长度为`shorter`，长度较长的木板长度为`longer`。你必须正好使用`k`块木板。编写一个方法，生成跳水板所有可能的长度。

* 返回的长度需要从小到大排列。

# 精选 TOP 面试题

## 7 [整数反转](https://leetcode-cn.com/problems/reverse-integer/)

* 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
* **注意:**
  * 假设我们的环境只能存储得下 `32` 位的有符号整数，则其数值范围为 `[−231, 231 − 1]`。请根据这个假设，如果反转后整数溢出那么就返回 `0`。

## 127 [单词接龙](https://leetcode-cn.com/problems/word-ladder/)

* 给定两个单词（`beginWord` 和 *`endWord`*）和一个字典，找到从 *`beginWord`* 到 *`endWord`* 的最短转换序列的长度。转换需遵循如下规则：

	1. 每次转换只能改变一个字母。
	2. 转换过程中的中间单词必须是字典中的单词。

* **说明:**
  * 如果不存在这样的转换序列，返回 0。
  * 所有单词具有相同的长度。
  * 所有单词只由小写字母组成。
  * 字典中不存在重复的单词。
  * 你可以假设 `beginWord `和 `endWord` 是非空的，且二者不相同。

## 134 [ 加油站](https://leetcode-cn.com/problems/gas-station/)

* 在一条环路上有 *N* 个加油站，其中第 *i* 个加油站有汽油 `gas[i]` 升。

* 你有一辆油箱容量无限的的汽车，从第 *i* 个加油站开往第 *i+1* 个加油站需要消耗汽油 `cost[i]` 升。你从其中的一个加油站出发，开始时油箱为空。

* 如果你可以绕环路行驶一周，则返回出发时加油站的编号，否则返回 -1。

* **说明:** 
  * 如果题目有解，该答案即为唯一答案。
  * 输入数组均为非空数组，且长度相同。
  * 输入数组中的元素均为非负数。

## 139 [单词拆分](https://leetcode-cn.com/problems/word-break/)

* 给定一个**非空**字符串 *s* 和一个包含**非空**单词列表的字典 *wordDict*，判定 *s* 是否可以被空格拆分为一个或多个在字典中出现的单词。

* **说明：**
  * 拆分时可以重复使用字典中的单词。
  * 你可以假设字典中没有重复的单词。

## 171 [Excel表列序号](https://leetcode-cn.com/problems/excel-sheet-column-number/)

* 给定一个Excel表格中的列名称，返回其相应的列序号。

## 172 [阶乘后的零](https://leetcode-cn.com/problems/factorial-trailing-zeroes/)

* 给定一个整数 *n*，返回 *n*! 结果尾数中零的数量。
* **说明:** 
  * 你算法的时间复杂度应为 *O*(log *n*) 。

## 198 [打家劫舍](https://leetcode-cn.com/problems/house-robber/)

* 你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。

* 给定一个代表每个房屋存放金额的非负整数数组，计算你**在不触动警报装置的情况下，**能够偷窃到的最高金额。

## 221 [最大正方形](https://leetcode-cn.com/problems/maximal-square/)

* 在一个由 0 和 1 组成的二维矩阵内，找到只包含 1 的最大正方形，并返回其面积。

## 309 [最佳买卖股票时机含冷冻期](https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/)

* 给定一个整数数组，其中第 *i* 个元素代表了第 *i* 天的股票价格 。

* 设计一个算法计算出最大利润。在满足以下约束条件下，你可以尽可能地完成更多的交易（多次买卖一支股票）:
  * 你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
  * 卖出股票后，你无法在第二天买入股票 (即冷冻期为 1 天)。

## 322 [零钱兑换](https://leetcode-cn.com/problems/coin-change/)

* 给定不同面额的硬币 `coins `和一个总金额` amount`。编写一个函数来计算可以凑成总金额所需的最少的硬币个数。如果没有任何一种硬币组合能组成总金额，返回`-1`。

* **说明**:
  * 你可以认为每种硬币的数量是无限的。

## 337 [打家劫舍 III](https://leetcode-cn.com/problems/house-robber-iii/)

* 在上次打劫完一条街道之后和一圈房屋后，小偷又发现了一个新的可行窃的地区。这个地区只有一个入口，我们称之为“根”。 除了“根”之外，每栋房子有且只有一个“父“房子与之相连。一番侦察之后，聪明的小偷意识到“这个地方的所有房屋的排列类似于一棵二叉树”。 如果两个直接相连的房子在同一天晚上被打劫，房屋将自动报警。

* 计算在不触动警报的情况下，小偷一晚能够盗取的最高金额。

---

# 腾讯

## 9 [回文数](https://leetcode-cn.com/problems/palindrome-number/)

* 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。

* **进阶:**
  * 你能不将整数转为字符串来解决这个问题吗？

## 89 [格雷编码](https://leetcode-cn.com/problems/gray-code/)

* 格雷编码是一个二进制数字系统，在该系统中，两个连续的数值仅有一个位数的差异。

* 给定一个代表编码总位数的非负整数 *n*，打印其格雷编码序列。格雷编码序列必须以 0 开头。

## 292 [Nim 游戏](https://leetcode-cn.com/problems/nim-game/)

* 你和你的朋友，两个人一起玩 [Nim 游戏](https://baike.baidu.com/item/Nim游戏/6737105)：桌子上有一堆石头，每次你们轮流拿掉 1 - 3 块石头。 拿掉最后一块石头的人就是获胜者。你作为先手。

* 你们是聪明人，每一步都是最优解。 编写一个函数，来判断你是否可以在给定石头数量的情况下赢得游戏。

## 344 [反转字符串](https://leetcode-cn.com/problems/reverse-string/)

* 编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 `char[]` 的形式给出。

* 不要给另外的数组分配额外的空间，你必须**[原地](https://baike.baidu.com/item/原地算法)修改输入数组**、使用 O(1) 的额外空间解决这一问题。

* 你可以假设数组中的所有字符都是 [ASCII](https://baike.baidu.com/item/ASCII) 码表中的可打印字符。

## 557 [反转字符串中的单词 III](https://leetcode-cn.com/problems/reverse-words-in-a-string-iii/)

* 给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
* 注意
  * 在字符串中，每个单词由单个空格分隔，并且字符串中不会有任何额外的空格。



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

# 数学

## 204 [计数质数](https://leetcode-cn.com/problems/count-primes/)

*  统计所有小于非负整数 *n* 的质数的数量。 

## 263 [丑数](https://leetcode-cn.com/problems/ugly-number/)

- 编写一个程序判断给定的数是否为丑数。
- 丑数就是只包含质因数 `2, 3, 5` 的**正整数**。

## 264 [丑数 II](https://leetcode-cn.com/problems/ugly-number-ii/)

- 编写一个程序，找出第 `n` 个丑数。
- 丑数就是只包含质因数 `2, 3, 5` 的**正整数**。
- **说明:** 
  1. `1` 是丑数。
  2. `n` **不超过**1690。

## 313 [超级丑数](https://leetcode-cn.com/problems/super-ugly-number/)

- 编写一段程序来查找第 `*n*` 个超级丑数。
- 超级丑数是指其所有质因数都是长度为 `k` 的质数列表 `primes` 中的正整数。

## 326 [3的幂](https://leetcode-cn.com/problems/power-of-three/)

* 给定一个整数，写一个函数来判断它是否是 3 的幂次方。

## 342 [4的幂](https://leetcode-cn.com/problems/power-of-four/)

* 给定一个整数 (32 位有符号整数)，请编写一个函数来判断它是否是 4 的幂次方。

## 343 [整数拆分](https://leetcode-cn.com/problems/integer-break/)

* 给定一个正整数 *n*，将其拆分为**至少**两个正整数的和，并使这些整数的乘积最大化。 返回你可以获得的最大乘积。

## 365 [水壶问题](https://leetcode-cn.com/problems/water-and-jug-problem/)

有两个容量分别为 *x*升 和 *y*升 的水壶以及无限多的水。请判断能否通过使用这两个水壶，从而可以得到恰好 *z*升 的水？

如果可以，最后请用以上水壶中的一或两个来盛放取得的 *z升* 水。

你允许：

- 装满任意一个水壶
- 清空任意一个水壶
- 从一个水壶向另外一个水壶倒水，直到装满或者倒空

## 598 [范围求和 II](https://leetcode-cn.com/problems/range-addition-ii/)

* 给定一个初始元素全部为 **0**，大小为 m*n 的矩阵 **M** 以及在 **M** 上的一系列更新操作。

* 操作用二维数组表示，其中的每个操作用一个含有两个**正整数 a** 和 **b** 的数组表示，含义是将所有符合 **0 <= i < a** 以及 **0 <= j < b** 的元素 **M[i][j]** 的值都**增加 1**。

* 在执行给定的一系列操作后，你需要返回矩阵中含有最大整数的元素个数。

## 836 [矩形重叠](https://leetcode-cn.com/problems/rectangle-overlap/)

* 矩形以列表 `[x1, y1, x2, y2]` 的形式表示，其中 `(x1, y1)` 为左下角的坐标，`(x2, y2)` 是右上角的坐标。

* 如果相交的面积为正，则称两矩形重叠。需要明确的是，只在角或边接触的两个矩形不构成重叠。

* 给出两个矩形，判断它们是否重叠并返回结果。

## 892 [三维形体的表面积](https://leetcode-cn.com/problems/surface-area-of-3d-shapes/)

* 在 `N * N` 的网格上，我们放置一些 `1 * 1 * 1` 的立方体。

* 每个值 `v = grid[i][j]` 表示 `v` 个正方体叠放在对应单元格 `(i, j)` 上。

* 请你返回最终形体的表面积。

## 949 [给定数字能组成的最大时间](https://leetcode-cn.com/problems/largest-time-for-given-digits/)

* 给定一个由 4 位数字组成的数组，返回可以设置的符合 24 小时制的最大时间。
* 最小的 24 小时制时间是 00:00，而最大的是 23:59。从 00:00 （午夜）开始算起，过得越久，时间越大。
* 以长度为 5 的字符串返回答案。如果不能确定有效时间，则返回空字符串。

## 976 [三角形的最大周长](https://leetcode-cn.com/problems/largest-perimeter-triangle/)

* 给定由一些正数（代表长度）组成的数组 `A`，返回由其中三个长度组成的、**面积不为零**的三角形的最大周长。

* 如果不能形成任何面积不为零的三角形，返回 `0`。

## 1037 [有效的回旋镖](https://leetcode-cn.com/problems/valid-boomerang/)

* <p>回旋镖定义为一组三个点，这些点各不相同且<strong>不</strong>在一条直线上。</p>

* <p>给出平面上三个点组成的列表，判断这些点是否可以构成回旋镖。</p>

## 1041 [困于环中的机器人](https://leetcode-cn.com/problems/robot-bounded-in-circle/)

* <p>在无限的平面上，机器人最初位于&nbsp;<code>(0, 0)</code>&nbsp;处，面朝北方。机器人可以接受下列三条指令之一：</p>

  <ul>
  	<li><code>&quot;G&quot;</code>：直走 1 个单位</li>
  	<li><code>&quot;L&quot;</code>：左转 90 度</li>
  	<li><code>&quot;R&quot;</code>：右转 90 度</li>
  </ul>

* <p>机器人按顺序执行指令&nbsp;<code>instructions</code>，并一直重复它们。</p>	

* <p>只有在平面中存在环使得机器人永远无法离开时，返回&nbsp;<code>true</code>。否则，返回 <code>false</code>。</p>

## 1071 [字符串的最大公因子](https://leetcode-cn.com/problems/greatest-common-divisor-of-strings/)

* 对于字符串 `S` 和 `T`，只有在 `S = T + ... + T`（`T` 与自身连接 1 次或多次）时，我们才认定 “`T` 能除尽 `S`”。

* 返回最长字符串 `X`，要求满足 `X` 能除尽 `str1` 且 `X` 能除尽 `str2`。

## 1232 [缀点成线](https://leetcode-cn.com/problems/check-if-it-is-a-straight-line/)

* 在一个 XY 坐标系中有一些点，我们用数组 `coordinates` 来分别记录它们的坐标，其中 `coordinates[i] = [x, y]` 表示横坐标为 `x`、纵坐标为 `y` 的点。

* 请你来判断，这些点是否在该坐标系中属于同一条直线上，是则返回 `true`，否则请返回 `false`。

##  1281 [整数的各位积和之差](https://leetcode-cn.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/)

* <p>给你一个整数&nbsp;<code>n</code>，请你帮忙计算并返回该整数「各位数字之积」与「各位数字之和」的差。</p>

## 1323 [ 6 和 9 组成的最大数字](https://leetcode-cn.com/problems/maximum-69-number/)

* 给你一个仅由数字 6 和 9 组成的正整数 `num`。
* 你最多只能翻转一位数字，将 6 变成 9，或者把 9 变成 6 。
* 请返回你可以得到的最大数字。

## 1362 [最接近的因数](https://leetcode-cn.com/problems/closest-divisors/)

* 给你一个整数 `num`，请你找出同时满足下面全部要求的两个整数：
  * 两数乘积等于  `num + 1` 或 `num + 2`
  * 以绝对差进行度量，两数大小最接近

* 你可以按任意顺序返回这两个整数。

## 面试题16.01 [交换数字](https://leetcode-cn.com/problems/swap-numbers-lcci/)

* 编写一个函数，不用临时变量，直接交换numbers = [a, b]中a与b的值。

## 面试题17.09 [第 k 个数](https://leetcode-cn.com/problems/get-kth-magic-number-lcci/)

* 有些数的素因子只有 3，5，7，请设计一个算法找出第 k 个数。注意，不是必须有这些素因子，而是必须不包含其他的素因子。例如，前几个数按顺序应该是 1，3，5，7，9，15，21。

# 蓄水池抽样

## 382 [链表随机节点](https://leetcode-cn.com/problems/linked-list-random-node/)

- 给定一个单链表，随机选择链表的一个节点，并返回相应的节点值。保证每个节点**被选的概率一样**。
- **进阶:**
  - 如果链表十分大且长度未知，如何解决这个问题？你能否使用常数级空间复杂度实现？

## 398 [随机数索引](https://leetcode-cn.com/problems/random-pick-index/)

* 给定一个可能含有重复元素的整数数组，要求随机输出给定的数字的索引。 您可以假设给定的数字一定存在于数组中。

* *注意：**
  * 数组大小可能非常大。 使用太多额外空间的解决方案将不会通过测试。

# 其他

## 10 [正则表达式匹配](https://leetcode-cn.com/problems/regular-expression-matching/)

## 168 [Excel表列名称](https://leetcode-cn.com/problems/excel-sheet-column-title/)

* 给定一个正整数，返回它在 Excel 表中相对应的列名称。

## 223 [矩形面积](https://leetcode-cn.com/problems/rectangle-area/)

* 在二维平面上计算出两个由直线构成的矩形重叠后形成的总面积。

* 每个矩形由其左下顶点和右上顶点坐标表示，如图所示。

![Rectangle Area](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2018/10/22/rectangle_area.png)

## 258 [各位相加](https://leetcode-cn.com/problems/add-digits/)

* 给定一个非负整数 `num`，反复将各个位上的数字相加，直到结果为一位数。
* 你可以不使用循环或者递归，且在 O(1) 时间复杂度内解决这个问题吗？



## 307 [区域和检索 - 数组可修改](https://leetcode-cn.com/problems/range-sum-query-mutable/)

* 给定一个整数数组  *`nums`*，求出数组从索引 *i* 到 *j* (*i* ≤ *j*) 范围内元素的总和，包含 *i, j* 两点。

* *`update(i, val)`* 函数可以通过将下标为 *i* 的数值更新为 *val*，从而对数列进行修改。
* **说明:**
  1. 数组仅可以在 *`update`* 函数下进行修改。
  2. 你可以假设 *`update`* 函数与 *`sumRange`* 函数的调用次数是均匀分布的。

## 437 [路径总和 III](https://leetcode-cn.com/problems/path-sum-iii/)

* 给定一个二叉树，它的每个结点都存放着一个整数值。

* 找出路径和等于给定数值的路径总数。

* 路径不需要从根节点开始，也不需要在叶子节点结束，但是路径方向必须是向下的（只能从父节点到子节点）。

* 二叉树不超过1000个节点，且节点数值范围是 `[-1000000,1000000] `的整数。

## 838 [推多米诺](https://leetcode-cn.com/problems/push-dominoes/)

* 一行中有 `N` 张多米诺骨牌，我们将每张多米诺骨牌垂直竖立。

* 在开始时，我们同时把一些多米诺骨牌向左或向右推。

![img](https://aliyun-lc-upload.oss-cn-hangzhou.aliyuncs.com/aliyun-lc-upload/uploads/2018/05/19/domino.png)

* 每过一秒，倒向左边的多米诺骨牌会推动其左侧相邻的多米诺骨牌。

* 同样地，倒向右边的多米诺骨牌也会推动竖立在其右侧的相邻多米诺骨牌。

* 如果同时有多米诺骨牌落在一张垂直竖立的多米诺骨牌的两边，由于受力平衡， 该骨牌仍然保持不变。

* 就这个问题而言，我们会认为正在下降的多米诺骨牌不会对其它正在下降或已经下降的多米诺骨牌施加额外的力。

* 给定表示初始状态的字符串 "S" 。如果第 i 张多米诺骨牌被推向左边，则 `S[i] = 'L'`；如果第 i 张多米诺骨牌被推向右边，则 `S[i] = 'R'`；如果第 i 张多米诺骨牌没有被推动，则 `S[i] = '.'`。

* 返回表示最终状态的字符串。

## 1093 [大样本统计](https://leetcode-cn.com/problems/statistics-from-a-large-sample/)

* 我们对 `0` 到 `255` 之间的整数进行采样，并将结果存储在数组 `count` 中：`count[k]` 就是整数 `k` 的采样个数。

* 我们以 **浮点数** 数组的形式，分别返回样本的最小值、最大值、平均值、中位数和众数。其中，众数是保证唯一的。

* 我们先来回顾一下中位数的知识：
  * 如果样本中的元素有序，并且元素数量为奇数时，中位数为最中间的那个元素；
  * 如果样本中的元素有序，并且元素数量为偶数时，中位数为中间的两个元素的平均值。

# 剑指offer

## 树

### [面试题07. 重建二叉树](https://leetcode-cn.com/problems/zhong-jian-er-cha-shu-lcof/)

* 输入某二叉树的前序遍历和中序遍历的结果，请重建该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。

# 状态压缩

## 1371 [每个元音包含偶数次的最长子字符串](https://leetcode-cn.com/problems/find-the-longest-substring-containing-vowels-in-even-counts/)

* 给你一个字符串 s ，请你返回满足以下条件的最长子字符串的长度：每个元音字母，即 'a'，'e'，'i'，'o'，'u' ，在子字符串中都恰好出现了偶数次。

# 多线程

## 1195 [交替打印字符串](https://leetcode-cn.com/problems/fizz-buzz-multithreaded/)

* 编写一个可以从 1 到 n 输出代表这个数字的字符串的程序，但是：
  * 如果这个数字可以被 3 整除，输出 "fizz"。
  * 如果这个数字可以被 5 整除，输出 "buzz"。
  * 如果这个数字可以同时被 3 和 5 整除，输出 "fizzbuzz"。



# SQL

## 175  [组合两个表](https://leetcode-cn.com/problems/combine-two-tables/)	

## 176 [第二高的薪水](https://leetcode-cn.com/problems/second-highest-salary/)

* 编写一个 SQL 查询，获取 `Employee` 表中第二高的薪水（Salary） 。

## 181 [超过经理收入的员工](https://leetcode-cn.com/problems/employees-earning-more-than-their-managers/)

* `Employee` 表包含所有员工，他们的经理也属于员工。每个员工都有一个 Id，此外还有一列对应员工的经理的 Id。

## 182 [查找重复的电子邮箱](https://leetcode-cn.com/problems/duplicate-emails/)

* 编写一个 SQL 查询，查找 `Person` 表中所有重复的电子邮箱。

## 183 [从不订购的客户](https://leetcode-cn.com/problems/customers-who-never-order/)

* 某网站包含两个表，`Customers`表和 `Orders` 表。编写一个 SQL 查询，找出所有从不订购任何东西的客户。

## 184 [部门工资最高的员工](https://leetcode-cn.com/problems/department-highest-salary/)

* `Employee` 表包含所有员工信息，每个员工有其对应的 Id, salary 和 department Id。

## 596 [超过5名学生的课](https://leetcode-cn.com/problems/classes-more-than-5-students/)

* 有一个`courses` 表 ，有: **student (学生)** 和 **class (课程)**。

* 请列出所有超过或等于5名学生的课。

