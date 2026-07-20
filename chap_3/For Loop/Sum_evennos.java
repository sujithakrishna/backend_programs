package For_loop;

public class Sum_evennos {
	public static void main(String[] args)
	{
		int n=20;
		int sum=0;
		
		for(int i=0;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.println("The even number is "+i);
				sum+=i;
			}
		
		
		
	}

		System.out.println("The sum of even numbers is: "+sum);
}
}
