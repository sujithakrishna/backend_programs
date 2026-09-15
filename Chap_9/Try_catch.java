package Exception;
import java.lang.*;

import java.util.Scanner;

public class Try_catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the brand of mobile phone: ");
		String brand=sc.nextLine();
		System.out.println("Enter the price of phone: ");
		int price=sc.nextInt();
		System.out.println("Enter the quantity: ");
		int q=sc.nextInt();
		
		
		try
		{
		 int total_price=price*q;
		 
	
		System.out.println("Brand: "+brand);
		System.out.println("Price: "+price);
		
		}catch(ArithmeticException e)
			{
				System.out.println(e);
			}
					
		}
		
	}


