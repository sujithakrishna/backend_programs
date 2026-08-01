package ch4_class;

import java.util.Scanner;

class mob
{
	String brand;
	int price;
	
	void display()
	{
		System.out.println("The details are: ");
		System.out.println("The brand: "+brand);
		System.out.println("The price: "+price);
		
	}
}

public class Mobile {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		mob m1=new mob();
		
		System.out.print("Enter first brand: ");
		m1.brand=sc.nextLine();
		
		System.out.print("Enter first brand price: ");
		m1.price=sc.nextInt();
		m1.display();
		
		sc.nextLine();
		
		mob m2=new mob();
		
		System.out.print("Enter second brand: ");
		m2.brand=sc.nextLine();
		
		System.out.print("Enter second brand price: ");
		m2.price=sc.nextInt();
		m2.display();
		
		
		

	}

}
