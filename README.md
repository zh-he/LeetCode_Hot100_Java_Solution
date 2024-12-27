# LeetCode_Hot100_Java_Solution
## 我将Leetcode hot 1000题目按照类型分类。部分题目可能属于多个类型。
刷leetcode hot 100以前需要了解一些基础知识：

- 常见排序：冒泡排序，插入排序，选择排序，归并排序，快速排序，堆排序。 
  时间复杂度为O(nlogn)：归并排序和堆排序。快速排序时间复杂度最好的情况下是O(nlogn)，最坏的情况下是O(n^2)。
- 字符串的常用方法：length()，substring()，spilt()。 StringBuffer()的常用方法：deleteCharAt()，reverse()，toString()，append()，insert。
- 常用数据结构：List，HashMap，HashSet，PriorityQueue，stack，queue。
- Arrays.sort()自定义排序，PriorityQueue()自定义排序。

| 数据结构 | 常用方法 |
| :---- | :---- |
| List | add()，remove() |
| HashMap | put()，size()，remove()，containsKey() |
| HashSet | add()，remove()，size()，contains() |
| PriorityQueue | poll()，offer()，isEmpty()，size()，peek() |
| stack | push()，size()，pop()，isEmpty()，peek() |
| queue | poll()，offer()，isEmpty()，size()，peek() |

### dp

- dp数组和下标的含义，递推公式，初始化，遍历顺序。

- 01背包和完全背包。

