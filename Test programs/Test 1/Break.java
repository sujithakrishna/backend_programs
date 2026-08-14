package Test1;

import java.util.Scanner;

public class Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements to be printed: ");
		int n=sc.nextInt();
		int i=1;
		
		while(i<=n)
		{
			System.out.println(i);
			i++;
			if(i==5)
			{
			break;
			}		
			
		}

	}

}
