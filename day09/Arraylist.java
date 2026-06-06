package day09;
import java.util.*;

class Patient {
    String name;
    int age;

    public Patient(String name, int age) {
        this.name = name;
        this.age = age;
    }

}

public class Arraylist {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        ArrayList<Patient> patients = new ArrayList<>();

	        while (true) {
	            System.out.println("\n--- Patient Management System ---");
	            System.out.println("1. Add Patient");
	            System.out.println("2. View All Patients");
	            System.out.println("3. Search Patient");
	            System.out.println("4. Exit");
	            System.out.print("Enter choice: ");

	            int choice = sc.nextInt();
	            sc.nextLine(); 

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter name: ");
	                    String name = sc.nextLine();

	                    System.out.print("Enter age: ");
	                    int age = sc.nextInt();

	                    patients.add(new Patient(name, age));
	                    System.out.println("Patient added.");
	                    break;

	                case 2:
	                    if (patients.isEmpty()) {
	                        System.out.println("No patients found.");
	                    } else {
	                        for (Patient p : patients) {
	                            System.out.println(p);
	                        }
	                    }
	                    break;

	                case 3:
	                    System.out.print("Enter name to search: ");
	                    String searchName = sc.nextLine();
	                    boolean found = false;

	                    for (Patient p : patients) {
	                        if (p.name.equalsIgnoreCase(searchName)) {
	                            System.out.println("Found: " + p);
	                            found = true;
	                        }
	                    }

	                    if (!found) {
	                        System.out.println("Patient not found.");
	                    }
	                    break;

	                case 4:
	                    System.out.println("Exiting...");
	                    return;

	                default:
	                    System.out.println("Invalid choice.");
	            }
	        }
	    }
	

}
