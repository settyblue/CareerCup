import java.util.Arrays;
import java.util.Comparator;

/**
 * https://www.careercup.com/question?id=5145370309951488
 * 
 * Given two object arrays of "id,weight" (sorted by weight), 
 * merge them together and create a one single array. 
 * If the "id"s are same values should be merged. Final 
 * resulting array should be sorted by weight. 
 * Result should be O(nlogn) in time complexity.
 */

/**
 * @author rakshith
 *
 */
public class Main {

	public static void main(String[] args) {
		Item[] array1 = {new Item(2,5),new Item(5,10),new Item(1, 10), new Item(4,12)};
		Item[] array2 = {new Item(3,7),new Item(2,10),new Item(1, 10)};
		
		print(array1);print(array2);
		mergeAndPrint(array1,array2);
	}
	
	public static class Item {
		int id, weight;
		Item(int id, int weight){
			this.id = id;
			this.weight = weight;
		}
		public String toString(){
			return "("+id+", "+weight+")";
		}
	}
	
	public static class compareById implements Comparator<Item>{
		public int compare(Item i1, Item  i2) {
			return i1.id - i2.id;
		}
	}
	
	public static class compareByWeight implements Comparator<Item>{
		public int compare(Item i1, Item  i2) {
			return i1.weight - i2.weight;
		}
	}
	
	public static void print(Item[] array){
		System.out.println(Arrays.toString(array));
	}
	
	public static void mergeAndPrint(Item[] array1, Item[] array2){
		Item[] result = new Item[array1.length + array2.length];
		System.arraycopy(array1, 0, result, 0, array1.length);
		System.arraycopy(array2, 0, result, array1.length, array2.length);
		Arrays.sort(result,new compareById());
		int count = 0;
		for(int i=1; i<result.length; i++){
			if(result[count].id == result[i].id){
				result[count].weight += result[i].weight;
			}else{
				count++;
				result[count] = result[i];
			}
		}
		result = Arrays.copyOf(result, count+1);
		Arrays.sort(result,new compareByWeight());
		print(result);
	}
}
