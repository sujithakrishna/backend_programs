package array;

import java.util.Scanner;

public class Reverse_order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements of array: ");
		int n=sc.nextInt();
		System.out.println("Enter the elements of array: ");
		int[] arr=new int[n];
		
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("The reverse is ");

		for(int i=n-1;i>=0;i--)
		{
			
			System.out.print(arr[i]+" ");
			
		}
		
	}

}
