package Test2;

import java.util.Scanner;

interface management
{
	void stu_details();
}

class Students implements management
{
	int id;
	String name;
	String course;
	String department;
	
	Students()
	{
		
	}
	Students(int id, String name, String course, String department)
	{
		this.id=id;
		this.name=name;
		this.course=course;
		this.department=department;
		
	}
	public void stu_details()
	{
		System.out.println("");
		System.out.println("Displaying details....");
		System.out.println("Id: "+id);
		System.out.println("Name: "+name);
		System.out.println("Course: "+course);
		System.out.println("Department: "+department);
	}
}

class Library extends Students
{
	int book_id;
	String book_name;
	String author;
	String status;
	
	Library()
	{
		
	}
	Library(int book_id,String book_name,String author,String status)
	{
		this.book_id=book_id;
		this.book_name=book_name;
		this.author=author;
		this.status=status;
	}
	public void display()
	{
		System.out.println("");
		System.out.println("Book Id: "+book_id);
		System.out.println("Book Name: "+book_name);
		System.out.println("Author name: "+author);
		System.out.println("Status: "+status);
	}
}

class lib_action extends Library
{
	String status;
    int issue_days;

    lib_action()
    {
    
    }
    

    public void actionss(int choice, Scanner sc)
    {
        switch(choice)
        {
        case 1:
            System.out.println("");

            if(status.equals("Issued"))
            {
                System.out.println("Book is already issued.");
            }
            else
            {
                System.out.println("Enter number of days for the issue: ");
                issue_days = sc.nextInt();

                status = "Issued";

                System.out.println("Book issued successfully.");
                System.out.println("Book Name: " + book_name);
                System.out.println("Issue Duration: " + issue_days + " days");
            }

            break;


        case 2:
            if(status.equals("Available"))
            {
                System.out.println("This book is available.");
            }
            else
            {
                status = "Available";
                issue_days = 0;

                System.out.println("Book returned successfully.");
            }

            break;


        case 3:
            System.out.println("Book Name: " + book_name);
            System.out.println("Status: " + status);

            if(status.equals("Issued"))
            {
                System.out.println("Issue Duration: " + issue_days + " days");
            }

            break;


        default:

            System.out.println("Enter a valid option!");
        }
}
}
public class Library_management {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter id: ");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter name: ");
		String name=sc.nextLine();
		System.out.print("Enter course: ");
		String course =sc.nextLine();
		System.out.print("Enter department: ");
		String department=sc.nextLine();
		
		System.out.print("Enter Book ID: ");
		int book_id=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Book Name: ");
		String book_name=sc.nextLine();
		System.out.print("Enter author of book: ");
		String author=sc.nextLine();
		System.out.print("Enter the status: ");
		String status=sc.nextLine();
		
		lib_action l=new lib_action();
		l.id=id;
		l.name=name;
		l.course=course;
		l.department=department;
		l.book_id=book_id;
		l.book_name=book_name;
		l.author=author;
		l.status="Available";
		
		l.stu_details();
		l.display();
		
		System.out.println("");
        System.out.println("1. Issue Book");
        System.out.println("2. Return Book");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        l.actionss(choice, sc);

	}

}

