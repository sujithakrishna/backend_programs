package Ch_6;

import java.util.Scanner;

class Person
{
	int id;
	String name;
	
	
	void display()
	{
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		
	}
}

class Employee extends Person
{
	String role;
	String department;
	
	void display_emp()
	{
		System.out.println("Role: "+role);
		System.out.println("Department: "+department);
	}
	
}

class Manager extends Employee
{
	String location;
	
	void display_manager()
	{
		System.out.println("Location: "+location);
	}

}

public class Multilevel_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the id of person: ");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter the name of person: ");
		String name=sc.nextLine();
		System.out.print("Enter the role of employee: ");
		String role=sc.nextLine();
		System.out.print("Enter the department of employee: ");
		String department=sc.nextLine();
		System.out.print("Enter the location of manager: ");
		String location=sc.nextLine();
		
		Manager m=new Manager();
		m.id=id;
		m.name=name;
		m.role=role;
		m.department=department;
		m.location=location;
		m.display();
		m.display_emp();
		m.display_manager();


	}

}
