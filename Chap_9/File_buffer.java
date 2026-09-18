package File_handling;
import java.io.*;
public class File_buffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		FileWriter f=new FileWriter("Output.txt",true);
		BufferedWriter b=new BufferedWriter(f);
		b.write("Hello");
		b.newLine();
		b.write("Gud morning");
		b.newLine();
		b.close();
		System.out.println("Success");
		}catch(IOException e)
		{
			System.out.println("Error");
		}
	}

}
