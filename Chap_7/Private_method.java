package Access_modifiers;

import java.util.Scanner;

class Employee
{
	private int id;
	String name;
	private String company;
	
	public void display()
	{
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
	}
	public void details()
	{
		System.out.println("Company: "+company);
	}
}


public class Private_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id: ");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the name: ");
		String name=sc.nextLine();
		System.out.println("Enter company name: ");
		String company=sc.nextLine();
		
		Employee e=new Employee();
		e.name=name;
		e.display();
		
		e.details();

	}

}
