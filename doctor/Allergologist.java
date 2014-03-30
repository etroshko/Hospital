package doctor;
import java.util.Random;

public class Allergologist extends Doctor{
    Random rand = new Random();

    public void getSymptoms(){
        //получаем симптомы
        //compare();
    }
    public void setAnalyses(){
        //назначаем анализы
        System.out.println("Необходимо провести анализы крови и тест на аллергены");
    }
    public boolean getAnalyses(){
        //назначаем анализы
        boolean bloodTest = rand.nextBoolean();
        boolean allergensTest = rand.nextBoolean();
        return bloodTest&&allergensTest;
    }
    public void setDiagnosis(){
        //ставим диагноз
        if (getAnalyses())
            System.out.println("Результаты неплохие, серьезное лечение не требуется");
        else
            System.out.println("Результаты анализов плохие, необходимо пройти курс стационарного лечения");
    }
}
