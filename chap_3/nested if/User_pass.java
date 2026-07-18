package ch3_nested_if;

import java.util.Scanner;

public class User_pass {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Please enter your username: ");
		String name=sc.nextLine();
		
		System.out.print("Please enter your password: ");
		String pass=sc.nextLine();
		
		String user= "Root";
		String password="Root@123";
		
		if(name.equals(user))
		{
			if(pass.equals(password))
			{
				System.out.println("Your username and password is correct and you have access to your account.");
			}
			else
			{
				System.out.println("Please check your password.");
			}
		}
		
		else
		{
			System.out.println("Please check your username and password.");
		}
		
	}

}
