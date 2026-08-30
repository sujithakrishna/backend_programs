package Ch_6;

class Empployees
{
	int id;
	String name;
	String designation;
	String department;
	int salary,bonus;
	
	
	public void display(int id, String name)
	{
		System.out.println("Employee id: "+id);
		System.out.println("Employee name: "+name);
	}
	
	public void display(String designation,String department)
	{
		System.out.println("Designation: "+designation);
		System.out.println("Department: "+department);
	}
	public void display(int salary, int bonus)
	{
		System.out.println("Salary: "+salary);
		System.out.println("Bonus: "+bonus);
	}
	
}

public class Load_emp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empployees e=new Empployees();
		e.display(1, "Suji");
		e.display("Engineer", "Testing");
		e.display(20000, 10000);
		

	}

}
