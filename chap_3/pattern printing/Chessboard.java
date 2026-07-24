package ch3_pattern_printing;

public class Chessboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=8;
		int col =8;
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<col;j++)
			{
				if((i+j)%2==0)
				{
					System.out.print(" 0 ");	
				}
				else
				{
					System.out.print(" 1 ");
				}
			}
			System.out.println();
			
	}
	

	}

}
