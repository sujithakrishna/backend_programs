package For_loop;

import java.util.Scanner;
public class Reverse_string {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the word to be reversed: ");
		String a=sc.nextLine();
		
		String reverse="";
		
		for(int i=a.length()-1;i>=0;i--)
		{
			
			reverse+=a.charAt(i);	
			
		}
		System.out.println("The reversed word is: "+reverse);
				
	}

}


