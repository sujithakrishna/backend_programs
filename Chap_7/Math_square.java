package static_ex;
import static static_ex.Static_import.*;

import java.util.Scanner;

public class Math_square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the the first number: ");
		int a=sc.nextInt();
		System.out.println("Enter the second number: ");
		int b=sc.nextInt();
		double sq_root1= squareroot(a);
		double sq_root2= squareroot(b);
		System.out.println("Square root of first number is "+sq_root1);
		System.out.println("Square root of second number is "+sq_root2);
		double pow1=power(a,b);
		System.out.println("Power of numbers is "+pow1);
		
		

	}

}
