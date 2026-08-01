package ch4_class;

import java.util.Scanner;

class teaching
{
	String name;
	int age;
	String role;
	int salary;
	
	void getdetails()
	{
		System.out.println("Enter the name: ");
		System.out.println("Enter the age: ");
		System.out.println("Enter the role: ");
		System.out.println("Enter the salary: ");
	}
	void printdetails()
	{
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Role: "+role);
		System.out.println("Salary: "+salary);
		
	}
}

public class Teacher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		teaching t=new teaching();
		
		t.getdetails();
		t.name=sc.nextLine();
		t.age=sc.nextInt();
		sc.nextLine();
		t.role=sc.nextLine();
		t.salary=sc.nextInt();
		
		t.printdetails();
		
	

	}

}
