package Collections;
import java.util.*;
public class List_vector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> list=new Vector<>();
		list.addElement("Suji");
		list.addElement("Pappu");
		list.addElement("Arjun");
		System.out.println("Displating list: "+list);
		System.out.println("Value at index 1: "+list.elementAt(1));
		list.removeElementAt(1);
		System.out.println("Removing element at index 1: "+list);
		list.removeAllElements();
		System.out.println("Removing all elements: "+list);

	}

}
