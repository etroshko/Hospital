package doctor;
import java.util.Random;

public class Neurologist extends Doctor {
    Random rand = new Random();

    public void getSymptoms(){
        //получаем симптомы
        //compare();
    }
    public void setAnalyses(){
        //назначаем анализы
        System.out.println("Необходимо пройти психологический тест");
    }
    public boolean getAnalyses(){
        boolean someNeurologicalStuff = rand.nextBoolean();
        return someNeurologicalStuff;
    }
    public void setDiagnosis(){
        //ставим диагноз
        if (getAnalyses())
            System.out.println("Все в норме, нужно отдохнуть дома");
        else
            System.out.println("Нужна помощь психолога");
    }
}
