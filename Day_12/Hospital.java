package Day_12;
import java.io.*;
import java.util.*;
public class Hospital {

    static Scanner sc = new Scanner(System.in);

    public static void addPatient() {
        try {
            FileWriter fw = new FileWriter("patients.txt", true);

            System.out.print("Enter ID: ");
            int id = sc.nextInt(); sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Disease: ");
            String disease = sc.nextLine();

            fw.write(id + "," + name + "," + disease + "\n");
            fw.close();

            FileWriter report = new FileWriter("report_" + id + ".txt");
            report.write("Medical Report\n");
            report.write("Patient ID: " + id + "\n");
            report.write("Name: " + name + "\n");
            report.write("Disease: " + disease + "\n");
            report.close();

            System.out.println("Patient record saved!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void viewPatients() {
        try {
            FileReader fr = new FileReader("patients.txt");
            int ch;
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }
            fr.close();
        } catch (Exception e) {
            System.out.println("No records.");
        }
    }

    public static void main(String[] args) {
        addPatient();
        viewPatients();
    }
}