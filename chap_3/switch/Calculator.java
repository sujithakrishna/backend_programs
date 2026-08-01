package ch_3_switch;

import java.util.Scanner;
import java.math.*;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int a=sc.nextInt();
		System.out.println("Enter the second number: ");
		int b=sc.nextInt();
		
		System.out.println("Enter the operation to be done.");
		System.out.println("1. Addition.");
		System.out.println("2. Subtraction.");
		System.out.println("3. Multiplication.");
		System.out.println("4. Division.");
		System.out.println("5. Modulus.");
		System.out.println("6. Root of a number.");
		System.out.println("7. Square of a number.");
		System.out.println("8. Cube of a number.");
		System.out.println("9. Log of a number.");
		System.out.println("10.Ln of a number.");
		System.out.println("11. sin of a number.");
		System.out.println("12. Cos of a number.");
		System.out.println("13. Tan of a number.");
		System.out.println("14. Exponential of numbers.");
		
		int select=sc.nextInt();
		
		switch(select)
		{
		case 1:
			int add= a+b;
			System.out.println("The addition of above numbers is "+add);
			break;
			
		case 2:
			int sub=a-b;
			System.out.println("The subtraction of above numbers is "+sub);
			break;
			
		case 3:
			int mul=a*b;
			System.out.println("The multiplication of above numbers is "+mul);
			break;
			
		case 4:
			int div=a/b;
			System.out.println("The division of above numbers is "+div);
			break;
			
		case 5:
			int mod=a%b;
			System.out.println("The modulus of above numbers is "+mod);
			break;
			
		case 6:
			double root=Math.sqrt(a);
			double root2=Math.sqrt(b);
			System.out.println("The square root of first number is "+root);
			System.out.println("The square root of second number is "+root2);
			break;
			
		case 7:
			int sq=a*a;
			int sq1=b*b;
			System.out.println("The square of first number is "+sq);
			System.out.println("The square of second number is "+sq1);
			break;
		
		case 8:
			int cu=a*a*a;
			int cu1=b*b*b;
			System.out.println("The cube of first number is "+cu);
			System.out.println("The square of second number is "+cu1);
			break;
			
		case 9:
			double log=Math.log10(a);
			double logb=Math.log10(b);
			System.out.println("The log of first number is "+log);
			System.out.println("The log of second number is "+logb);
			break;
			
		case 10:
			double ln=Math.log(a);
			double lnb=Math.log(b);
			System.out.println("The log of first number is "+ln);
			System.out.println("The log of second number is "+lnb);
			break;
			
		case 11:
			double sin=Math.sin(a);
			double sinb=Math.sin(b);
			System.out.println("The sin of first number is "+sin);
			System.out.println("The sin of second number is "+sinb);
			break;
			
		case 12:
			double cos=Math.cos(a);
			double cosb=Math.cos(b);
			System.out.println("The cos of first number is "+cos);
			System.out.println("The cos of second number is "+cosb);
			break;
			
		case 13:
			double tan=Math.tan(a);
			double tanb=Math.tan(b);
			System.out.println("The tan of first number is "+tan);
			System.out.println("The tan of second number is "+tanb);
			break;
			
		case 14:
			double exp=Math.exp(a);
			double expb=Math.exp(b);
			System.out.println("The exponential of first number is "+exp);
			System.out.println("The exponential of second number is "+expb);
			break;
			
		default:
			System.out.println("Enter a valid option.");
		
				
			
		}
		
		

	}

}
