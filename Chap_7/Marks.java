package school;

import java.util.Scanner;

import school.Teacher;

public class Marks {
	int m1;
	int m2;
	
	public void details()
	{
		System.out.println("Mark 1: "+m1);
		System.out.println("Mark 2: "+m2);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the id: ");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter name: ");
		String name=sc.nextLine();
		System.out.print("Enter mark1: ");
		int m1=sc.nextInt();
		System.out.print("Enter mark2: ");
		int m2=sc.nextInt();
		
		Teacher t=new Teacher();
		t.id=id;
		t.name=name;
		t.display();
		
		Marks m=new Marks();
		m.m1=m1;
		m.m2=m2;
		m.details();
		
		
		

	}

}
