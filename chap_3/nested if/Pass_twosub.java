package ch3_nested_if;

import java.util.Scanner;

public class Pass_twosub {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter your first subject mark:");
		int a =sc.nextInt();
		System.out.print("Enter your second subject mark:");
		int b =sc.nextInt();
		
		if(a>=0 && a>=35)
		{
			if(b>=35)
			{
				System.out.println("You passed in two subjects!");
			}
			else
			{
				System.out.println("You passed in first subject and failed in second subject.");
			}
		}
		else if(a>=0 && a<35)
		{
			if(b>=35)
			{
				System.out.println("You failed in first subject and passed in second subject.");
			}
			else
			{
				System.out.println("You failed in both subjects.");
			}
		}
		else
		{
			System.out.println("Enter a valid mark.");
		}
		
	}

}
