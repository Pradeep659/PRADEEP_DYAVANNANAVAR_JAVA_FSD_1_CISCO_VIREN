package cisco.simplilearn.overloading;

public class PrameterConstruct {

	int id;
	String name;
	
	public PrameterConstruct(int i,String n)
	{
		id = i;
		name = n;
	}
	
	public void display()
	{
		System.out.println(id+ " " + name);
	}
	
	public static void main(String[] args) {
		PrameterConstruct s1 = new PrameterConstruct(111,"Karan");
		PrameterConstruct s2 = new PrameterConstruct(222,"Aryan");
		
		s1.display();
		s2.display();
	}
}
