package collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        
        queue.add("America");
        queue.add("Germany");
        queue.add("India");
        queue.add("South Africa");
        queue.add("Europe");
        
        System.out.println("Original queue: " + queue);
        
        queue.remove();
        System.out.println("Queue after removing the head element: " + queue);
        
        // Peek is used to view the topmost element of the queue 
        String head = queue.peek();
        System.out.println("The topmost element is: " + head);
        
        // Poll is used to view and remove the topmost element of the queue simultaneously
        head = queue.poll();
        System.out.println("Topmost element which is viewed and removed: " + head);
        
        System.out.println("Now the queue looks something like this: " + queue);
        
	}

}
