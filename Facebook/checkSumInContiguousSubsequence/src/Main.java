/**
 * https://www.careercup.com/question?id=6305076727513088
 * 
 * Question: Given a sequence of positive integers A and an integer T, return whether there is a continuous sequence of A that sums up to exactly T 
 * Example 
 * [23, 5, 4, 7, 2, 11], 20. Return True because 7 + 2 + 11 = 20 
 * [1, 3, 5, 23, 2], 8. Return True because 3 + 5 = 8 
 * [1, 3, 5, 23, 2], 7 Return False because no sequence in this array adds up to 7
 */

/**
 * @author rakshith
 *
 */
public class Main {
	
	public static void main(String[] args) {
		//int[] array = {23, 5, 4, 7, 2, 11};int sum = 20;
		//int[] array = {1, 3, 5, 23, 2};int sum = 8;
		int[] array = {1, 3, 5, 23, 2};int sum = 7;
		
		if(checkSumInSubsequence(array,sum)){
			System.out.println("The given sum is present.");
		}else{
			System.out.println("The given sum is not present.");
		}

	}
	
	//Works for array of positive numbers.
	public static boolean checkSumInSubsequence(int[] array, int sum){
		int startIndex = 0, endIndex = 0;
		int curSum = 0;
		for(int i=0; i<array.length; i++){
			curSum += array[i];
			endIndex++;
			if(curSum==sum){
				System.out.println("start = "+startIndex+", end = "+endIndex);
				return true;
			}else if(curSum < sum){
				continue;
			}else if(curSum > sum){
				while(curSum > sum){
					if(startIndex<endIndex){
						curSum -= array[startIndex];
						startIndex++;
					}
					else{
						break;
					}
				}
				if(curSum==sum){
					System.out.println("start = "+startIndex+", end = "+endIndex);
					return true;
				}
			}
		}
		return false;
	}
	
	//TODO: Function which works even for array of negative numbers.
}
