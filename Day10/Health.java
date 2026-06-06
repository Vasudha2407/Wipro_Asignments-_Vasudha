package Day10;
import java.util.*;
class Patient implements Comparable<Patient>{
	private int id;
	private String name;
	 public Patient(int id, String name) {
	        this.id = id;
	        this.name = name;
	    }

	    public int getId() {
	        return id;
	    }
	    @Override
	    public int compareTo(Patient other) {
	        return Integer.compare(this.id, other.id);
	    }

	  
	
	    @Override
	    public String toString() {
	        return "Patient ID: " + id + ", Name: " + name;
	    }
	}

	

public class Health {
	public static void main(String[] args) {
		TreeSet<Patient> patients = new TreeSet<>();

        patients.add(new Patient(101, "vas"));
        patients.add( new Patient(102, "vysh"));
        patients.add( new Patient(101, " rupa")); 

        System.out.println("Registered Patients:");
        for (Patient p : patients) {
            System.out.println(p);
        }
    }

  
		
	}


