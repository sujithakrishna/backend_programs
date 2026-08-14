package Test2;

import java.util.Scanner;

interface Student
{
	void display();
}
class studentdetails implements Student{
	int id;
	String name;
	studentdetails()
	{
		
	}
	
	studentdetails(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public void display()
	{
		System.out.println("");
		System.out.println("Displaying Details....");
		System.out.println();
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
	}
	
}	
class student_info
{
	int age;
	String gender;
	String email;
	String department;
	String course;
	int year;
	
	student_info(int age, String gender, String email, String department, String course,int year)
	{
		this.age=age;
		this.gender=gender;
		this.email=email;
		this.department=department;
		this.course=course;
		this.year=year;
	}
	void display_info()
	{
		System.out.println("Age: "+age);
		System.out.println("Gender: "+gender);
		System.out.println("Email ID: "+email);
		System.out.println("Department: "+department);
		System.out.println("Course: "+course);
		System.out.println("Year: "+year);
		
	}
}
class Attendance extends studentdetails
{
	int day;
	void calculate()
	{
		System.out.println("The total number of working days is 250");
		if(day>=200)
		{
			System.out.println("Attendance prcentange is 80%");
		}
		else if(day>=180 && day<200)
		{
			System.out.println("Attendance percentage is 72%");
		}
		else if(day >=165 && day<180)
		{
			System.out.println("Attendance percentage is 66%");
		}
		else if (day>=145 && day<165)
		{
			System.out.println("Attendance percentage is 58%");
		}
		else if(day>=125 && day<145)
		{
			System.out.println("Attendance percentage is 50%");
		}
		else
		{
			System.out.println("Your attendance is low.");
		}
	}

}
class Fee extends Attendance
{
	String fee;
	void display_fee()
	{
		if(fee.equals("paid"))
		{
			System.out.println("You have paid your fees!");
		}
		else if(fee.equals("pending"))
		{
			System.out.println("Your fees is pending!! Please pay before deadline.");
		}
		else
		{
			System.out.println("Enter valid one!");
		}
			
	}
}





public class Student_Management {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter student id: " );
		int id=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter student name: ");
		String name=sc.nextLine();
		studentdetails s=new studentdetails(id,name);
		System.out.print("Enter your age: ");
		int age=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter your Gender: ");
		String gender=sc.nextLine();
		System.out.print("Enter your email id: ");
		String email=sc.nextLine();
		System.out.print("Enter your department: ");
		String department=sc.nextLine();
		System.out.print("Enter your course: ");
		String course=sc.nextLine();
		System.out.print("Enter your year: ");
		int year=sc.nextInt();
		sc.nextLine();
		
		student_info s1=new student_info(age,gender,email,department,course,year);
		s.display();
		s1.display_info();
		System.out.println("");
		System.out.print("Enter total number of days present: ");
		int day=sc.nextInt();
		sc.nextLine();
		Attendance a=new Attendance();
		a.day=day;
		a.calculate();
		System.out.println("");
		System.out.print("Please mention if you have paid your fee: (paid,pending)");
		String fee=sc.nextLine();
		Fee f=new Fee();
		f.fee=fee;
		f.display_fee();

	}

}
