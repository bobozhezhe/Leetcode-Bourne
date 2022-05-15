# Sorted Squared Array
Write a function that takes in a non-empty array of integers that are sorted in ascending order 
and returns a new array of the same length with the squares of the original integers also sorted in ascending order.

输入：非空升序整数数组（可能为负）

输出：原数组的平方，升序数组

# Solution 1
先平方，再快排

Time: O(nlogn), Space: O(n).

# Solution 2
遍历一遍，完成绝对值比较再平方的过程。

因为数组的两端只能看到绝对值最大的数，所以，只能从大到小逆向来完成排序。

# JAVA
Arrays.sort();
