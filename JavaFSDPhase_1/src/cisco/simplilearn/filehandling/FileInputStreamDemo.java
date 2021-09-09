package cisco.simplilearn.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {
public static void main(String[] args) throws IOException 
{
	//attach the file to FileInputStream
	FileInputStream fin =  new FileInputStream("C://Users//Pradeep D//Desktop//JAVA//Hello.txt");
	
	//illustrating getChannel() method
	System.out.println(fin.getChannel());
	
	//illustrating getFD() method
	//returns the FileDescriptor object that represents the connection to the actual file
	//in the file system being used by this
	//system.out.println(fin.getFD());
	
	//illustrating available method
	//Returns an esimate of the number of remaining bytes that can be read(or skipped over
	//from this input stream
	System.out.println("Number of bytes read: " + fin.available());
	
	//illustrating  skip method
	/*original file content
	 * this is my first line
	 * this is my second line
	 */
	fin.skip(7);
	System.out.println("FileContents :");
	
	//read characters from fileinputstream and write them
	int ch;
	while((ch=fin.read()) != -1)
	{
		System.out.println((char)ch);
	}
	
	// close the file
	fin.close();
 }
}
