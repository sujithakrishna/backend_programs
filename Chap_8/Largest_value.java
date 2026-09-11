package Jagged_array;

import java.util.*;

public class Largest_value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        int[][] arr = new int[rows][];

        for (int i = 0; i < rows; i++) {

            System.out.print("Enter number of elements in row " + (i + 1) + ": ");
            int size = sc.nextInt();

            arr[i] = new int[size];

            System.out.println("Enter elements:");

            for (int j = 0; j < size; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {

            int largest = arr[i][0];

            for (int j = 1; j < arr[i].length; j++) {

                if (arr[i][j] > largest) {
                    largest = arr[i][j];
                }
            }

            System.out.println("Largest in Row " + (i + 1) + ": " + largest);
        }

	}

}
