package simple_programs;

import java.util.Scanner;

public class Percentage {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the obtained mark: ");
		float mark=sc.nextInt();
		
		System.out.print("Enter total mark: ");
		float total = sc.nextInt();
		
		float percent= (mark/total)*100;
		
		System.out.println("The percentage is "+percent +"%");
		
	}
 
}
