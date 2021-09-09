package cisco.simplilearn.filehandling;

import java.io.FileReader;

public class FileReaderExample {
public static void main(String[] args) {
	char[] array = new char[45];
	
	try
	{
		//step1: Creates a reader using the FileReader
		FileReader input = new FileReader("C://Users//Pradeep D//Desktop//JAVA//Hello.txt");
		
		//step2 Reads characters
		input.read(array);
		
		System.out.println("Data in the file: ");
		System.out.println(array);
		
		//step3: Closes the Reader
		input.close();
	}
	catch(Exception e)
	{
		e.getStackTrace();
	}
  }
}
