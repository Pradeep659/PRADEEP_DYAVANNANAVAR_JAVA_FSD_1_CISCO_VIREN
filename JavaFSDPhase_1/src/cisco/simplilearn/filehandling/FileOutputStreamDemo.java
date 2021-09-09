package cisco.simplilearn.filehandling;

import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		//Step 1: Attach keyboard to DataInputStram 
		DataInputStream dis = new DataInputStream(System.in);
		//Step 2: attach file to fileoutputstream
		FileOutputStream fout =  new FileOutputStream("C://Users//Pradeep D//Desktop//JAVA//Day5.txt",true);
		BufferedOutputStream bout = new BufferedOutputStream(fout,1024);
		System.out.println("Enter text(@ at the end):");
	    char ch;
	    
	    while((ch=(char)dis.read())!='@');
	    {
	    	bout.write(ch);
	    }
	    //close th file
	   bout.close();
	}
}
