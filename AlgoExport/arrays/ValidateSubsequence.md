# Validate Subsequence
Given two non-empty arrays of integers, write a function that determines 
whether the second array is a subsequence of the first one.

A subsequence of an array is a set of numbers that aren't necessarily adjacent in the array 
but that are in the same order as they appear in the array. 
For instance, the numbers [1, 3, 4] form a subsequence of the array [1, 2, 3, 4], 
and so do the numbers [2, 4]. 
Note that a single number in an array and the array itself are both valid subsequences of the array.

## Sample Input
array = [5, 1, 22, 25, 6, -1, 8, 10]
sequence = [1, 6, -1, 10]
## Sample Output
true

# Solutions

## Method 1
暴力。
双指针，以子串中的第0个元素为起点，逐个在母串中查找；
如果找到，则查找子串中的第1个元素，

需要注意
1. 如果母串中有重复元素时，需要略过。
2. 子串中如果有重复，怎么处理？


# JAVA
1. 如何打印boolean 值；
```java
        System.out.printf(String.valueOf(res));
```


# Todo
1. List 与 Arrays 的区别？是不是可以方便地互换？
