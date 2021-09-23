public class Opdracht12 {

    public static void main(String[] args) {

        //DECLARATION AND INITIALIZATION
        int a = 1;
        int b = 2;
        int result=0;
        int c=++a * b-- +b;

        //PRINT
        System.out.println(c);
        //int result = ++a * b-- +b < 2 ? --a : ++b;
        //IF
        if (++a * b-- +b<2){
            result= --a;
        }
        //ELSE
        else{
            result=++b;
        }
        //PRINT
        System.out.println(result);
    }
}
