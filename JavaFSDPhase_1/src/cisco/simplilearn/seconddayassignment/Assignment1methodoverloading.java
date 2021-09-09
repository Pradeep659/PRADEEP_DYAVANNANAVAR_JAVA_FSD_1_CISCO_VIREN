package cisco.simplilearn.seconddayassignment;

public class Assignment1methodoverloading {
	final float pi = 3.14f;
	public int Addition(int a,int b)
	{
		int sum = a+b;
		return sum;
	}
	
	public float areaOfCircle(float radius)
	{
		float areaCircle=(radius*radius)*pi;
		return areaCircle;
        
	}
	
	public int areaOfRectangle(int length,int breadth)
	{
		int areaRectangle = length*breadth;
		return areaRectangle;
	}
	
	public static void main(String[] args) {
		Assignment1methodoverloading a = new Assignment1methodoverloading();
		
		System.out.println("Sum of two numbers:" + a.Addition(10, 20));
		System.out.println("Area of Cirecle: " + a.areaOfCircle(4.5f));
		System.out.println("Area of Rectangle: " + a.areaOfRectangle(42,25));
	}
}
