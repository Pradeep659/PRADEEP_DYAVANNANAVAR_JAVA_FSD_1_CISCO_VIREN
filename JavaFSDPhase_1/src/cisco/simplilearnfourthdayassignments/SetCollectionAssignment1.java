package cisco.simplilearnfourthdayassignments;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class SetCollectionAssignment1 {
	
	public static void main(String[] args) {
		
		LinkedHashSet l1 = new LinkedHashSet();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two Integers");
		int i1 = sc.nextInt();
		int i2 = sc.nextInt();
		System.out.println("Enter the two floating numbers");
		float f1 = sc.nextFloat();
		float f2 = sc.nextFloat();
		System.out.println("Enter the two characters");
		char ch1 = sc.next().charAt(0);
		char ch2 = sc.next().charAt(0);
		System.out.println("Enter the one boolean");
		boolean b = sc.nextBoolean();
		
		l1.add(i1);
		l1.add(i2);
		l1.add(f1);
		l1.add(f2);
		l1.add(ch1);
		l1.add(ch2);
		l1.add(b);
		
		System.out.println("Hashset is: " + l1);
		System.out.println("Size of LinkedHashSet = " + l1.size());
		System.out.println("Trying to Remove A which is not " + "present: " + l1.remove('A'));  
		l1.remove(ch2);
		System.out.println("After removing element " + l1);
		
		
		
		System.out.println("---------------------------------------");
		
		
		LinkedHashSet<Integer> l2 = new LinkedHashSet<Integer>();
		
		System.out.println("ENter the digits from 1 to 8 Randomly");
		for(int i=1;i<9;i++)
		{
		  int a1 = sc.nextInt();
		  l2.add(a1);
		 System.out.println("Hashset is: " + l2); 
		}
		
		System.out.println("----------------------------------------");
		
		TreeSet<String> ts = new TreeSet<String>();
		
		ts.add("Java");
		ts.add("Python");
		ts.add("SQL");
		ts.add("Javascript");
		ts.add("ReactJS");
		ts.add("AngularJS");
		
		System.out.println("Treeset is: " + ts);
		System.out.println("First programming language name: " + ts.first());
		System.out.println("Last Programming language name: " + ts.last());
		
		ts.pollLast();
		ts.pollLast();
		
		System.out.println("After removing elements are: " + ts);
		
		ts.add("HTML");
		ts.add("CSS");
		ts.add("MongoDB");
		
		System.out.println("After adding elemets: " + ts );
		
		System.out.println(ts.removeAll(ts));
		
		System.out.println(ts);
		
	
	}
}
