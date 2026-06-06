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

public class Treemap { 
	 private TreeMap<Integer, Patient> patients = new TreeMap<>();

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
	            System.out.println("Updated.");
	        } else {
	            System.out.println("Not found.");
	        }
	    }

	    public void getPatient(int id) {
	        System.out.println(patients.get(id));
	    }

	    public void removePatient(int id) {
	        patients.remove(id);
	    }

	    public void listPatients() {
	        for (Map.Entry<Integer, Patient> entry : patients.entrySet()) {
	            System.out.println(entry.getValue());
	        }
	    }

	    public void exists(int id) {
	        System.out.println(patients.containsKey(id));
	    }

	    public void count() {
	        System.out.println("Total: " + patients.size());
	    }

	    public void clearAll() {
	        patients.clear();
	    }

	    public static void main(String[] args) {
	        Treemap h = new Treemap();

	        h.addPatient(103, "ram");
	        h.addPatient(101, "nick");
	        h.addPatient(102, "raghu");

	        h.listPatients(); 
	    }
	
	}


