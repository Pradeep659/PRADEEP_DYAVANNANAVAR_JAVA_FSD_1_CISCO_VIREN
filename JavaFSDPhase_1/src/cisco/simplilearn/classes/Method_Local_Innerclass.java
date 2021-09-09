package cisco.simplilearn.classes;

class Outer
{
	private int age = 90;
	
	void dis()
	{
		System.out.println("Inside dis method");
	}
	
	void outerMethod()
	{
		System.out.println("Inside OuterMethod");
		
		//Inner class is local to OutMethod()
		
		class Inner
		{
			void innerMethod()
			{
				dis();  // calling the outer method
				System.out.println("Inside innerMethod: " + age);
			}
		}
		Inner y = new Inner();
		y.innerMethod(); // callinhg inner class method
	}
	public void f()
	{
		
	}
}

public class Method_Local_Innerclass 
{
public static void main(String[] args) 
{
	Outer x = new Outer();
	x.outerMethod();
}
}