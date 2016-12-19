/**
 * https://www.careercup.com/question?id=5675917835763712
 * 
 * Given a sorted array and n, find the count of sum of 2 
 * numbers greater than or equal to n
 */

/**
 * @author rakshith
 *
 */
public class Main {

	public static void main(String[] args) {
		int[] array = { 1, 5, 7, 9, 30, 33, 35, 65, 67 };
		
		System.out.println("Number of pairs having sum greater than n : "+numberOfPairs(array));

	}

	private static int numberOfPairs(int[] array) {
		int startIndex=0, endIndex=array.length-1;
		int count = 0;
		while(startIndex < endIndex){
			if(array[startIndex] + array[endIndex] >= array.length){
				count += endIndex - startIndex;
				endIndex--;
			}else{
				startIndex++;
			}
		}
		return count;
	}

}
