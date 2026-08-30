package Ch_6;

class Student
{
	int id=1;
	String name="suji";
	
	public void display()
	{
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
	}
}
class Marks extends Student
{
	int marks=90;
	
	public void details()
	{
		super.display();
		System.out.println("Marks: "+this.marks);
	}
}
public class Override_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marks m=new Marks();
		m.details();
		
	}

}
