package Day_11;
import  java.io.*;

public class FileHandling {
	public static void main(String[] args) {
		  try {
	            BufferedWriter writer = new BufferedWriter(new FileWriter("vasudha.txt"));

	            writer.write("Hello, this is buffered writing!");
	            writer.newLine();
	            writer.write("It improves performance.");

	            writer.close();
	            System.out.println("File written successfully");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
		
	}


