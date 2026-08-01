package ch_3_switch;

import java.util.*;
public class ATM_Machine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        int pin = 1234;
        int enteredPin;
        double balance = 10000;
        double amount;
        int choice;

        System.out.println("WELCOME TO ATM!!");

        System.out.println("Enter your 4-digit PIN: ");
        enteredPin = sc.nextInt();

        if (enteredPin != pin) {
            System.out.println("Please enter valid pin.");
        }

        	System.out.print("Please enter an option: ");
            System.out.println("1. Check balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdrawal");
            System.out.println("4. Statement");
            System.out.println("5. Cash (₹500)");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Balance: ₹" + balance);
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ₹");
                    amount = sc.nextDouble();

                    if (amount > 0)
                    {
                        balance += amount;
                        System.out.println( amount + " deposited successfully.");
                        System.out.println("Updated Balance: "+ balance);
                    } 
                    else 
                    {
                        System.out.println("Invalid Amount.");
                    }
                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    amount = sc.nextDouble();

                    if (amount <= balance && amount > 0) 
                    {
                        balance -= amount;
                        System.out.println("Please collect your amount.");
                        System.out.println("Remaining Balance: " + balance);
                    } 
                    else 
                    {
                        System.out.println("Insufficient Balance.");
                    }
                    break;

                case 4:
                    System.out.println("Statement");
                    System.out.println("Current Balance : " + balance);
                    System.out.println("Thank you!!");
                    break;

                case 5:
                    if (balance >= 500)
                    {
                        balance -= 500;
                        System.out.println("₹500 Dispensed Successfully.");
                        System.out.println("Remaining Balance: " + balance);
                    }
                    else 
                    {
                        System.out.println("Insufficient Balance.");
                    }
                    break;

                

                default:
                    System.out.println("Please enter valid option.");
            }


	}

}
