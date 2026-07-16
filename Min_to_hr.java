package simple_programs;

import java.util.Scanner;

public class Min_to_hr {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter minutes: ");
		float min= sc.nextFloat();
		
		float hr= min/60;
		
		System.out.println("The minutes is "+hr);
		
	}

}
