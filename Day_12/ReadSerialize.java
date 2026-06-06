package Day_12;
import java.io.*;

public class ReadSerialize {
	public static void main(String[] args) {
		 try {
	            FileInputStream fis = new FileInputStream("student.dat");
	            ObjectInputStream ois = new ObjectInputStream(fis);

	            Student s = (Student) ois.readObject();

	            ois.close();
	            fis.close();

	            System.out.println("ID: " + s.id);
	            System.out.println("Name: " + s.name);

	        } catch (IOException | ClassNotFoundException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	}

}
