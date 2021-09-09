package cisco.simplilearn.firstdayassignment;

class M
{
	private int a = 10;
	long b = 20L;
	protected float c = 45254454.45445545f;
	
	public void publicMethod()
	{
		System.out.println("Class M Public modifier method");
	}
	protected void protectedMethod()
	{
		System.out.println("Class M protected modifier method");
	}
	void defaultMethod()
	{
		System.out.println("Class M default modifier method");
	}
	private void privateMethod()
	{
		System.out.println("Class M private modifier method");
	}
}
 class N
{
	
	protected long d = 40;
	public int e = 50;
	double f = 5444412154135412.87413215452154;
	
	public void publicMethod()
	{
		System.out.println("Class N Public modifier method");
	}
	protected void protectedMethod()
	{
		System.out.println("Class N protected modifier method");
	}
	void defaultMethod()
	{
		System.out.println("Class N default modifier method");
	}
	private void privateMethod()
	{
		System.out.println("Class N private modifier method");
	}
}
 class P {
	 
	 public void publicMethod()
		{
			System.out.println("Class P Public modifier method");
		}
		protected void protectedMethod()
		{
			System.out.println("Class P protected modifier method");
		}
		void defaultMethod()
		{
			System.out.println("Class P default modifier method");
		}
		private void privateMethod()
		{
			System.out.println("Class P private modifier method");
		}
	
 public static void main(String[] args) {
	 M m = new M();
		System.out.println(m.b);
		System.out.println(m.c);
		m.defaultMethod();
		m.protectedMethod();
		m.publicMethod();
		
		N n = new N();
		System.out.println(n.d);
		System.out.println(n.e);
		System.out.println(n.e);
		n.defaultMethod();
		n.protectedMethod();
		n.publicMethod();
 }

}
