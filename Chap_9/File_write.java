package File_handling;
import java.io.*;

public class File_write {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter f=new FileWriter("output.txt");
			f.write("Gud Mrng!!");
			f.close();
			System.out.println("Success");
		}catch(IOException e)
		{
			System.out.println("Error");
		}
		

	}

}
