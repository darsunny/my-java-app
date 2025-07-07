package lesson7;

public class Clinic {
    public static void main(String[] args) {
        Patient patient = new Patient();
        patient.setTreatmentPlan(8);

        Therapist therapist = new Therapist();
        therapist.assignDoctor(patient);
    }
}
