package cisco.simpilearn.sixthdayassignment;

class Customer
{
	double Balance = 10000;
	synchronized void withdraw(double amount) {
		System.out.println("Going to withdraw...");
		System.out.println("Balance is: " + Balance);
		if(Balance < amount) {
			System.out.println("Insufficient balance; waiting for deposit");
			System.out.println("--------------------------------");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Balance -= amount;
			System.out.println("Withdraw successfull...!!!  " + amount + " Rupees");
			System.out.println("Available balance: " + Balance);	
		}
		else {
			Balance -= amount;
			System.out.println("Withdraw successfull...!!!  " + amount + " Rupees");
			System.out.println("Available balance: " + Balance);	
		}
		System.out.println("----------------------------------");
}
	
	synchronized void deposit(double amount) {
		System.out.println("Going to deposit the money to bank account");
		Balance += amount;
		System.out.println(amount + " Deposit successfull ");
		System.out.println("Total Balance- " + Balance);
		System.out.println("------------------------------------");
		notify();
	}
}
public class Wait_Notify_Demo {

	public static void main(String[] args) {
		final Customer customer = new Customer();
		
		
	   new Thread()
		{
			public void run()
			{
				customer.withdraw(3000);
				customer.withdraw(4000);
				customer.withdraw(10000);
			}
		}
	   .start();
	 
		new Thread()
		{
			public void run()
			{
				customer.deposit(20000);
			}
		}
		.start();
		
	}
}
