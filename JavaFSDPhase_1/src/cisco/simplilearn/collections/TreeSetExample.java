package cisco.simplilearn.collections;

import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		
		TreeSet<String> treeset = new TreeSet<String>();
		
		System.out.println("Enter the input Strings to be added in TreeSet");
		
		Scanner input = new Scanner(System.in);
		String s1 = input.nextLine();
		String s2 = input.nextLine();
		String s3 = input.nextLine();
		String s4 = input.nextLine();
		
		treeset.add(s1);
		treeset.add(s2);
		treeset.add(s3);
		treeset.add(s4);
		
		System.out.println("TreeSet is : " + treeset);
		System.out.println("check if TreeSet is empty : " + treeset.isEmpty());
		System.out.println(treeset.ceiling("imnvbnb"));
		treeset.remove(s2);
		System.out.println("After removing element : " + s2 + " Treeset is : " + treeset);
	}
}
