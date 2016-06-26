import java.util.ArrayList;
import java.util.Arrays;

/**
 * https://www.careercup.com/question?id=5751343965798400
 * 
 * 
 */

/**
 * @author rakshith
 *
 */
public class Main {

	public static void main(String[] args) {
		//int[] array = {6,11,101,15,105,110};
		int[] array = {6,11,12,15,16,21};
		printOriginalArray(array);
	}
	
	public static void printOriginalArray(int[] array){
		Arrays.sort(array);
		int n = (int) Math.sqrt((double)array.length*2)+1;
		int smallest = 0;
		ArrayList<Integer> list, answer;
		list = new ArrayList<Integer>();
		answer = new ArrayList<Integer>();
		boolean isSolution = true;
		while(smallest <= array[0]/2){
			list = new ArrayList<Integer>();
			
			isSolution = true;
			
			for(int i=0; i<array.length; i++){
				list.add(array[i]);
			}
			
			answer = new ArrayList<Integer>();
			answer.add(smallest);
			int nextIndex = 0;
			for(int i=1; i<n; i++){
				int newElement = list.get(nextIndex) - smallest;
				for(int j=0; j<answer.size(); j++){
					if(!list.remove(Integer.valueOf(newElement+answer.get(j)))){
						isSolution = false;
					}
				}
				if(!isSolution){
					break;
				}
				answer.add(newElement);
				//System.out.println(answer);
			}
			if(isSolution){
				break;
			}
			smallest++;
		}
		if(isSolution){
			System.out.println(answer);
		}else{
			System.out.println("No solution exists.");
		}
		
	}

}
