package ch3_pattern_printing;

public class Patter_multiply {
	public static void main(String[] args)
	{
		int n=2;
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				System.out.print(n+"\t");
				n+=2;
			}
			System.out.println();
		}
	}

}
