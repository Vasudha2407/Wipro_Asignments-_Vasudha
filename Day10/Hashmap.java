package Day10;
import java.util.*;
class Patient {
    int id;
    String name;

    Patient(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }
}

public class Hashmap {
	 HashMap<Integer, Patient> patients = new HashMap<>();

    public void addPatient(int id, String name) {
        if (patients.containsKey(id)) {
            System.out.println("Patient already exists!");
        } else {
            patients.put(id, new Patient(id, name));
            System.out.println("Patient added.");
        }
    }

 
    public void updatePatient(int id, String name) {
        if (patients.containsKey(id)) {
            patients.put(id, new Patient(id, name));
            System.out.println("Patient updated.");
        } else {
            System.out.println("Patient not found.");
        }
    }

    
    public void getPatient(int id) {
        System.out.println(patients.getOrDefault(id, null));
    }

    public void removePatient(int id) {
        patients.remove(id);
        System.out.println("Patient removed.");
    }

    public void listPatients() {
        for (Patient p : patients.values()) {
            System.out.println(p);
        }
    }


    public void exists(int id) {
        System.out.println(patients.containsKey(id));
    }

 
    public void count() {
        System.out.println("Total patients: " + patients.size());
    }

    
    public void clearAll() {
        patients.clear();
        System.out.println("System cleared.");
    }

	public static void main(String[] args) {
		  Hashmap h = new Hashmap();

	        h.addPatient(101, "vas");
	        h.addPatient(102, "vysh");
	        h.addPatient(101, "rup"); 

	        h.listPatients();
	        h.updatePatient(101, "Updated vas");
	        h.getPatient(101);
	        h.exists(102);
	        h.count();
	        h.removePatient(102);
	        h.clearAll();
		
	}

}
