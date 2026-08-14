package Test2;

import java.util.Scanner;

interface Customer
{
	void displayy();
}

class Customerdetailss implements Customer
{
	int id;
	String name;
	int age;
	String email;
	String location;
	
	Customerdetailss()
	{
		
	}
	Customerdetailss(int id, String name, int age, String email, String location)
	{
		this.id=id;
		this.name=name;
		this.age=age;
		this.email=email;
		this.location=location;
	}
	public void displayy()
	{
		System.out.println("");
		System.out.println("Displaying details....");
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Email: "+email);
		System.out.println("Location: "+location);
	}
}

class Account_details extends Customerdetailss
{
	int acc_no;
	String acc_type;
	int balance;
	
	Account_details()
	{
		
	}
	Account_details(int acc_no,String acc_type,int balance)
	{
		this.acc_no=acc_no;
		this.acc_type=acc_type;
		this.balance=balance;
	}
	public void displayy_acc()
	{
		System.out.println("");
		System.out.println("Account Details: ");
		System.out.println("Account number: "+acc_no);
		System.out.println("Account type: "+acc_type);
		System.out.println("Balance: "+balance);
	}
}

class todone extends Account_details
{
	int deposit;
	int withdraw;
	
	
	public void display(int choice, Scanner sc)
	{
	
	
	switch(choice)
	{
	case 1: 
		System.out.println("Enter the amount to withdraw: ");
		withdraw=sc.nextInt();
		if(withdraw>balance)
		{
			System.out.println("Unsufficient balance");
		}
		else 
		{
		balance = balance-withdraw;
		System.out.println("Your balance after withdraw: "+balance);
		}
		break;
		
	case 2: 
		System.out.println("Enter the amount to deposit: ");
		deposit=sc.nextInt();
		balance=balance+deposit;
		System.out.println("Your balance after deposit: "+balance);
		break;
		
	case 3:
		System.out.println("Your balance is "+balance);
		break;
		
	default:
		System.out.println("Enter valid option!");
		
	
	}
	}
}




public class Bank_app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your ID: ");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter your name: ");
		String name=sc.nextLine();
		System.out.print("Enter your age: ");
		int age=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter your email: ");
		String email=sc.nextLine();
		System.out.print("Enter your location: ");
		String location=sc.nextLine();
		System.out.print("Enter your account number: ");
		int acc_no=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter your account type: ");
		String acc_type=sc.nextLine();

		System.out.print("Enter your balance amount: ");
		int balance=sc.nextInt();
		
		todone a=new todone();
		a.id=id;
		a.name=name;
		a.age=age;
		a.email=email;
		a.location=location;
		a.acc_no=acc_no;
		a.acc_type=acc_type;
		a.balance=balance;
		
		
		a.displayy();
		
		
		a.displayy_acc();
		System.out.println("");
	    System.out.println("Enter your choice: ");
	    System.out.println("1. Withdraw");
	    System.out.println("2. Deposit");
	    System.out.println("3. Check Balance");
	    int choice = sc.nextInt();
		a.display(choice,sc);
		
		
		

	}

}
