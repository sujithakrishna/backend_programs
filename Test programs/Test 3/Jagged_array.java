package Test3;

import java.util.Scanner;

public class Jagged_array
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n=sc.nextInt();

        int[][] arr=new int[n][];

        for(int i=0;i<n;i++)
        {
            System.out.print("Enter number of elements in row ");
            int size=sc.nextInt();

            arr[i]=new int[size];
            System.out.println("Enter elements:");
            for(int j = 0; j < size; j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("Jagged Array:");

        for(int i = 0; i < n; i++)
        {
            for(int j=0; j<arr[i].length; j++)
            {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}