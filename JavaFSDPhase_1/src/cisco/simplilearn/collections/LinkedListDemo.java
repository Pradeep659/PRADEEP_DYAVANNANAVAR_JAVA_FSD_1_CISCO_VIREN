package cisco.simplilearn.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;



public class LinkedListDemo {

	public static void main(String[] args) {
		
		int a1 = 5;
		
		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("January");
		ll.add("March");
		ll.add("May");
		ll.add("July");
		ll.add("March");
		
		System.out.println(ll);
		
		ll.set(3, "December");
		
		ll.addFirst("Hello");
		System.out.println(ll);
		ll.add(5,"August");
		ll.remove(3);
		System.out.println(ll);
		
			Iterator itr = ll.iterator();
			while(itr.hasNext())
			{
				System.out.println("list is: " + itr.next());
			}
			
			System.out.println(ll);
			System.out.println("size of the linked list: " + ll.size());
			System.out.println("Is LinkedList empty? " + ll.isEmpty());
			System.out.println("Does LinkedList contains 'September'? " + ll.contains("september"));
			
			
			Vector<String> v = new Vector<String>();
			
			v.add("Jaipur");
			v.add("Delhi");
			v.add("Mumbai");
			
			Iterator itr1 = v.iterator();
			while(itr1.hasNext())
			{
				System.out.println("Vector is: " + itr1.next());
			}
			
		
	}
}
