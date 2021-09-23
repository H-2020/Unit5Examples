import java.util.Scanner;

public class BmiUtility {

    public static float calculateBmi(float weight,float height){
        float bmi = weight / ((height / 100F * height / 100F));
        return bmi;

    }


    public static void printDiagnose(float bmi) {

        System.out.println("your bmi is: "+ bmi);
    }
}
