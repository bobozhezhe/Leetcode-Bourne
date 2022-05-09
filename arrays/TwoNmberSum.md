# 两数和 Two Number Sum
Write a function that takes in a non-empty array of distinct integers and an integer representing a target sum. If any two numbers in the input array sum up to the target sum, the function should return them in an array, in any order. If no two numbers sum up to the target sum, the function should return an empty array.

Note that the target sum has to be obtained by summing two different integers in the array; you can't add a single integer to itself in order to obtain the target sum.

You can assume that there will be at most one pair of numbers summing up to the target sum.

## 方法1
暴力循环，两重循环遍历所有可能的加法，比对结果，如果符合则返回。

## 方法2
用hashset。使用hashset 的 contains() 方法来判断差值是否存在。

## Todo
1. hashset 原理是啥？ 为什么它可以在O(1) 时间内找到数据
2. JAVA 中的 hashset 有些什么方法？它还有什么其他的功能，方便在算法中使用
3. JAVA 中还有什么与 hashset 相似的set 或者其他数据结构，可以实现其他的什么功能？有什么异同点？

# JAVA 技巧
## for 循环高级用法
可以用如下结构直接遍历数组中的所有元素。
```java
int[] array = new int[10];
for(int i : array){
        int sum=0;
        sum+=i;
        }
```

