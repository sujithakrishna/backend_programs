package ch4_class;

import java.util.Scanner;

class ani
{
	String name;
	
	void sound()
	{
		System.out.println("The sound of "+name);
	}
	
}
public class Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		ani a=new ani();
		System.out.print("Enter animal name: ");
		a.name=sc.nextLine();
		
		
		ani b=new ani();
		System.out.print("Enter second animal name: ");
		b.name=sc.nextLine();
	
		
		ani c=new ani();
		System.out.print("Enter third animal name: ");
		c.name=sc.nextLine();
		a.sound();
		b.sound();
		c.sound();
		
		

	}

}
