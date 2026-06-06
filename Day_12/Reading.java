package Day_12;
import java.io.*;
import java.io.IOException;

public class Reading {

	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader("surabhi.txt");
            int ch;
            
            while((ch=reader.read()) !=-1)
            {
            System.out.println((char) ch);
            }
			reader.close();
			}
 
		 	catch(IOException e)
            {
            	System.out.print(e);
            }

}
}