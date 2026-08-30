package Final_instance;
class Animal
{
    void eat()
    {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal
{
    void bark()
    {
        System.out.println("Dog barks");
    }
}


public class Instance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    Dog d = new Dog();

	        if(d instanceof Animal)
	        {
	            System.out.println("Dog is an instance of Animal");
	        }
	        else
	        {
	            System.out.println("Dog is not an instance of Animal");
	        }

	}

}
