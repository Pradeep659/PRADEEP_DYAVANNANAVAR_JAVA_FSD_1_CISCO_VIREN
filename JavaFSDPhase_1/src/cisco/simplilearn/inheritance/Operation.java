package cisco.simplilearn.inheritance;

 class Operation {

	int square(int n)
	{
		return n*n;
	}
}
 class AggregationExample
 {
	 Operation op;
	 double pi = 3.142;
	 
	 double area(int radius)
	 {
		 op = new Operation();
		 int rsquare = op.square(radius);
		 return pi*rsquare;
	 }
	 
	 public static void main(String[] args) {
		 
		 AggregationExample c = new AggregationExample();
		 
		 double result = c.area(5);
		 System.out.println(result);
	}
 }