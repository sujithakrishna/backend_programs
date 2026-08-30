package Ch_6;

class Persons
{
	Persons()
	{
		
	}
	Persons(int id, String name)
	{
		int n=id;
		String m=name;
		System.out.println("ID: "+n);
		System.out.println("Name: "+m);
		
	}

}
class Markss extends Persons
{
	int marks=80;
	Markss(int id, String name)
	{
		super(id,name);
	}
	void display()
	{
		
		System.out.println("Marks: "+marks);
	}
	
}
public class Param_super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Markss m=new Markss(11,"Suji");
		m.display();

	}

}
