package Ch_5;
class BankAccount
{
	String name;
	long acc_no;
	int age;
	String bank_name;
	String ifsc_code;
	
	BankAccount(String a, long b, int c, String d, String e)
	{
		name=a;
		acc_no=b;
		age=c;
		bank_name=d;
		ifsc_code=e;
		
		System.out.println("The name of the account holder : "+a);
		System.out.println("The account number : "+b);
		System.out.println("The account holder age : "+c);
		System.out.println("The account holder bank branch : "+d);
		System.out.println("The branch IFSC Code : "+e);
		
	}
}

public class Param_account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BankAccount("Suji", 90748324 ,23, "Neyveli", "KVBL002");
	}

}
