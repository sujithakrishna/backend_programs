package Encapsulation;
class Employee
{
	private String name;
	private int salary;
	
	public String getname()
	{
		return name;
	}
	public void setname(String name)
	{
		this.name=name;
		System.out.println("Name: "+name);
	}
	public int getsalary()
	{
		return salary;
	}
	public void setsalary(int salary)
	{
		this.salary=salary;
		System.out.println("Salary: "+salary);
	}
}

public class Access_private {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee();
		e.setname("Suji");
		e.setsalary(120000);
		e.getname();
		e.getsalary();
				

	}

}
