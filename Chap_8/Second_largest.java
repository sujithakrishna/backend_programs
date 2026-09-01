package array;

import java.util.Scanner;

public class Second_largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n=sc.nextInt();
		System.out.println("Enter the elements of array: ");
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int large=arr[0];
		int second=arr[0];
		for(int i=1;i<n;i++)
		{
			if(arr[i]>large)
			{
				second=large;
				large=arr[i];
				
			}
			else if(arr[i]>second && arr[i]!=large)
			{
				second=arr[i];
			}
		}
		System.out.println("Second larges is "+second);

	}

}
