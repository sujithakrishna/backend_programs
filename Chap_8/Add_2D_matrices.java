package array;

import java.util.Scanner;

public class Add_2D_matrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n=sc.nextInt();
		System.out.println("Enter the elements of first array: ");
		int arr[][] =new int[n][n];
		int sum=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++) {
			arr[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Enter elements of second array: ");
		int arr1[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr1[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				sum=arr[i][j]+arr1[i][j];
				System.out.println("Sum of array is "+sum);
			}
		}
		
	}

}
