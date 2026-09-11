package String;

import java.util.Scanner;

public class Starts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        if (str.startsWith("Hello")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

	}

}
