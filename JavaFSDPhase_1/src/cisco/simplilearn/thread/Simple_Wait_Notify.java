package cisco.simplilearn.thread;

class Customer
{
	int amount = 10000;
	
	synchronized void withdraw(int amount)
	{
		System.out.println("going to withdraw...");
	
		if(this.amount<amount)
		{
			try
			{
				wait();
			}
			catch(Exception e)
			{
				
			}
			this.amount -= amount;
			System.out.println("Withdraw completed.....The left over amount is" + this.amount);
		}
	}
	 
	synchronized void deposit(int amount)
		{
			System.out.println("Going to deposit...");
			this.amount  += amount;
		    System.out.println("Deposit Completed..." + this.amount);
		    notify();
		}
}
public class Simple_Wait_Notify {

	public static void main(String[] args) {
		Customer c = new Customer();
		
		new Thread()
		{
			public void run()
			{
				c.withdraw(15000);
			}
		}
		.start();
		
		new Thread()
		{
			public void run()
			{
				c.deposit(20000);
			}
		}
		.start();
	}
	
}
