package lesson7;

public class Therapist extends Doctors {
    void treatment () {
        System.out.println("treat flu");
    }

    public void assignDoctor(Patient patient) {
    if (patient.getTreatmentPlan() == 1) {
        Surgeon surgeon = new Surgeon();
        patient.setDoctor(surgeon);
        surgeon.treatment();
    } else if (patient.getTreatmentPlan() == 2) {
        Dentist dentist = new Dentist();
        patient.setDoctor(dentist);
        dentist.treatment();
    } else {
        patient.setDoctor(this);
        this.treatment();
    }
    }
}