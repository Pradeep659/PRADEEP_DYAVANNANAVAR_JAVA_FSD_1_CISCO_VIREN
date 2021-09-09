package cisco.simplilearnfourthdayassignments;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetClassAssignment {

	public static void main(String[] args) {
		
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		
		lhs.add("p");
		lhs.add("r");
		lhs.add("Pradeep");
		lhs.add("one");
		lhs.add("Two");
		lhs.add("three");
		lhs.add("Java");
		lhs.add("SQL");
		lhs.add("Python");
		
		System.out.println("Size of the LinkedHashSet is: " + lhs.size());
		System.out.println("Is P in LinkedHashSet: " + lhs.contains("p"));
		System.out.println("LinkedHashSet is: " + lhs);
		System.out.println("Class is: " + lhs.getClass());
		System.out.println("Remove the element Pradeep: " + lhs.remove("Pradeep"));
		System.out.println(lhs.add("Hello"));
		System.out.println("LinkedHashSet after removing and adding : " + lhs);
		
		
		Iterator<String> itr = lhs.iterator();
		
		System.out.println("Iterate elemets using itertator: ");
		
		while(itr.hasNext())
		{
			System.out.print(itr.next() + " ");
		}
		
		System.out.println();
		System.out.println("LinkedHashSet is empty: " + lhs.isEmpty());
		lhs.clear();
		System.out.println("LinkedHashSet is empty: " + lhs.isEmpty());
		System.out.println("------------------------------------------");
		
		
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("India");
		ts.add("England");
		ts.add("Australia");
		ts.add("Japan");
		ts.add("America");
		
		System.out.println("Size of the TreeSet is: " + ts.size());
		System.out.println("Contains method in treeset " + ts.contains("Italy"));
		System.out.println("Removing elemets in Treeset: " + ts.remove("Singapore"));
		System.out.println("Adding objects in treeset: " + ts.add("South africa"));
		
		System.out.println("Class of collection: " + ts.getClass());
		System.out.println("Is Empty: " + ts.isEmpty());
		ts.clear();
		System.out.println("Is empty: " + ts.isEmpty());
		
		System.out.println("--------------------------------------------");
		
		HashSet<String> hs = new HashSet<String>();
	
	    hs.add("Mango");
	    hs.add("Apple");
	    hs.add("Orange");
	    hs.add("Grapes");
	
	    System.out.println("Size of hashset is " + hs.size());
	    System.out.println("Contains method in hashset: " + hs.contains("Piepapple"));
    	System.out.println("Removing element: " + hs.remove("Apple"));
    	System.out.println("Adding elemet: " + hs.add("Bluberry"));
    	System.out.println("After adding and removing elements: " + hs);
	
    	System.out.println("Is empty: " + hs.isEmpty());
    	hs.clear();
	    System.out.println("Is empty: " +  hs.isEmpty());
	}
}
