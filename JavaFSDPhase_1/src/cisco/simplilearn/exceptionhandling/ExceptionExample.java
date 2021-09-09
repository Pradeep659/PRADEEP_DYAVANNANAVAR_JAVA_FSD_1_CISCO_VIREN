package cisco.simplilearn.exceptionhandling;
public class ExceptionExample {

	public static void main(String[] args) {
		    try 
		    {
			checkException();
			}
			catch (ArithmeticException  e)
			{
				System.out.println("Arithmetic Exception");
			}
			finally
			{
				System.out.println("Finallt outside method");
			}
		}
	
	public static void  checkException()
	{
		try
		{
			int res = 3/0;
		}
		finally
		{
			System.out.println("Finally inside method");
		}
	}
}
