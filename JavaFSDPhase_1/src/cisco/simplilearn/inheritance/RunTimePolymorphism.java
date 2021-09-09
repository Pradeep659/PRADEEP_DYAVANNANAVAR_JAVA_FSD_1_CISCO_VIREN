package cisco.simplilearn.inheritance;

class Bank
{
 float getRateOfIntrest()
 {
	return 0;
 }
}
class SBI extends Bank
{
	float getRateOfIntrest()
	 {
		return 8.4f;
	 }
}
class ICICI extends Bank
{
	float getRateOfIntrest()
	 {
		return 7.3f;
	 }
}
class Axis extends Bank
{
	float getRateOfIntrest()
	 {
		return 9.7f;
	 }
}

public class RunTimePolymorphism {

	public static void main(String[] args) {
		Bank b ;
		b = new SBI();
		System.out.println("SBI Rate of intrest : " + b.getRateOfIntrest());
		
		b = new ICICI();
		System.out.println("SBI Rate of intrest : " + b.getRateOfIntrest());
		
		b = new Axis();
		System.out.println("SBI Rate of intrest : " + b.getRateOfIntrest());
		
	}
}

