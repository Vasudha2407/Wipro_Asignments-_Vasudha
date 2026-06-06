package Day_12;
import java.io.*;

public class Filecreation {
	public static void main(String[] args) {
		
				try {
					
					File file = new File("surabhi.txt");
					if(file.createNewFile())
					{
						System.out.println("File Created Successfully");
				    }
					else
					{
						System.out.println("File Already Exists");
		            }
					}
				catch(IOException e)
		            {
		            	System.out.println(e);
		            }
			}
			}
