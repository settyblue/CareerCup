http://www.geeksforgeeks.org/largest-sum-contiguous-subarray/
https://www.careercup.com/question?id=5764750370668544
-------------------------------------------------------------
Largest Sum Contiguous Subarray
Write an efficient program to find the sum of contiguous subarray within a one-dimensional array of numbers which has the largest sum.
-------------------------------------------------------------
Kadane's algorithm doesn't work for all negative numbers. It simply returns 0 if all numbers are negative. For handling this we can add an extra phase before actual implementation. The phase will look if all numbers are negative, if they are it will return maximum of them (or smallest in terms of absolute value).
-------------------------------------------------------------
Implemented :
1. Kadane's Algorithm to only print max-sum.
2. Modified Kadane's algorithm to also print index and length of sub-array.