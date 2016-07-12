import java.util.Arrays;

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

/**
 * @author rakshith
 *
 */
public class Main {

	public static void main(String[] args) {
		//int[] array = {9, 8, 8, 4};
		//int[] array = {9, 9, 9, 9};
		int[] array = {9, 8, 9, 9};
		
		incrementIntArray(array);
	}

	private static void incrementIntArray(int[] array) {
		incrementElement(array,array.length-1);
	}

	private static void incrementElement(int[] array, int i) {
		if(array[i]<9){
			array[i]++;
			System.out.println(Arrays.toString(array));
		}else{
			array[i]=0;
			if(i>0){
				incrementElement(array,i-1);
			}else{
				array[i] = 0;
				int[] ans = new int[array.length+1];
				ans[0] = 1;
				System.out.println(Arrays.toString(ans));
			}
		}
	}

}
