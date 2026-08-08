package Ch_5;
class Book
{
	String title;
	String author;
	
	Book(String n, String m)
	{
		title=n;
		author=m;
		
		System.out.println("The title of book is "+n);
		System.out.println("The author of book is "+m);
	}
}
public class Param_book {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Book("The dark side", "Suji");
		System.out.println();
		new Book("The misson","Arjun");
		

	}

}
