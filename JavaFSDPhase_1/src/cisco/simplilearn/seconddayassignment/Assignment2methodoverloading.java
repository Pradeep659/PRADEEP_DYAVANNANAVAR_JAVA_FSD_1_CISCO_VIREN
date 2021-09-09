package cisco.simplilearn.seconddayassignment;

import java.util.Scanner;

public class Assignment2methodoverloading {
	int length, breadth,areaRectangle;
    final float pi=3.14f;
    int side,areaSquare;
    float radius,areaCircle;
    Assignment2methodoverloading()
   {
       length=0;
       breadth=0;
       side=0;
   }

    Assignment2methodoverloading(float r)
   {
       radius=r;
   }

    Assignment2methodoverloading(int l,int b)
   {
       length=l;
       breadth=b;
   }

    Assignment2methodoverloading(int a)
   {
       side=a;
   }
  
   void AreaCircle()
   {
       areaCircle=(radius*radius)*pi;
       System.out.println("Area of Circle is "+areaCircle+"cm.square" );
   }

   void AreaSquare()
   {
       areaSquare=side*side;
       System.out.println("Area of Square is "+areaSquare+"cm.square"   );
   }

   void AreaRectangle()
   {
       areaRectangle=length*breadth;
       System.out.println("Area of Rectangle is "+areaRectangle+"cm.square"   );
   }
   
   void areaOfTriangleAndRhombus(float base,float height)
   {
   	double areaTriangle = base*height*0.5;
   	System.out.println("Area of Trinagle is: " + areaTriangle+ "cm.square" );
   }
   
   void areaOfTriangleAndRhombus(int dia1,int dia2)
   {
   	double areaTriangle = dia1*dia2*0.5;
   	System.out.println("Area of Trinagle is: " + areaTriangle+ "cm.square" );
   }
}

class Caluculate
{
   public static void main(String arg[])
   {
       //Input from user
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the Radius of Circle as integer");
       float r=sc.nextFloat();
       System.out.println("Enter the Length and Breadth of Rectangle as integer");
       int len=sc.nextInt();
       int bre=sc.nextInt();
       System.out.println("Enter the length of the side of the square as int");
       int s=sc.nextInt();       
       
      
       //Create Object
       Assignment2methodoverloading circle = new Assignment2methodoverloading(r);
       Assignment2methodoverloading rectangle =new Assignment2methodoverloading(len,bre);
       Assignment2methodoverloading square =new Assignment2methodoverloading(s);
      
       circle.AreaCircle();
       rectangle.AreaRectangle();
       square.AreaSquare();
       
       System.out.println("");
       new Assignment2methodoverloading().areaOfTriangleAndRhombus(5.4f, 6.8f);
       new Assignment2methodoverloading().areaOfTriangleAndRhombus(10, 20);
   }
}
