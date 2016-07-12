/**
 * https://www.careercup.com/question?id=5702909641621504
 * 
 * Given an integer array of variable length like so [9, 8, 8, 3] 
 * where each item in array could be 0 to 9, write a function that would take 
 * would interpret the array [9, 8, 8, 3] as a number 9883 and increment it by 1. 
 * The return of the function would be an integer array containing the addition 
 * like so [9,8,8,4]. No zeros in the first position like [0,1,2,3]. 
 * I initially suggested a possible solution of process to convert the integer 
 * array to String then convert to Integer or Long and then do the addition of 1 
 * and then convert it back to integer array. That is not allowed when the interviewer 
 * change the ques. to not allow that.
 */
 Solution:
 ---------
 Time Complexity = O(n)