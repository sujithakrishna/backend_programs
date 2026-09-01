package array;

import java.util.Scanner;

public class Sum_1D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n=sc.nextInt();
		System.out.println("Enter the elements of array: ");
		int[] arr=new int[n];
		int sum=0;
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			sum+=arr[i];
			
		}
		System.out.println("Sum of elements in array is "+sum);
		sc.close();
	}

}
