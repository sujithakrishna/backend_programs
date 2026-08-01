package ch4_class;

import java.util.Scanner;

class personn
{
	String name;
	int age;
	String city;
	
	void display()
	{
		System.out.println("The details are ");
		System.out.println("The name is "+name);
		System.out.println("The age is "+age);
		System.out.println("The city is "+city);
		
	}
}

public class Person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		personn p=new personn();
		
		System.out.print("Enter the name: ");
		p.name=sc.nextLine();
		System.out.print("Enter the age: ");
		p.age=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter the city: ");
		p.city=sc.nextLine();
		
		p.display();
		
		
				

	}

}
