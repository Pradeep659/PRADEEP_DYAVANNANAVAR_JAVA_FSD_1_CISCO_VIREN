package cisco.simplilearn.firstdayassignment;

public class Z 
{
	public static void main(String[] args) {
		
		M m = new M();
		m.defaultMethod();
		m.publicMethod();
		m.protectedMethod();
		System.out.println("-------------------------"); 
		
		N n = new N();
		n.defaultMethod();
		n.protectedMethod();
		n.publicMethod();
		System.out.println("-------------------------");
		
		P p = new P();
		p.defaultMethod();
		p.publicMethod();
		p.protectedMethod();
		System.out.println("-------------------------");
		
		X x = new X();
		System.out.println("a value is: " + x.b);
		System.out.println("b value is: " + x.c);
		System.out.println("Character is: " + x.ch);
	}
}
