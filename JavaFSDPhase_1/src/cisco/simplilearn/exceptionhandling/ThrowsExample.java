package cisco.simplilearn.exceptionhandling;
import java.io.IOException;

public class ThrowsExample {

	void m() throws IOException
	{
		throw new IOException("device error");
	}
	
	void n() throws IOException{
		m();
	}
	 void p()
	 {
		 try
		 {
			 n();
		 }
		 catch(Exception e)
		 {
			 System.out.println("Exception handled");
			 System.out.println(e.getMessage());
			 System.out.println(e.getStackTrace());
			 System.out.println(e.getClass());
		 }
	 }
	 
	 public static void main(String[] args) {
		 ThrowsExample obj = new ThrowsExample();
		 obj.p();
		 System.out.println("normal flow...");
	}
}
