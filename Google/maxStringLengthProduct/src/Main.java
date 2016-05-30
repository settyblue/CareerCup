import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/**
 * https://www.careercup.com/question?id=5113734827606016
 * Given an array of words (i.e. ["ABCW", "BAZ", "FOO", "BAR", "XTFN", 
 * "ABCDEF"]), find the max value of length(s) * length(t), 
 * where s and t are words from the array. 
 * The catch here is that the two words cannot share any characters. 
 * 
 * Assume that there are many words in the array (N words) 
 * and average length of word is M. 
 * Answer for the example above is "ABCW" and "XTFN" as the result 
 * is 4 * 4 = 12. 
 *
 * "ABCW" and "ABCDEF" do not work since they share similar characters.
 */

/**
 * @author rakshith
 *
 */
public class Main {

	public static void main(String[] args) {
		String[] array = {"ABCW", "BAZ", "FOO", "BAR", "XTSN", "ABCDEF"};//Answer = 24.
		System.out.println("Maximum product is : "+maxProduct(array));
	}
	
	//Brute force implementation.
	private static int maxProduct(String[] array) {
		int maxProduct=1;
		ArrayList<HashSet<Character>> list = new ArrayList<>();
		
		for(int i=0; i<array.length; i++){
			list.add(new HashSet<Character>());
			for(int j=0; j<array[i].length(); j++){
				list.get(i).add(array[i].charAt(j));
			}
		}
		
		for(int i=0; i<list.size(); i++){
			for(int j=1; j<list.size(); j++){
				HashSet<Character> intersection = new HashSet<Character>(list.get(i)); // use the copy constructor
				intersection.retainAll(list.get(j));
				if(intersection.size()==0){
					maxProduct = Math.max(maxProduct, array[i].length()*array[j].length());
				}
			}
		}
		return maxProduct;
	}

}
