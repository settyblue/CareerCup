/**
 * https://www.careercup.com/question?id=5693718846767104
 * 
 * Return the length of longest possible chunked palindrome string. 
 * 
 * Examples : 
 * Input : VOLVO 
 * Output : 3 
 * Explanation : 
 * (VO)L(VO) 
 * 
 */

/**
 * @author rakshith
 *
 */
public class Main {

	public static void main(String[] args) {
		//String s = "antaprezatepzapreanta";
		//String s = "antaprezatpzapreanta";
		//String s = "ap";
		//String s = "ghiabcdefhelloadamhelloabcdefghi";
		String s = "antaprezazapreanta";
		
		System.out.println(longestChunkPalindromeSize2(s));

	}
	
	public static int longestChunkPalindromeSize2(String s){
		if(s.length()==0){
			return 0;
		}
		if(s.length()==1){
			return 1;
		}
		
		String left = "";
		String right = "";
		int i=0, j=s.length()-1;
		while(i<j){
			left = left+s.charAt(i);
			right = s.charAt(j)+right;
			if(left.equals(right)){
				System.out.println(left+" "+right);
				break;
			}
			i++;j--;
		}
		if(i==j){
			return 1;
		}
		if(i>j){
			return 1;
		}
		return longestChunkPalindromeSize2(s.substring(i+1,j))+2;
	}
}
