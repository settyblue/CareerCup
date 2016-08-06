/**
 * https://www.careercup.com/question?id=5763139615326208
 * http://www.geeksforgeeks.org/find-if-given-matrix-is-toeplitz-or-not/
 *
 * A matrix is "Toepliz" if each descending diagonal from left to right is constant. Given an M x N matrix write the method isToepliz to determine if a matrix is Toepliz. 
 * 
 * Example: 
 * Input: 
 * 67892 
 * 46789 
 * 14678 
 * 01467 
 * 
 * Output: 
 * True
 */

/**
 * @author rakshith
 *
 */
public class Main {

	public static void main(String[] args) {
		int[][] matrix = {{6, 7, 8, 9, 2},
						  {4, 6, 7, 8, 9},
						  {1, 4, 6, 7, 8},
						  {0, 1, 3, 6, 7}};
		
		if(checkToepliz(matrix)){
			System.out.println("It is toepliz matrix.");
		}else{
			System.out.println("It is not a toepliz matrix.");
		}
	}
	
	public static boolean checkToepliz(int[][] matrix){
		for(int i=0; i<matrix.length-1; i++){
			for(int j=0; j<matrix[0].length-1; j++){
				if(matrix[i][j] != matrix[i+1][j+1]){
					return false;
				}
			}
		}
		return true;
	}
}
