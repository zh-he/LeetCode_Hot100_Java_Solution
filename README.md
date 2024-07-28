# LeetCode_Hot100_Java_Solution
## 记录Leetcode hot 100的java题解,答案来源于chatgpt，leetcode题解和我自己的思考
## 我将hot100题目按照类型分类。部分题目可能属于多个类型
刷leetcode hot 100以前需要了解一些基本知识：
常见排序：冒泡排序，插入排序，选择排序，归并排序，快速排序，堆排序。 
时间复杂度为O(nlogn)：归并排序和堆排序。快速排序时间复杂度最好的时候是O(nlogn)，最坏的时候是O(n^2)。
字符串的常用方法：length(),substring(),spilt()。 StringBUffer()的常用方法：deleteCharAt(),reverse(),toString(),append()。
常用数据结构：List,HashMap,HashSet,PriorityQueue,stack,queue。
| 数据结构 | 常用方法 |
| ---- | ---- |
| List | add(), remove() |
| HashMap | put(),size(),remove(),containsKey() |
| HashSet | add(),remove(),size(),contains() |
| PriorityQueue | poll(),offer(),isEmpty(),size(),peek() |
| stack | push(),size(),pop(),isEmpty(),peek() |
| queue | poll(),offer(),isEmpty(),size(),peek() |

dp的含义，递推公式，初始化，遍历顺序。01背包和完全背包。
深度优先搜索和广度优先搜索：深度优先搜索就是按照既定的顺序在一个方向上搜到底，在回溯到上一个位置，按照顺序进行下一个方向的搜索；广度优先搜索是每一次搜索所有相邻的位置，以起点为中心，向周围扩散


### dp
| 题号 | 题目 |
| ---- | ---- |
| 198 | [打家劫舍](https://leetcode.cn/problems/house-robber/?envType=problem-list-v2&envId=2cktkvj&) |
| 238 | [除自身数组以外的乘积](https://leetcode.cn/problems/product-of-array-except-self/description/?envType=problem-list-v2&envId=2cktkvj&) |
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


