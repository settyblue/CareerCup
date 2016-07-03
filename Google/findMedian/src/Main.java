import java.util.Comparator;
import java.util.PriorityQueue;
/**
 * https://www.careercup.com/question?id=4924808426946560
 * Given an array of integers find median.
 */

/**
 * @author rakshith
 *
 */
public class Main {

	public static void main(String[] args) {
		int[] array = {12, 10, 2, 23, 3, 4, 100, 101, 1};
		System.out.println("The median is "+getMedian(array));
	}

	private static int getMedian(int[] array) {
		PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
		PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(array.length,
				new Comparator<Integer>(){
			public int compare(Integer a, Integer b){
				if(a < b) return 1;
				if(a > b) return -1;
				return 0;
			}
		});
		
		if(array[0] < array[1]){
			minHeap.add(array[1]);
			maxHeap.add(array[0]);
		}else{
			minHeap.add(array[0]);
			maxHeap.add(array[1]);
		}
		
		for(int i=2; i<array.length; i++){
			if(array[i] < maxHeap.peek()){
				maxHeap.add(array[i]);
			}else if(array[i] > minHeap.peek()){
				minHeap.add(array[i]);
			}else{
				minHeap.add(array[i]);
			}
			
			if(Math.abs(minHeap.size() - maxHeap.size()) > 1){
				if(minHeap.size() > maxHeap.size()){
					maxHeap.add(minHeap.poll());
				}else{
					minHeap.add(maxHeap.poll());
				}
			}
		}
		
		System.out.println(maxHeap.toString());
		System.out.println(minHeap.toString());
		if(array.length % 2 == 0){
			return (maxHeap.peek()+minHeap.peek())/2;
		}else{
			return maxHeap.size() > minHeap.size() ? maxHeap.peek(): minHeap.peek();
		}
	}
}