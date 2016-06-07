import java.util.Arrays;

/**
 * Arrange given int array in wave form a1 > a2 < a3 > a4 ... 
 * Example: { 2, 4, 8, 9, 7, 3}
 * Answer : { 4, 2, 9, 3, 8, 7}
 * (one of many solutions)
 */

/**
 * @author rakshith
 *
 */
public class Main {

	public static void main(String[] args) {
		int[] array = { 2, 4, 8, 9, 7, 3};
		System.out.println("List of integers in wave format : "+ waveFormat(array));
	}

	private static String waveFormat(int[] array) {
		Arrays.sort(array);
		
		int endIndex;
		if(array.length%2 == 0) endIndex=array.length/2-1;
		else endIndex=array.length/2;

		String result = "";
		for(int i=array.length-1; i!=endIndex; i=(i>=array.length/2)?array.length-1-i:array.length-2-i){
			result = result + array[i]+"_";
		}
		result = result + array[endIndex];
		return result;
	}

}
