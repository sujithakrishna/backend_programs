package ch4_class;

import java.util.Scanner;

class details
{
	String title;
	String author;
	int price;
	
	void display()
	{
		System.out.println("The title is "+title);
		System.out.println("The author is "+author);
		System.out.println("The price is "+price);
	}
}
public class Book {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		details d1=new details();
		System.out.print("Enter the title of the book: ");
		d1.title=sc.nextLine();
		
		System.out.print("Enter the author of book: ");
		d1.author=sc.nextLine();
		
		System.out.print("Enter the price of book: ");
		d1.price=sc.nextInt();
		
		d1.display();

	}

}
