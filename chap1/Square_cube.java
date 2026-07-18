package simple_programs;

import java.util.Scanner;

public class Square_cube {
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int a =sc.nextInt();
		
		int square= a*a;
		int cube = a*a*a;
		
		System.out.println("The square of number is "+square);
		System.out.println("The cube of number is "+cube);
		
	}

}
