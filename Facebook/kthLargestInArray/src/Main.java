import java.util.PriorityQueue;
/**
 * https://www.careercup.com/question?id=5663671083597824
 * 
 * Select kth largest value in the array. Given an unsorted array 
 * of size n, and a value k. Select the kth largest value from the array. 
 * 
 * For example: 
 * 
 * Array is [5, 3, 9, 1], n is 4 
 * k = 0 => 9 
 * k = 1 => 5 
 * k = 3 => 1
 */

/**
 * @author rakshith
 *
 */
public class Main {

	public static void main(String[] args) {
		int[] array = {5, 3, 9, 1};
		int k = 2;
		System.out.println(k+"th largest number is "+kthLargest(array,k));
	}
	
	public static int kthLargest(int[] array, int k){
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>(k+1);
		if(array.length < k+1){
			System.out.println("Array size is smaller than k.");
			return -1;
		}
		for(int i=0;i<k+1;i++){
			queue.add(array[i]);
		}
		for(int i=k; i<array.length; i++){
			if(array[i] > queue.peek()){
				queue.remove();
				queue.add(array[i]);
			}
		}
		
		return queue.peek();
	}

}
