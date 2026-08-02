package ch3_do_while;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		
		int rev=0;
		int temp=n;
		
		
		do
		{
			int digit=temp%10;
			rev=(rev*10)+digit;
			temp=temp/10;
			
		}while(temp!=0);
		
		if(n==rev)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a palindrome");
		}

	}

}
