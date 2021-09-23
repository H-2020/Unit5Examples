public class Opdracht03 {

    public static void main(String[] args) {

        //DECLARATION AND INITIALIZATION
        short aShort=5;
        int anInt;
        anInt=aShort;
        //PRINT
        System.out.println(aShort);
        System.out.println(anInt);

        System.out.println("**************************");

        //DECLARATION AND INITIALIZATION
        short aShort2;
        int anInt2=600_000;

        //CASTING
        aShort2=(short)anInt2;
        //PRINT
        System.out.println(aShort2);
        System.out.println(anInt2);

        System.out.println("*****************************");

        //DECLARATION AND INITIALIZATION
        char aChar='a';
        anInt=aChar;
        //PRINT
        System.out.println(anInt);

        //DECLARATION
        byte aByte;

        //CASTING
        aByte=(byte)aShort;
        //PRINT
        System.out.println(aByte);

    }
}
