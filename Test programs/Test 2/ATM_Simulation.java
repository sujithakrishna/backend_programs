package Test2;

import java.util.*;

interface customer
{
	void details();
}

class Customer_details implements customer
{
	int acc_no;
	String acc_type;
	int balance;
	
	Customer_details()
	{
		
	}
	Customer_details(int acc_no, String acc_type,int balance)
	{
		this.acc_no=acc_no;
		this.acc_type=acc_type;
		this.balance=balance;
	}
	public void details()
	{
		System.out.println("");
		System.out.println("Displaying details...");
		System.out.println("Account number: "+acc_no);
		System.out.println("Account Type: "+acc_type);
	}
}

class actions extends Customer_details
{
	
	actions()
	{
		
	}
	
	public void disp(int choice, Scanner sc)
	{
		switch(choice)
		{
		case 1:
			System.out.println("The balance amount: "+balance);
			break;
		case 2:
			System.out.println("Enter the amount to withdraw: ");
			int withdraw=sc.nextInt();
			if(withdraw>balance)
			{
				System.out.println("Unsufficient balance");
			}
			else
			{
				balance=balance-withdraw;
				System.out.println("The remaining balance after withdraw: "+balance);	
			}
			break;
		case 3:
			System.out.println("Enter the amount to deposit: ");
			int deposit=sc.nextInt();
			balance=balance+deposit;
			System.out.println("The remaining balance after deposit: "+balance);	
			break;
			
		case 4:
			System.out.println("Enter the PIN to change: ");
			int change_pin=sc.nextInt();
			System.out.println("ATM PIN changed successfully.");
			break;
		default:
			System.out.println("Enter valid option!");
		
		
		}
	}
}
class displaying extends actions
{
	public void display()
	{
		System.out.println("");
		System.out.println("Statement: ");
		System.out.println("Account Number: "+acc_no);
		System.out.println("Account Type: "+acc_type);
		System.out.println("Account status: Active");
		System.out.println("Balance: "+balance);
		
	}
}
public class ATM_Simulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the account number: ");
		int acc_no=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account type: ");
		String acc_type=sc.nextLine();
		System.out.print("Enter the balance: ");
		int balance=sc.nextInt();
		
		displaying d=new displaying();
		d.acc_no=acc_no;
		d.acc_type=acc_type;
		d.balance=balance;
		d.details();
		d.display();
		
		System.out.println("");
		System.out.println("Enter the option: ");
		System.out.println("1.Check Balance");
		System.out.println("2.Withdraw");
		System.out.println("3.Deposit");
		System.out.println("4.Change PIN");
		
		int choice=sc.nextInt();
		d.disp(choice,sc);
		
		
		
		

	}

}
