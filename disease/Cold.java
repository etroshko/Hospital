package disease;

import patient.Patient;

public class Cold extends Patient {

    public Cold() {
        symptoms.put("stomachAche", false);
        symptoms.put("heartAche", false);
        symptoms.put("runningNose", true);
        symptoms.put("soreThroat", true);
        symptoms.put("cough", true);
        symptoms.put("rash", false);
        symptoms.put("sneezing", true);
        symptoms.put("teak", false);
        symptoms.put("psychiatricDisorders", false);
        symptoms.put("convulsions", false);
        symptoms.put("insomnia", false);

    }
}