| 题号 | 题目                                                         | 题解                                                     |
| :--- | :------------------------------------------------------------ | :-------------------------------------------------------- |
| 198  | [打家劫舍](https://leetcode.cn/problems/house-robber/?envType=problem-list-v2&envId=2cktkvj&) | [Java](Leetcode/dp/198.%20打家劫舍.md)                   |
| 238  | [除自身数组以外的乘积](https://leetcode.cn/problems/product-of-array-except-self/description/?envType=problem-list-v2&envId=2cktkvj&) | [Java](Leetcode/dp/238.%20除自身以外数组的乘积.md)       |
| 221  | [最大正方形](https://leetcode.cn/problems/maximal-square/description/?envType=problem-list-v2&envId=2cktkvj) | [Java](Leetcode/dp/221.%20最大正方形.md)                 |
| 152  | [乘积最大子数组](https://leetcode.cn/problems/maximum-product-subarray/description/?envType=problem-list-v2&envId=2cktkvj&) | [Java](Leetcode/dp/152.%20乘积最大子数组.md)             |
| 139  | [单词拆分](https://leetcode.cn/problems/word-break/description/?envType=problem-list-v2&envId=2cktkvj&) | [Java](Leetcode/dp/139.%20单词拆分.md)                   |
| 647  | [回文子串](https://leetcode.cn/problems/palindromic-substrings/?envType=problem-list-v2&envId=2cktkvj&) | [Java](Leetcode/dp/647.%20回文子串.md)                   |
| 322  | [零钱兑换](https://leetcode.cn/problems/coin-change/?envType=problem-list-v2&envId=2cktkvj&) | [Java](Leetcode/dp/322.%20零钱兑换.md)                   |
| 494  | [目标和](https://leetcode.cn/problems/coin-change/?envType=problem-list-v2&envId=2cktkvj&) | [Java](Leetcode/dp/494.%20目标和.md)                     |
| 416  | [分割等和子集](https://leetcode.cn/problems/partition-equal-subset-sum/description/?envType=problem-list-v2&envId=2cktkvj&) | [Java](Leetcode/dp/416.%20分割等和子集.md)               |
| 337  | [打家劫舍 III](https://leetcode.cn/problems/house-robber-iii/description/?envType=problem-list-v2&envId=2cktkvj&) | [Java](Leetcode/dp/337.%20打家劫舍%20III.md)               |
| 312  | [戳气球](https://leetcode.cn/problems/burst-balloons/description/?envType=problem-list-v2&envId=2cktkvj&) | [Java](Leetcode/dp/312.%20戳气球.md)                     |
| 309  | [买卖股票的最佳时期含冷冻期](https://leetcode.cn/problems/best-time-to-buy-and-sell-stock-with-cooldown/?envType=problem-list-v2&envId=2cktkvj&) | [Java](Leetcode/dp/309.%20买卖股票的最佳时机含冷冻期.md) |
| 300  | [最长递增子序列](https://leetcode.cn/problems/longest-increasing-subsequence/?envType=problem-list-v2&envId=2cktkvj&) | [Java](Leetcode/dp/300.%20最长递增子序列.md)             |
| 279  | [完全平方数](https://leetcode.cn/problems/perfect-squares/description/?envType=problem-list-v2&envId=2cktkvj&) | [Java](Leetcode/dp/279.%20完全平方数.md)                 |
| 42   | [接雨水](https://leetcode.cn/problems/trapping-rain-water/?envType=problem-list-v2&envId=2cktkvj&) | [Java](Leetcode/dp/42.%20接雨水.md)                      |
| 32   | [最长有效括号](https://leetcode.cn/problems/longest-valid-parentheses/description/?envType=problem-list-v2&envId=2cktkvj&) | [Java](Leetcode/dp/32.%20最长有效括号.md)                |
| 10   | [正则表达式匹配](https://leetcode.cn/problems/regular-expression-matching/description/?envType=problem-list-v2&envId=2cktkvj&) | [Java](Leetcode/dp/10.%20正则表达式匹配.md)              |
| 5    | [最长回文子串](https://leetcode.cn/problems/longest-palindromic-substring/description/?envType=problem-list-v2&envId=2cktkvj&) | [Java](Leetcode/dp/5.%20最长回文子串.md)                 |
| 96   | [不同的二叉搜索树](https://leetcode.cn/problems/unique-binary-search-trees/description/?envType=problem-list-v2&envId=2cktkvj&) | [Java](Leetcode/dp/96.%20不同的二叉搜索树.md)            |
| 85   | [最大矩形](https://leetcode.cn/problems/maximal-rectangle/description/?envType=problem-list-v2&envId=2cktkvj&) | [Java](Leetcode/dp/85.%20最大矩形.md)                    |
| 72   | [编辑距离](https://leetcode.cn/problems/edit-distance/description/?envType=problem-list-v2&envId=2cktkvj&) | [Java](Leetcode/dp/72.%20编辑距离.md)                    |
| 70   | [爬楼梯](https://leetcode.cn/problems/climbing-stairs/description/?envType=problem-list-v2&envId=2cktkvj&) | [Java](Leetcode/dp/70.%20爬楼梯.md)                      |
| 62   | [不同路径](https://leetcode.cn/problems/shortest-unsorted-continuous-subarray/description/?envType=problem-list-v2&envId=2cktkvj&) | [Java](Leetcode/dp/62.%20不同路径.md)                    |
| 53   | [最大子数组和](https://leetcode.cn/problems/maximum-subarray/?envType=problem-list-v2&envId=2cktkvj&) | [Java](Leetcode/dp/53.%20最大子数组和.md)                |

### 链表

- 链表的题目往往使用虚拟头结点的方法，以避免对头结点为空的情况进行特判。
- 做链表的题目是，我们需要记住的是链表的增删节点都是使用的双指针。

| **题号** | **题目**                                                     | 题解                                                     |
| :-------- | :------------------------------------------------------------ | :-------------------------------------------------------- |
| 160      | [相交链表](https://leetcode.cn/problems/intersection-of-two-linked-lists/description/?envType=problem-list-v2&envId=2cktkvj) | [Java](Leetcode/链表/160.%20相交链表.md)                 |
| 234      | [回文链表](https://leetcode.cn/problems/palindrome-linked-list/?envType=problem-list-v2&envId=2cktkvj) | [Java](Leetcode/链表/234.%20回文链表.md)                 |
| 206      | [反转链表](https://leetcode.cn/problems/reverse-linked-list/?envType=problem-list-v2&envId=2cktkvj) | [Java](Leetcode/链表/206.%20反转链表.md)                 |
| 148      | [排序链表 ](https://leetcode.cn/problems/sort-list/?envType=problem-list-v2&envId=2cktkvj) | [Java](Leetcode/链表/148.%20排序链表.md)                 |
| 146      | [LRU 缓存 ](https://leetcode.cn/problems/lru-cache/?envType=problem-list-v2&envId=2cktkvj) | [Java](Leetcode/链表/146.%20LRU%20缓存.md)                 |
| 142      | [环形链表 II](https://leetcode.cn/problems/linked-list-cycle-ii/?envType=problem-list-v2&envId=2cktkvj) | [Java](Leetcode/链表/142.%20环形链表%20II.md)              |
| 141      | [环形链表](https://leetcode.cn/problems/linked-list-cycle-ii/?envType=problem-list-v2&envId=2cktkvj) | [Java](Leetcode/链表/141.%20环形链表.md)                 |
| 23       | [ 合并 K 个升序链表 ](https://leetcode.cn/problems/merge-k-sorted-lists/description/?envType=problem-list-v2&envId=2cktkvj) | [Java](Leetcode/链表/23.%20合并%20K%20个升序链表.md)         |
| 21       | [合并两个有序链表](https://leetcode.cn/problems/merge-two-sorted-lists/?envType=problem-list-v2&envId=2cktkvj) | [Java](Leetcode/链表/21.%20合并两个有序链表.md)          |
| 114      | [二叉树展开为链表](https://leetcode.cn/problems/flatten-binary-tree-to-linked-list/) | [Java](Leetcode/链表/114.%20二叉树展开为链表.md)         |
| 19       | [删除链表的倒数第 N 个结点](https://leetcode.cn/problems/remove-nth-node-from-end-of-list/) | [Java](Leetcode/链表/19.%20删除链表的倒数第%20N%20个结点.md) |
| 2        | [两数相加](https://leetcode.cn/problems/add-two-numbers/)    | [Java](Leetcode/链表/2.%20两数相加.md)                   |

### 单调栈

- 单调栈按照从栈底到栈顶的大小变化可以分为单调递增栈和单调递减栈。
- 单调栈中存储的是元素的索引。

| 题号 | 题目                                                         | 题解                                                |
| :---- | :------------------------------------------------------------ | :--------------------------------------------------- |
| 739  | [ 每日温度 ](https://leetcode.cn/problems/daily-temperatures/submissions/543113746/?envType=problem-list-v2&envId=2cktkvj) | [Java](Leetcode/单调栈/739.%20每日温度.md)          |
| 84   | [柱状图中最大的矩形](https://leetcode.cn/problems/largest-rectangle-in-histogram/) | [Java](Leetcode/单调栈/84.%20柱状图中最大的矩形.md) |

### 构建数据结构

- 构建特殊数据结构。

| 题号 | 题目                                                         | 题解                                                       |
| :---- | :------------------------------------------------------------ | :---------------------------------------------------------- |
| 207  | [课程表 ](https://leetcode.cn/problems/course-schedule/description/?envType=problem-list-v2&envId=2cktkvj) | [Java](Leetcode/构建数据结构/207.%20课程表.md)             |
| 399  | [除法求值](https://leetcode.cn/problems/evaluate-division/)  | [Java](Leetcode/构建数据结构/399.%20除法求值.md)           |
| 208  | [实现 Trie (前缀树)](https://leetcode.cn/problems/implement-trie-prefix-tree/) | [Java](Leetcode/构建数据结构/208.%20实现%20Trie%20(前缀树).md) |

### 二进制

- ^异或：任何数^自身 = 0，^0不变。
- &1：判断末尾数是否为1。
-  <<：向左位移1位，>>：向右位移1位。

| 题号 | 题目                                                         | 题解                                         |
| :---- | :------------------------------------------------------------ | :-------------------------------------------- |
| 461  | [汉明距离](https://leetcode.cn/problems/hamming-distance/description/?envType=problem-list-v2&envId=2cktkvj) | [Java](Leetcode/二进制/461.%20汉明距离.md)   |
| 338  | [比特位计数](https://leetcode.cn/problems/counting-bits/)    | [Java](Leetcode/二进制/338.%20比特位计数.md) |

### 贪心

- 通过局部最优，得到全局最优，需要会自定义排序，建议使用lamda表达式。

| 题号 | 题目                                                         | 题解                                             |
| :---- | :------------------------------------------------------------ | :------------------------------------------------ |
| 406  | [根据身高重建队列](https://leetcode.cn/problems/queue-reconstruction-by-height/) | [Java](Leetcode/贪心/406.%20根据身高重建队列.md) |
| 253  | [会议室II](https://leetcode.cn/problems/meeting-rooms-ii/description/?envType=problem-list-v2&envId=2cktkvj) | [Java](Leetcode/贪心/253.%20会议室II.md)         |
| 621  | [任务调度器](https://leetcode.cn/problems/task-scheduler/)   | [Java](Leetcode/贪心/621.%20任务调度器.md)       |

### 优先队列

- PriorityQueue是底层是堆排序。

| 题目 | 题号                                                         | 题解                                                 |
| :---- | :------------------------------------------------------------ | :---------------------------------------------------- |
| 239  | [滑动窗口最大值](https://leetcode.cn/problems/sliding-window-maximum/) | [Java](Leetcode/优先队列/239.%20滑动窗口最大值.md)   |
| 23   | [合并 K 个升序链表](https://leetcode.cn/problems/merge-k-sorted-lists/) | [Java](Leetcode/优先队列/23.%20合并%20K%20个升序链表.md) |

### 回溯

- 回溯三要素：1.传递的参数和返回类型；2.终止条件；3.回溯的逻辑。

| 题号 | 题目                                                         | 题解                                              |
| :---- | :------------------------------------------------------------ | :------------------------------------------------- |
| 22   | [括号生成](https://leetcode.cn/problems/generate-parentheses/) | [Java](Leetcode/回溯/22.%20括号生成.md)           |
| 46   | [全排列](https://leetcode.cn/problems/permutations/)         | [Java](Leetcode/回溯/46.%20全排列.md)             |
| 17   | [电话号码的字母组合](https://leetcode.cn/problems/letter-combinations-of-a-phone-number/) | [Java](Leetcode/回溯/17.%20电话号码的字母组合.md) |
| 78   | [ 子集](https://leetcode.cn/problems/subsets/)               | [Java](Leetcode/回溯/78.%20子集.md)               |
| 39   | [组合总和](https://leetcode.cn/problems/combination-sum/)    | [Java](Leetcode/回溯/39.%20组合总和.md)           |

### 数组

- 需要会二分法的使用和双指针、滑动窗口。

| 题号 | 题目                                                         | 题解                                                         |
| :---- | :------------------------------------------------------------ | :------------------------------------------------------------ |
| 48   | [旋转图像](https://leetcode.cn/problems/rotate-image/)       | [Java](Leetcode/数组/48.%20旋转图像.md)                      |
| 33   | [ 搜索旋转排序数组](https://leetcode.cn/problems/search-in-rotated-sorted-array/) | [Java](Leetcode/数组/33.%20搜索旋转排序数组.md)              |
| 34   | [在排序数组中查找元素的第一个和最后一个位置](https://leetcode.cn/problems/find-first-and-last-position-of-element-in-sorted-array/) | [Java](Leetcode/数组/34.%20在排序数组中查找元素的第一个和最后一个位置.md) |
| 31   | [下一个排列](https://leetcode.cn/problems/next-permutation/) | [Java](Leetcode/数组/31.%20下一个排列.md)                    |
| 15   | [三数之和](https://leetcode.cn/problems/3sum/)               | [Java](Leetcode/数组/15.%20三数之和.md)                      |
| 11   | [盛最多水的容器](https://leetcode.cn/problems/container-with-most-water/) | [Java](Leetcode/数组/11.%20盛最多水的容器.md)                |
| 4    | [寻找两个正序数组的中位数](https://leetcode.cn/problems/median-of-two-sorted-arrays/) | [Java](Leetcode/数组/4.%20寻找两个正序数组的中位数.md)       |
| 1    | [两数之和](https://leetcode.cn/problems/two-sum/)            | [Java](Leetcode/数组/1.%20两数之和.md)                       |
| 75   | [颜色分类](https://leetcode.cn/problems/sort-colors/)        | [Java](Leetcode/数组/75.%20颜色分类.md)                      |
| 56   | [合并区间](https://leetcode.cn/problems/merge-intervals/)    | [Java](Leetcode/数组/56.%20合并区间.md)                      |
| 55   | [跳跃游戏](https://leetcode.cn/problems/jump-game/)          | [Java](Leetcode/数组/55.%20跳跃游戏.md)                      |
| 215  | [ 数组中的第K个最大元素](https://leetcode.cn/problems/kth-largest-element-in-an-array/) | [Java](Leetcode/数组/215.%20数组中的第K个最大元素.md)        |
| 287  | [寻找重复数](https://leetcode.cn/problems/find-the-duplicate-number/) | [Java](Leetcode/数组/287.%20寻找重复数.md)                   |
| 283  | [移动零](https://leetcode.cn/problems/move-zeroes/)          | [Java](Leetcode/数组/283.%20移动零.md)                       |
| 240  | [搜索二维矩阵 II](https://leetcode.cn/problems/search-a-2d-matrix-ii/) | [Java](Leetcode/数组/240.%20搜索二维矩阵%20II.md)              |

### 二叉树

- 需要会前中后序遍历的递归、迭代实现和层序遍历。

| 题号 | 题目                                                         | 题解                                                         |
| :---- | :------------------------------------------------------------ | :------------------------------------------------------------ |
| 236  | [二叉树的最近公共祖先](https://leetcode.cn/problems/lowest-common-ancestor-of-a-binary-tree/) | [Java](Leetcode/二叉树/236.%20二叉树的最近公共祖先.md)       |
| 226  | [翻转二叉树](https://leetcode.cn/problems/invert-binary-tree/) | [Java](Leetcode/二叉树/226.%20翻转二叉树.md)                 |
| 124  | [二叉树中的最大路径和](https://leetcode.cn/problems/binary-tree-maximum-path-sum/) | [Java](Leetcode/二叉树/124.%20二叉树中的最大路径和.md)       |
| 297  | [二叉树的序列化与反序列化](https://leetcode.cn/problems/serialize-and-deserialize-binary-tree/) | [Java](Leetcode/二叉树/297.%20二叉树的序列化与反序列化.md)   |
| 543  | [二叉树的直径](https://leetcode.cn/problems/diameter-of-binary-tree/) | [Java](Leetcode/二叉树/543.%20二叉树的直径.md)               |
| 538  | [把二叉搜索树转换为累加树](https://leetcode.cn/problems/convert-bst-to-greater-tree/) | [Java](Leetcode/二叉树/538.%20把二叉搜索树转换为累加树.md)   |
| 114  | [二叉树展开为链表](https://leetcode.cn/problems/flatten-binary-tree-to-linked-list/) | [Java](Leetcode/二叉树/114.%20二叉树展开为链表.md)           |
| 617  | [合并二叉树](https://leetcode.cn/problems/merge-two-binary-trees/) | [Java](Leetcode/二叉树/617.%20合并二叉树.md)                 |
| 105  | [从前序与中序遍历序列构造二叉树](https://leetcode.cn/problems/construct-binary-tree-from-preorder-and-inorder-traversal/) | [Java](Leetcode/二叉树/105.%20从前序与中序遍历序列构造二叉树.md) |
| 104  | [二叉树的最大深度](https://leetcode.cn/problems/maximum-depth-of-binary-tree/) | [Java](Leetcode/二叉树/104.%20二叉树的最大深度.md)           |
| 102  | [二叉树的层序遍历](https://leetcode.cn/problems/binary-tree-level-order-traversal/) | [Java](Leetcode/二叉树/102.%20二叉树的层序遍历.md)           |
| 101  | [对称二叉树](https://leetcode.cn/problems/symmetric-tree/)   | [Java](Leetcode/二叉树/101.%20对称二叉树.md)                 |
| 98   | [验证二叉搜索树](https://leetcode.cn/problems/validate-binary-search-tree/) | [Java](Leetcode/二叉树/98.%20验证二叉搜索树.md)              |
| 96   | [不同的二叉搜索树](https://leetcode.cn/problems/unique-binary-search-trees/) | [Java](Leetcode/二叉树/96.%20不同的二叉搜索树.md)            |
| 437  | [路径总和 III](https://leetcode.cn/problems/path-sum-iii/)   | [Java](Leetcode/二叉树/437.%20路径总和%20III.md)               |
| 94   | [二叉树的中序遍历](https://leetcode.cn/problems/binary-tree-inorder-traversal/) | [Java](Leetcode/二叉树/94.%20二叉树的中序遍历.md)            |

### Stack、Queue、HashMap()、HashSet()

- Stack、Queue、HashMap和HashSet的常见方法需要会使用。

| 题号 | 题目                                                         | 题解                                                         |
| :---- | :------------------------------------------------------------ | :------------------------------------------------------------ |
| 169  | [多数元素](https://leetcode.cn/problems/majority-element/)   | [Java](Leetcode/栈、队列、HashMap()、HashSet()/169.%20多数元素.md) |
| 128  | [最长连续序列](https://leetcode.cn/problems/longest-consecutive-sequence/) | [Java](Leetcode/栈、队列、HashMap()、HashSet()/128.%20最长连续序列.md) |
| 438  | [找到字符串中所有字母异位词](https://leetcode.cn/problems/find-all-anagrams-in-a-string/) | [Java](Leetcode/栈、队列、HashMap()、HashSet()/438.%20找到字符串中所有字母异位词.md) |
| 394  | [字符串解码](https://leetcode.cn/problems/decode-string/)    | [Java](Leetcode/栈、队列、HashMap()、HashSet()/394.%20字符串解码.md) |
| 560  | [和为 K 的子数组](https://leetcode.cn/problems/subarray-sum-equals-k/) | [Java](Leetcode/栈、队列、HashMap()、HashSet()/560.%20和为K的子数组.md) |
| 20   | [有效的括号](https://leetcode.cn/problems/valid-parentheses/) | [Java](Leetcode/栈、队列、HashMap()、HashSet()/20.%20有效的括号.md) |
| 3    | [无重复字符的最长子串](https://leetcode.cn/problems/longest-substring-without-repeating-characters/) | [Java](Leetcode/栈、队列、HashMap()、HashSet()/3.%20无重复字符的最长子串.md) |

### 深度优先搜索和广度优先搜索

- 深度优先搜索：按照既定的搜索顺序，在一个方向搜索到头之后，回溯搜索下一个方向。

- 广度优先搜索：从起始位置开始，逐层遍历（按照距离）所有可能到达的位置。

| 题号 | 题目                                                        | 题解                                                         |
| :---- | :----------------------------------------------------------- | :------------------------------------------------------------ |
| 79   | [单词搜索](https://leetcode.cn/problems/word-search/)       | [Java](Leetcode/深度优先搜索和广度优先搜索/79.%20单词搜索.md) |
| 200  | [岛屿数量](https://leetcode.cn/problems/number-of-islands/) | [Java](Leetcode/深度优先搜索和广度优先搜索/200.%20岛屿数量.md) |

