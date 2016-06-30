/**
 * https://www.careercup.com/question?id=5647476964982784
 * 
 * Given a sorted array, find a way to find the # of occurrence of a number 
 * for eg: [1, 1, 2, 3, 3, 3, 4, 5] 
 * find # of occurrence of 3 in time better than O(n)
 */

/**
 * @author rakshith
 *
 */
public class Main {

	public static void main(String[] args) {
		int[] array = {1, 1, 2, 3, 3, 3, 4, 5};
		int n=5;
		System.out.println("Count of number n in array : "+numCountInArray(array,n));
	}

	private static int numCountInArray(int[] array, int n) {
		int begin, end;
		int beginIndex=0,endIndex=array.length-1;
		int midIndex = (beginIndex + endIndex)/2;
		
		while(beginIndex < endIndex){
			if(array[midIndex] < n){
				beginIndex = midIndex+1;
			}else{
				endIndex = midIndex;
			}
			midIndex = (beginIndex + endIndex)/2;
		}
		
		if(array[midIndex] == n){
			begin = midIndex;
		}else{
			begin = midIndex+1;
		}
		
		beginIndex=0;endIndex=array.length-1;
		midIndex = (beginIndex + endIndex)/2;
		while(beginIndex < endIndex){
			if(n < array[midIndex]){
				endIndex = midIndex;
			}else{
				beginIndex = midIndex+1;
			}
			midIndex = (beginIndex + endIndex)/2;
		}
		
		if(array[midIndex] == n){
			end = midIndex+1;
		}else{
			end = midIndex;
		}
		System.out.println(begin+" "+end);
		return end-begin;
	}

}
