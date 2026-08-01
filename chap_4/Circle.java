package ch4_class;

import java.util.Scanner;

class calculate
{
	int r;
	double pi=3.14;
	
	void calculateArea()
	{
		double area= pi*r*r;
		System.out.println("The area is "+ area);
		
	}
}

public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		calculate c=new calculate();
		
		System.out.println("Enter the radius of circle: ");
		c.r=sc.nextInt();
		
		c.calculateArea();

	}

}
