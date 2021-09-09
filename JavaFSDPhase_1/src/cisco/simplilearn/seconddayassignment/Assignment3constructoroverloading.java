package cisco.simplilearn.seconddayassignment;

public class Assignment3constructoroverloading {
	String name;
	int age;
	char section;
	char gender;
	int sub1;
	int sub2;
	int sub3;
	int totalMarks;
	double percentage;
	
	public Assignment3constructoroverloading(String name,int age,char section,char gender,int sub1,int sub2,int sub3){
		this.name = name;
		this.age = age;
		this.section = section;
		this.gender = gender;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
	}
	
	public static void main(String[] args) {
		
		Assignment3constructoroverloading[] s = new Assignment3constructoroverloading[4];
		
		s[0] = new Assignment3constructoroverloading("Pradeep",23,'A','M',62,65,72);
		s[1] = new Assignment3constructoroverloading("Ravi",24,'B','M',0,75,80);
		s[2] = new Assignment3constructoroverloading("Naveen",25,'C','M',0,84,94);
		s[3] = new Assignment3constructoroverloading("Sachin",26,'D','M',68,74,88);
		
		System.out.println("Total Students: " + s.length);
		System.out.println("Display all Students details");
		System.out.println("name\tage\tsection\tgender\tsub1\tsub2\tsub3\ttotalMarks\tpercentage");
		
		for(int i=0;i<s.length;i++)
		{
			double totalMarks = 0;
			double[] marks ={s[i].sub1,s[i].sub2,s[i].sub3};
			
			for(int j=0;j<marks.length;j++)
			{
				totalMarks = totalMarks + marks[j];
			}
			
			double percentage = totalMarks / marks.length;
			
			System.out.println(s[i].name + "\t" + s[i].age + "\t" + s[i].section + "\t" + s[i].gender + "\t" + s[i].sub1 + "\t" + s[i].sub2 + "\t" + s[i].sub3 + "\t" + totalMarks + "\t\t" + percentage);
		}
	}
}
