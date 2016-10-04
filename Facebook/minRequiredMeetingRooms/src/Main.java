import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

/**
 * https://www.careercup.com/question?id=6277103186083840
 * 
 * write a function that calculates the minimum number of meeting rooms 
 * that can accommodate all the given schedules 
 * input: same 
 * output: # of rooms 
 * Also back to back events are allowed e.g. {2,5} {5,9} correct o/p:1
 */

/**
 * @author rakshith
 *
 */
public class Main {

	public static void main(String[] args) {
		int[][] schedules = {{5,9},{5,7},{2,5},{3,12},{3,5},{1,15}};
		System.out.println("Minimum number of meeting rooms required is :" + minMeetingRooms(schedules));
	}
	
	public static int minMeetingRooms(int[][] schedules){
		ArrayList<Integer> array = new ArrayList<Integer>(schedules.length*2);
		for(int i=0;i<schedules.length; i++){
			array.add(schedules[i][0]);
			array.add(schedules[i][1]*(-1));
		}
		
		Collections.sort(array, new Comparator<Integer>(){
			public int compare(Integer a, Integer b){
				if(Math.abs(a) != Math.abs(b))
					return Math.abs(a) - Math.abs(b);
				else 
					return a - b;
			}
		});
		
		System.out.println(array.toString());
		
		int minRooms = 0;
		int curRooms = 0;
		for(int i=0; i<array.size(); i++){
			if(array.get(i) > 0){
				curRooms++;
				minRooms = Math.max(minRooms, curRooms);
			}else{
				curRooms--;
			}
		}
		return minRooms;
	}
}
