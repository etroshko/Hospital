package Hospital;


import doctor.Doctor;
import patient.Patient;

 public abstract class Hospital {
    private Patient patient;
    private Doctor doctor;

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    public Hospital getPatient() {
         return this.patient;
     }

    public abstract void printSymptoms();



 }
