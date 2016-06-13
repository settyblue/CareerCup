import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * https://www.careercup.com/question?id=5723915160649728
 * Given a list of integers, find the highest value obtainable by concatenating these together. 
 * 
 * For example:
 * Given 9, 918, 917 - The answer is 9918917. 
 * But given 1,112,113 - The answer is 1131121
 */

/**
 * @author rakshith
 *
 */
public class Main {

	public static void main(String[] args) {
		//int[] array = {9, 918, 917}; 
		int[] array = {1, 112, 113};
		System.out.println("Concatenated maximum number is "+maxNumber(array));

	}
	
	private static String maxNumber(int[] array) {
		ArrayList<String> list = new ArrayList<String>();
		for(int i=0; i<array.length; i++){
			list.add(Integer.toString(array[i]));
		}
		
		Collections.sort(list, new Comparator<String>(){
			
			@Override
			public int compare(String a, String b){
				int m=a.length(), n=b.length();
				int i=0;
				char c1=a.charAt(0),c2=b.charAt(0);
				while(i < Math.max(m, n)){
					if(i<m)c1=a.charAt(i);
					if(i<n)c2=b.charAt(i);
					i++;
					if(c1==c2)continue;
					return c2-c1;
				}
				return 0;
			}
		});
		
		String result = "";
		for(int i=0; i<array.length; i++){
			result = result + list.get(i);
		}
		return result;
	}

}
