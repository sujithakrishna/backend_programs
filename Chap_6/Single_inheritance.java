package Ch_6;

import java.util.Scanner;

class Teacher
{
	int id;
	String name;
	String city;
	Teacher()
	{
		System.out.println("Displaying details: ");
	}
	Teacher(int id, String name, String city)
	{
		this.id=id;
		this.name=name;
		this.city=city;
	
	}
	
	void display()
	{
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("City: "+city);
	}
}

class Mathteacher extends Teacher
{
	String subject;
	
	Mathteacher()
	{
		System.out.println(" ");
		System.out.println("Dislaying details of teacher...");
	}
	void displayy()
	{
		System.out.println("Subject: Maths");
	}
}

public class Single_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the id of teacher: ");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter the name of teacher: ");
		String name=sc.nextLine();
		System.out.print("Enter the city: ");
		String city =sc.nextLine();
		
		Mathteacher m=new Mathteacher();
		
		m.id=id;
		m.name=name;
		m.city=city;
		m.display();
		m.displayy();

	}

}
