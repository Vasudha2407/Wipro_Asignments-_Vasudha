package day3;

public class patient {
	private String name;
    private String diagnosis; 

    public Patient(String name, String diagnosis) {
        this.name = name;
        this.diagnosis = diagnosis;
    }

    public String getDiagnosis(String role) {
        if (role.equals("doctor")) {
            return diagnosis;
        }
        return "Access Denied";
    }

    public String getName() {
        return name;
    }

}
