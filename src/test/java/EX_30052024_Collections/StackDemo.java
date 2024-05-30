package EX_30052024_Collections;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
Stack<String> stack = new Stack();
stack.push("A");
stack.push("B");
stack.push("C");
stack.push("D");
System.out.println(stack);
System.out.println(stack.pop());// Removes last added.
System.out.println(stack);

System.out.println(stack.peek());// Checks the last Item
System.out.println(stack);
	}

}
