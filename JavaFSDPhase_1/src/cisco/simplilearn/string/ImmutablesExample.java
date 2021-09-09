package cisco.simplilearn.string;

public class ImmutablesExample {

	public static void main(String[] args) {
		
		String s = "Sachin"; // String Literal---> objects are created in String pool
		String p = "Sachin";
		
		if(s.equals(p))
		{
			System.out.println("True.....");
		}
		else
		{
			System.out.println("false....");
		}
		
		s.concat("Tendulkar"); // concat() method appends the string at the end
		s = s.concat("Tendulkar");
		
		System.out.println(s);
		
		if(s.equals(p))
		{
			System.out.println("true....");
		}
		else
		{
			System.out.println("false....");
		}
		
		String s4 = "Hello";
		String s5 = "Hello";
		
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		String s3 = new String("hello");
		
		if(s1.equals(s3))
		{
			System.out.println("true??????");
		}
		else
		{
			System.out.println("false??????");
		}
	}
}
