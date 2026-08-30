package Access_modifiers;

import java.util.Scanner;

class Student
{
	private int id;
	public String name;
	protected String department;
	
	public void display()
	{
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);	
		System.out.println("Department: "+department);
	}
}

public class Check_access {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your id: ");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter your name: ");
		String name=sc.nextLine();
		System.out.println("Enter your department: ");
		String department=sc.nextLine();
		Student s=new Student();
		s.name=name;
		s.department=department;
		s.display();
		

	}

}
