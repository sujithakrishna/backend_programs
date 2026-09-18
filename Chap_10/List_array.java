package Collections;
import java.util.*;
public class List_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<>();
		list.add("Suji");
		list.add("Pinky");
		list.add("Swathi");
		list.add(2,"Ammu");
		
		System.out.println("Displaying list: "+list);
		list.remove(1);
		System.out.println("After removing value at index 1: "+list);
		System.out.println("Getting value at index 2 : "+list.get(2));
		
		System.out.println("After updating the value at index 2: "+list.set(2, "Pinky")+list);
		System.out.println("The size of elements is "+list.size());
		System.out.println("Check if list contains value Ammu "+list.contains("Ammu"));
		System.out.println("Check if list is empty: "+list.isEmpty());
		list.clear();
		System.out.println("Deleting all elements from list ");
		System.out.println("Checking elements after removing: "+list.isEmpty());
		

	}

}
