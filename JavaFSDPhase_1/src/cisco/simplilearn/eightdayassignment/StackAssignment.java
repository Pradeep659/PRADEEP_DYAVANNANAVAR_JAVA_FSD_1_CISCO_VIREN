package cisco.simplilearn.eightdayassignment;

import java.util.Scanner;
import java.util.Stack;

public class StackAssignment {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Stack<Integer> stack = new Stack<Integer>();
		
		System.out.println("Enter the number of elements ");
	    int n = sc.nextInt();
		System.out.println("Push the elements to stack");
		for(int i=0;i<n;i++)
		{
			stack.push(sc.nextInt());
			System.out.println(stack);
		}
		
		stack.pop();
		stack.pop();
		
		System.out.println(stack);
		
		System.out.println("Get top of the element: " + stack.peek());
		
		System.out.println("Does the stack contains 23:-- " + stack.search(23));
		System.out.println("Does the stack contains 56:-- " + stack.search(56));
		
	}
}
