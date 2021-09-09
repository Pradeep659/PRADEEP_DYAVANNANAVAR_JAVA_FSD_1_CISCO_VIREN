package cisco.simplilearn.exceptionhandling;

public class NestedTryDemo {

	public static void main(String[] args) {
		
		try
		{
			checkException();
		}
		catch (ArithmeticException e)
		{
			System.out.println("ArithmeticException");
		}
		finally
		{
			System.out.println("Finally outside method");
		}
	}
	
	public static void checkException()
	{
		try
		{
			int res = 3 / 0;
		}
		finally
		
		{
			System.out.println("Finally inside method");
		}
	}
}
