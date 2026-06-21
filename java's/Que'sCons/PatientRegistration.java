class PatientRegistration {
    String patientName;
    String disease;

    {
        System.out.println("Patient Registration Started");
    }

    PatientRegistration() {
        this("Unknown", "Not Specified");
    }

    PatientRegistration(String patientName) {
        this(patientName, "Not Specified");
    }

    PatientRegistration(String patientName, String disease) {
        this.patientName = patientName;
        this.disease = disease;

        System.out.println("Patient: " + patientName);
        System.out.println("Disease: " + disease);
    }

    public static void main(String[] args) {
        new PatientRegistration("Rohan", "Fever");
    }
}