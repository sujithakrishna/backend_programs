package ch4_class;

import java.util.Scanner;

class empdetails
{
	String name;
	int age;
	String role;
	int salary;
	
	void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Role: "+role);
		System.out.println("Salary: "+salary);
		
	}
}

public class Employeee {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				Scanner sc=new Scanner(System.in);
				empdetails e1=new empdetails();
			
				
				System.out.print("Enter your name:");
				e1.name=sc.nextLine();
				System.out.print("Enter your age: ");
				e1.age=sc.nextInt();
				sc.nextLine();
				System.out.print("Enter your role: ");
				e1.role=sc.nextLine();
				System.out.print("Enter your salary");
				e1.salary=sc.nextInt();
				System.out.print("The employee details:");
				e1.display();
				
				

	}

}
