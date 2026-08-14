package Test2;

import java.util.Scanner;

interface Employee
{
	void display();
}

class Employee_details implements Employee
{
	int emp_id;
	String emp_name;
	String designation;
	String month;
	
	Employee_details()
	{
		
	}
	Employee_details(int emp_id, String emp_name,String designation,String month)
	{
		this.emp_id=emp_id;
		this.emp_name=emp_name;
		this.designation=designation;
		this.month=month;
	}
	
	public void display()
	{
		System.out.println("Displaying details.....");
		System.out.println("");
		System.out.println("EMployee ID: "+emp_id);
		System.out.println("Employee name: "+emp_name);
		System.out.println("Designation: "+designation);
		System.out.println("Month: "+month);
		
	}
}

class day extends Employee_details
{
	 int count;
	 int calculate_sal(){
		 return count*250;
		 
	 }
   public void display_day()
	{
	  
		System.out.println("");
		System.out.println("Please note that per day salary is 250!!");
		System.out.println("Basic Salary: "+calculate_sal());
	}	

}

class final_salary extends day
{
	int minus=2000+300+1500;
	int cal_final_sal()
	{
		return calculate_sal()-minus +2000;
	}
}
class salary_slip extends final_salary
{
	public void salaryslip()
	{
	System.out.println("Here is your salary slip!!");
	System.out.println("");
	System.out.println("EMployee ID: "+emp_id);
	System.out.println("Employee name: "+emp_name);
	System.out.println("Designation: "+designation);
	System.out.println("Month: "+month);
	System.out.println("");
	System.out.println("Basic Salary: "+calculate_sal());
	System.out.println("PF Amount: 2000 ");
	System.out.println("Tax: 300 ");
	System.out.println("Insurance: 1500 ");
	System.out.println("Monthly allowance: 2000 ");
	System.out.println("Total deduction amount: "+minus);
	System.out.println("Salary after deductions: "+cal_final_sal());
	
	
	}
}

public class Employee_payroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter employee id:  ");
		int emp_id=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter employee name: ");
		String emp_name=sc.nextLine();
		System.out.print("Enter your designation: ");
		String designation=sc.nextLine();
		System.out.print("Enter the month to get the payroll: ");
		String month=sc.nextLine();
		System.out.print("Enter how many days you have come to work: ");
		int count=sc.nextInt();
		System.out.println("");
		
		salary_slip s= new salary_slip();
		 s.emp_id = emp_id;
	     s.emp_name = emp_name;
	     s.designation = designation;
	     s.month = month;
	     s.count = count;
	     s.display();
	     s.display_day();
	     s.salaryslip();
		
	}

}
