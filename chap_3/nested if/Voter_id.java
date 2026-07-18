package ch3_nested_if;

import java.util.Scanner;

public class Voter_id {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Please enter yes/YES if you have voter ID.");
		String verify=sc.nextLine();
		
		System.out.println("Please enter your age: ");
		int age=sc.nextInt();
		
		if(age>=18)
		{
			if(verify.equals("YES") || verify.equals("yes"))
			{
				System.out.println("You are eligible to vote.");
			}
			else
			{
				System.out.println("You are not eligible to vote.");
			}
		
		}
		else
		{
			System.out.println("You are not eligible to vote.");
		}
	
	
	}	

}
