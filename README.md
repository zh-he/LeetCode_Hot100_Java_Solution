# LeetCode_Hot100_Java_Solution
## 记录Leetcode hot 100的java题解
## 我将hot100题目按照类型分类。部分题目可能属于多个类型
刷leetcode hot 100以前需要了解一些基本知识：
常见排序：冒泡排序，插入排序，选择排序，归并排序，快速排序，堆排序。 
时间复杂度为O(nlogn)：归并排序和堆排序。快速排序时间复杂度最好的时候是O(nlogn)，最坏的时候是O(n^2)。
字符串的常用方法：length()，substring()，spilt()。 StringBuffer()的常用方法：deleteCharAt()，reverse()，toString()，append()，insert。
常用数据结构：List,HashMap，HashSet，PriorityQueue，stack，queue。
Arrays.sort()自定义排序，PriorityQueue()自定义排序。

| 数据结构 | 常用方法 |
| ---- | ---- |
| List | add(), remove() |
| HashMap | put(),size(),remove(),containsKey() |
| HashSet | add(),remove(),size(),contains() |
| PriorityQueue | poll(),offer(),isEmpty(),size(),peek() |
| stack | push(),size(),pop(),isEmpty(),peek() |
| queue | poll(),offer(),isEmpty(),size(),peek() |

### dp

dp的含义，递推公式，初始化，遍历顺序。01背包和完全背包。
深度优先搜索和广度优先搜索：深度优先搜索就是按照既定的顺序在一个方向上搜到底，在回溯到上一个位置，按照顺序进行下一个方向的搜索；广度优先搜索是每一次搜索所有相邻的位置，以起点为中心，向周围扩散

