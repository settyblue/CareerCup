/**
 * https://www.careercup.com/question?id=5143327210995712
 * 
 * You are given a list of array float numbers x_1, x_2, x_3, ... x_n, where x_i > 0. 
 * A traveler starts at point (0, 0) and moves x_1 metres to the north, 
 * then x_2 metres to the west, x_3 to the south, x_4 to the east and so on 
 * (after each move his direction changes counter-clockwise) 
 * Write an single-pass algorithm that uses O(1) memory to determine, 
 * if the travelers path crosses itself, or not (i.e. if it's self-intersecting) 
 * 
 * e.g. 
 * 2 1 1 2 -> crosses 
 * 1 2 3 4 -> doesn't cross
 */

/**
 * @author rakshith
 *
 */
public class Main {

	public static void main(String[] args) {
		//int[] array = new int[] { 2, 2, 2, 1 }; // No 
        //int[] array = new int[] { 2, 2, 2, 2 }; // Yes
        //int[] array = new int[] { 3, 2, 2, 3 }; // Yes
        //int[] array = new int[] { 3, 3, 2, 2, 3 }; // Yes
        //int[] array = new int[] { 2, 2, 4, 5, 1, 4 }; // No 
        //int[] array = new int[] { 2, 2, 4, 5, 3, 4 }; // Yes
        int[] array = new int[] { 1, 2, 4, 5, 1, 4 }; // No 
		
		printIfIntersects(array);
	}

	private static void printIfIntersects(int[] array) {
		for(int i=3; i<array.length; i++){
			if(i >= 3 &&
			   array[i-1] <= array[i-3] &&
			   array[i] >= array[i-2]){
				System.out.println("The path intersects.");
				return;
			}
			if(i >= 5 &&
			   array[i-3] > array[i-5] &&
			   array[i-2] > array[i-4] &&
			   array[i-1] > (array[i-3] - array[i-5]) &&
			   array[i] > (array[i-2] - array[i-4])){
				System.out.println("The path intersects.");
				return;
			}
		}
		System.out.println("No path intersects.");
		
		return;
	}

}
