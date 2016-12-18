/**
 * https://www.careercup.com/question?id=5689327699886080
 * 
 * take an array and print non over lapping in order pairs. example:


 * [1,2,3,4] => input

 * output below is in order combination

 * (1234)
 * (1)(234)
 * (1)(23)(4)
 * (1)(2)(34)
 * (12)(34)
 * (12)(3)(4)
 * (123)(4)
 * (1)(2)(3)(4)
 */

/**
 * @author rakshith
 *
 */
public class Main {

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4};
		String input ="1234";
		printDisjointOrderedPairs(input);
	}

	private static void printDisjointOrderedPairs(String input) {
		recursivePrint(input,0,"");
	}

	private static void recursivePrint(String input, int i, String stringTillNow) {
		if(i==input.length()){
			System.out.println(stringTillNow);
			return;
		}
		
		for(int j=i+1; j<=input.length(); j++){
			recursivePrint(input, j, stringTillNow+"("+input.substring(i, j)+")");
		}
	}

}
