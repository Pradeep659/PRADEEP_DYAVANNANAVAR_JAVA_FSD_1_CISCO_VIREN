package cisco.simplilearn.thirddayassignments;

public abstract class MNC 
{
	MNC()
	{
		System.out.println("Multi National Company");
	}
	
	public abstract void developer();
	
	public abstract void tester();
	
	public void company()
	{
		System.out.println("These are also nothing but software or it companys");
	}	
}

abstract class Infosys extends MNC
{
	public void developer()
	{
		System.out.println("Who develops the application they are call developer");
	}
	public abstract void tester();
}

class Hello extends Infosys
{
	public void developer()
	{
		System.out.println("Who develops the application they are call developer");
	}
	
	public void tester()
	{
		System.out.println("Who tests the code they are called tester");
	}
	public void engineering()
	{
		System.out.println("engineering is professional job ");
	}
	
	public static void main(String[] args) {
		
		MNC mnc = new Hello();
		Hello h = new Hello();
		mnc.company();
		mnc.developer();
		mnc.tester();
		h.engineering();	
	}
}

