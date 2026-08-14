package Test1;

import java.util.Scanner;

public class Leap_year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the year to be checked: ");
		int n=sc.nextInt();
		
		if(n%4==0 || n%400==0 || n%1000==0)
		{
			System.out.println("Leap year");
		}
		else
		{
			System.out.println("Not a leap year");
		}

	}

}
