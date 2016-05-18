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
		int[][] array = {{1,2,4},{3,2,3}}; 
		//matrixSort(array);//Trivial Solution.
		matrixSort2(array);//Solution to obtain unique elements in both rows and columns.
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
	
	//Traverse along diagonal while placing the elements back from temp to the array.
	//Both row and column will have unique elements given such a solution exists.
	private static void matrixSort2(int[][] array) {
		int rowCount = array.length;
		int colCount = array[0].length;
		int[] temp = new int[rowCount*colCount];
		for(int r=0; r<rowCount; r++){
			for(int c=0; c<colCount; c++){
				temp[r*colCount+c] = array[r][c];
			}
		}

		Arrays.sort(temp);
		//int indexSum=0;
		int j,k=0;
		for(int indexSum=0; indexSum<rowCount+colCount-1; indexSum++){
			for(int i=0;i<rowCount; i++){
				j = indexSum - i;
				if(0<=j && j<colCount){
					array[i][j] = temp[k];
					k++;
				}
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
