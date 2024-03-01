package collections;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
       Stack<String> stack = new Stack<>();
       
       stack.push("Swati");
       stack.push("Vayu");
       stack.push("Vardaan");
       stack.push("Ankit");
       stack.push("Nikhil");
       
       System.out.println("Stack : " + stack);
       
       // To remove the first element from the stack
       String firstPoppedElement = stack.pop();
       System.out.println("Popped Element: " + firstPoppedElement);
       
       System.out.println("Now the stack looks like: " + stack);
       
		// To remove the second element from the stack
       String secondPoppedElement = stack.pop();
       System.out.println("Second popped element: " + secondPoppedElement);
       
       System.out.println("Now the stack looks like: " + stack);
       
       // Peek is used to print the top element not to remove any element like pop
       
       String peekedElement = stack.peek();
       System.out.println("Peeked element from the stack: " + peekedElement);
       
       System.out.println("Now the stack looks like: " + stack);
	}

}
