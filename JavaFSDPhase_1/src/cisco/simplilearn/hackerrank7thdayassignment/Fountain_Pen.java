package cisco.simplilearn.hackerrank7thdayassignment;

abstract class Pen
{
	public abstract void write();
	
	public abstract void refill();
	
	public static class Fountain_Pen extends Pen {

		public void write()
		{
			System.out.println("Pen is used for writing");
		}
		public void refill()
		{
			System.out.println("we have to refill the ink");
		}
		public void Nib()
		{
			System.out.println("Nib is sensitive part of the pen");
		}
		
		public static void main(String[] args) {
			
			Fountain_Pen fp = new Fountain_Pen();
			fp.Nib();
			fp.write();
			fp.refill();
		}
	}
}


