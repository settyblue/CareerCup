/**
 * https://www.careercup.com/question?id=5751343965798400
 * 
 * If pairwise sums of n numbers (set P) are given identify the individual numbers (Set S).
 */

 Solution:
 ---------
 There are few points to note in order to understand the solution:
1. Size of S can be computed from size of P.
2. If P is in sorted order, the smallest and largest numbers are the sum of the two lowest and two highest numbers in S.

So the key to finding the solution is sorting P.
refer the following page for a more detailed explanation:
http://stackoverflow.com/questions/8566534/pairwise-sum-of-n-numbers-in-non-increasing-order

The algorithm will find a solution in polynomial time if it exists.