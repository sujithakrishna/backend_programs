package ch4_class;

import java.util.Scanner;

class arithmetic
{
	int a;
	int b;
	
	void addition()
	{
		int add= a+b;
		System.out.println("The addition of numbers is "+add);
	}
	void subt()
	{
		int sub= a-b;
		System.out.println("The subtraction of numbers is "+sub);
	}
	void multiply()
	{
		int mul= a*b;
		System.out.println("The multiplication of numbers is "+mul);
	}
	void divi()
	{
		int div= a/b;
		System.out.println("The division of numbers is "+div);
	}
	
}

public class Calulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		arithmetic c=new arithmetic();
		
		System.out.println("Enter the first number: ");
		c.a=sc.nextInt();
		System.out.println("Enter the second number: ");
		c.b=sc.nextInt();
		
		System.out.println("Enter the operation to be done: ");
		System.out.println("1. Addition.");
		System.out.println("2. Subtraction.");
		System.out.println("3. Multiplication.");
		System.out.println("4. Division.");
		int select=sc.nextInt();
		
		switch(select)
		{
		case 1:
			c.addition();
			break;
		
		case 2:
			c.subt();
			break;
		
		case 3:
			c.multiply();
			break;
			
		case 4:
			c.divi();
			break;
			
		default:
			System.out.println("Enter valid option.");
		}
		
	}

}
