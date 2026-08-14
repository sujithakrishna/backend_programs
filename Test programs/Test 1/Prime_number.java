package Test1;
import java.util.Scanner;
public class Prime_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the element to be checked: ");
		int n=sc.nextInt();
		int i=2;
		int check=0;
		if( n<=1)
		{
			System.out.println("Not a prime number.");
		}
		else
		{
			do
			{
				if(n%i==0 )
				{
					check++;
				}
				i++;
			}while(i<=n);
		}
		if(check==1)
		{
			System.out.println("Prime number");
		}
		else
		{
			System.out.println("Not a prime number.");
		}
	}
}
