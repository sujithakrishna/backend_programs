package ch_3_switch;

import java.util.Scanner;

public class Day {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the below option:");
		System.out.println("1. Monday");
		System.out.println("2. Tuesday");
		System.out.println("3. Wednesday");
		System.out.println("4. Thursday");
		System.out.println("5. Friday");
		System.out.println("6. Saturday");
		System.out.println("7. Sunday");
		
		int date=sc.nextInt();
		
		switch(date)
		{
		case 1:
			System.out.println("Today is Monday");
			break;
			
		case 2:
			System.out.println("Today is Tuesday");
			break;
			
		case 3:
			System.out.println("Today is Wednesday");
			break;
			
		case 4:
			System.out.println("Today is Thursday");
			break;
			
		case 5:
			System.out.println("Today is Friday");
			break;
			
		case 6:
			System.out.println("Today is Saturday");
			break;
			
		case 7:
			System.out.println("Today is Sunday");
			break;
			
		default:
			System.out.println("Enter valid option.");
			break;
			
		}
		

	}

}
