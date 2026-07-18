package ch3_nested_if;

import java.util.Scanner;

public class Positive_even {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Please enter a number: ");
		int a =sc.nextInt();
		
		if(a>0)
		{
			if(a%2==0)
			{
				System.out.println("The number is positive and even.");
			}
			else
			{
				System.out.println("The number is positive but not an even number");
			}
		}
		else {
			System.out.println("The given number is not positive.");
		}
	}

}
