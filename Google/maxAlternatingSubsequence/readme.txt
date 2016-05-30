/**
 * https://www.careercup.com/question?id=5667564572114944
 * Given an array of numbers, find the longest alternating subsequence. 
 * That is, 
 * a subsequence [a1, a2, a3, ..., ak] where a1 > a2, a3 < a2, a4 > a3
 * examples:
 		//int[] input = {1, 2, 51, 50, 60, 55, 70, 68, 80, 76, 75, 12, 45}; //MaxSubLen:9 (2, 51, 50, 60, 55, 70, 68, 80, 76)
        //int[] input = {1, 2, 51, 50, 45, 55, 54, 68, 66, 76, 75, 12, 45}; //MaxSubLen:8 (50, 45, 55, 54, 68, 66, 76, 75)
        //int[] input = {1, 2, 3, 4, 5, 6, 70}; //MaxSubLen:2 (1, 2)
        //int[] input = {1, 1, 1, 1, 1, 2}; //MaxSubLen: 2 (1, 2)
        //int[] input = {3, 3, 3, 3, 3, 2}; //MaxSubLen: 2 (3, 2)
        //int[] input = {1, 1, 1, 1, 1, 1}; //MaxSubLen: 1 (1)
        //int[] input = {50, 45, 51, 48, 62, 55, 73}; //MaxSubLen:7 (50, 45, 51, 48, 62, 55, 73)
        //int[] input = {1, 1, 1, 2, 1, 1, 1}; //MaxSubLen:3 (1, 2, 1)
        //int[] input = {2, 2, 2, 1, 2, 2, 2}; //MaxSubLen:3 (2, 1, 2)
 */
 Solution:
 ---------
 Counting in one pass through the array.