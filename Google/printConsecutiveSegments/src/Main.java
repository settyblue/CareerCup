/**
 * https://www.careercup.com/question?id=5693954190213120
 * 
 * Number list compressing. 
 * Given an sorted array. Input: sorted number list 
 * 1, 2, 3,10, 25, 26, 30, 31, 32, 33 
 * 
 * Output: find consecutive segments 
 * print: 1-3, 10, 25-26, 30-33
 */

/**
 * @author rakshith
 *
 */
public class Main {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3,10, 25, 26, 30, 31, 32, 33, 45};
		printConsecutiveSegments(array);
	}

	private static void printConsecutiveSegments(int[] array) {
		boolean newSegment = true;
		int segCount = 0;
		for(int i=0; i<array.length; i++){
			if(newSegment){
				segCount = 1;
				System.out.print(array[i]);
			}
			if(i==array.length-1){
				if(segCount!=1){
					System.out.print("-"+array[i]);
				}
				return;
			}
			if(array[i+1]-array[i] != 1){
				newSegment = true;
				if(segCount != 1){
					System.out.print("-"+array[i]+",");
				}else{
					System.out.print(",");
				}
				
			}else{
				segCount++;
				newSegment = false;
			}
		}
	}

}
