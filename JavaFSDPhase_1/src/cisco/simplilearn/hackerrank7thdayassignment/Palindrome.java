package cisco.simplilearn.hackerrank7thdayassignment;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) 
	{
		      
		      Scanner sc = new Scanner(System.in);
		 
		      System.out.println("Enter a string:");
		    
		      String str = sc.nextLine();
		 
		      int length = str.length();
		      String reverse = "";
		      for ( int i = length - 1; i >= 0; i-- )
		          reverse = reverse + str.charAt(i);
		 
		      if (str.equals(reverse))
		      {
		    	  System.out.println(str+" is a palindrome");
		      }
		         
		      else
		      {
		    	  System.out.println(str+" is not a palindrome");  
		      }
		        
		 
	 }
}
