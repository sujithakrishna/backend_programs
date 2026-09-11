package String;

import java.util.*;

public class Compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string:");
        String str1 = sc.nextLine();

        System.out.println("Enter second string:");
        String str2 = sc.nextLine();

        if (str1.equals(str2)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }

	}

}
