package ch4_class;

import java.util.Scanner;

class ShopItem
{
	String itemName;
	int quantity;
	int price;
	
	void calculate()
	{
		System.out.println("The item: "+itemName);
		System.out.println("The quantity: "+quantity);
		int cost= quantity*price;
		System.out.println("The cost: "+cost);
		
	}
}

public class Shopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ShopItem s=new ShopItem();
		
		System.out.println("Enter the item name: ");
		s.itemName=sc.nextLine();
		System.out.println("Enter the quantity: ");
		s.quantity=sc.nextInt();
		System.out.println("Enter the price: ");
		s.price=sc.nextInt();
		
		s.calculate();

	}

}
