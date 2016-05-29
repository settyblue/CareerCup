import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * https://www.careercup.com/question?id=5648257217724416
 * A list L is too big to fit in memory. L is partially sorted. 
 * Partially sorted in a specific way: 
 * x-sorted L[i] < L[i+x]. 
 * Any element is at most x indices out of position. 
 * You can look at the condition in a different way too.. 
 * L[i] >= L[i-x]
 *
 * Sort the list L.
 */

/**
 * @author rakshith
 *
 */
public class Main {

	public static void main(String[] args) {
		int[] array = {2,3,1,7,8,4,5,9,6};
		int k=3;
		List<Integer> sortedList = new ArrayList<Integer>();
		
		sort(array,sortedList,k);
		print(sortedList);
	}

	private static void sort(int[] array, List<Integer> sortedList, int k) {

		PriorityQueue<Integer> queue = new PriorityQueue<Integer>(array.length, new Comparator<Integer>(){
			public int compare(Integer a, Integer b) {
				return Integer.compare(a, b);
			}
		});
		k++;
		int i;
		for(i=0; i<k; i++){
			queue.add(array[i]);
		}
		
		while(i < array.length){
			sortedList.add(queue.poll());
			queue.add(array[i]);
			i++;
		}
		for(i=0; i<k; i++){
			sortedList.add(queue.poll());
		}
	}

	private static void print(PriorityQueue<Integer> queue) {
		System.out.println(queue.toString());
	}

	private static void print(List<Integer> sortedList) {
		for(int i=0;i<sortedList.size();i++){
			System.out.print(sortedList.get(i)+" ");
		}
		System.out.println();
	}

}
