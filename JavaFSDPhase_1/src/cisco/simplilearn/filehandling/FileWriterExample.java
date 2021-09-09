package cisco.simplilearn.filehandling;

import java.io.FileWriter;
import java.util.Scanner;

public class FileWriterExample {
	public static void main(String[] args) {
		
		try
		{
			FileWriter op = new FileWriter("C://Users//Pradeep D//Desktop//JAVA//Hello.txt");
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the paragraph");
			String data = scan.next();
			
			op.write(data);
			System.out.println("Data is written to the file");
			op.close();
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}
	}

}
