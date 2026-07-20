package For_loop;

import java.util.Scanner;

public class Multiply_by_five {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of digits: ");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			System.out.println("5 * "+i+" = "+ i*5);
		}
	}

	

}
