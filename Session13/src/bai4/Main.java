package bai4;

public class Main {
    static void main(String[] args) {
        EmergencyRoom em = new EmergencyRoom();
        em.patientCheckIn("A");
        em.patientCheckIn("B");
        em.emergencyCheckIn("C");
        em.treatPatient();

    }
}
