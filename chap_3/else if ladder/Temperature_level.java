package cha3_elseifladder;

import java.util.Scanner;

public class Temperature_level {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter temperature: ");
		float temp=sc.nextFloat();
		
		if(temp >= 38)
		{
			System.out.println("The temperature is hot.");
		}
		else if(temp<38 && temp>=25)
		{
			System.out.println("The temperature is normal.");
		}
		else if(temp<25 && temp>0)
		{
			System.out.println("The temperature is cold.");
		}
		else
		{
			System.out.println("Please enter valid temperature.");
		}
	
	}
}
