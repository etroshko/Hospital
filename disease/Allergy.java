package disease;

import patient.Patient;

public class Allergy extends Patient {
    public Allergy() {
        symptoms.put("stomachAche", false);
        symptoms.put("heartAche", false);
        symptoms.put("runningNose", false);
        symptoms.put("soreThroat", true);
        symptoms.put("cough", false);
        symptoms.put("rash", true);
        symptoms.put("sneezing", true);
        symptoms.put("teak", false);
        symptoms.put("psychiatricDisorders", false);
        symptoms.put("convulsions", false);
        symptoms.put("insomnia", false);
    }
}
