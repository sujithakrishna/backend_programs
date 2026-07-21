package ch3_pattern_printing;

public class Patern_Ab {
	public static void main(String[] args)
	{
		int n= 5; 

        for (int i = 1; i <= n; i++) {
            char ch = 'A'; 
        
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + "\t");
                ch++; 
            }
            
            System.out.println(); 
        }
    }

	}


