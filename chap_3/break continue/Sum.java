package ch3_break_continue;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0;i<=20;i++)
		{
			sum+=i;
			if(sum>=50)
			{
				break;
			}
			System.out.println(i);
		}
		System.out.println("the sum is "+sum);
	}

}
