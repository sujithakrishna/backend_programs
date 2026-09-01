package array;

import java.util.Scanner;

public class Print_student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter array elements: ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Student Marks: ");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
