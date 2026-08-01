package ch_3_switch;

import java.util.*;

public class Electricity_bill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    Scanner sc = new Scanner(System.in);

	        int choice;
	        int days;
	        double units, rate = 0,fine=0;
	        double bill,totalBill;
	      
	        System.out.println("Please select an option: ");
	  

	        System.out.println("1. Domestic");
	        System.out.println("2. Commercial");
	        System.out.println("3. Industrial");
	        System.out.println("4. Agricultural");
	        System.out.println("5. Household");
	 
	        choice = sc.nextInt();
	        
	        System.out.print("Enter units consumed: ");
	        units = sc.nextDouble();

	        switch (choice) {

	            case 1:
	                rate = 5.50;
	                System.out.println("Consumer Type : Domestic");
	                break;

	            case 2:
	                rate = 8.00;
	                System.out.println("Consumer Type : Commercial");
	                break;

	            case 3:
	                rate = 10.50;
	                System.out.println("Consumer Type : Industrial");
	                break;

	            case 4:
	                rate = 3.00;
	                System.out.println("Consumer Type : Agricultural");
	                break;
	                
	            case 5:
	            	rate=3.86;
	            	System.out.println("Consumer Type : Household");
	            	break;

	            default:
	                System.out.println("Please enter valid option");

	        }

	        bill = units * rate;
	        
	        System.out.print("Enter Number of Days Delayed: ");
	        days = sc.nextInt();

	        if (days == 0) 
	        {
	            fine = 0;
	        }
	        else if (days <= 7) 
	        {
	            fine = 50;
	        } 
	        else if (days <= 15) 
	        {
	            fine = 100;
	        } 
	        else if (days <= 30) 
	        {
	            fine = 250;
	        } 
	        else
	        {
	            fine = 500;
	        }

	       totalBill = bill + fine;

	        System.out.println("Units Consumed: " + units);
	        System.out.println("Rate: " + rate);
	        System.out.println("Bill :" + bill);
	        System.out.println("Fine : " + fine);
	        System.out.println("Total Amount: " + totalBill);


	}

}
