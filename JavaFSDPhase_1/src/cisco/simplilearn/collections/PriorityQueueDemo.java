package cisco.simplilearn.collections;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
	
	public static void main(String[] args) {
		PriorityQueue queue = new PriorityQueue();
		
		queue.add("India");
		queue.add("Australia");
		queue.add("Japan");
		queue.add("Italy");
		queue.add("England");
		queue.add("Srilanka");
		queue.add("France");
		
		System.out.println("Priority queue elements: " + queue);
		queue.remove();
		queue.poll();
		System.out.println(queue.add("Spain"));
		System.out.println(queue.add("Malayasia"));
		System.out.println(queue);
		System.out.println(queue.peek());
	}

}
