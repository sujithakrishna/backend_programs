package ch_3_switch;
import java.util.*;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter an alphabet:(a-z) ");
        char ch = sc.next().charAt(0);

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vowel.");
                break;

            default:
                if (ch >= 'a' && ch <= 'z') {
                    System.out.println("Consonant.");
                } else {
                    System.out.println("Please enter a alphabet");
                }
        }


	}

}
