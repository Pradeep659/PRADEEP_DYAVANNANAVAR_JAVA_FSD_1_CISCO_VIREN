package cisco.simplilearn.Phase_1Project;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class SimplilearnProject1 {

	String Dir;
	File file ;
	
	public SimplilearnProject1()
	{
		Dir = ("C:/Users/Pradeep D/workspace/FSD_Phase1_Project");
		file = new File(Dir + "/files");
		file.mkdir();
		System.out.println("Directory" + file);
	}
	
	
	void showMenu()
	{
		String main_menu = "\n---------MAIN_MENU----------\nPlease enter option: \n"+ 
		          "Option 1 --> List of files in the folder\n"+
				  "Option 2 --> Add, delete, search files in the folder\n"+
				  "Option 3 --> Exit";	
	
		System.out.println(main_menu);
		try
		{
			Scanner sc = new Scanner(System.in);
			
			int option = sc.nextInt();
			
			switch(option)
			{
			   case 1 : 
			   {
				filelist();
				showMenu();
				
			   }
			   case 2 :
			   {
				   manipulate();
				  
			   }
			   case 3 :
			   {
				   System.out.println("Application will be closed...........Bye");
				   System.exit(0);
			   }
			   
			   default : System.out.println("Please enter option 1 , 2 or 3");	
			}
			showMenu();
		}
			catch(Exception e)
			{
				e.printStackTrace();
			}
	}
	void manipulate()
	{
		String manipulate = "\n----------MANIPULATE MENU---------\nPlease enter option: \n"+
			      "Option 1 --> Add the files to the folder \n" +
			      "Option 2 --> delete the files from the folder \n" +
			      "Option 3 --> Searching the files from the folder \n" +
	              "Option 4 --> Go to Main menu";
		System.out.println(manipulate);
		
		try
		{
			Scanner sc = new Scanner(System.in);
		
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1 : {
				 System.out.println("Adding files to the folder");
				    String filename = sc.next().toLowerCase();
				    addingfile(filename);
				    break;
			}
			case 2 : {
				System.out.println("Deleting files to the folder");
				String filename = sc.next().toLowerCase();
			    deletingfile(filename);
			    break;
			}
			case 3 : {
				System.out.println("Searching files to the folder");
			    String filename = sc.next().toLowerCase();
			    searchingfile(filename);
			    break;
			}
			case 4 : {
				System.out.println("Go to main menu");
			    showMenu();
			    break;
			}
			default : System.out.println("please enter the valid option 1, 2, 3, and 4");
			}
			manipulate();
		}
		catch(Exception e)
		{
			System.out.println("please enter the valid option 1, 2, 3, and 4");
			manipulate();
		}
		
	}
void filelist()
	{
		if(file.list().length==0)
		{
			System.out.println("Folder is empty");
		}
		else
		{
			String[] filelist = file.list();
			System.out.println("the files in the folder " + file);
			for(String str: filelist)
			{
				System.out.println(str);
			}
		}
	}
void addingfile(String filename) throws IOException
	{
		File files = new File(file + "/" +filename);
		String[] filelist = file.list();
		for(String list : filelist)
		{
			if(filename.equals(list))
			{
				System.out.println("File already exist in the folder " + file);
				return;
			}
		}
		files.createNewFile();
		System.out.println("File is added to the folder " + file);
	}
void deletingfile(String filename)
	{
		File files = new File(file + "/" +filename);
		String[] filelist = file.list();
		for(String list : filelist)
		{
			if(filename.equals(list) && files.delete())
			{
				System.out.println("file " + filename + " deleted from " + file);
				return;
			}
		}
		System.out.println("file not found in the folder " + file);
	}
void searchingfile(String filename)
	{
		File files = new File(file + "/" +filename);
		String[] filelist = file.list();
		for(String list : filelist)
		{
			if(filename.equals(list))
			{
				System.out.println("file found at " + file);
				return;
			}
		}
		System.out.println("file not found in the folder " + file);
	}
	
	
	public static void main(String[] args) {
		SimplilearnProject1 s = new SimplilearnProject1();
		s.showMenu();
	}
}
