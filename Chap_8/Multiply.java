package array;

import java.util.Scanner;

public class Multiply {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n=sc.nextInt();
		System.out.println("Enter the elements of first array: ");
		int[][] arr=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++) {
			arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the elements of second array: ");
		int[][] arr1=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr1[i][j]=sc.nextInt();
			}
		}
		System.out.println("The multiplication of matrix is ");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				int mul=0;
				for(int k=0;k<n;k++)
				{
					mul=mul+arr[i][k]*arr1[k][j];
				}
						
				System.out.println(mul+" ");
			}
			System.out.println();
		}

	}

}
