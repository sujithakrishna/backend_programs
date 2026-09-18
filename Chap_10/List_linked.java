package Collections;
import java.util.*;
public class List_linked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list=new LinkedList<>();
		System.out.println("Adding Elements:");
		list.addFirst("Suji");
		list.add("Pinky");
		list.add("Ammu");
		list.addLast("Pappu");
		System.out.println("Displaying all elements: "+list);
		System.out.println("First element: "+list.getFirst());
		System.out.println("Last element: "+list.getLast());
		System.out.println("Removing first element: "+list.removeFirst());
		System.out.println("Removing last element: "+list.removeLast());
		System.out.println("Queue element: "+list.offer("Pinky")+list);
		System.out.println("Remove Queue: "+list.poll()+list);
		
		

	}

}
