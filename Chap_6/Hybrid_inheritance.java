package Ch_6;

import java.util.Scanner;

interface member
{
	void details();
}

class Displaying implements member
{
	int id;
	String name;
	String city;
	
	public void details()
	{
		System.out.println("");
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("City: "+city);
	}
}

class Company extends Displaying
{
	String comp_name;
	String department;
	
	void display()
	{
		System.out.println("");
		System.out.println("Company Details");
		System.out.println("Company name: "+comp_name);
		System.out.println("Department: "+department);
	}
	
	
}
class Salary extends Company
{
	
	int salary;
	Salary()
	{
		
	}
	
	Salary(int salary)
	{
		this.salary=salary;
	}
	void sal()
	{
		System.out.println("Salary: "+salary);
	}
	}


public class Hybrid_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the id: ");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter name: ");
		String name=sc.nextLine();
		System.out.print("Enter location: ");
		String city=sc.nextLine();
		System.out.print("Enter company name: ");
		String comp_name=sc.nextLine();
		System.out.print("Enter department: ");
		String department=sc.nextLine();
		System.out.print("Enter salary: ");
		int salary=sc.nextInt();
		
		Salary s=new Salary(salary);
		s.id=id;
		s.name=name;
		s.city=city;
		s.comp_name=comp_name;
		s.department=department;

		s.details();
		s.display();
		s.sal();

	}

}
