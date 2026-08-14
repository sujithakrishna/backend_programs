package Test1;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int a=sc.nextInt();
		System.out.print("Enter the second number: ");
		int b=sc.nextInt();
		
		
		int max= (a>b) ? a:b;
		while(true) {
		if(max%a==0 && max%b==0)
		{
			System.out.println("LCM: "+ max);
			break;
		}
		max++;
		}

	}

}
