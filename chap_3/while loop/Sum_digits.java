package ch3_whileloop;

import java.util.Scanner;

public class Sum_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the digit: ");
		int n=sc.nextInt();
		int i=1;
		int sum=0;
		
		while(i<=n)
		{
			int digit=n%10;
			sum=sum+digit;
			n=n/10;
		
			
			
		}
		System.out.println(sum);
		

	}

}
