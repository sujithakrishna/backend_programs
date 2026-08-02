package ch3_do_while;

import java.util.Scanner;

public class Leap_year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year");
		int n=sc.nextInt();
		int check=0;
		
		do
		{
			if(n%4==0 || n%400==0 || n%100==0)
			{
				check=1;
			}
			break;
			
		}while(n!=0);
		
		if(check==1)
		{
			System.out.println("Leap year");
		}
		else
		{
			System.out.println("Not a leap year");
		}

	}

}
