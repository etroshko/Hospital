package disease;

import patient.Patient;

public class NervousBreakdown extends Patient {
    public NervousBreakdown() {
        symptoms.put("stomachAche", false);
        symptoms.put("heartAche", false);
        symptoms.put("runningNose", false);
        symptoms.put("soreThroat", false);
        symptoms.put("cough", false);
        symptoms.put("rash", false);
        symptoms.put("sneezing", false);
        symptoms.put("teak", true);
        symptoms.put("psychiatricDisorders", true);
        symptoms.put("convulsions", false);
        symptoms.put("insomnia", true);
    }
}
