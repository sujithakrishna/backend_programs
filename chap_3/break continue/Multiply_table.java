package ch3_break_continue;

public class Multiply_table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		while(true)
		{
			if(5*i>30)
			{
				break;
			}
			System.out.println(i+ " * "+ "5"+ " = "+ 5*i);
			i++;
		}

	}

}
