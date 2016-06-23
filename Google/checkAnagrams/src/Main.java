import java.util.HashMap;
/**
 * https://www.careercup.com/question?id=5968485823807488
 * 
 * Check if two given words are anagrams of each other.
 */

/**
 * @author rakshith
 *
 */
public class Main {

	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "heol";
		
		if(areAnagrams(s1, s2)){
			System.out.println("The given strings are anagrams.");
		}else{
			System.out.println("The given strings are not anagrams.");
		}
	}

	private static boolean areAnagrams(String s1, String s2) {
		HashMap<Character,Integer> map = new HashMap<Character, Integer>();
		if(s1.length() != s2.length()){
			return false;
		}
		for(int i=0; i<s1.length(); i++){
			if(map.containsKey(s1.charAt(i))){
				map.put(s1.charAt(i), map.get(s1.charAt(i))+1);
			}else{
				map.put(s1.charAt(i), 1);
			}
		}
		
		for(int i=0; i<s2.length(); i++){
			if(map.containsKey(s2.charAt(i)) && map.get(s2.charAt(i)) > 0){
				map.put(s2.charAt(i), map.get(s2.charAt(i))-1);
			}else{
				return false;
			}
		}
		return true;
	}

}
