package Ch_6;

class Calculator
{
	int a;
	int b;
	
	public void add(int a,int b)
	{
		System.out.println("Addition of integer numbers is "+(a+b));
	}
	
	public void add(double a, double b)
	{
		System.out.println("Addition of double numbers is "+(a+b));
	}
	
	public void add(float a, float b)
	{
		System.out.println("Addition of float numbers is "+(a+b));
	}
}

public class Load_add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c =new Calculator();
		c.add(3, 4);
		c.add(86797.24, 51541.67);
		c.add(13.7f, 20.9f);
	}

}
