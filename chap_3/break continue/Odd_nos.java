package ch3_break_continue;

public class Odd_nos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=15;i++)
		{
			if(i%2==0)
			{
				continue;
			}
			System.out.println(i);
		}

	}

}
