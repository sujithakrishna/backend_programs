package ATM;

import java.util.Scanner;

class InvalidPinException extends Exception {
	public InvalidPinException(String message) {
		super(message);
	}
}

class InsufficientBalanceException extends Exception {
	public InsufficientBalanceException(String message) {
		super(message);
	}
}

class InvalidAmountException extends Exception {
	public InvalidAmountException(String message) {
		super(message);
	}
}

interface ATMOperations {
	void checkBalance();
	void withdraw(int amount) throws InvalidAmountException, InsufficientBalanceException;
}

class Account {
	private int accountNumber;
	private String name;
	private int pin;
	protected double balance;
	public Account(int accountNumber, String name, int pin, double balance)
	{
		this.accountNumber = accountNumber;
		this.name = name;
		this.pin = pin;
		this.balance = balance;
	}

	public int getAccountNumber()
	{
		return accountNumber;
	}

	public String getName() 
	{
		return name;
	}

	public int getPin() 
	{
		return pin;
	}

	public void displayAccount() 
	{
		System.out.println("Account Number : " +accountNumber);
		System.out.println("Name : " +name);
		System.out.println("Balance : Rs." +balance);
	}
}

class ATM extends Account implements ATMOperations
{

	private static final int MIN_BALANCE=500;

	public ATM(int accountNumber, String name, int pin, double balance) 
	{
		super(accountNumber,name,pin,balance);
	}

	public void checkBalance() 
	{
		System.out.println("Current Balance : Rs." +balance);
	}

	public void withdraw(int amount) throws InvalidAmountException, InsufficientBalanceException 
	{

		if (amount<100 || amount%100 != 0) 
		{
			throw new InvalidAmountException("Amount should be at least 100 and must be a multiple of 100.");
		}

		if (amount>balance) 
		{
			throw new InsufficientBalanceException("Insufficient balance.");
		}

		double remainingBalance=balance-amount;

		if (remainingBalance<MIN_BALANCE) 
		{
			throw new InsufficientBalanceException("Minimum balance of Rs.500 must be maintained.");
		}

		balance=remainingBalance;
		System.out.println("Please collect your cash.");
		System.out.println("Withdrawn Amount : Rs." +amount);
		System.out.println("Remaining Balance : Rs." +balance);
	}

	public void deposit(int amount) throws InvalidAmountException {

		if (amount <= 0 || amount % 100 != 0) 
		{
			throw new InvalidAmountException("Deposit amount must be positive and a multiple of 100.");
		}
		balance = balance + amount;
		System.out.println("Amount deposited successfully.");
		System.out.println("Deposited Amount : Rs." + amount);
		System.out.println("New Balance : Rs." + balance);
	}

	public void showAccountDetails()
	{
		displayAccount();
	}
}

public class ATMproject {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ATM[] accounts = new ATM[3];
		accounts[0] = new ATM(1001, "Sujitha", 1234, 10000);
		accounts[1] = new ATM(1002, "Arjun", 2345, 15000);
		accounts[2] = new ATM(1003, "Pappu", 3456, 8000);

		System.out.println("");
		System.out.println("ATM SIMULATION");
		System.out.println("");
		System.out.print("Enter Account Number: ");
		int accountNumber = Integer.parseInt(sc.nextLine());
		ATM currentAccount = null;
		for (int i=0; i<accounts.length;i++) {
			if (accounts[i].getAccountNumber()==accountNumber) 
			{
				currentAccount = accounts[i];
				break;
			}
		}

		if (currentAccount==null)
		{
			System.out.println("Account not found.");
			sc.close();
			return;
		}

		try {
			System.out.print("Enter PIN: ");
			int pin = Integer.parseInt(sc.nextLine());

			if (pin!=currentAccount.getPin()) 
			{
				throw new InvalidPinException("Incorrect PIN.");
			}

			System.out.println("\nLogin successful.");
			System.out.println("Welcome " +currentAccount.getName());

			int choice = 0;

			do {
				System.out.println("");
				System.out.println("ATM MENU");
				System.out.println("1. Check Balance");
				System.out.println("2. Withdraw Money");
				System.out.println("3. Deposit Money");
				System.out.println("4. Account Details");
				System.out.println("5. Exit");
				System.out.print("Enter your choice: ");

				try 
				{
					choice = Integer.parseInt(sc.nextLine());
					
					if (choice == 1)
					{

						currentAccount.checkBalance();

					} 
					else if (choice == 2) 
					{
						System.out.print("Enter withdrawal amount: ");
						int amount = Integer.parseInt(sc.nextLine());

						try 
						{
							currentAccount.withdraw(amount);
						} catch (InvalidAmountException e)
						{
							System.out.println("Error: " + e.getMessage());
						} catch (InsufficientBalanceException e) {
							System.out.println("Error: " + e.getMessage());
						}

					} 
					else if (choice == 3) 
					{
						System.out.print("Enter deposit amount: ");
						int amount = Integer.parseInt(sc.nextLine());

						try {
							currentAccount.deposit(amount);
						} catch (InvalidAmountException e) {
							System.out.println("Error: " + e.getMessage());
						}

					} 
					else if (choice == 4) 
					{
						currentAccount.showAccountDetails();

					} 
					else if (choice == 5) 
					{
						System.out.println("Thank you for using the ATM.");

					} 
					else
					{
						System.out.println("Invalid choice.");
					}

				} catch (NumberFormatException e) {

					System.out.println("Please enter numbers only.");
				}

			} while (choice != 5);

		} catch (InvalidPinException e)
		{
			System.out.println("Login failed: " +e.getMessage());

		} catch (NumberFormatException e) 
		{
			System.out.println("PIN must contain numbers only.");

		} finally {

			System.out.println("\nTransaction session ended.");
		}

		sc.close();
	}
}