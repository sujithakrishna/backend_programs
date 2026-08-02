package ch3_whileloop;

import java.util.Scanner;

public class Reverse_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int a=sc.nextInt();
		int i=1;
		int rev=0;
		
		while(a!=0)
		{
			int digit=a%10;
			rev=rev*10+digit;
			a=a/10;
		}
		System.out.println("The reversed number is "+rev);

	}

}
