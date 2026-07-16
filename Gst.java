package simple_programs;

import java.util.Scanner;

public class Gst {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter bill amount: ");
		double amt=sc.nextDouble();
		
		System.out.print("Enter GST Percentage: ");
		double gst_percent= sc.nextDouble();
		
		double gst= (amt*gst_percent)/100;
		double total = amt+gst;
		
		System.out.println("The total amount with GST is "+total);
	}

}
