package Ch_5;
class Student
{
	String name;
	int roll_no;
	int marks;
	
	Student()
	{
		name= "Suji";
		roll_no=123;
		marks=89;
	}
}

public class Default_marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		System.out.println("The name is "+s.name);
		System.out.println("The roll number is "+s.roll_no);
		System.out.println("The mark is "+s.marks);
	}

}
