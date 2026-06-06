package Day_12;
import java.io.*;


class Employe implements Serializable {
    int id;
    String name;
    double salary;

    Employe(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}


public class Employee {
    public static void main(String[] args) {

        Employe emp = new Employe(101, "vas", 50000); 

        try {
            FileOutputStream fos = new FileOutputStream("employee.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(emp);
            oos.close();
            fos.close();

            System.out.println("Employee object saved.");

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fis = new FileInputStream("employee.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Employe e = (Employe) ois.readObject(); // ✅ FIX
            ois.close();
            fis.close();

            System.out.println("\nEmployee Details:");
            System.out.println(e.id + " " + e.name + " " + e.salary);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}