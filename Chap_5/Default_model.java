package Ch_5;
class Car{
	String model;
	int price;
	Car()
	{
		model="Tata Nexon";
		price=1800000;
	

}
}
public class Default_model {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car();
		System.out.println("The model is "+c.model);
		System.out.println("The price is "+c.price);

	}

}
