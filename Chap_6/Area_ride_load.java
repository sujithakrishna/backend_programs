package Ch_6;

class Shapez
{
	public void details()
	{
		System.out.println("Describing area of shapes ");
	}
	public void display(int r)
	{
		double area = 3.14*r*r;
		System.out.println("Area of circle is "+area);
		
	}
	public void display(int l,int b)
	{
		int area= l*b;
		System.out.println("Area of rectangle is "+area);
	}
	public void display(double b, double h)
	{
		double area=0.15*b*h;
		System.out.println("Area of triangle is "+area);
	}
}

class Circlez extends Shapez
{
	public void details()
	{
		System.out.println("Shape: Circle");
	}
}
class Rectanglez extends Shapez
{
	public void details()
	{
		System.out.println("Shape: Rectangle");
	}
}
class Trianglez extends Shapez
{
	public void details()
	{
		System.out.println("Shape: Triangle");
	}
}
public class Area_ride_load {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shapez s=new Circlez();
		s.details();
		Shapez r =new Rectanglez();
		r.details();
		Shapez t= new Trianglez();
		t.details();
		
		Shapez s1=new Shapez();
		s1.display(3);
		s1.display(3, 4);
		s1.display(3.7,4.2);

	}

}
