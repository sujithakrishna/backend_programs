package cha3_elseifladder;

import java.util.Scanner;

public class Student_performance {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Please enter your name: ");
		String name=sc.nextLine();
		
		System.out.print("Enter your first subject score: ");
		int a=sc.nextInt();
		System.out.print("Enter your second subject score: ");
		int b=sc.nextInt();
		System.out.print("Enter your third subject score: ");
		int c=sc.nextInt();
		System.out.print("Enter your fourth subject score: ");
		int d=sc.nextInt();
		System.out.print("Enter your fifth subject score: ");
		int e=sc.nextInt();
		
		int total= (a+b+c+d+e);
		int avg= total/5;
		
		System.out.println("Your name : "+name);
		System.out.println("Your total score : "+total);
		System.out.println("Your average score : "+avg);
		
		if(avg>=85)
		{
			System.out.println("Your performance is outstanding.");
		}
		else if(avg>=75 || avg<85)	
		{
			System.out.println("Your performance is excellent.");
		}
		else if(avg>=65 || avg<75)	
		{
			System.out.println("Your performance is good.");
		}
		else if(avg>=55 || avg<65)	
		{
			System.out.println("Your performance is good but need improvement.");
		}
		else if(avg>=35 || avg<65)	
		{
			System.out.println("Your performance is satisfactory and need improvement.");
		}
		else
		{
			System.out.println("Your performance is poor.");
		}
		
	}
	
}
