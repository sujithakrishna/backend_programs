package ch3_do_while;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		int i=2;
		int count=0;
		
		if(n<=1)
		{
			System.out.println("Not a prime");
		}
		else
		{
			do
			{
				if(n%i==0)
				{
					count++;
				}
				i++;
			}while(i<=n);
			
			if(count==1)
			{
				System.out.println("Prime");
			}
			else
			{
				System.out.println("Not a prime");
			}
		}

	}

}
