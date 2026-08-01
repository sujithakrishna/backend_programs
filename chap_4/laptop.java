package ch4_class;

import java.util.Scanner;

class lap
{
	String brand;
	int ram;
	int price;
	
	void display() {
		System.out.println("THe details are: ");
		System.out.println("The brand is "+brand);
		System.out.println("The RAM is "+ram);
		System.out.println("The price is "+price);
	}
}
public class laptop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		lap l=new lap();
		
		System.out.print("Enter the brand: ");
		l.brand=sc.nextLine();
		
		System.out.print("Enter the RAM: ");
		l.ram=sc.nextInt();
		
		System.out.print("Enter the price: ");
		l.price=sc.nextInt();
		l.display();
		
		

	}

}
