package chap3_if;

import java.util.Scanner;

public class Pass {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter your marks: ");
		int mark=sc.nextInt();
		
		if(mark>=50)
		{
			System.out.println("You're passed.");
		}
		System.out.println("The program completed successfully.");
	}

}
