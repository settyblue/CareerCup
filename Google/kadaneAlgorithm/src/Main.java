/**
 * Kadane's Algorithm
 * Largest Sum Contiguous Subarray
 * Write an efficient program to find the sum of contiguous subarray
 * within a one-dimensional array of numbers which has the largest sum.
 * --------------------------------------------------------------------
 * Algorithm doesn't work for all negative numbers. 
 * It simply returns 0 if all numbers are negative. For handling 
 * this we can add an extra phase before actual implementation. 
 * The phase will look if all numbers are negative, if they are 
 * it will return maximum of them (or smallest in terms of absolute value). 
 */


/**
 * @author rakshith
 *
 */
public class Main {

	public static void main(String[] args) {
		int[] array = {-2, -3, 4, -1, -2, 1, 5, -3, 4};
		System.out.println("The maximum contiguous sum subarray is : " + maxSumContSubarray(array));
		
	}
	
	//This doesn't handle the case when all the numbers are negative.
	//This doesn't return the index and length of the sub-array.
	private static int maxSumContSubarray(int[] array) {
		int maxSumSoFar = array[0];
		int currentMax = array[0];
		for(int i=1; i<array.length; i++){
			currentMax = Math.max(array[i], currentMax+array[i]);
			maxSumSoFar = Math.max(maxSumSoFar, currentMax);
		}
		return maxSumSoFar;
	}

}
