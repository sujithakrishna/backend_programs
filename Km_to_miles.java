package simple_programs;

import java.util.Scanner;

public class Km_to_miles {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the value of kilometer: ");
		float km= sc.nextFloat();
		
		double miles= km*0.621371;
		System.out.println("The miles is "+miles);
		
	}

}
