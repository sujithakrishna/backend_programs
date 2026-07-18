package simple_programs;

import java.util.Scanner;

public class Bmi {
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter the height:");
		float height = sc.nextFloat();
		
		System.out.print("Enter the weight:");
		float weight = sc.nextFloat();
		
		float bmi=weight/(height*height);
		
		System.out.println("The BMI is "+bmi);
	}

}
