package Jagged_array;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int[][] marks = {
		            {80, 75, 90},
		            {85, 70, 88, 92},
		            {78, 82}
		        };

		        for (int i = 0; i < marks.length; i++) {
		            System.out.print("Student " + (i + 1) + ": ");

		            for (int j = 0; j < marks[i].length; j++) {
		                System.out.print(marks[i][j] + " ");
		            }

		            System.out.println();
		        }
	}

}
