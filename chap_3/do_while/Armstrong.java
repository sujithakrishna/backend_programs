package ch3_do_while;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		
		int temp=n;
		int sum=0;
		
		do
		{
			int digit=temp%10;
			sum=sum+(digit*digit*digit);
			temp=temp/10;
			
		}while(temp!=0);
		
		if(sum==n)
		{
			System.out.println("Armstrong number");
		}
		else
		{
			System.out.println("Not an armstrong number");
		}
		

}
}
