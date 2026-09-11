package Jagged_array;

public class Total {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[][] arr = {
		            {10, 20},
		            {30, 40, 50, 60},
		            {70, 80, 90}
		        };

		        int total = 0;

		        for (int i = 0; i < arr.length; i++) {

		            total = total + arr[i].length;
		        }

		        System.out.println("Total number of elements: " + total);

	}

}
