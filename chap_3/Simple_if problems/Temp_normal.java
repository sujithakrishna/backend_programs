package chap3_if;

import java.util.Scanner;

public class Temp_normal {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the temperature: ");
		float temp=sc.nextFloat();
		
		if(temp == 97.5 || temp<=99 )
		{
			System.out.println("The temperature is normal.");
		}
		System.out.println("The program completed successfully.");
	}

}
