import java.util.Arrays;

/**
 * https://www.careercup.com/question?id=5753551096643584
 * 
 */

/**
 * @author rakshith
 *
 */
public class Main {

	public static void main(String[] args) {
		int[] array = {6, 4, 1, 7, 10};
		System.out.println(minMoves(array));

	}

	private static int minMoves(int[] array) {
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		int n = array.length;
		int maxCount = 1;
		for(int i=0; i<n; i++){
			int p = getLowerBound(array, array[i]+n-1, i, Math.min(i+n, n-1));
			//System.out.println(array[i]+" "+p+" "+array[p]);
			maxCount = Math.max(maxCount, p-i+1);
		}
		return n-maxCount;
	}

	private static int getLowerBound(int[] array, int searchElement, int start, int end) {
		int n = array.length;
		while(start < end){
			int mid = (start+end+1)/2;
			if(array[mid] <= searchElement){
				start = mid;
			}else{
				end = mid - 1;
			}
		}
		return start;
	}

}
