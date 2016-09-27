/**
 * https://www.careercup.com/question?id=5696794451247104
 * 
 * Implement stairs(N) that (collect the solutions in a list) prints all the ways to climb up a N-step-stairs 
 * where one can either take a single step or double step. 
 * We'll use 1 to represent a single step, and 2 to represent a double step. 
 * 
 * 
 * stairs(3) 
 * 111 
 * 12 
 * 21
 */

/**
 * @author rakshith
 *
 */
public class Main {

	public static void main(String[] args) {
		int n=5;
		printPossibleSteps(n);

	}

	public static void printPossibleSteps(int n){
		printSteps("",n);
	}
	
	public static void printSteps(String soFar, int remainingSteps){
		if(remainingSteps > 0){
			printSteps(soFar+" 1",remainingSteps-1);
			printSteps(soFar+" 2",remainingSteps-2);
		}else if(remainingSteps==0){
			System.out.println(soFar);
		}
	}
}
