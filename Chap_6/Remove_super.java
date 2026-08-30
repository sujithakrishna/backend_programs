package Ch_6;

class Employeez
{
	int id;
	String name;
	
	Employeez()
	{
	id=1;
	name="Suji";
	}
	public void display()
	{
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
	}
}
class Details extends Employeez
{
	String designation;
	Details()
	{
		super();
		designation="Engineer";
	}
	public void display()
	{
		super.display();
		System.out.println("Designation: "+designation);
		
	}
}
public class Remove_super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Details d=new Details();
		d.display();

	}

}
