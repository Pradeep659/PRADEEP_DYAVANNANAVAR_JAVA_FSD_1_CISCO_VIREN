package cisco.simplilearn.firstdayassignment;

class X
{
	private int a = 100;
	long b = 542154512L;
	protected float c = 98785.54521541f;
	public char ch = 'R';
}
public class Y {

	public static void main(String[] args) {
		N n = new N();
		n.defaultMethod();
		n.protectedMethod();
		n.publicMethod();
		M m = new M();
		m.defaultMethod();
		m.publicMethod();
		m.protectedMethod();
		
		X x = new X();
		System.out.println("a value is: " + x.b);
		System.out.println("b value is: " + x.c);
		System.out.println("Character is: " + x.ch);
	}
}
