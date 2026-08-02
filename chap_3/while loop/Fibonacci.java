package ch3_whileloop;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		
		int first=0;
		int second=1;
		int i=1;
		
		while(i<=n)
		{
				System.out.print(first+" ");
				int third=first+second;
				first=second;
				second=third;
				
				i++;
				
		}

	}

}
