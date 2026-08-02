package ch3_do_while;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n=sc.nextInt();
		System.out.println("Enter the number for multiplication: ");
		int mul=sc.nextInt();
		
		int i=1;
		do
		{
			System.out.println(mul + " * "+ i +" = "+ mul*i);
			i++;
		}
		while(i<=n);

	}

}
