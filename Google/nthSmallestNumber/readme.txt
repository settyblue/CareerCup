/**
 * https://www.careercup.com/question?id=5686055997014016
 * Find the n-th smallest multiple given a set of numbers. 
 * For example, given set = {4, 6}, n = 6: 
 * The combined sequence is: 
 * 4, 6, 8, 12, 16, 18, etc... 
 * Answer is 18.
 * 
 * multiples of 4 give sequence:
 * 4, 8, 12, 16, 20, 24, 28, 32, 36, 40, 44, 48, 52, 56, 60, 64, 68, 72, 76, ...
 * 
 * multiples of 6 give sequence:
 * 6, 12, 18, 24, 30, 36, 42, 48, 54, 60, 66, 72, ... 
 * 
 * Combine 2 sequences (but eliminate duplicates):
 * 4, 6, 8, 12, 16, 18, 20, 24, 28, 30, 32, 36, 40, 42, 44, 48, 52, 54, 56, 60, 64, 66, 68, 72, ... 
 * 18 is the 6th smallest number in this combined sequence.
 */

 Solution 1:
 -----------
 1. Implemented solution
    Time Complexity = O(k*n) //given set size = k.
    Space Complexity = O(k+n)  //Space complexity can be reduced to O(k)

 2. Implemented using min heap. 
 	Time Complexity = O(n)
 	Space Complexity = O(k)