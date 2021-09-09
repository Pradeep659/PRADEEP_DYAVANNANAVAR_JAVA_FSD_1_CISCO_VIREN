package cisco.simplilearn.hackerrank7thdayassignment;

import java.util.Scanner;


public class MyCalculator {
	
	long power(int n, int p)
	{
		long square = 0;
		
		try
		{
			if((n < 0) || (p < 0))
			{
				System.out.println("n or p should not be negative");
			}
			else if((n == 0) || (p==0))
			{
				System.out.println("n and p should not be zero");
			}
			
			else 
			{ 
				 square = (long) Math.pow(n,p);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return square;
	}
	
	public static void main(String[] args) {
		MyCalculator mycal = new MyCalculator();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int n = sc.nextInt();
		int p = sc.nextInt();
		long result = mycal.power(n, p);
		System.out.println(n + " power " + p + " is: " + result);
		
	}
}
