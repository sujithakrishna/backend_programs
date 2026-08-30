package Ch_6;

class Vehicles
{
	public void display()
	{
		System.out.println("Vehicle....");
	}
}
class Cars extends Vehicles
{
	public void display()
	{
		System.out.println("Vehicle: Car");
	}
}

public class Ride_move {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cars c=new Cars();
		c.display();

	}

}
