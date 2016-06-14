/**
 * https://www.careercup.com/question?id=5665999128887296
 * 
 * Write a code which checks if a given number is a power of two.
 */

/**
 * @author rakshith
 *
 */
public class Main {

	public static void main(String[] args) {
		int n = 35;
		if(isPowerOfTwo(n)){
			System.out.println("given number is a power of 2.");
		}else{
			System.out.println("given number is not a power of 2.");
		}

	}

	private static boolean isPowerOfTwo(int n) {
		int m = 1;
		while(m > 0){
			if((n|m)==m){
				return true;
			}
			m = m<<1;
		}
		return false;
	}

}
