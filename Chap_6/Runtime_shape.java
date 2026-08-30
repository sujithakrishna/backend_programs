package Ch_6;

class Shape
{
	public void display() {
	System.out.println("Describing Shapes: ");
	}
}
class Circle extends Shape
{
	
	
	public void display()
	{
		
		System.out.println("Shape: Circle");
		
	}
}
class Rectangle extends Shape
{
	
	public void display()
	{
		
		System.out.println("Shape: Rectangle");
		
	}
}
class Triangle extends Shape
{
	
	public void display()
	{
		
		System.out.println("Shape: Triangle");
		
	}
	
}

public class Runtime_shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s=new Circle();
		s.display();
		Shape r=new Rectangle();
		r.display();
		Shape t=new Triangle();
		t.display();
		
		
		
		

	}

}
