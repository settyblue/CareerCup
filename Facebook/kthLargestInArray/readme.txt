/**
 * https://www.careercup.com/question?id=5663671083597824
 * 
 * Select kth largest value in the array. Given an unsorted array 
 * of size n, and a value k. Select the kth largest value from the array. 
 * 
 * For example: 
 * 
 * Array is [5, 3, 9, 1], n is 4 
 * k = 0 => 9 
 * k = 1 => 5 
 * k = 3 => 1
 */

Solution:
---------
Implemented using a minHeap of size k+1.
Time Complexity = O(n)