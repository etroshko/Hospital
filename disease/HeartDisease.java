package disease;

import patient.Patient;

public class HeartDisease extends Patient {
    public HeartDisease() {
        symptoms.put("stomachAche", false);
        symptoms.put("heartAche", true);
        symptoms.put("runningNose", false);
        symptoms.put("soreThroat", false);
        symptoms.put("cough", false);
        symptoms.put("rash", false);
        symptoms.put("sneezing", false);
        symptoms.put("teak", false);
        symptoms.put("psychiatricDisorders", false);
        symptoms.put("convulsions", false);
        symptoms.put("insomnia", true);
    }
}
