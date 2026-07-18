package ch3_nested_if;
import java.util.Scanner;

public class largest_threenos {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int a =sc.nextInt();
		System.out.print("Enter second number: ");
		int b =sc.nextInt();
		System.out.print("Enter third number: ");
		int c =sc.nextInt();
		
		if(a>0 && b>0 && c>0)
		{
			if(a>b && a>c)
			{
				System.out.println("The greatest number is "+a);
			}
			else if(b>a && b>c)
			{
				System.out.println("The greatest number is "+b);
			}
			else
			{
				System.out.println("The greatest number is "+c);
			}
		}
		else
		{
			System.out.println("Please check your input value.");
		}
	}

}
