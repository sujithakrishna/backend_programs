package array;

import java.util.Scanner;

public class Display_diagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n=sc.nextInt();
		System.out.println("Enter the element of array: ");
		int[][] arr=new int[n][n];
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				
				arr[i][j]=sc.nextInt();
			}
		}
		
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("The diagonal elements are "+arr[i][j]);
				}
			}
		}

	}

	}
