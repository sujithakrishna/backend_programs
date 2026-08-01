package ch_3_switch;

import java.util.Scanner;

public class Month_name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the below option ");
		System.out.println("1. January.");
		System.out.println("2. February.");
		System.out.println("3. March.");
		System.out.println("4. April.");
		System.out.println("5. May.");
		System.out.println("6. June.");
		System.out.println("7. July.");
		System.out.println("8. August.");
		System.out.println("9. September.");
		System.out.println("10. October.");
		System.out.println("11. November.");
		System.out.println("12. December.");
		int option=sc.nextInt();
		
		switch(option)
		{
		case 1:
			System.out.println("This month is january.");
			break;
			
		case 2:
			System.out.println("This month is february.");
			break;
			
		case 3:
			System.out.println("This month is march.");
			break;
			
		case 4:
			System.out.println("This month is april.");
			break;
		
		case 5:
			System.out.println("This month is may.");
			break;
			
		case 6:
			System.out.println("This month is june.");
			break;
			
		case 7:
			System.out.println("This month is july.");
			break;
			
		case 8:
			System.out.println("This month is august.");
			break;
			
		case 9:
			System.out.println("This month is september.");
			break;
			
		case 10:
			System.out.println("This month is october.");
			break;
			
		case 11:
			System.out.println("This month is november.");
			break;
			
		case 12:
			System.out.println("This month is december.");
			break;
			
		default:
			System.out.println("Enter valid option.");
			break;
		}
		

	}

}
