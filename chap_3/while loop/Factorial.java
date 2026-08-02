package ch3_whileloop;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		
		int fact=1;
		int i=1;
		
		while(i<=n)
		{
			fact=fact*i;
			i++;
			
		}
		System.out.println("The factorial of number is : "+fact);

	}

}
