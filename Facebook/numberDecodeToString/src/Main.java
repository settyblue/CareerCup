/**
 * https://www.careercup.com/question?id=5659801074794496
 * 
 * You are given a string "abc" which is encoded like "123" where alphabets are mapped like a => 1 to z => 26. Now find out how many string can be formed by reverse engineering encode string "123". 
 * 
 * For ex. given string "123" we can form 3 string "abc"(1,2,3), "lc" (i.e 12,3), "aw"(1,23). 
 * 
 * for string "1234" we have following possible combinations, I might be missing some of them but you get the idea 
 * 
 * {12, 3, 4} 
 * {1, 23, 4} 
 * {1, 2, 3, 4}
 */

/**
 * @author rakshith
 *
 */
public class Main {

	public static void main(String[] args) {
		//String s = "1234"; //3
		//String s = "5555"; //1
		String s = "11111"; //8
		System.out.println("Number of possible decodes : "+countOfPossibleDecodes(s));
		
	}
	
	public static int countOfPossibleDecodes(String s){
		int count=0;
		if(s.length()==1){
			return 1;
		}
		if(s.length()==0){
			return 1;
		}
		count = countOfPossibleDecodes(s.substring(1));
		if(s.charAt(0)=='1'){
			count += countOfPossibleDecodes(s.substring(2));
		}
		if(s.charAt(0)=='2' && s.charAt(1)<='6'){
			count += countOfPossibleDecodes(s.substring(2));
		}
		
		return count;
	}
}
