package ch3_do_while;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int n=sc.nextInt();
		int i=1;
		int fact=1;
		
		do
		{
			fact=fact*i;
			i++;
		}
		
		while(i<=n);
		System.out.println("The factorial is "+fact);

	}

}
