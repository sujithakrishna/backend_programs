package ch3_whileloop;

import java.util.Scanner;

public class Multi_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the number:");
		int n=sc.nextInt();
		
		int i=0;
		while(i<=n)
		{
			System.out.println("5" +"*" + i+"="+(5*i));
			i++;
		}

	}

}
