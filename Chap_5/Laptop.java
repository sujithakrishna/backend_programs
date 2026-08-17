package Ch5_this;

public class Laptop {
	String brand;
    int price;

    Laptop setBrand(String brand)
    {
        this.brand = brand;
        return this;
    }

    Laptop setPrice(int price)
    {
        this.price = price;
        return this;
    }

    void display()
    {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Laptop l1 = new Laptop();

	     l1.setBrand("HP");
	     l1.setPrice(50000);
	     l1.display();

	}

}
