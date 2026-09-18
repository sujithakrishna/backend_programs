package File_handling;
import java.io.*;
public class BufferReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader f=new FileReader("output.txt");
			BufferedReader b=new BufferedReader(f);
			String l=b.readLine();
			while(l!=null)
			{
				System.out.println(l);
				l=b.readLine();
				
			}
			b.close();
		}catch(IOException e)
		{
			System.out.println("Error");
		}

	}

}
