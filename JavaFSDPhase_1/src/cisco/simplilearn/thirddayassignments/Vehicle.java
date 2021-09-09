package cisco.simplilearn.thirddayassignments;

public class Vehicle {
	int speed;
	long distance;
	Vehicle()
	{
		speed = 0;
		distance = 0;
	}
	Vehicle(int speed,long distance)
	{
		this.speed = speed;
		this.distance = distance;
	}
	public void run()
	{
		System.out.println("engine will start");
	}
	
	public void stop()
	{
		System.out.println("Engine will stop");
	}
	
	public void fuel(int a)
	{
		System.out.println("Value of a:" + a);
	}
	public void fuel(float b,String str)
	{
		System.out.println("value of b: " + b);
		System.out.println("value of str: " + str);
	}
	public void fuel(char ch,int c)
	{
		System.out.println("value of ch: " + ch);
		System.out.println("value of c: " + c);
	}
}

class TwoWheeler extends Vehicle
{
	int speed = 20;
	long distance = 30 ;
	int nos_of_tyre = 2;
	
	TwoWheeler()
	{
	   System.out.println("TwoWheeler");
	}
	public void run()
	{
		System.out.println("Two wheeler engine will start");
	}
	
	public void stop()
	{
		System.out.println("Two wheeler Engine will stop");
	}
	
	public void display()
	{
	   System.out.println("Speed: " + speed);
	   System.out.println("distance: " + distance);
	   System.out.println("nos_of_tyre: " + nos_of_tyre);
	   
	   Vehicle v = new Vehicle(10,20);
	   System.out.println("parent Vehicle class");
	   System.out.println("Parent class speed: " + v.speed);
	   System.out.println("Parent class distance: " + v.distance);
	}
}

class ThreeWheeler extends Vehicle
{
	int speed = 30;
	long distance = 40;
	int nos_of_tyre = 3;
	
	ThreeWheeler()
	{
	   System.out.println("ThreeWheeler");
	}
	public void run()
	{
		System.out.println("Three wheeler engine will start");
	}
	
	public void stop()
	{
		System.out.println("Three wheeler Engine will stop");
	}
	
	public void display()
	{
	   System.out.println("Speed: " + speed);
	   System.out.println("distance: " + distance);
	   System.out.println("nos_of_tyre: " + nos_of_tyre);
	   
	   Vehicle v = new Vehicle(10,20);
	   System.out.println("parent Vehicle class");
	   System.out.println("Parent class speed: " + v.speed);
	   System.out.println("Parent class distance: " + v.distance);
	}
}
class FourWheeler extends Vehicle
{
	int speed = 40;
	long distance = 50;
	int nos_of_tyre = 4;
	
	FourWheeler()
	{
	    System.out.println("FourWheeler");
	}
	public void run()
	{
		System.out.println("Four wheeler engine will start");
	}
	
	public void stop()
	{
		System.out.println("Four wheeler Engine will stop");
	}
	
	public void display()
	{
	   System.out.println("Speed: " + speed);
	   System.out.println("distance: " + distance);
	   System.out.println("nos_of_tyre: " + nos_of_tyre);
	   
	   Vehicle v = new Vehicle(10,20);
	   System.out.println("parent Vehicle class");
	   System.out.println("Parent class speed: " + v.speed);
	   System.out.println("Parent class distance: " + v.distance);
	}
}
class EightWheeler extends Vehicle
{
	int speed = 50;
	long distance = 60;
	int nos_of_tyre = 8;
	
	EightWheeler()
	{
	    System.out.println("EightWheeler");
	}
	public void run()
	{
		System.out.println("Eight wheeler engine will start");
	}
	
	public void stop()
	{
		System.out.println("Eight wheeler Engine will stop");
	}
	
	public void display()
	{
	   System.out.println("Speed: " + speed);
	   System.out.println("distance: " + distance);
	   System.out.println("nos_of_tyre: " + nos_of_tyre);
	   
	   Vehicle v = new Vehicle(10,20);
	   System.out.println("parent Vehicle class");
	   System.out.println("Parent class speed: " + v.speed);
	   System.out.println("Parent class distance: " + v.distance);
	}
	public static void main(String[] args) {
		Vehicle v = new Vehicle(10,20);
		System.out.println("parent Vehicle class");
		v.fuel(10);
		v.fuel('A', 100);
		v.fuel(5.45f,"Pradeep");
		v.run();
		v.stop();
		System.out.println("------------------------");
		TwoWheeler a = new TwoWheeler();
		a.display();
		a.run();
		a.stop();
		System.out.println("------------------------");
		ThreeWheeler b = new ThreeWheeler();
		b.display();
		b.run();
		b.stop();
		System.out.println("------------------------");
		FourWheeler c = new FourWheeler();
		c.display();
		c.run();
		c.stop();
		System.out.println("------------------------");
		EightWheeler d = new EightWheeler();
		d.display();
		d.run();
		d.stop();
		
	}
}
