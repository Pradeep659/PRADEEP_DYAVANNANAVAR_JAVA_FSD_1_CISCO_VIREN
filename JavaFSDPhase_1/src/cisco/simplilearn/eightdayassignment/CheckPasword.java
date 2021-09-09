package cisco.simplilearn.eightdayassignment;

import java.util.Scanner;
import java.util.regex.*;
public class CheckPasword {
	
	String Password;
    public static boolean isValidPassword(String password)
    {
        String regex = "^((?=.*[A-Z])(?=.*d)(?=.*[a-z]).{10})";
 
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(password);
        return (m.find() && m.group().equals(password));
    }
    public static void main(String args[])
    {
    	CheckPasword cp = new CheckPasword();
    	Scanner sc = new Scanner(System.in);
       
		for(int i = 1;i<20;i++)
		{
			System.out.println("Enter the password: ");
	        String str = sc.next();
	        if(isValidPassword(str))
	        {
	        	System.out.print(str + " Is Matched"); 
	        }
	        else
	        {
	        	System.out.print(str + " is not Matched");
	        }
	        System.out.println("\n");
		}
    }
}
