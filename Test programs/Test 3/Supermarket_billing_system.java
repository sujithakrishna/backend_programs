package Test3;

import java.util.Scanner;

class Add
{
	private int product_id;
	int quantity;
	private String product_name;
	int selling_price,mrp;
	
	public int getproductid()
	{
		return product_id;
	}
	public String product_name()
	{
		return product_name;
	}
	
	Add(int product_id,int quantity,String product_name, int selling_price,int mrp)
	{
		this.product_id=product_id;
		this.quantity=quantity;
		this.product_name=product_name;
		this.selling_price=selling_price;
		this.mrp=mrp;
	}
	double total()
	{
		return selling_price*quantity;
	}
}

public class Supermarket_billing_system {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int choice;
		double subtotal=0;
		double discount=0;
		double gst=0;
		double finalamount=0;
		do {
		System.out.println("Welcome to Supermarket Billing System");
		System.out.println("");
		System.out.println("1.Add products");
		System.out.println("2.Calculate sub total for added products");
		System.out.println("3.Calculate discount ");
		System.out.println("4.Calculate GST");
		System.out.println("5.Final Amount");
		System.out.println("6.Exit");
		System.out.println("");
		System.out.println("Enter the choice: ");
		choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:
			System.out.println("");
			System.out.print("Enter Product ID: ");
            int product_id = sc.nextInt();

            System.out.print("Enter Product Name: ");
            String product_name = sc.next();

            System.out.print("Enter Selling Price: ");
            int selling_price = sc.nextInt();

            System.out.print("Enter MRP: ");
            int mrp = sc.nextInt();

            System.out.print("Enter Quantity: ");
            int quantity = sc.nextInt();
            Add a = new Add(product_id, quantity, product_name,selling_price, mrp);
            subtotal=subtotal+a.total();
           System.out.println("Product added successfully");
           break;
            
		case 2:	
			 System.out.println("");
			 System.out.println("Sub total is "+subtotal);
			 break;
		case 3:
			if(subtotal>3000)
			{
				discount=subtotal*0.10;
			}
			else if(subtotal>5000)
			{
				discount =subtotal*0.20;
			}
			else
			{
				discount=0;
			}
			System.out.println("Discount amount is "+discount);
			break;
		case 4:
			double amount=subtotal-discount;
			gst=amount*0.18;
			System.out.println("GST: "+gst);
			break;
		case 5:
			finalamount= (subtotal-discount)+gst;
			System.out.println("Final Amount: "+finalamount);
			break;
		case 6:
			System.out.println("Thank You");
			break;
		default:
			System.out.println("Enter valid choice");
			break;
			
			
			
		}
		}while(choice!=6);
		sc.close();
	}

}
