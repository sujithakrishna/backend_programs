package Test1;

import java.util.*;

public class Vowels_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String a=sc.nextLine();

        int count=0;

        for (int i=0;i<a.length();i++) {
            char ch=a.charAt(i);

            if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
                ch=='A' || ch=='E' || ch=='I'|| ch=='O' || ch=='U') {
                count++;
            }
        }

        System.out.println("Vowels = " + count);
	}
}
