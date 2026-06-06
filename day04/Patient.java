package day04;
public class Patient {
	private int id;
	private String name;
	private int age;
	private String illness;
	public Patient(int id,String name,int age,String illness) {
		this.id=id;
		this.name=name;
		this.age=age;
		this.illness=illness;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getIllness() {
		return illness;
	}
	public void display() {
		System.out.println("ID:"+id+ ",Name:"+name+ ",Age:"+age+ ",Illness:"+illness);
	}

	interface PatientService{
		void registerPatient(Patient patient);
		void showPatients();
	}
	class PatientServiceImpl implements PatientService {
	    private Patient[] patients = new Patient[15];
	    private int count = 0;

	    public void registerPatient(Patient patient) {
	        if (count < patients.length) {
	            patients[count] = patient;
	            count++;
	        } else {
	            System.out.println("Patient list is full!");
	        }
	    }

	    public void showPatients() {
	        for (int i = 0; i < count; i++) {
	            patients[i].display();
	        }
	    }
	}

	abstract class Doctor {
	    protected String name;
	    protected String specialization;

	    public Doctor(String name, String specialization) {
	        this.name = name;
	        this.specialization = specialization;
	    }

	    abstract void diagnose(Patient patient);
	}

	class GeneralPhysician extends Doctor {
	    public GeneralPhysician(String name) {
	        super(name, "General");
	    }

	    void diagnose(Patient patient) {
	        System.out.println("Dr. " + name +
	                " treated " + patient.getName() +
	                " for " + patient.getIllness());
	    }
	}

	class Cardiologist extends Doctor {
	    public Cardiologist(String name) {
	        super(name, "Cardiology");
	    }

	    void diagnose(Patient patient) {
	        System.out.println("Dr. " + name +
	                " (Cardiologist) treated heart issue of " +
	                patient.getName());
	    }
	}
	class MainApp {
		  public static void main(String[] args) {
			  PatientService service = new PatientServiceImpl();

		        Patient p1 = new Patient(1, "vysh", 30, "Fever");
		        Patient p2 = new Patient(2, "vas", 45, "heart problem");

		        service.registerPatient(p1);
		        service.registerPatient(p2);

		        System.out.println("Patient Details:");
		        service.showPatients();

		        Doctor d1 = new GeneralPhysician("ram");
		        Doctor d2 = new Cardiologist("shiva");

		        System.out.println("\nDiagnosis:");
		        d1.diagnose(p1);
		        d2.diagnose(p2);
		    }

		
	}
	
}

