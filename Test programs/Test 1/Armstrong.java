package Test1;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to be checked: ");
		int n=sc.nextInt();
		
		int i=1;
		int sum=0;
		int num=n;
		while(num!=0)
		{
			int digit=num%10;
			sum=sum+(digit*digit*digit*digit);
			num=num/10;
			i++;
		}
	
		
		if(sum==n)
		{
			System.out.println("armstrong number");
		}
		else
		{
			System.out.println("Not an armstrong number.");
		}

	}

}
