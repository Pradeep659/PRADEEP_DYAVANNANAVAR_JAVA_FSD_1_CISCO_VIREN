package cisco.simplilearnfourthdayassignments;

import java.util.Scanner;

class Example
{
	static void check(double salary) throws SalaryException
	{
		
		if(salary<2000)
			throw new SalaryException("You need to work hard");
	   else if(salary > 2100 && salary < 5000)
		   throw new SalaryException("your salary is somehow good");
	   else
		   System.out.println("Salary is very good");
	}
	
	public static void main(String[] args) {
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the salary");
			double sal = sc.nextDouble();
			check(sal);
		}
		catch(Exception e)
		{
			System.out.println("exception occured is: " + e.getMessage());
		}
	}
}
 class SalaryException extends Exception {

	SalaryException(String s)
	{
	super(s);
	}
}

