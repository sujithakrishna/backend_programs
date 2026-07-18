package chap3_if;

import java.util.Scanner;

public class Divisible_by_5 {
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		
		if(num%5 ==0)
		{
			System.out.println("The given number " + num + " divisible by 5.");
		}
		System.out.println("The program completed sucessfully.");
	}

}
