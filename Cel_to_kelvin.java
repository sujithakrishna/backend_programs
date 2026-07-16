package simple_programs;

import java.util.Scanner;

public class Cel_to_kelvin {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the celcius: ");
		float cel=sc.nextFloat();
		
		double kelvin= cel + 273.15;
		
		System.out.println("the kelvin is "+kelvin);
		
		
		
	}

}
