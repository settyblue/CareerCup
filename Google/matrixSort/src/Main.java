import java.util.Arrays;
import java.util.Collections;

/**
 * Given a 2D matrix of integers, sort it such that: 
 *
 * - every row is sorted in ascending order from left to right 
 * - every column is sorted in ascending order from top to down 
 * - all items in the same row are unique 
 *
 * You may assume the input matrix is always valid, meaning that such a sort is always possible. 
 */


/**
 * @author rakshith
 *
 */
public class Main {

	public static void main(String[] args) {
		int[][] array = {{1,2,5},{3,2,3}}; 
		matrixSort(array);
		print(array);
	}
	
	//This is a trivial solution.
	private static void matrixSort(int[][] array) {
		int rowCount = array.length;
		int colCount = array[0].length;
		int[] temp = new int[rowCount*colCount];
		for(int r=0; r<rowCount; r++){
			for(int c=0; c<colCount; c++){
				temp[r*colCount+c] = array[r][c];
			}
		}
		
		Arrays.sort(temp);
		for(int c=0; c<colCount; c++){
			for(int r=0; r<rowCount; r++){
				array[r][c] = temp[c*rowCount + r];
			}
		}
		
	}

	private static void print(int[][] array) {
		int rowCount = array.length;
		int colCount = array[0].length;
		for(int r=0; r<rowCount; r++){
			for(int c=0; c<colCount; c++){
				System.out.print(array[r][c]+" ");
			}
			System.out.println();
		}
	}

}
