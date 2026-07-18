package chap3_ifelse;

import java.util.Scanner;

public class Pos_neg {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int a =sc.nextInt();
		
		if(a>0)
		{
			System.out.println("The given number "+a+" is positive.");
		}
		else
		{
			System.out.println("The given number "+a+" is negative.");
		}
	}

	
}
