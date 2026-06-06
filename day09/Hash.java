package day09;

import java.util.*;

public class Hash {
	  private Set<Integer> registeredPatients = new HashSet<>();

	
	    public String registerPatient(int patientId) {
	  
	        if (registeredPatients.contains(patientId)) {
	            return "Patient " + patientId + " is already registered.";
	        }

	      
	        registeredPatients.add(patientId);
	        return "Patient " + patientId + " added successfully.";
	    }

	    public void viewAllPatients() {
	        System.out.println("Registered Patients: " + registeredPatients);
	    }
	  
	  public static void main(String[] args) {
		  Hash hospital = new Hash();
		  System.out.println(hospital.registerPatient(101));
		  System.out.println(hospital.registerPatient(102));
		  System.out.println(hospital.registerPatient(101));
		  hospital.viewAllPatients();
	}
}