package cha3_elseifladder;

import java.util.Scanner;

public class Larges {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the first number: ");
		int a =sc.nextInt();
		System.out.print("Enter the second number: ");
		int b =sc.nextInt();
		System.out.print("Enter the third number: ");
		int c =sc.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println("The greatest among three numbers is "+ a);
		}
		else if(b>a && b>c)
		{
			System.out.println("The greatest among three numbers is "+ b);
		}
		else if(c>a && c>b)
		{
			System.out.println("The greatest among three numbers is "+ c);
		}
		else
		{
			System.out.println("Invalid input.");
		}
		
	}

}
