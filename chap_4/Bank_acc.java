package ch4_class;

import java.util.Scanner;

class account
{
	int deposit;
	int balance;
	int withdraw;
	
	void deposit()
	
	{
		
		System.out.println("The deposit amount: "+deposit);
		balance= deposit+balance;
		System.out.println("The balance amount after deposit: "+balance);
	}
	void withdraw()
	{
		System.out.println("The withdraw amount: "+withdraw);
		withdraw= balance-withdraw;
		System.out.println("The balance amount after withdraw : "+withdraw);
	}
}

public class Bank_acc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		account a1=new account();
		
		System.out.print("Enter the total amount in your account: ");
		a1.balance=sc.nextInt();
		
		System.out.println("Enter the option: ");
		System.out.println( "1. Deposit");
		System.out.println("2. Withdraw");	
		int select=sc.nextInt();
		
		switch(select)
		{
		case 1:
			System.out.print("Enter the amount to be deposited: ");
			a1.deposit=sc.nextInt();
			a1.deposit();
			break;
		
		case 2:
			System.out.print("Enter the amount to withdraw: ");
			a1.withdraw=sc.nextInt();
			a1.withdraw();
			break;
		
		default:
			System.out.println("Enter valid details,");
		}
		
		

	}

}
