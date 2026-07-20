package For_loop;

import java.util.Scanner;

public class Even_odd_count {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int n=sc.nextInt();
		int count_odd = 0;
		int count_even = 0;
		
		for(int i=0; i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.println("The even numbers are: "+i);
				count_even++;
			}
			else {
				System.out.println("The odd numbers are: "+i);
				count_odd++;
				
			}
			
		}
		
		System.out.println("The count of even numbers is: "+count_even);
		System.out.println("The count of odd numbers is: "+count_odd);
	}

}
