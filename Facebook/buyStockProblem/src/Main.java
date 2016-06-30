/**
 * https://www.careercup.com/question?id=6051351341563904
 * http://www.geeksforgeeks.org/maximum-difference-between-two-elements/
 * 
 * Slight variant ->
 * http://www.geeksforgeeks.org/stock-buy-sell/
 * 
 * Given an array, find the maximum difference between two array 
 * elements given the second element comes after the first. 
 * 
 * For example. 
 * 
 * array = [1,2,3,4,5,6,7] 
 * 
 * We can take the difference between 2 and 1 (2-1), 
 * but not the different between 1 and 2 (1-2). 
 */

/**
 * @author rakshith
 *
 */
public class Main {

	public static void main(String[] args) {
		int[] array = {2, 3, 10, 6, 4, 8, 1, 11, 0};
		System.out.println("Maximum profit made = "+maxProfit(array));
	}
	
	public static int maxProfit(int[] array){
		int maxProfit = 0;
		int minSoFar = array[0];
		
		for(int i=0; i<array.length; i++){
			if(array[i] - minSoFar > maxProfit){
				maxProfit = array[i] - minSoFar;
			}else{
				if(array[i] < minSoFar){
					minSoFar = array[i];
				}
			}
		}
		return maxProfit;
	}
}
