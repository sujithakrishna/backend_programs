package ch3_do_while;

import java.util.Scanner;

public class Fibonnaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements to be printed: ");
		int n=sc.nextInt();
		int i=1;
		int first=0;
		int second=1;
		int third;
		
		do
		{
			System.out.println(first +" ");
			third=first +second;
			first=second;
			second=third;
			i++;
			
		}while(i<=n);
		
		

	}

}
