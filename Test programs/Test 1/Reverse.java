package Test1;

import java.util.*;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to be reversed: ");
		int n=sc.nextInt();
		int rev=0;
		int i=1;
		
		while(n!=0)
		{
			int digit=n%10;
			rev=(rev*10)+digit;
			n=n/10;
			i++;
		}
		System.out.println("The reverse is "+rev);
		

	}

}
