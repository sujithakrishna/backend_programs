package Test1;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int a=sc.nextInt();
		System.out.print("Enter the second number: ");
		int b=sc.nextInt();
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("The swaped value of a is "+a);
		System.out.println("teh swaped value of b is "+b);

	}

}
