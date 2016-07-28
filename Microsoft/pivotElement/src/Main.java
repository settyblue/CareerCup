/**
 * https://www.careercup.com/question?id=5703298884567040
 * https://www.careercup.com/question?id=5665792839385088  -- i think its the same; not sure.
 * Given an array of ints (positive numbers) find out the index 
 * that balances the array. If no such index exists, return the 
 * index that minimizes the difference. 
 * 
 * How can you do it by touching each element only once.
 */

/**
 * @author rakshith
 *
 */
public class Main {

	public static void main(String[] args) {
		//int[] array = {2, 5, 1, 1, 3, 4, 1};
		//int[] array = {1, 2, 2};
		int[] array = {1, 1, 1, 1, 1};
		//int[] array = {2, 5, 1, 3, 4, 1};
		//int[] array = {10, 1, 2, 3, 4};
		
		System.out.println("pivot element is  = "+pivotElement1(array));

	}
	
	public static int pivotElement(int[] array){
		int left=1, right=array.length-1;
		int leftSum=array[0],rightSum=0;
		while(left<right){
			if(leftSum < rightSum){
				leftSum += array[left];
				left++;
			}else{
				rightSum += array[right];
				right--;
			}
		}
		return left;
	}
	
	public static boolean pivotElement1(int[] array){
		int left=1, right=array.length-1;
		int leftSum=array[0],rightSum=0;
		while(left<right){
			if(leftSum < rightSum){
				leftSum += array[left];
				left++;
			}else{
				rightSum += array[right];
				right--;
			}
		}
		if(leftSum==rightSum && left==(array.length+1)/2){
			return true;
		}else 
			return false;
	}
}
