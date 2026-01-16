[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/qYzjDqgu)
# Experiment 30: Missing Number in Array

## Problem Statement

Given an array containing $n$ distinct numbers taken from the range $0, 1, 2, \dots, n$, find the one that is missing from the array.

## Input Format

* The first line contains an integer $n$ (size of the array range).
* The second line contains $n$ space-separated integers.

## Output Format

Print the missing number.

### Example 1

**Input:**

```text
3
3 0 1
```

**Output:**

```text
2
```

### Explanation
The range is $[0, 3]$, so the numbers should be $\{0, 1, 2, 3\}$.
The array contains $\{3, 0, 1\}$.
The missing number is 2.

### Example 2

**Input:**

```text
2
0 1
```

**Output:**

```text
2
```

### Logic Hint
The sum of numbers from $0$ to $n$ is given by the formula $\frac{n \times (n+1)}{2}$.
Subtract the sum of the elements present in the array from this expected sum to find the missing value.
