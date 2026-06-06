package Day_12;
import java.io.*;

public class Writing {
	public static void main(String[] args) {
		try {
			FileWriter writer = new FileWriter("surabhi.txt");
			
			writer.write("Welcome to Java IO Classes");
			writer.write("\nLearning File Handling");
 
			writer.close();
			System.out.println("Data Written Successfully");
			}
 
		catch(IOException e)
            {
            	System.out.println(e);
            }
	}

}
