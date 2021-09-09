package cisco.simplilearn.thread;

public class ThreadExample extends Thread{

	public void run()
	{
		System.out.println("Thread is running...");
	}
	
	public static void main(String[] args) {
		ThreadExample t1 = new ThreadExample();  //step 1: create the object of the class
		t1.start();
		
	}
}
