import java.util.HashSet;
import java.util.Set;

/**
 * https://www.careercup.com/question?id=5663263489523712
 * given 2 strings A and B. generate all possible solutions 
 * when B is merged in A.
 * Ex: A = "hey", B="sam"
 * Output: [hseaym, hseyam, hesaym, heysam, shaemy, shamey, sahemy, samhey].
 * Note: The order of letters in "hey" and "sam" remain same.
 */


/**
 * @author rakshith
 *
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String A = "hey";
		String B = "sam";
		Set<String> result = new HashSet<String>();
		getMergedStrings(A,B,result);
		print(result);
	}

	private static void getMergedStrings(String a, String b, Set<String> result) {
		String c = "";
		mergeStringRecursive(a,b,c,result);
	}

	private static void mergeStringRecursive(String a, String b, String c, Set<String> result) {
		if(a.length()==0 && b.length()==0){
			result.add(c);
		}else if(a.length()==0){
			result.add(c+b);
		}else if(b.length()==0){
			result.add(c+a);
		}else{
			for(int i=0; i<b.length(); i++){
				String x = b.substring(0, i);
				mergeStringRecursive(a.substring(1,a.length()),b.substring(i,b.length()),c+x+a.charAt(0), result);
			}
		}
	}

	private static void print(Set<String> result) {
		for(String s:result){
			System.out.println(s);
		}
	}
}
