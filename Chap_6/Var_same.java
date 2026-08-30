package Ch_6;



class Student1
{
	int id=10;
	String name="Suji";
		
}

class Student2 extends Student1
{
	int id=20;
	String name="Suji";
	
	public void details()
	{
		System.out.println("ID of first student: "+super.id);
		System.out.println("Name of first student: "+super.name);
		System.out.println("");
		System.out.println("ID of second student: "+this.id);
		System.out.println("Name of second student: "+this.name);
	}
}

public class Var_same {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student2 s1= new Student2();
		s1.details();
		
	}

}
