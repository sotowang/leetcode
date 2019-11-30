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

## 67 [二进制求和](https://leetcode-cn.com/problems/add-binary/)

* 给定两个二进制字符串，返回他们的和（用二进制表示）。

* 输入为**非空**字符串且只包含数字 `1` 和 `0`。

---

# 栈

## 20 有效的括号

* 给定一个只包括` '('`，`')'`，`'{'`，`'}'`，`'['`，`']'` 的字符串，判断字符串是否有效。

* 有效字符串需满足：
  * 左括号必须用相同类型的右括号闭合。
  * 左括号必须以正确的顺序闭合。

* 注意空字符串可被认为是有效字符串。

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

232 

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

## 204 [计数质数](https://leetcode-cn.com/problems/count-primes/)

*  统计所有小于非负整数 *n* 的质数的数量。 

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

## 124 二叉树中的最大路径和

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

## 207 [课程表](https://leetcode-cn.com/problems/course-schedule/)

* 现在你总共有 *n* 门课需要选，记为 `0` 到 `n-1`。

*  在选修某些课程之前需要一些先修课程。 例如，想要学习课程 0 ，你需要先完成课程 1 ，我们用一个匹配来表示他们: `[0,1]` 

* 给定课程总量以及它们的先决条件，判断是否可能完成所有课程的学习？ 

## 257 [二叉树的所有路径](https://leetcode-cn.com/problems/binary-tree-paths/)

* 给定一个二叉树，返回所有从根节点到叶子节点的路径。

* **说明:** 叶子节点是指没有子节点的节点。

# 拓扑排序

## 210 [课程表 II](https://leetcode-cn.com/problems/course-schedule-ii/)

* 现在你总共有 *n* 门课需要选，记为 `0` 到 `n-1`。 

* 在选修某些课程之前需要一些先修课程。 例如，想要学习课程 0 ，你需要先完成课程 1 ，我们用一个匹配来表示他们: `[0,1]` 

* 给定课程总量以及它们的先决条件，返回你为了学完所有课程所安排的学习顺序。

* 可能会有多个正确的顺序，你只要返回一种就可以了。如果不可能完成所有课程，返回一个空数组。

# 广度优先搜索

## 102 [二叉树的层次遍历](https://leetcode-cn.com/problems/binary-tree-level-order-traversal/)

*  给定一个二叉树，返回其按层次遍历的节点值。 （即逐层地，从左到右访问所有节点）。 

## 103 [二叉树的锯齿形层次遍历](https://leetcode-cn.com/problems/binary-tree-zigzag-level-order-traversal/)

* 给定一个二叉树，返回其节点值的锯齿形层次遍历。（即先从左往右，再从右往左进行下一层遍历，以此类推，层与层之间交替进行）。 

## 107 [二叉树的层次遍历 II](https://leetcode-cn.com/problems/binary-tree-level-order-traversal-ii/)

*  给定一个二叉树，返回其节点值自底向上的层次遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历） 

## 126 [单词接龙 II](https://leetcode-cn.com/problems/word-ladder-ii/)

* 给定两个单词（beginWord 和 endWord）和一个字典 wordList，找出所有从 beginWord 到 endWord 的最短转换序列。转换需遵循如下规则：

1. 每次转换只能改变一个字母。
2. 转换过程中的中间单词必须是字典中的单词。

 **说明:** 

* 如果不存在这样的转换序列，返回一个空列表。
* 所有单词具有相同的长度。
* 所有单词只由小写字母组成。
* 字典中不存在重复的单词。
* 你可以假设 beginWord 和 endWord 是非空的，且二者不相同。

## 199 二叉树的右视图

*  给定一棵二叉树，想象自己站在它的右侧，按照从顶部到底部的顺序，返回从右侧所能看到的节点值。 

# 滑动窗口

## 30  串联所有单词的子串

* 给定一个字符串` s` 和一些长度相同的单词 `words`。找出 `s` 中恰好可以由` words` 中所有单词串联形成的子串的起始位置。
* 注意子串要与 `words` 中的单词完全匹配，中间不能有其他字符，但不需要考虑 `words` 中单词串联的顺序。

## 76 最小覆盖子串

* 给你一个字符串 `S`、一个字符串 `T`，请在字符串` S` 里面找出：包含` T `所有字母的最小子串。

## 187 [重复的DNA序列](https://leetcode-cn.com/problems/repeated-dna-sequences/)

* 所有 DNA 都由一系列缩写为 A，C，G 和 T 的核苷酸组成，例如：`“ACGAATTCCG”`。在研究 DNA 时，识别 DNA 中的重复序列有时会对研究非常有帮助。

* 编写一个函数来查找 DNA 分子中所有出现超过一次的 10 个字母长的序列（子串）。

## 438 找到字符串中所有字母异位词

* 给定一个字符串 `s` 和一个非空字符串` p`，找到 `s` 中所有是 `p` 的字母异位词的子串，返回这些子串的起始索引。

* 字符串只包含小写英文字母，并且字符串 `s `和`p` 的长度都不超过 `20100`。

* **说明**：
  * 字母异位词指字母相同，但排列不同的字符串。
  * 不考虑答案输出的顺序。

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

## 113 路径总和 II

* 给定一个二叉树和一个目标和，找到所有从根节点到叶子节点路径总和等于给定目标和的路径。

* **说明:** 叶子节点是指没有子节点的节点。

## 131 分割回文串

* 给定一个字符串 s，将 s 分割成一些子串，使每个子串都是回文串。

* 返回 s 所有可能的分割方案。

## 257 [二叉树的所有路径](https://leetcode-cn.com/problems/binary-tree-paths/)

* 给定一个二叉树，返回所有从根节点到叶子节点的路径。

* **说明:** 叶子节点是指没有子节点的节点。

# 贪心算法

# 动态规划

## 5 最长回文子串

* 给定一个字符串 `s`，找到 `s` 中最长的回文子串。你可以假设 `s` 的最大长度为 1000。

## 42 接雨水

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

## 279 [完全平方数](https://leetcode-cn.com/problems/perfect-squares/)

* 给定正整数 *n*，找到若干个完全平方数（比如 `1, 4, 9, 16, ...`）使得它们的和等于 *n*。你需要让组成和的完全平方数的个数最少。

## 300 [最长上升子序列](https://leetcode-cn.com/problems/longest-increasing-subsequence/)

* 给定一个无序的整数数组，找到其中最长上升子序列的长度。 
* **说明:** 
  - 可能会有多种最长上升子序列的组合，你只需要输出对应的长度即可。
  - 你算法的时间复杂度应该为 `O(n^2)` 。
* **进阶:** 
  * 你能将算法的时间复杂度降低到 O(*n* log *n*) 吗? 

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