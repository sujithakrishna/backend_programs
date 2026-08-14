package Test1;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the digit: ");
		int n=sc.nextInt();
		int num=n;
		int i=1;
		int sum=0;
		
		while(num!=0)
		{
			int digit=num%10;
			sum+=digit;
			num=num/10;
			i++;
		}
		System.out.println("The sum is "+sum);

	}

}
