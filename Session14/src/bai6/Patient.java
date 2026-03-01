package bai6;

public class Patient {
    private String name;
    private int age;
    private String treatmentDepartment;

    public Patient() {
    }

    public Patient(String name, int age, String treatmentDepartment) {
        this.name = name;
        this.age = age;
        this.treatmentDepartment = treatmentDepartment;
    }

    public String getTreatmentDepartment() {
        return treatmentDepartment;
    }

    @Override
    public String toString() {
        return name;
    }
}
