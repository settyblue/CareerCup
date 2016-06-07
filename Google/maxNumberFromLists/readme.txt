/**
 * https://www.careercup.com/question?id=5682951373193216
 * You are given two arrays of length M and N having elements in range 0-9.
 * Your task is to create maximum number of length K from elements of these 
 * two arrays such that relative order of elements is same in the final 
 * number as in the array, they are taken from i.e. 
 * If two elements a,b are taken from array1 and and a comes before b 
 * in array1 so in the final number a should come before b 
 * (Relative order kept same).
 *  
 * Example: N=4 and M =6 
 * Array1 = { 3 , 4 , 6,5} 
 * Array2 ={9,1,2,5,8,3} 
 * Suppose K = 5, then number will be {9,8,6,5,3} 
 * 
 * You can see {9,8,3} are taken from array2 in the same order as they are in 
 * Array2. Similarly {6,5} are taken from Array1 in the same order and 
 * number 98653 is maximum possible number.
 */

 Solution:
 ---------
 Solved using Dynamic Programming.
 Space complexity = O(K*M+1*N+1)
 Time complexity = O(K*M+1*N+1)
