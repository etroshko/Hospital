import Hospital.Hospital;
import disease.Allergy;
import disease.Cold;
import patient.Patient;

public class Poli {
    public static void main(String[] args) {

        //Scanner scan = new Scanner(System.in);
        Cold cold = new Cold();
        Allergy allergy = new Allergy();
        //Patient lal = new Patient();
        Patient lal = new Patient();
        //Patient a=new Patient();


        lal.addSymptoms("stomachAche", false);
        lal.addSymptoms("heartAche", false);
        lal.addSymptoms("runningNose", true);
        lal.addSymptoms("soreThroat", true);
        lal.addSymptoms("cough", true);
        lal.addSymptoms("rash", false);
        lal.addSymptoms("sneezing", true);
        lal.addSymptoms("teak", false);
        lal.addSymptoms("psychiatricDisorders", false);
        lal.addSymptoms("convulsions", false);
        lal.addSymptoms("insomnia", false);

        Hospital a=lal;
        Hospital b=cold;
        Hospital c=allergy;

        a.setPatient(lal);
        b.setPatient(cold);
        c.setPatient(allergy);
        a.printSymptoms();
        b.printSymptoms();
        c.printSymptoms();

        System.out.println(a.equals(b));
        System.out.println(a.equals(c));


        }





    }


