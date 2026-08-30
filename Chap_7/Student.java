package school;

import java.util.Scanner;

public class Student {
	int id;
	String name;
	
	public void details()
	{
		System.out.println("");
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id: ");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter name: ");
		String name=sc.nextLine();
		Student s=new Student();
		s.id=id;
		s.name=name;
		s.details();
		

	}

}
