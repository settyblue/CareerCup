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
		int[] array = {-2, -3, -4, -1, -2, 1, 5, -1, 4};
		//System.out.println("The maximum contiguous sum subarray is : " + maxSumContSubarray(array));
		System.out.println("The maximum contiguous sum subarray is : " + maxSumContSubarray2(array));
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
	
	//This will print the index and length of the maximum sum contiguous sub-array.
	private static int maxSumContSubarray2(int[] array) {
		int maxSumSoFar = array[0], currentMax = array[0];
		int maxIndex = 0, currIndex=0;
		int maxLength = 1, currLength=1;
		for(int i=1; i<array.length; i++){
			if(array[i] > currentMax+array[i]){
				//It means currentMax was negative.
				//It is better to start a new sub-array.
				currentMax = array[i];
				currIndex = i;
				currLength = 1;
			}else{
				//continue with old sub-array.
				currentMax = currentMax+array[i];
				currLength++;
			}
			if(maxSumSoFar < currentMax){
				//new max sub-array found.
				maxSumSoFar = currentMax;
				maxIndex = currIndex;
				maxLength = currLength;
			}
		}
		System.out.println("max sum contiguous sub-array\nStarting index : "+maxIndex+"\nlength of sub-array : "+maxLength);
		return maxSumSoFar;
	}

}
