import java.util.HashMap;
/**
 * https://www.careercup.com/question?id=5727863133175808
 * 
 * Taxi cab numbers
 * Write all solutions for a^3+b^3 = c^3 + d^3, where a, b, c, d lie 
 * between [0, 10^5] in at least O(n^2) complexity
 */

/**
 * @author rakshith
 *
 */
public class Main {
	
	public static class Pair{
		int a,b;
		Pair(int a, int b){
			this.a = a;
			this.b = b;
		}
		public String toString(){
			return "("+this.a+", "+this.b+")";
		}
	}
	public static void main(String[] args) {
		int n = 100000;
		printTaxiCabNumbers(n);
	}

	private static void printTaxiCabNumbers(int n) {
		HashMap<Integer, Pair> map = new HashMap<Integer, Pair>();
		for(int i=0; i<n; i++){
			for(int j=i+1; j<n; j++){
				int m = (int) (Math.pow(i, 3)+Math.pow(j, 3));
				if(map.containsKey(m)){
					System.out.println(new Pair(i,j).toString()+" and "+map.get(m).toString());
				}else{
					map.put((int) (m), new Pair(i,j));
				}
			}
		}
	}

}
