package ch3_whileloop;

import java.util.*;

public class Num_dig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n=sc.nextInt();

        int count=0;

        while(n!=0) 
        {
            count++;
            n= n/10;
        }

        System.out.println("Number of digits is " + count);
	}

}
