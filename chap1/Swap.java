package simple_programs;

import java.util.Scanner;

public class Swap {
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter the first number: ");
		int a = sc.nextInt();
		
		System.out.print("Enter the second number: ");
		int b = sc.nextInt();
		
		a =a+b;
		b = a-b;
		a=a-b;
		
		System.out.println("The updated value of first number is "+ a);
		System.out.println("The updaed value of second number is "+b);
		
			
	}

}
