package Test1;

import java.util.Scanner;

public class Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many elements to be printed: ");
		int n=sc.nextInt();
		int i=1;
		
		while(i<=n)
		{
			
			if(i==5)
			{
				i++;
			 continue;
			}	
			System.out.println(i);
			i++;
			
		}
	}
}
