package ch4_class;

import java.util.Scanner;

class Calculate
{
	int a;
	int b;
	int c;
	
	void avg()
	{
		double avg=(a+b+c)/3;
		System.out.println("The average is "+avg);
	}
	void total()
	{
		int total = a+b+c;
		System.out.println("The total is "+total);
	}
}

public class Student_marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Calculate cal=new Calculate();
		
		System.out.print("Enter first subject mark: ");
		cal.a=sc.nextInt();
		System.out.print("Enter second subject mark: ");
		cal.b=sc.nextInt();
		System.out.print("Enter third subject mark: ");
		cal.c=sc.nextInt();
		
		cal.total();
		cal.avg();
		

	}

}
