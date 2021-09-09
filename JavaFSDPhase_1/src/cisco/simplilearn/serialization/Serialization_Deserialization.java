package cisco.simplilearn.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization_Deserialization {
	public static void main(String[] args) throws IOException {
		Student ob = new Student(101,25,"Chaitanya", "Agra",6);
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try
		{
			fos = new FileOutputStream("C://Users//Pradeep D//Desktop//JAVA// Hello.txt");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(ob);
			System.out.println("Serialization Done!!");
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		finally
		{
			oos.close();
			fos.close();
		}
		
		//Deserialization
		Student o = null;
		try
		{
			FileInputStream fis = new FileInputStream("C://Users//Pradeep D//Desktop//JAVA// Hello.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			o = (Student) ois.readObject();
			ois.close();
			fis.close();
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
			return;
		}
		catch(ClassNotFoundException cnfe)
		{
			System.out.println("Student class is not found");
			cnfe.printStackTrace();
			return;
		}
		System.out.println("Student name: " + o.getStuName() );
		System.out.println("Student Age: " + o.getStuAge());
		System.out.println("Student Roll NO: " + o.getStuRollNum());
		System.out.println("Student Address: " + o.getStuAddress());
		System.out.println("Student Height: " + o.getStuHeight());
		
	}
}
	class Student implements java.io.Serializable
	{
		private int stuRollNum;
		private int stuAge;
		private String stuName;
		private String stuAddress;
		private int stuHeight;
		
		
		public Student(int stuRollNum, int stuAge, String stuName, String stuAddress, int stuHeight) {
			this.stuRollNum = stuRollNum;
			this.stuAge = stuAge;
			this.stuName = stuName;
			this.stuAddress = stuAddress;
			this.stuHeight = stuHeight;
		}
		public int getStuRollNum() {
			return stuRollNum;
		}
		public void setStuRollNum(int stuRollNum) {
			this.stuRollNum = stuRollNum;
		}
		public int getStuAge() {
			return stuAge;
		}
		public void setStuAge(int stuAge) {
			this.stuAge = stuAge;
		}
		public String getStuName() {
			return stuName;
		}
		public void setStuName(String stuName) {
			this.stuName = stuName;
		}
		public String getStuAddress() {
			return stuAddress;
		}
		public void setStuAddress(String stuAddress) {
			this.stuAddress = stuAddress;
		}
		public int getStuHeight() {
			return stuHeight;
		}
		public void setStuHeight(int stuHeight) {
			this.stuHeight = stuHeight;
		}
	}
	
