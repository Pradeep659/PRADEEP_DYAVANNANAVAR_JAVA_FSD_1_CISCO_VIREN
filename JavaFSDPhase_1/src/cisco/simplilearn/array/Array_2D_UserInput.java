package cisco.simplilearn.array;

import java.util.Scanner;

public class Array_2D_UserInput {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the Rows of matrix: ");
		int rows = sc.nextInt();
		System.out.println("Enter the columns of matrix: ");
		int columns = sc.nextInt();
		int[][] Sum = new int[rows][columns];
		
		System.out.println("Enter the elements of matrix 1");
		int[][] matrix1 = new int[rows][columns];
	      for(int a = 0; a < rows; a++)
	      {
	         for(int b = 0; b < columns; b++)
	         {
				matrix1[a][b] = sc.nextInt();
	         }
	      }
	     
	      
	    System.out.println("Enter the elements of matrix 2");
	    int[][] matrix2 = new int[rows][columns];
	      for(int a = 0; a < rows; a++)
	      {
	         for(int b = 0; b < columns; b++)
	         {
				matrix2[a][b] = sc.nextInt();
	         }
	      }
	      
	      System.out.println("Sum of two matrices");
	      for(int a = 0; a < rows; a++)
	    	 
	      {
	         for(int b = 0; b < columns; b++)
	         {
	        	 Sum[a][b] = matrix1[a][b] + matrix2[a][b];
	         }
	      }
	      
	      for(int a = 0; a < rows; a++)
	      {
	         for(int b = 0; b < columns; b++)
	         {
	        	 System.out.format("%d \t",Sum[a][b]);
	         }
	         System.out.println("");
	      }
	} 
}
