package patient;

import Hospital.Hospital;

import java.util.Hashtable;
import java.util.Map;


public class Patient extends Hospital {
    /*pulse;
    bloodPressureS;
    bloodPressureD;
    temperature;
    bloodTestOk;
    urineTestOk;
    */
    public Map<String, Boolean> symptoms;


    public Patient() {
        symptoms = new Hashtable<String, Boolean>();

    }


    public void addSymptoms(String description, Boolean value) {
        symptoms.put(description, value);
    }

    public void deleteSymptoms(String description) {
        symptoms.remove(description);
    }

    public boolean areSymptoms(String description) {
        return symptoms.containsKey(description);
    }

    public void printSymptoms() {
        System.out.println(this.symptoms);
    }

    @Override
    public boolean equals(Object obj)
    {
        if(obj == this)
            return true;
        if(obj == null)
            return false;

        Patient tmp = (Patient)obj;
        for (Map.Entry entry : tmp.symptoms.entrySet() )
        {

            String s= (String) entry.getKey();
            Boolean b= (Boolean) entry.getValue();
            for( Map.Entry entry1 : this.symptoms.entrySet())
            {   String s1= (String) entry1.getKey();
                    Boolean b1= (Boolean) entry1.getValue();
                if(s==s1 && b!=b1)
                    return false;

            }
        }
        return true;

    }
}

