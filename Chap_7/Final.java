package Final_instance;
class Interest
{
    final double rate = 7.5;

    void calculate()
    {
        int principal = 10000;
        int yr = 2;

        double interest = (principal*rate*yr) / 100;

        System.out.println("Principal: " + principal);
        System.out.println("Interest Rate: " +rate);
        System.out.println("Year: " + yr);
        System.out.println("Simple Interest: " + interest);
    }
}
public class Final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interest i = new Interest();
        i.calculate();

	}

}
