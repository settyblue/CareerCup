import java.util.Collections;
import java.util.Vector;

/**
 * Given k - which is the number of bits, print all the possible 
 * combinations of numbers formed by printing all numbers with 
 * one bit set, followed by two bits set, 
 * ... up to the point when all k-bits are set. 
 * They must be sorted according to the number of bits set, 
 * if two numbers have the same number of bits set then 
 * they should be placed as per their value. 

 * For example if K=3 
 * Output: 
 * 000, 001, 010, 100,101, 110, 011, 111 
 * 0 bits set, followed by 1 bits set followed by 2 bits set followed by 3 bits set.
 */


/**
 * @author rakshith
 *
 */
public class Main {

	public static void main(String[] args){
		int k = 3;
		
		Vector<Vector<Integer>> result = new Vector<Vector<Integer>>();
		bitPermutation(k,result);//uses sorting. takes n(logn)^2 time.
		bitPermutation2(k);//no sorting, but takes n(logn) time.
		//print(k,result);
	}

	private static void bitPermutation(int k, Vector<Vector<Integer>> result) {
		int n = (int) Math.pow(2, k);
		
		for(int i=0; i<=k; i++){
			result.addElement(new Vector<Integer>());
		}
		
		for(int i=0; i<n; i++){
			result.get(Integer.bitCount(i)).add(i);
		}
		
		for(int i=0; i<=k; i++){
			Collections.sort(result.get(i));
		}
	}

	private static void print(int k, Vector<Vector<Integer>> result) {
		for(int i=0; i<=k; i++){
			printVector(result.get(i),k);
		}
	}

	private static void printVector(Vector<Integer> vector, int k) {
		for(int i:vector){
			String binString = Integer.toBinaryString(i);
			  while (binString.length() < k) {    //pad with 16 0's
			        binString = "0" + binString;
			  }
			System.out.println(binString);
		}
	}
	

	private static void bitPermutation2(int k) {
		int n = (int) Math.pow(2, k);
		boolean[] done = new boolean[n];
		for(int i=0; i<=k; i++){
			for(int j=0; j<n; j++){
				if(!done[j] && Integer.bitCount(j)==i){
					String binString = Integer.toBinaryString(j);
					  while (binString.length() < k) {    //pad with 16 0's
					        binString = "0" + binString;
					  }
					System.out.println(binString);
					done[j] = true;
				}
			}
		}
	}


}
