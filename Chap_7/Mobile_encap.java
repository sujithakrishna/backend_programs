package Encapsulation;

class MobilePhone
{
	private String model;
	private int price;
	String brand;
	int storage;
	
	public String getmodel()
	{
		return model;
	}
	public void setmodel(String model)
	{
		this.model=model;
	}
	public void setprice(int price)
	{
		this.price=price;
	}
	public int getprice()
	{
		return price;
	}
	public void display()
	{
		System.out.println("Model: "+model);
		System.out.println("Price: "+price);
		System.out.println("Brand: "+brand);
		System.out.println("Storage: "+storage);
	}
}

public class Mobile_encap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MobilePhone m=new MobilePhone();
		m.setmodel("F12");
		m.setprice(12000);
		m.brand="Oppo";
		m.storage=256;
		m.display();

	}

}
