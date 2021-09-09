package cisco.simplilearn.classes;

class Demo
{
	void show()
	{
		System.out.println("I am in show method of super class");
	}
}
public class Ananymous_Inner {

	// A n anonymous class with Demo as base class
	
	static Demo d =  new Demo()
	{
		void show()
		{
			super.show();
			System.out.println("I am in Flavor1Demo class");
		}
	};
	public static void main(String[] args) {
		d.show();
	}
}
