/**
 * https://www.careercup.com/question?id=5682951373193216
 * You are given two arrays of length M and N having elements in range 0-9.
 * Your task is to create maximum number of length K from elements of these 
 * two arrays such that relative order of elements is same in the final 
 * number as in the array, they are taken from i.e. 
 * If two elements a,b are taken from array1 and and a comes before b 
 * in array1 so in the final number a should come before b 
 * (Relative order kept same).
 *  
 * Example: N=4 and M =6 
 * Array1 = { 3 , 4 , 6,5} 
 * Array2 ={9,1,2,5,8,3} 
 * Suppose K = 5, then number will be {9,8,6,5,3} 
 * 
 * You can see {9,8,3} are taken from array2 in the same order as they are in 
 * Array2. Similarly {6,5} are taken from Array1 in the same order and 
 * number 98653 is maximum possible number.
 */

/**
 * @author rakshith
 *
 */
public class Main {

	public static void main(String[] args) {
		int[] array1 = {3, 4, 6, 5};
		int[] array2 = {9, 1, 2, 5, 8, 3};
		int k=5;
		System.out.println("Highest number = "+highestNumber(array1, array2, k));
	}
	
	//implemented using Dynamic Programming.
	private static int highestNumber(int[] array1, int[] array2, int K) {
		int I=array1.length;
		int J=array2.length;
		int[][][] x = new int[K+1][I+1][J+1];
		
		for(int k=0; k<=K; k++){
			for(int i=0; i<=I; i++){
				for(int j=0; j<=J; j++){
					if(k==0 || i==0 || j==0){
						x[k][i][j]=0;
						continue;
					}
					x[k][i][j] = Math.max(
								 Math.max(x[k][i-1][j], x[k][i][j-1]),
								 Math.max(x[k-1][i-1][j]*10+array1[i-1], x[k-1][i][j-1]*10+array2[j-1])
								 );
				}
				
			}
		}
		return x[K][I][J];
	}

}
