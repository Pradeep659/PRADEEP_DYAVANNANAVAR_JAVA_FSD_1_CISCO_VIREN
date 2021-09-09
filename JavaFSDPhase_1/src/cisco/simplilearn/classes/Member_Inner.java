package cisco.simplilearn.classes;

 class Member_Inner {

	private int data=30;
	
	void display()
	{
		System.out.println("I am inside the outer class method");
	}
	
	class Inner
	{
		private int data = 20;
	
		void msg()
		{
			Member_Inner.this.display();
			System.out.println("Data is " + data);
		}
		
		void display()
		{
			System.out.println("I am inside the inner class method");
		}
		
	}

	
	public static void main(String[] args) {
		
		Member_Inner obj = new Member_Inner();
		
		Member_Inner.Inner in = obj.new Inner();
		in.msg();
		in.display();
	
	}
}
