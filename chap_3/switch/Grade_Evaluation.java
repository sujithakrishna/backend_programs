package ch_3_switch;

import java.util.Scanner;

public class Grade_Evaluation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name=sc.nextLine();
		System.out.print("Enter your roll number:");
		int roll_no=sc.nextInt();
		
		System.out.print("Enter first subject mark: ");
		int a=sc.nextInt();
		System.out.print("Enter second subject mark: ");
		int b=sc.nextInt();
		System.out.print("Enter third subject mark: ");
		int c=sc.nextInt();
		System.out.print("Enter fourth subject mark: ");
		int d=sc.nextInt();
		System.out.print("Enter fifth subject mark: ");
		int e=sc.nextInt();
		
		System.out.println("Please enter the below option: ");
		System.out.println("1. Calculate total ");
		System.out.println("2. Calculate average ");
		System.out.println("3. Calculate overall grade ");
		System.out.println("Calculate if the person is above average in class ");
		int select=sc.nextInt();
		
		switch(select)
		{
		case 1:
			int total= a+b+c+d+e;
			System.out.println("The total is "+total);
			break;
			
		case 2:
			double avge=(a+b+c+d+e)/5;
			System.out.println("The average is "+avge);
			break;
			
		case 3:
			double avg=(a+b+c+d+e)/5;
			if(avg>=90)
			{
				System.out.println("The grade is A.");
			}
			else if(avg>=80 && avg<90)
			{
				System.out.println("The grade is B.");
			}
			else if(avg>=70 && avg<80 )
			{
				System.out.println("The grade is C.");
			}
			else if(avg>=60 && avg<70)
			{
				System.out.println("The grade is D.");
			}
			else if(avg>45 && avg<60)
			{
				System.out.println("The grade is E.");
			}
			else
			{
				System.out.println("You are failed.");
			}
			break;
		
		case 4:
			double average=(a+b+c+d+e)/5;
			if(average>=70)
			{
				System.out.println("You are above average.");
			}
			else
			{
				System.out.println("You are below average.");
			}
			break;
			
		default:
			System.out.println("Enter valid option.");
			break;
			
		}
			
		
		

	}

}
