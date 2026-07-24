package ch3_pattern_printing;

public class Hollow_inverter_tri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		for(int i =1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j==n|| i==j || i==1 )
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		

	}

}
