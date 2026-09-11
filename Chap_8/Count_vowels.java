package String;

import java.util.*;

public class Count_vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        System.out.println("Enter a string:");
	        String str = sc.nextLine();

	        int count = 0;

	        for (int i = 0; i < str.length(); i++) {

	            char ch = str.charAt(i);

	            if (ch == 'a' || ch == 'e' || ch == 'i' ||
	                ch == 'o' || ch == 'u') {

	                count++;
	            }
	        }

	        System.out.println("Number of vowels: " + count);

	}

}
