# Example Class 3 - Dynamic Programming 
Solved the Knapsack problem (both 0/1 Bounded and Unbounded) using the Dynamic Programming approach

Team Members: Seng Yi Wei Alan, Yong Chi Kei, Pyae Thein, Pathak Siddhant

As a part of academic coursework for CZ2101: Algorithms Design and Analysis.

## Problem Statement
We have a knapsack of capacity weight C (a positive integer) and n types of objects. Each object of the ith type has weight wi and profit pi (all wi and all pi are positive integers, i = 0, 1, …, n-1). There are unlimited supplies of each type of objects. Find the largest total profit of any set of the objects that fits in the knapsack.

Let P(C) be the maximum profit that can be made by packing objects into the knapsack of capacity C.
(1) Give a recursive definition of the function P(C).
(2) Draw the subproblem graph for P(14) where n is 3 with the weights and profits given below.

![image](https://user-images.githubusercontent.com/77330150/147474003-77a5b9c0-ae2b-427a-bb6f-d345ecf0afa7.png)

(3) Give a dynamic programming algorithm to compute the maximum profit, given a knapsack of capacity C, n types of objects with weights wi and profits pi using the
bottom up approach.

(4) Code your algorithm in a programming language
    a. show the running result of P(14) with weights and profits given in (2).
    b. Show the running result of P(14) with weights and profits given below.

You should show the program input and the output in (a) and (b).

![image](https://user-images.githubusercontent.com/77330150/147474059-9818a13a-f4e2-41bf-841c-14790b774a09.png)

