/**
 * https://www.careercup.com/question?id=5697293959299072
 * 
 * A robot has to move in a grid which is in the form of a matrix. It can go to 
 * 1.) A(i,j)--> A(i+j,j) (Down) 
 * 2.) A(i,j)--> A(i,i+j) (Right) 
 * 
 * Given it starts at (1,1) and it has to go to A(m,n), 
 * find the minimum number of STEPS it has to take to get to (m,n) and write 
 * public static int minSteps(int m,int n) 
 * 
 * For instance to go from (1,1) to m=3 and n=2 it has to take 
 * (1, 1) -> (1, 2) -> (3, 2) i.e. 2 steps
 * 
 */

/**
 * @author rakshith
 *
 */
public class Main {

	public static void main(String[] args) {
		int m=3,n=4;
		//Assuming robot always starts from (1,1).
		System.out.println("Minimum number of steps required :"+minRobotSteps(m,n));

	}
	
	public static int minRobotSteps(int m, int n){
		int count = 0;
		boolean noSolution=false;
		while( m!=1 || n!=1 ){
			if(m==0 || n==0){
				noSolution=true;
				break;
			}
			if(m>n){
				m=m-n;
				count++;
			}else{
				n=n-m;
				count++;
			}
		}
		if(noSolution){
			System.out.println("No solution exists.");
			return -1;
		}
		return count;
	}

}
