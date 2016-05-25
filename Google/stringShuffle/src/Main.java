/**
 * https://www.careercup.com/question?id=5681030989086720
 * Define a function that can detect whether the characters 
 * of a string can be shuffled without repeating same characters 
 * as one other's neighbour.
 * For examples: 
 * apple => aplpe => valid 
 * apppe => papep => valid 
 * appp => invalid 
 */


/**
 * @author rakshith
 *
 */
public class Main {

	public static void main(String[] args) {
		String s1 = "apple";
		String s2 = "apppe";
		String s3 = "appp";
		
		String s = s3;
		if(canShuffle(s)){
			System.out.println(s+" can be shuffled.");
		}else{
			System.out.println(s+" cannot be shuffled.");
		}
	}

	private static boolean canShuffle(String s) {
		int[] charCounter = new int[256];
		int maxCount=0;
		for(char c : s.toCharArray()){
			charCounter[c]++;
		}
		for(int i=0; i<256; i++){
			maxCount = Math.max(maxCount, charCounter[i]);
		}
		
		return (maxCount < (s.length()/2+1));
	}

}
