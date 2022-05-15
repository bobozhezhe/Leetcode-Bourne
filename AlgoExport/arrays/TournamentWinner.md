# Tournament Winner 
There's an algorithms tournament taking place in which teams of programmers compete against each other to solve algorithmic problems as fast as possible. 
Teams compete in a round robin, where each team faces off against all other teams. 
Only two teams compete against each other at a time, 
and for each competition, one team is designated the home team, while the other team is the away team. 
In each competition there's always one winner and one loser; there are no ties. 
A team receives 3 points if it wins and 0 points if it loses. 
The winner of the tournament is the team that receives the most amount of points.

Given an array of pairs representing the teams that have competed against each other 
and an array containing the results of each competition, 
write a function that returns the winner of the tournament. 

The input arrays are named competitions and results, respectively. 
The competitions array has elements in the form of `[homeTeam, awayTeam]`, 
where each team is a string of at most 30 characters representing the name of the team. 
The results array contains information about the winner of each corresponding competition in the competitions array. 
Specifically, `results[i]` denotes the winner of `competitions[i]`, 
where a 1 in the results array means that the home team in the corresponding competition won and a 0 means that the away team won.

It's guaranteed that exactly one team will win the tournament 
and that each team will compete against all other teams exactly once. 
It's also guaranteed that the tournament will always have at least two teams.

## Sample Input

```python
competitions = [
    ["HTML", "C#"],
    ["C#", "Python"],
    ["Python", "HTML"],
]
results = [0, 0, 1]
```

## Sample Output
```
"Python"
// C# beats HTML, Python Beats C#, and Python Beats HTML.
// HTML - 0 points
// C# -  3 points
// Python -  6 points
```

## 输入
- 参赛队数组`competitions[i]` ，数组中的项是字符串对`[homeTeam, awayTeam]`，每个team的名称最多30个字符。

- 比赛结果数组`results[i]` ，int[], 1表示主队胜，0表客队胜，无平局。

## 输出
- 最后胜者，每队积分。

## Solution 1
同时遍历 competition 和 results 数组，用hashset 存储队名字符串，用 int[] score 存储最后得分。

遍历时，查找 hashset 中是否已经存在队名，存在则加分，不存在则

## Todo
此处用的是hashmap，与前面用的hashset 有什么区别？
