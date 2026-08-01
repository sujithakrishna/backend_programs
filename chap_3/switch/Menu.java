package ch_3_switch;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter do you have reservation: (yes/no) ");
		String reser=sc.nextLine();
		if(reser.equals("yes"))
		{
			System.out.println("This is your table. Please enjoy your meal!!");
		}
		else
		{
			System.out.println("Please do fill the table reservation form and you will be guided to your table in a minute.");
			System.out.println("Enjoy your meal!!");
		}
		
		System.out.println("Please select your food preference: ");
		System.out.println("1. Vegetarian.");
		System.out.println("2. Non-Vegetarian.");
		System.out.println("3. Eggetarian.");
		System.out.println("4. Vegan.");
		int pref=sc.nextInt();
		
		switch(pref)
		{
		case 1:
			System.out.println(" Thank you. Here is your menu!!");
			System.out.println("1. Chappathi     -- Rs.80");
			System.out.println("2. Idly(2 pc)    -- Rs.40");
			System.out.println("3. Dosa          -- Rs.110");
			System.out.println("4. Parotta(1 pc) -- Rs.30");
			System.out.println("5. Poori         -- Rs.100");
			System.out.println("Hope you enjoy your meal!.");
			break;
			
		case 2:
			System.out.println(" Thank you. Here is your menu!!");
			System.out.println("1. Chicken 65       -- Rs.120");
			System.out.println("2. Mutton Biriyani  -- Rs.240");
			System.out.println("3. Chicken Biriyani -- Rs.110");
			System.out.println("4. Fish Finger      -- Rs.300");
			System.out.println("5. Prawn 65         -- Rs.450");
			System.out.println("Hope you enjoy your meal!.");
			break;
			
		case 3:
			System.out.println(" Thank you. Here is your menu!!");
			System.out.println("1. Egg manchurian   -- Rs.140");
			System.out.println("2. Scrambled eggs   -- Rs.40");
			System.out.println("3. Omelete          -- Rs.100");
			System.out.println("4. Sunny sideup     -- Rs.90");
			System.out.println("5. Boiled Egg       -- Rs.40");
			System.out.println("Hope you enjoy your meal!.");
			break;
			
		case 4:
			System.out.println(" Thank you. Here is your menu!!");
			System.out.println("1. Tofu stir fry         -- Rs.220");
			System.out.println("2. Channa masala         -- Rs.140");
			System.out.println("3. Lentil Shephered pie  -- Rs.410");
			System.out.println("4. Sesame soba noodles   -- Rs.350");
			System.out.println("5. Tofu scrambled bowl   -- Rs.450");
			System.out.println("Hope you enjoy your meal!.");
			break;
			
		default:
			System.out.println("Enter a valid option.");
			
		}
		
		

	}

}
