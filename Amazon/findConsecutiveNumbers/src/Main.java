import java.util.Arrays;
import java.util.HashSet;
import static java.lang.Math.max;
/**
 * https://www.careercup.com/question?id=5656053464170496
 * 
 * Find the length of maximum number of consecutive numbers jumbled up in an array. 
 * e.g.: 1, 94, 93, 1000, 2, 92, 1001 should return 3 for 92, 93, 94
 */

/**
 * @author rakshith
 *
 */
public class Main {

	public static void main(String[] args) {
		int[] array = { 1, 94, 93, 1000, 2, 92, 1001};
		System.out.println("Max continuous length = "+maxContinuousLength2(array));
	}
	
	//Using sorting.
	public static int maxContinuousLength(int[] array){
		int maxLength = 1, curLength = 1;
		Arrays.sort(array);
		int prev = array[0];
		for(int i=1; i<array.length; i++){
			if(prev == array[i]-1){
				curLength++;
			}else{
				maxLength = max(maxLength,curLength);
				curLength = 1;
			}
			prev = array[i];
		}
		return maxLength;
	}
	
	//using HashSet
	public static int maxContinuousLength2(int[] array){
		int maxLength = 0;
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i=0; i<array.length; i++){
			set.add(array[i]);
		}
		
		for(Integer i: set){
			if(!set.contains(i-1)){
				int curLength = 0;
				while(set.contains(i)){
					i++;curLength++;
				}
				maxLength = max(maxLength, curLength);
			}
		}
		return maxLength;
	}
}
