package doctor;
import java.util.Random;

public class Pediatrist extends Doctor{
    Random rand = new Random();

    public void getSymptoms(){
        //получаем симптомы
        //compare();
    }
    public void setAnalyses(){
        //назначаем анализы
        System.out.println("Необходимо проверить пульс, прослушать легкие, измерить давление и температуру, сдать анализы крови и мочи");

    }
    public boolean getAnalyses(){
        boolean pulse = rand.nextBoolean();
        boolean lungs = rand.nextBoolean();
        boolean bloodPressure = rand.nextBoolean();
        boolean temperature = rand.nextBoolean();
        boolean bloodTest = rand.nextBoolean();
        boolean urineTest = rand.nextBoolean();
        return (pulse&&lungs&&bloodPressure&&temperature&&bloodTest&&urineTest);
    }
    public void setDiagnosis(){
        //ставим диагноз
        if (getAnalyses())
            System.out.println("Все в норме, посидите дома пару дней");
        else
            System.out.println("Необходимо усиленно лечиться и принимать лекарства");
    }
}
