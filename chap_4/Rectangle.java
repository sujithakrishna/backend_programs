package ch4_class;

import java.util.Scanner;

class calculation
{
	int l;
	int b;
	
	void area()
	{
		int area=l*b;
		System.out.println("Area :"+ area);
	}
	void perimeter()
	{
		int perimeter = 2*(l+b);
		System.out.println("Perimeter: "+perimeter);
	}
	
}

public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		calculation c1=new calculation();
		
		System.out.print("Enter length: ");
		c1.l=sc.nextInt();
		
		System.out.print("Enter breadth: ");
		c1.b=sc.nextInt();
		
		
	
		
		c1.area();
		c1.perimeter();
		
		
	

	}

}
