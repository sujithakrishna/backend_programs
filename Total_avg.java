package simple_programs;

import java.util.Scanner;
public class Total_avg {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first subject mark: ");
		float first= sc.nextFloat();
		
		System.out.println("Enter second subject mark: ");
		float second= sc.nextFloat();
		
		System.out.println("Enter third subject mark: ");
		float third= sc.nextFloat();
		
		System.out.println("Enter fourth subject mark: ");
		float fourth= sc.nextFloat();
		
		float total= first+second+third+fourth;
		int t= (int)total;
		
		float avg= (first+second+third+fourth)/4;
		
		System.out.println("The total is "+t);
		System.out.println("The average is "+avg);
		
		

		}

}
