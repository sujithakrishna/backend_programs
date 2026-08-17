package Ch5_this;

class Employee
{
	String name;
	int salary;
	
	Employee(String name, int salary)
	{
		this.name=name;
		this.salary=salary;
	}
	void display()
	{
		System.out.println("The name is "+name);
		System.out.println("The salary is "+salary);
	}
}

public class Employeeeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee("Suji", 12000);
		e.display();

	}

}
