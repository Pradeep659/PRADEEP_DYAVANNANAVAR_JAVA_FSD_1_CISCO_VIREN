package cisco.simplilearn.array;

public class ATM {
	
	
public static void main(String[] args) {
	
	double amount = 5000;
	int actual_Pass = 9659;
	int expected_pass = 9659;
	
	
	if(actual_Pass == expected_pass)
	{
		int withdraw = 6000;
		if( amount > withdraw)
		{
			System.out.println("WIthdrawal successfull");
			amount -= withdraw;
			amount = amount - withdraw;
			System.out.println("Available balance: " + amount);
		}
		else
		{
			System.out.println("Insufficient balance");
		}
	}
	else
	{
		System.out.println("Invalid password");
	}
 } 
}

	