package simple_programs;

import java.util.Scanner;

public class Triangle_valid {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter first side: ");
		int a =sc.nextInt();
		
		System.out.print("Enter second side: ");
		int b =sc.nextInt();
		
		System.out.print("Enter third side: ");
		int c =sc.nextInt();
		
		boolean valid = (( a+b>c && a+c>b && b+c>a));
		
		System.out.println(valid);
	}

}
