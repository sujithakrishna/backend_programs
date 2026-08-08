package Ch_5;
class Laptop
{
	String company;
	int cost;
	
	Laptop(String n, int m)
	{
		company=n;
		cost=m;
		System.out.println("The brand is "+n);
		System.out.println("The cost is "+m);
	}
}

public class Param_lap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Laptop("HP", 12000);
		System.out.println();
		new Laptop("Dell", 13000);
		System.out.println();
		new Laptop("Asus",150000);
		
				
		
				

	}

}
