package school;

import java.util.Scanner;

public class Teacher {
	public int id;
	public String name;
	
	public void display()
	{
		System.out.println("");
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the id: ");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter name: ");
		String name=sc.nextLine();	
		Teacher t=new Teacher();
		t.id=id;
		t.name=name;
		t.display();

	}

}
