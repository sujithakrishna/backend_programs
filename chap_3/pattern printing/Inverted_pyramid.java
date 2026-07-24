package ch3_pattern_printing;

public class Inverted_pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=5;
		
		for(int i=rows; i>=1;i--)
		{
			for(int j=0; j<rows-i;j++)
			{
				System.out.print(" ");
			}
				for(int k=0; k<(2*i)-1;k++)
				{
					System.out.print("*");
					
			
				}
				System.out.println();
		}
			
		
			
		}

	}


