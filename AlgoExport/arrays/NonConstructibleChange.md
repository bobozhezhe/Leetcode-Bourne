# Non-Constructible Change

Given an array of positive integers representing the values of coins in your possession, 
write a function that returns the minimum amount of change (the minimum sum of money) that you cannot create. 
The given coins can have any positive integer value and aren't necessarily unique 
(i.e., you can have multiple coins of the same value).

For example, if you're given coins = [1, 2, 5], the minimum amount of change that you can't create is 4. 
If you're given no coins, the minimum amount of change that you can't create is 1.

## Sample Input
coins = [5, 7, 1, 1, 2, 3, 22]
## Sample Output
20

## 思路
主要是思路，后一个数必须能接上前面所有数之和，也就是 <= sum +1。

如果能接上，就相当于把前面的覆盖搬移到新的高度；如果不能接上，即coins[n] > sum+1，表示中间出现了断裂，跳跃。