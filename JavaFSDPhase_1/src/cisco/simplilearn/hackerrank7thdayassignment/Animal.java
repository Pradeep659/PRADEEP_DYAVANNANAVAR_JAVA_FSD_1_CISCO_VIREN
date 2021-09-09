package cisco.simplilearn.hackerrank7thdayassignment;

public interface Animal 
{
   void eat();
   void sleep();
}

class Monkey
{
	void jump()
	{
		System.out.println("Monkeys are expert in jumping");
	}
	void bite()
	{
		System.out.println("Monkey bites are an important risk among travelers and after dog bites is the most common animal bite for travelers.");
	}
}

class Human extends Monkey implements Animal
{
	public void eat()
	{
		System.out.println("Humans are having 3 times food per a day");
		
	}
	public void sleep()
	{
		System.out.println("Humans are usually take 8 hours sleep per a day");
	}
	
	public static void main(String[] args) {
		Human human = new Human();
		human.eat();
		human.sleep();
		human.bite();
		human.jump();
		
	}
}
