public class BmiApplication {

    public static void main(String[] args) {

        //PRINT->length
        System.out.println("Enter you length (cm): ");
        //INPUT->height
        int height = KeyboardUtility.readInt();
        //PRINT->weight
        System.out.println("Enter your weight (kg): ");
        //INPUT->weight
        int weight = KeyboardUtility.readInt();
        //CALCULATE->bmi
        float bmi = BmiUtility.calculateBmi(weight, height);
        //PRINT->bmi
        BmiUtility.printDiagnose(bmi);

    }
}
