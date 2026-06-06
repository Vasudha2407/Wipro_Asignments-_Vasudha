package Day_12;
import java.io.*;
class Student implements Serializable{

    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class Serialize {
	public static void main(String[] args) {
		 Student s1 = new Student(1, "Surabhi");

	        try {
	            FileOutputStream fos = new FileOutputStream("student.dat");
	            ObjectOutputStream oos = new ObjectOutputStream(fos);

	            oos.writeObject(s1);

	            oos.close();
	            fos.close();

	            System.out.println("Object saved to file");

	        } catch (IOException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
		
	}

}
