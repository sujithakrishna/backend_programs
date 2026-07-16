package simple_programs;

import java.util.Scanner;

public class Hour_sec {
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter hour");
		int hr = sc.nextInt();
		
		int sec= (hr*3600);
		System.out.println("The seconds is " +sec);
	}
	
}
