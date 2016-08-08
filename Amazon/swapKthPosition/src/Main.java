/**
 * https://www.careercup.com/question?id=5637167285010432
 * 
 * Swap the elements in Kth position from the start and end of a link list. 
 * ex: 
 * input: list: 1,2,4,5,7,8 & K=2 
 * output: 1,7,4,5,2,8
 */

/**
 * @author rakshith
 *
 */
public class Main {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>(10);
		list.add(20);list.add(30);list.add(40);list.add(50);list.add(60);list.add(70);
		int k = 8;
		list.printLinkedList();
		swap(list,k);
		list.printLinkedList();
	}
	
	public static void swap(LinkedList list, int k){
		if(list.getCount()<k){
			System.out.println("Unable to swap.");
			return;
		}else{
			int count=0;
			Node to = null;
			Node from = null;
			Node temp = list.head;
			while(temp != null){
				if(count==k){
					from = temp;
					to = list.head;
				}else if(count>k){
					to = to.next;
				}
				count++;
				temp = temp.next;
			}
			System.out.println(to.data+" "+from.data);
			swap(from,to);
		}
	}
	
	public static void swap(Node n1, Node n2){
		Node temp = new Node(n1);
		temp.data = n1.data;
		n1.data = n2.data;
		n2.data = temp.data;
		
	}
}
