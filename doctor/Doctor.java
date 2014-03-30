package doctor;
import java.util.ArrayList;

public abstract class Doctor {
    public abstract void getSymptoms();
    //получаем симптомы
    public abstract void setAnalyses();
    //назначаем анализы
    public abstract boolean getAnalyses();
    //получаем результаты анализов
    public abstract void setDiagnosis();
    //ставим диагноз
}

