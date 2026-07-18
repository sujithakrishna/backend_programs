package cha3_elseifladder;

import java.util.Scanner;

public class Grade_system {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your mark: ");
		int mark=sc.nextInt();
		
		if(mark>=90 )
		{
			System.out.println("Your Grade is O.");
		}
		
		else if(mark>=75 && mark<90)
		{
			System.out.println("Your Grade is A.");
		}
		
		else if(mark >=50 && mark<75)
		{
			System.out.println("Your Grade is B.");
		}
		
		else if(mark>=35 && mark<50)
		{
			System.out.println("Your Grade is C.");
		}
		
		else
		{
			System.out.println("You are failed.");
		}
	}
	

}
