/**
 * https://www.careercup.com/question?id=5673390490779648
 * 
 * Counting the islands. 
 * 
 * Given a map N x N, 2-D array 
 * 0 - sea 
 * 1 - land 
 * 
 * Land is connected by 4-Neighbor connections, i.e.: above, down, left and right. 
 */


public class Main {

	public static void main(String[] args) {
		int[][] array = {{0, 1, 1, 0, 1},
						 {1, 1, 0, 0, 1},
						 {0, 0, 0, 1, 0},
						 {1, 1, 0, 1, 1}};
		System.out.println("Number of islands is "+getNumberOfislands(array.clone()));
	}

	private static int getNumberOfislands(int[][] array) {
		int count = 0;
		
		for(int i=0;i< array.length; i++){
			for(int j=0; j<array[0].length; j++){
				if(array[i][j] == 1){
					count++;
					explore(array,i,j);
				}
			}
		}
		return count;
	}

	private static void explore(int[][] array, int i, int j) {
		if(array[i][j] == 1){
			array[i][j] = 0;
			if(i-1>=0)explore(array,i-1,j);
			if(i+1<array.length)explore(array,i+1,j);
			if(j-1>=0)explore(array,i,j-1);
			if(j+1<array[0].length)explore(array,i,j+1);
		}else{
			return;
		}
	}

}
