package Encapsulation;
import java.util.*;

class BankAccount
{
	private int balance;
	int amount,with;
	public int getbalance()
	{
		return balance;
	}
	
	public void deposit()
	{	
		System.out.println("Deposit amount: "+amount);
		if(amount==0)
		{
			System.out.println("Add deposit amount");
		}
		else
		{
			balance=amount+balance;
			System.out.println("Balance: "+balance);
		}
	}
	
	public void withdraw()
	{
		System.out.println("Withdraw amount: "+with);
		if(with>balance)
		{
			System.out.println("Insuffiecient balance");
		}
		else
		{
			balance=balance-with;
			System.out.println("Balance: "+balance);
		}
		
	}
}

public class Private_bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		BankAccount b=new BankAccount();
		b.getbalance();
		System.out.println("Enter the amount to be deposited: ");
		int amount=sc.nextInt();		
		b.amount=amount;	
		b.deposit();
		System.out.println("Enter the amount to be withdrawed: ");
		int with=sc.nextInt();
		b.with=with;
		b.withdraw();
		
		

	}

}
