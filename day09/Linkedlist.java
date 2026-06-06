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

public class Linkedlist {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        LinkedList<Patient> hospital = new LinkedList<>();

	        while (true) {
	            System.out.println("\n--- Hospital Queue System ---");
	            System.out.println("1. Add Patient (Normal)");
	            System.out.println("2. Add Emergency Patient");
	            System.out.println("3. Remove Patient");
	            System.out.println("4. View hospital");
	            System.out.println("5. Check First & Last");
	            System.out.println("6. Exit");
	            System.out.print("Enter choice: ");

	            int choice = sc.nextInt();
	            sc.nextLine();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter name: ");
	                    String name = sc.nextLine();

	                    System.out.print("Enter age: ");
	                    int age = sc.nextInt();
	                    hospital.addLast(new Patient(name, age));
	                    System.out.println("Patient added to queue.");
	                    break;

	                case 2:
	                    System.out.print("Enter name: ");
	                    String ename = sc.nextLine();

	                    System.out.print("Enter age: ");
	                    int eage = sc.nextInt();

	                    hospital.addFirst(new Patient(ename, eage));
	                    System.out.println("Emergency patient added.");
	                    break;

	                case 3:
	                    if (hospital.isEmpty()) {
	                        System.out.println("hospital is empty.");
	                    } else {
	                        Patient removed = hospital.removeFirst();
	                        System.out.println("Removed: " + removed);
	                    }
	                    break;

	                case 4:
	                    if (hospital.isEmpty()) {
	                        System.out.println("hospital is empty.");
	                    } else {
	                        for (Patient p : hospital) {
	                            System.out.println(p);
	                        }
	                    }
	                    break;

	                case 5:
	                    if (hospital.isEmpty()) {
	                        System.out.println("hospital is empty.");
	                    } else {
	                        System.out.println("First: " + hospital.getFirst());
	                        System.out.println("Last: " + hospital.getLast());
	                    }
	                    break;

	                case 6:
	                    System.out.println("Exiting...");
	                    return;

	                default:
	                    System.out.println("Invalid choice.");
	            }
	        }
	    }

}
