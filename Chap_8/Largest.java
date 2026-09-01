package array;

import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n=sc.nextInt();
		System.out.println("Enter the elements of array: ");
		int[] arr= new int[n];
		int large=arr[0];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			
			if(arr[i]>large)
			{
				large=arr[i];
				
			}
		}
		System.out.println("The largest number is "+large);

	}

}
