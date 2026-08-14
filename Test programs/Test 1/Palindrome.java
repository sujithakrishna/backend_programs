package Test1;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number to be checked: ");
		int n=sc.nextInt();
		int num=n;
		
		int i=1;
		int rev=0;
		
		while(num!=0)
		{
			int digit=num%10;
			rev=(rev*10)+digit;
			num=num/10;
			i++;
		}
		if(rev==n)
		{
			System.out.println("palindrome.");
		}
		else
		{
			System.out.println("not a palindrome.");
		}

	}

}
