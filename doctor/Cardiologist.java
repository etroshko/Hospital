package doctor;
import java.util.Random;

public class Cardiologist extends Doctor {
    Random rand = new Random();

    public void getSymptoms(){
        //получаем симптомы
        //compare();
    }
    public void setAnalyses(){
        //назначаем анализы
        System.out.println("Необходимо сдать анализ крови и пройти ЭКГ");
    }
    public boolean getAnalyses(){
        //назначаем анализы
        boolean cardioTest = rand.nextBoolean();
        boolean bloodTest = rand.nextBoolean();
        return cardioTest&&bloodTest;
    }
    public void setDiagnosis(){
        //ставим диагноз
        if (getAnalyses())
            System.out.println("Анализы неплохие, серьезное лечение не требуется");
        else
            System.out.println("Анализы плохие, необходимо стационарное лечение");
    }
}
