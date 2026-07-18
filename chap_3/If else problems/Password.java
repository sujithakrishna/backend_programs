package chap3_ifelse;

import java.util.Scanner;

public class Password {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter your password: ");
		String pass=sc.nextLine();
		
		String check= "Hello123@#?&";
		
		if(pass.equals(check))
		{
			System.out.println("The password is correct.");
		}
		else
		{
			System.out.println("Check your password.");
		}
	}

}
