import java.util.Arrays;
import java.util.HashSet;
/**
 * https://www.careercup.com/question?id=5639359996887040
 * 
 * Given a List of Strings, return the number of sets of anagrams. 
 * 
 * For instance, given: 
 * <abc,cab,dac,beed,deb,few,acd> 
 * return 5.
 */

/**
 * @author rakshith
 *
 */
public class Main {

	public static void main(String[] args) {
		String[] array = {"abc","cab","dac","beed","deb","few","acd"};
		
		System.out.println("Number of anagram groups is "+numberOfAnagramGroups(array));
	}
	
	private static int numberOfAnagramGroups(String[] array) {
		HashSet<String> set = new HashSet<String>();
		for(int i=0; i<array.length; i++){
			char[] ca = array[i].toCharArray();
			Arrays.sort(ca);
			set.add(Arrays.toString(ca));
		}
		
		System.out.println(set.toString());
		return set.size();
	}

}
