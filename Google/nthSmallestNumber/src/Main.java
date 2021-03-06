import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * https://www.careercup.com/question?id=5686055997014016
 * Find the n-th smallest multiple given a set of numbers. 
 * For example, given set = {4, 6}, n = 6: 
 * The combined sequence is: 
 * 4, 6, 8, 12, 16, 18, etc... 
 * Answer is 18.
 * 
 * multiples of 4 give sequence:
 * 4, 8, 12, 16, 20, 24, 28, 32, 36, 40, 44, 48, 52, 56, 60, 64, 68, 72, 76, ...
 * 
 * multiples of 6 give sequence:
 * 6, 12, 18, 24, 30, 36, 42, 48, 54, 60, 66, 72, ... 
 * 
 * Combine 2 sequences (but eliminate duplicates):
 * 4, 6, 8, 12, 16, 18, 20, 24, 28, 30, 32, 36, 40, 42, 44, 48, 52, 54, 56, 60, 64, 66, 68, 72, ... 
 * 18 is the 6th smallest number in this combined sequence.
 */

/**
 * @author rakshith
 *
 */
public class Main {

	public static void main(String[] args) {
		int[] array = {4,6};
		int n = 6;
		System.out.println("nth smallest number is "+nthSmallestNumber(array,n));
	}

	private static int nthSmallestNumber(int[] array, int n) {
		Set<Integer> set = new HashSet<Integer>();
		ArrayList<Integer> count = new ArrayList<Integer>();
		for(int i=0; i<array.length; i++){
			count.add(1);
		}
		int minNumber = 0;
		int minIndex = 0;
		
		while(set.size()<n){
			minNumber = Integer.MAX_VALUE;
			for(int i=0; i<array.length; i++){
				if(minNumber > array[i]*count.get(i)){
					minNumber = array[i]*count.get(i);
					minIndex = i;
				}
			}
			set.add(minNumber);
			System.out.println(set.toString());
			count.set(minIndex, count.get(minIndex)+1);
		}
		
		return minNumber;
	}

}
