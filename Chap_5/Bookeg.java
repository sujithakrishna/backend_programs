package Ch5_this;
class Book
{
	String author;
	String name;
	int price;
	
	Book()
	{
		this("Suji","The evil",12000);	
		
	}
	
	Book(String author,String name, int price)
	{
		
		this.author=author;
		this.name=name;
		this.price=price;
	}
	void display()
	{
		System.out.println("The author of book is "+author);
		System.out.println("The name of book is "+name);
		System.out.println("The price of book is "+price);
		
	}
	
}

public class Bookeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b=new Book();
		b.display();
		
		

	}

}
