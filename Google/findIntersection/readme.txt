/**
 * https://www.careercup.com/question?id=5143327210995712
 * 
 * You are given a list of array float numbers x_1, x_2, x_3, ... x_n, where x_i > 0. 
 * A traveler starts at point (0, 0) and moves x_1 metres to the north, 
 * then x_2 metres to the west, x_3 to the south, x_4 to the east and so on 
 * (after each move his direction changes counter-clockwise) 
 * Write an single-pass algorithm that uses O(1) memory to determine, 
 * if the travelers path crosses itself, or not (i.e. if it's self-intersecting) 
 * 
 * e.g. 
 * 2 1 1 2 -> crosses 
 * 1 2 3 4 -> doesn't cross
 */

 Solution:
 ---------
 Important thing to note here is that, there are only two cases how which intersection can occur.
 identify the cases and solve this problem.
