package simple_programs;

import java.util.Scanner;

public class Avg {
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the first number:");
		int a = sc.nextInt();
		
		System.out.println("Enter the second number:");
		int b = sc.nextInt();
		
		System.out.println("Enter the third number:");
		int c = sc.nextInt();
		
		int avg=(a+b+c)/3;
		
		System.out.println("The average of three numbers is " + avg);
	}

}
