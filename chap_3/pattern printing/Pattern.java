package ch3_pattern_printing;

public class Pattern {
	public static void main(String[] args)
	{
		for (int i=0;i<3;i++)
		{
			for (int j=0; j<3;j++)
			{
				if(i==j)
				{
					System.out.print("1"+"\t");
				}
				else
				{
					System.out.print("0" + "\t");
				}
			}
			System.out.println();
	}

	}

}
