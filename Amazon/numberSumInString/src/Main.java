/**
 * https://www.careercup.com/question?id=5748922686373888
 * 
 * How to calculate sum of all numbers in a string. 
 * Example 11aa22bb33dd44 = 110 
 * Note: Should not use Regex and replace 
 */

/**
 * @author rakshith
 *
 */
public class Main {

	public static void main(String[] args) {
		String s = "11aa22bb33dd44S"; //110
		System.out.println("The string sum is "+stringSum(s));
	}
	
	public static int stringSum(String s){
		int sum = 0, curNumber = 0;
		for(int i=0; i<s.length();i++){
			if(Character.isDigit(s.charAt(i))){
				curNumber = curNumber*10 + (s.charAt(i)-'0');
			}else{
				sum += curNumber;
				curNumber = 0;
			}
		}
		return sum+curNumber;
	}
}
