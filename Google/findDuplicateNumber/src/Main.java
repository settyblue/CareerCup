import java.util.Arrays;

/**
 * https://www.careercup.com/question?id=5122945074593792
 * 
 * Find a duplicates in an array of length n. 
 * The values are positive integers in the range between 1 .. n-1
 */

/**
 * @author rakshith
 *
 */
public class Main {
	
	public static void main(String[] args) {
		int[] array = {5, 4, 2, 3, 4, 1};
		printRepeatingElement(array);
	}

	private static void printRepeatingElement(int[] array) {
		for(int i=0; i< array.length; i++){
			if(array[i] > 0){
				array[array[i]] *=(-1);
			}else{
				System.out.println("repeating element = "+array[i]*(-1));
				return;
			}
		}
	}

}
