import java.sql.SQLOutput;

public class Opdracht04 {

    public static void main(String[] args) {
        //DECLARATION AND INITIALIZATION
        byte b1 = 7;
        byte b2 = 5;
        byte result;
        // CASTING
       result = (byte) (b1 * b2);

       //PRINT
       System.out.println("b1 is " + b1);
        System.out.println("b2 is " + b2);
        System.out.println("result is: "+ result);

        String SEPARATOR="----------------------------";
        System.out.println(SEPARATOR);

        //DECLARATION AND INITIALIZATION
        int number1=9;
        int number2=8;
        //CALCULATION
        int sum=number1+number2;
        int min=number1-number2;
        int mul=number1*number2;
        int div=number1/number2;
        int number1S=number1++;
        int number1N=number1--;


        //PRINT
        System.out.println("sum: "+sum);
        System.out.println("min: "+min);
        System.out.println("mul: "+mul);
        System.out.println("div: "+div);
        System.out.println("numbers1S: "+ number1S);
        System.out.println("numbers1n: "+number1N);



    }
}
