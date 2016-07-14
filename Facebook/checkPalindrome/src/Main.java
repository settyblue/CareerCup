/**
 * https://www.careercup.com/question?id=5085545090777088
 * 
 * Given a string containing letter, digit, and other characters, write a function to check palindrome for only letter and digit. The implementation need to be in-place, no extra memory is allowed to create another string or array. 
 * For example: 
 * 
 * "ABA" is palindrome 
 * "A!#A" is palindrome 
 * "A man, a plan, a canal, Panama!" is palindrome
 */

/**
 * @author rakshith
 *
 */
public class Main {

	public static void main(String[] args) {
		//String s = "A!#A";
		//String s = "A";
		//String s = "AA";
		//String s = "A$";
		String s = "A man, a plan, a canal, Panama!";
		if(isPalindrome(s)){
			System.out.println("Given string is palidrome.");
		}else{
			System.out.println("Given string is not a palindrome.");
		}

	}
	
	public static boolean isPalindrome(String s){
		int head=0,tail=s.length()-1;
		while(head < tail){
			while(!Character.isLetterOrDigit(s.charAt(head)) && head<tail ){
				head++;
			}
			while(!Character.isLetterOrDigit(s.charAt(tail)) && head<tail){
				tail--;
			}
			if(Character.toLowerCase(s.charAt(head))!=Character.toLowerCase(s.charAt(tail)) && head<tail){
				return false;
			}else{
				head++;tail--;
			}
		}
		return true;
	}
}
