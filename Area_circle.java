package simple_programs;

import java.util.Scanner;

public class Area_circle {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the radius value:");
		float r=sc.nextFloat();
		
		double area= 3.14*r*r;
		
		System.out.println("The area of circle is "+area);
		
		
		
	}

}
