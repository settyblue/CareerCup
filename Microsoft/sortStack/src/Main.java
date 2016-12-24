import java.util.Stack;

/**
 * https://www.careercup.com/question?id=5713851707293696
 * 
 * Sort a stack using only one other stack and no recursion.
 */

/**
 * @author rakshith
 *
 */
public class Main {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(4);stack.push(5);stack.push(2);stack.push(11);stack.push(8);
		System.out.println(stack);
		System.out.println(sort(stack));
	}
	
	public static Stack<Integer> sort(Stack<Integer> stack){
		Stack<Integer> newStack = new Stack<Integer>();
		
		while(!stack.isEmpty()){
			int temp = stack.pop();
			while(!newStack.isEmpty() && newStack.peek() > temp){
				stack.push(newStack.pop());
			}
			newStack.push(temp);
		}
		
		return newStack;
	}
}
