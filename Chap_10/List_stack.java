package Collections;
import java.util.*;

public class List_stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> list =new Stack<>();
		list.push("SUji");
		list.push("Pappu");
		list.push("Pinky");
		list.push("Ammu");
		System.out.println("Displaying elements "+list);
		System.out.println("Top element: "+list.peek());
		System.out.println("Pop operation: "+list.pop()+list);
		System.out.println("Check empty: "+list.empty());
		System.out.println("Search: "+list.search(list));

	}

}
