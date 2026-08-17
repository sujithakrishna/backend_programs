package Ch5_this;

public class Student {
	    int id;
	    String name;

	    Student(int id, String name)
	    {
	        this.id = id;
	        this.name = name;
	    }
	    void display(Student s)
	    {
	        System.out.println("ID: " + s.id);
	        System.out.println("Name: " + s.name);
	    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(1, "Suji");
        s1.display(s1);

	}

}
