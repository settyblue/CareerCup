/**
 * https://www.careercup.com/question?id=5086215957118976
 * 
 * Given unsigned integer 'x', write an algorithm that returns 
 * unsigned integer 'y' such that it has the same number of bits 
 * set as 'x' and is not equal to 'x' and the distance |x-y| is minimized. 
 * 
 * Example: 
 * x: 01 
 * y: 10 
 * 
 * Note that one bit is set and 'x' is not equal 'y'. 
 * You may assume that x is positive integer between zero and 2^32-2;
 */

/**
 * @author rakshith
 *
 */
public class Main {

	public static void main(String[] args) {
		int n = 25;
		System.out.println(Integer.toBinaryString(n));
		printBitShiftedNumber(n);
	}

	private static void printBitShiftedNumber(int n) {
		int m = 1;
		while((n&m) == 0){
			m = m << 1;
		}
		if(m==1){
			while((n&m)==1){
				m = m << 1;
			}
		}
		System.out.println(Integer.toBinaryString(n ^ (m | m>>1))); 
	}

}
