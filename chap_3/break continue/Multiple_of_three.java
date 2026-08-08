package ch3_break_continue;

public class Multiple_of_three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=20;i++)
		{
			if(i%3==0)
			{
				continue;
			}
			System.out.println(i);
		}
	

	}

}
