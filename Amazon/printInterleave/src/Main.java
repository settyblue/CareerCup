/**
 * https://www.careercup.com/question?id=5636314868219904
 * 
 * Given two strings, print all the inter-leavings of the Strings in which characters from two strings should be in same order as they were in original strings. 
 *  
 * for "abc", "de", print all of these: 
 * abcde, abdce, abdec, adbce, adbec, adebc, dabce, dabec, daebc, deabc
 */

/**
 * @author rakshith
 *
 */
public class Main {

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "de";
		printInterleave(s1,s2);
	}
	
	public static void printInterleave(String s1,String s2){
		String soFar = "";
		printInterleaveUtil(s1,s2,0,0, soFar);
	}
	
	public static void printInterleaveUtil(String s1, String s2, int l1, int l2, String soFar){
		if(l1 == s1.length() && l2 == s2.length()){
			System.out.println(soFar);
			return;
		}
		if(l1 < s1.length()){
			printInterleaveUtil(s1,s2,l1+1,l2,soFar+s1.charAt(l1));
		}
		if(l2 < s2.length()){
			printInterleaveUtil(s1,s2,l1,l2+1,soFar+s2.charAt(l2));
		}
	}
}
