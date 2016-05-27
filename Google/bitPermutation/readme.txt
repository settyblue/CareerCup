/**
 * Given k - which is the number of bits, print all the possible 
 * combinations of numbers formed by printing all numbers with 
 * one bit set, followed by two bits set, 
 * ... up to the point when all k-bits are set. 
 * They must be sorted according to the number of bits set, 
 * if two numbers have the same number of bits set then 
 * they should be placed as per their value. 

 * For example if K=3 
 * Output: 
 * 000, 001, 010, 100,101, 110, 011, 111 
 * 0 bits set, followed by 1 bits set followed by 2 bits set followed by 3 bits set.
 */

 Solution 1:
 -----------
 Used the following funcitons:

 Integer.bitCount()
 Collections.sort()
 Integer.toBinaryString()

 complexity = n(logn)^2

 Solution 2:
 -----------
 implemented without sorting but used nested for loops.
 used Integer.bitCount()

 complexity = nlogn