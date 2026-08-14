package Ch_6;

import java.util.Scanner;

interface student
{
	void display();
}
class details implements student{
	int roll_no;
	String name;
	
	public void display()
	{
		System.out.println("");
		System.out.println("Id: "+roll_no);
		System.out.println("Name: "+name);
	}
}

class Mark extends details
{
	int mark;
	
	void marks()
	{
		System.out.println("Mark: "+mark);
	}
}
public class Multiple_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the ID: ");
		int roll_no=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter the name: ");
		String name=sc.nextLine();
		System.out.print("Enter the mark: ");
		int mark=sc.nextInt();
		
		Mark m=new Mark();
		m.roll_no=roll_no;
		m.name=name;
		m.mark=mark;
		m.display();
		m.marks();
	}

}
