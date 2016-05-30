/**
 * https://www.careercup.com/question?id=5713892824055808
 * How many Fibonacci numbers exists less than a given number n.
 * example: n=6
 * answer: 6 as {0,1,1,2,3,5}
 */

/**
 * @author rakshith
 *
 */
public class Main {

	public static void main(String[] args) {
		int n=0;
		System.out.println("Count of fibonacci numbers less than "+n+" is "+countFibonacci(n));

	}

	private static int countFibonacci(int n) {
		int a=0,b=1;
		int count=1;
		for(;b<=n;b=a+b,a=b-a,count++);
		return count;
	}

}
