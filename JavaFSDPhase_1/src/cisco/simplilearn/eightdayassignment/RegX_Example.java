package cisco.simplilearn.eightdayassignment;

import java.util.Scanner;
 class ValidatingEmail {
   public static void main(String[] args) {
	   
	   for(int i=1;i<=4;i++)
	   {
		   Scanner sc = new Scanner(System.in);
		      System.out.println("Enter your Email: ");
		      String mail = sc.next();
		      String regex ="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
		      //Matching the given phone number with regular expression
		      boolean result = mail.matches(regex);
		      if(result) {
		         System.out.println("Given email-id is valid");
		      } else {
		         System.out.println("Given email-id is not valid");
		      }
		      System.out.println("-----------------------------------");
		   
	   }
     
   }
}