package ch3_pattern_printing;

public class Hollow_hourglass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
        
        for (int i = n; i >= 1; i--)
        {
           
            for (int j = n; j > i; j--) 
            {
                System.out.print(" ");
            }
         
            for (int k = 1; k <= (2 * i - 1); k++) 
            {
              
                if (i == n || k == 1 || k == (2 * i - 1))
                {
                    System.out.print("*");
                } 
                else 
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int i = 2; i <= n; i++)
        {
          
            for (int j = n; j > i; j--) 
            {
                System.out.print(" ");
            }
          
            for (int k = 1; k <= (2 * i - 1); k++)
            {
               
                if (i == n || k == 1 || k == (2 * i - 1)) 
                {
                    System.out.print("*");
                }
                else 
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

	}

}
