import java.util.Arrays;

/**
 * https://www.careercup.com/question?id=5663291826241536
 * Given an array: 1,2,3 ,5,8,7,6,9,5,7,3,0,5 
 * subarry:5,7 
 * 
 * Find the subarray in the large array and return the minimum length and index where you can find the subarray. Note: that the subarray may be present in the large array non-contiguous. 
 * 
 * In the above case : the answer is length = 2 and 
 * index = 8
 */

/**
 * @author rakshith
 *
 */
public class Main {

	public static void main(String[] args) {
		//int[] array = {1,2,3,5,8,8,6,9,5,9,3,0,5};
		//int[] array = {1,2,3,5,8,7,6,9,5,9,3,0,5};
		int[] array = {1,2,3,5,8,7,6,9,5,7,3,0,5};int[] subArray = {5,7};
		printMinLength(array,subArray);
	}
	
	public static void printMinLength(int[] array, int[] subArray){
		int minLength = Integer.MAX_VALUE, startIndex = -1;
		for(int i=0; i<array.length-subArray.length; i++){
			if(array[i] == subArray[0]){
				int end = find(array,i,subArray,0);
				if(end != -1 && minLength > end-i+1){
					minLength = end-i+1;
					startIndex = i;
				}
			}
		}
		if(startIndex != -1){
			int[] answer = Arrays.copyOfRange(array, startIndex, startIndex+minLength);
			System.out.println("minimum length = "+minLength+"; start index = "+startIndex);
			System.out.println(Arrays.toString(answer));
		}else{
			System.out.println("No solution exists.");
		}
	}
	
	public static int find(int[] array, int startArray, int[] subArray, int startSubArray){
		if(startSubArray == subArray.length)return startArray-1;
		if(subArray.length - startSubArray > array.length - startArray )return -1;
		if(array[startArray] == subArray[startSubArray]){
			return find(array,startArray+1,subArray,startSubArray+1);
		}else{
			return find(array,startArray+1,subArray,startSubArray);
		}
	}
}
