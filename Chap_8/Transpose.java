package array;

import java.util.Scanner;

public class Transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n=sc.nextInt();
		System.out.println("Enter the elements of array: ");
		int[][] arr=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++) {
			arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("The transpose of matrix is ");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				
				System.out.println(arr[j][i]);
			}
			System.out.println();			
		}

	}

}
