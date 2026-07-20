package For_loop;

public class Sum_oddnos {
	public static void main(String[] args)
	{
		int n=15;
		int sum =0;
		
		for(int i=0;i<=n;i++)
		{
			if(i%2!=0)
			{
				System.out.println("The odd number is "+i);
				sum+=i;
			}
		}
		System.out.println("The sum of odd number are "+ sum);
	}

	
}
