import java.util.HashMap;
/**
 * https://www.careercup.com/question?id=5704645247762432
 * 
 * Given a Pattern and a dictionary, print out all the strings that match the pattern. 
 * where a character in the pattern is mapped uniquely to a character in the dictionary ( this is what i was given first). 
 * 
 * 1. ("abc" , <"cdf", "too", "hgfdt" ,"paa">) -> output = "cdf" 
 * 2. ("acc" , <"cdf", "too", "hgfdt" ,"paa">) -> output = "too", "paa"
 */

/**
 * @author rakshith
 *
 */
public class Main {

	public static void main(String[] args) {
		String[] dictionary = {"cdf", "too", "hgfdt" ,"paa"};
		String pattern = "acc";
		
		printMatchingPatterns(dictionary, pattern);
	}
	
	public static void printMatchingPatterns(String[] dictionary, String pattern){
		String patternCode = encode(pattern);
		for(String s: dictionary){
			if(encode(s).equals(patternCode)){
				System.out.println(s);
			}
		}
	}
	
	public static String encode(String s){
		StringBuilder code = new StringBuilder("");
		HashMap<Character,Integer> map = new HashMap<>();
		int count = 0;
		for(char c:s.toCharArray()){
			if(map.get(c) != null){
				code.append(map.get(c));
			}else{
				map.put(c, count);
				code.append(count);
				count++;
			}
		}
		return code.toString();
	}

}
