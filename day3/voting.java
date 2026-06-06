package day3;

public class voting {private String name;
private String diagnosis; // sensitive

public Patient(String name, String diagnosis) {
    this.name = name;
    this.diagnosis = diagnosis;
}

// Controlled access
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