| 题号 | 题目 |
| ---- | ---- |
| 198 | [打家劫舍](https://leetcode.cn/problems/house-robber/?envType=problem-list-v2&envId=2cktkvj&) |
| 238 | [除自身数组以外的乘积](https://leetcode.cn/problems/product-of-array-except-self/description/?envType=problem-list-v2&envId=2cktkvj&) |
| 221 | [最大正方形](https://leetcode.cn/problems/maximal-square/description/?envType=problem-list-v2&envId=2cktkvj) |
| 152 | [乘积最大子数组](https://leetcode.cn/problems/maximum-product-subarray/description/?envType=problem-list-v2&envId=2cktkvj&) |
| 139 | [单词拆分](https://leetcode.cn/problems/word-break/description/?envType=problem-list-v2&envId=2cktkvj&) |
| 647 | [回文子串](https://leetcode.cn/problems/palindromic-substrings/?envType=problem-list-v2&envId=2cktkvj&) |
| 332 | [零钱兑换](https://leetcode.cn/problems/coin-change/?envType=problem-list-v2&envId=2cktkvj&) |
| 494 | [目标和](https://leetcode.cn/problems/coin-change/?envType=problem-list-v2&envId=2cktkvj&) |
| 416 | [分割等和子集](https://leetcode.cn/problems/partition-equal-subset-sum/description/?envType=problem-list-v2&envId=2cktkvj&) |
| 337 | [打家劫舍III](https://leetcode.cn/problems/house-robber-iii/description/?envType=problem-list-v2&envId=2cktkvj&) |
| 312 | [戳气球](https://leetcode.cn/problems/burst-balloons/description/?envType=problem-list-v2&envId=2cktkvj&) |
| 309 | [买卖股票的最佳时期含冷冻期](https://leetcode.cn/problems/best-time-to-buy-and-sell-stock-with-cooldown/?envType=problem-list-v2&envId=2cktkvj&) |
| 300 | [最长递增子序列](https://leetcode.cn/problems/longest-increasing-subsequence/?envType=problem-list-v2&envId=2cktkvj&) |
| 279 | [完全平方数](https://leetcode.cn/problems/perfect-squares/description/?envType=problem-list-v2&envId=2cktkvj&) |
| 42 | [接雨水](https://leetcode.cn/problems/trapping-rain-water/?envType=problem-list-v2&envId=2cktkvj&) |
| 32 | [最长有效括号](https://leetcode.cn/problems/longest-valid-parentheses/description/?envType=problem-list-v2&envId=2cktkvj&) |
| 10 | [正则表达式匹配](https://leetcode.cn/problems/regular-expression-matching/description/?envType=problem-list-v2&envId=2cktkvj&) |
| 5 | [最长回文子串](https://leetcode.cn/problems/longest-palindromic-substring/description/?envType=problem-list-v2&envId=2cktkvj&) |
| 96 | [不同的二叉搜索树](https://leetcode.cn/problems/unique-binary-search-trees/description/?envType=problem-list-v2&envId=2cktkvj&) |
| 85 | [最大矩形](https://leetcode.cn/problems/maximal-rectangle/description/?envType=problem-list-v2&envId=2cktkvj&) |
| 72 | [编辑距离](https://leetcode.cn/problems/edit-distance/description/?envType=problem-list-v2&envId=2cktkvj&) |
| 70 | [爬楼梯](https://leetcode.cn/problems/climbing-stairs/description/?envType=problem-list-v2&envId=2cktkvj&) |
| 62 | [不同路径](https://leetcode.cn/problems/shortest-unsorted-continuous-subarray/description/?envType=problem-list-v2&envId=2cktkvj&) |
| 53 | [最大子数组和](https://leetcode.cn/problems/maximum-subarray/?envType=problem-list-v2&envId=2cktkvj&) |

### 链表

链表的题目往往使用虚拟头结点的方法，以避免对头结点为空的情况进行特判。需要记住的是链表的增删节点都是使用的双指针

| **题号** | **题目**                                                     |
| -------- | ------------------------------------------------------------ |
| 160      | [相交链表](https://leetcode.cn/problems/intersection-of-two-linked-lists/description/?envType=problem-list-v2&envId=2cktkvj) |
| 234      | [回文链表](https://leetcode.cn/problems/palindrome-linked-list/?envType=problem-list-v2&envId=2cktkvj) |
| 206      | [反转链表](https://leetcode.cn/problems/reverse-linked-list/?envType=problem-list-v2&envId=2cktkvj) |
| 148      | [排序链表 ](https://leetcode.cn/problems/sort-list/?envType=problem-list-v2&envId=2cktkvj) |
| 146      | [LRU 缓存 ](https://leetcode.cn/problems/lru-cache/?envType=problem-list-v2&envId=2cktkvj) |
| 142      | [环形链表II](https://leetcode.cn/problems/linked-list-cycle-ii/?envType=problem-list-v2&envId=2cktkvj) |
| 141      | [环形链表](https://leetcode.cn/problems/linked-list-cycle-ii/?envType=problem-list-v2&envId=2cktkvj) |
| 23       | [ 合并 K 个升序链表 ](https://leetcode.cn/problems/merge-k-sorted-lists/description/?envType=problem-list-v2&envId=2cktkvj) |
| 21       | [合并两个有序链表](https://leetcode.cn/problems/merge-two-sorted-lists/?envType=problem-list-v2&envId=2cktkvj) |
| 114      | [二叉树展开为链表](https://leetcode.cn/problems/flatten-binary-tree-to-linked-list/) |
| 19       | [删除链表的倒数第 N 个结点](https://leetcode.cn/problems/remove-nth-node-from-end-of-list/) |
| 2        | [两数相加](https://leetcode.cn/problems/add-two-numbers/)    |

### 单调栈

单调栈按照从栈底到栈顶的大小变化可以分为单调递增栈和单调递减栈。单调栈中存储的是元素的索引

| 题号 | 题目                                                         |
| ---- | ------------------------------------------------------------ |
| 739  | [ 每日温度 ](https://leetcode.cn/problems/daily-temperatures/submissions/543113746/?envType=problem-list-v2&envId=2cktkvj) |
| 84   | [柱状图中最大的矩形](https://leetcode.cn/problems/largest-rectangle-in-histogram/) |

### 构建数据结构

| 题号 | 题目                                                         |
| ---- | ------------------------------------------------------------ |
| 207  | [课程表 ](https://leetcode.cn/problems/course-schedule/description/?envType=problem-list-v2&envId=2cktkvj) |
| 399  | [除法求值](https://leetcode.cn/problems/evaluate-division/)  |
| 208  | [实现 Trie (前缀树)](https://leetcode.cn/problems/implement-trie-prefix-tree/) |

### 二进制

^异或：任何数^自身 = 0，^0不变，&1：判断末尾数是否为1，>>：向右位移1位，<<：向左位移1位。

| 题号 | 题目                                                         |
| ---- | ------------------------------------------------------------ |
| 461  | [汉明距离](https://leetcode.cn/problems/hamming-distance/description/?envType=problem-list-v2&envId=2cktkvj) |
| 338  | [比特位计数](https://leetcode.cn/problems/counting-bits/)    |

### 贪心

通过局部最优，得到全局最优，需要会自定义排序，建议使用lamda表达式

| 题号 | 题目                                                         |
| ---- | ------------------------------------------------------------ |
| 406  | [根据身高重建队列](https://leetcode.cn/problems/queue-reconstruction-by-height/) |
| 253  | [会议室](https://leetcode.cn/problems/meeting-rooms-ii/description/?envType=problem-list-v2&envId=2cktkvj) |
| 621  | [任务调度器](https://leetcode.cn/problems/task-scheduler/)   |

### 优先队列

| 题目 | 题号                                                         |
| ---- | ------------------------------------------------------------ |
| 399  | [除法求值](https://leetcode.cn/problems/evaluate-division/)  |
| 239  | [滑动窗口最大值](https://leetcode.cn/problems/sliding-window-maximum/) |
| 23   | [合并 K 个升序链表](https://leetcode.cn/problems/merge-k-sorted-lists/) |

### 回溯

回溯三要素：1.传递的参数和返回类型，2.终止条件，3.单层的逻辑

| 题号 | 题目                                                         |
| ---- | ------------------------------------------------------------ |
| 22   | [括号生成](https://leetcode.cn/problems/generate-parentheses/) |
| 46   | [全排列](https://leetcode.cn/problems/permutations/)         |
| 17   | [电话号码的字母组合](https://leetcode.cn/problems/letter-combinations-of-a-phone-number/) |
| 78   | [ 子集](https://leetcode.cn/problems/subsets/)               |
| 39   | [组合总和](https://leetcode.cn/problems/combination-sum/)    |

### 数组

二分法的使用

| 题号 | 题目                                                         |
| ---- | ------------------------------------------------------------ |
| 48   | [旋转图像](https://leetcode.cn/problems/rotate-image/)       |
| 33   | [ 搜索旋转排序数组](https://leetcode.cn/problems/search-in-rotated-sorted-array/) |
| 34   | [在排序数组中查找元素的第一个和最后一个位置](https://leetcode.cn/problems/find-first-and-last-position-of-element-in-sorted-array/) |
| 31   | [下一个排列](https://leetcode.cn/problems/next-permutation/) |
| 15   | [三数之和](https://leetcode.cn/problems/3sum/)               |
| 11   | [盛最多水的容器](https://leetcode.cn/problems/container-with-most-water/) |
| 4    | [寻找两个正序数组的中位数](https://leetcode.cn/problems/median-of-two-sorted-arrays/) |
| 1    | [两数之和](https://leetcode.cn/problems/two-sum/)            |
| 75   | [颜色分类](https://leetcode.cn/problems/sort-colors/)        |
| 56   | [合并区间](https://leetcode.cn/problems/merge-intervals/)    |
| 55   | [跳跃游戏](https://leetcode.cn/problems/jump-game/)          |
| 215  | [ 数组中的第K个最大元素](https://leetcode.cn/problems/kth-largest-element-in-an-array/) |
| 287  | [寻找重复数](https://leetcode.cn/problems/find-the-duplicate-number/) |
| 283  | [移动零](https://leetcode.cn/problems/move-zeroes/)          |
| 240  | [搜索二维矩阵 II](https://leetcode.cn/problems/search-a-2d-matrix-ii/) |

### 二叉树

前中后序遍历的递归和迭代实现和层序遍历。

| 题号 | 题目                                                         |
| ---- | ------------------------------------------------------------ |
| 236  | [二叉树的最近公共祖先](https://leetcode.cn/problems/lowest-common-ancestor-of-a-binary-tree/) |
| 226  | [翻转二叉树](https://leetcode.cn/problems/invert-binary-tree/) |
| 124  | [二叉树中的最大路径和](https://leetcode.cn/problems/binary-tree-maximum-path-sum/) |
| 297  | [二叉树的序列化与反序列化](https://leetcode.cn/problems/serialize-and-deserialize-binary-tree/) |
| 543  | [二叉树的直径](https://leetcode.cn/problems/diameter-of-binary-tree/) |
| 538  | [把二叉搜索树转换为累加树](https://leetcode.cn/problems/convert-bst-to-greater-tree/) |
| 114  | [二叉树展开为链表](https://leetcode.cn/problems/flatten-binary-tree-to-linked-list/) |
| 617  | [合并二叉树](https://leetcode.cn/problems/merge-two-binary-trees/) |
| 105  | [从前序与中序遍历序列构造二叉树](https://leetcode.cn/problems/construct-binary-tree-from-preorder-and-inorder-traversal/) |
| 104  | [二叉树的最大深度](https://leetcode.cn/problems/maximum-depth-of-binary-tree/) |
| 102  | [二叉树的层序遍历](https://leetcode.cn/problems/binary-tree-level-order-traversal/) |
| 101  | [对称二叉树](https://leetcode.cn/problems/symmetric-tree/)   |
| 98   | [验证二叉搜索树](https://leetcode.cn/problems/validate-binary-search-tree/) |
| 96   | [不同的二叉搜索树](https://leetcode.cn/problems/unique-binary-search-trees/) |
| 437  | [路径总和 III](https://leetcode.cn/problems/path-sum-iii/)   |
| 94   | [二叉树的中序遍历](https://leetcode.cn/problems/binary-tree-inorder-traversal/) |

### 栈、队列、HashMap()、HashSet()

栈、队列、HashMap和HashSet的常见方法需要会使用

| 题号 | 题目                                                         |
| ---- | ------------------------------------------------------------ |
| 169  | [多数元素](https://leetcode.cn/problems/majority-element/)   |
| 128  | [最长连续序列](https://leetcode.cn/problems/longest-consecutive-sequence/) |
| 438  | [找到字符串中所有字母异位词](https://leetcode.cn/problems/find-all-anagrams-in-a-string/) |
| 394  | [字符串解码](https://leetcode.cn/problems/decode-string/)    |
| 560  | [和为 K 的子数组](https://leetcode.cn/problems/subarray-sum-equals-k/) |
| 20   | [有效的括号](https://leetcode.cn/problems/valid-parentheses/) |
| 3    | [无重复字符的最长子串](https://leetcode.cn/problems/longest-substring-without-repeating-characters/) |

### 深度优先搜索和广度优先搜索

深度优先搜索：按照既定的搜索顺序，在一个方向搜索到头之后，回溯搜索下一个方向

广度优先搜索：从起始位置开始，逐层遍历（按照距离）所有可能到达的位置

| 题号 | 题目                                                        |
| ---- | ----------------------------------------------------------- |
| 79   | [单词搜索](https://leetcode.cn/problems/word-search/)       |
| 200  | [岛屿数量](https://leetcode.cn/problems/number-of-islands/) |

