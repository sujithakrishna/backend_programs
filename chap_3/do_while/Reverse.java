package ch3_do_while;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		
		int i=0;
		int rev=0;
		do
		{
			int digit=n%10;
			rev=(rev*10)+digit;
			n=n/10;
			i++;
		}
		while(n!=0);
			System.out.println("The reverse is "+rev);

	}

}
