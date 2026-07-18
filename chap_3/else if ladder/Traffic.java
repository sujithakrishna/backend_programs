package cha3_elseifladder;

import java.util.Scanner;

public class Traffic {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the signal: ");
		String signal=sc.nextLine();
		
		if(signal.equals("RED") || signal.equals("red"))
		{
			System.out.println("Stop.");
		}
		else if(signal.equals("YELLOW") || signal.equals("yellow"))
		{
			System.out.println("Wait.");
		}
		else if(signal.equals("GREEN") || signal.equals("green"))
		{
			System.out.println("Go.");
		}
		else
		{
			System.out.println("Please enter valid input");
		}
	}

}
