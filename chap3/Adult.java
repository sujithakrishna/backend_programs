package chap3_if;

import java.util.Scanner;

public class Adult {
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		
		System.out.print(" Enter your age: ");
		int age= sc.nextInt();
		
		if(age>=18)
		{
			System.out.println("You are adult.");
		}
		System.out.println("The program completed successfully");
	}

}
