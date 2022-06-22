package openjava.core.variables;

public class VariableClassOfJava {
    public static void main(String[] args) {


        // number related
        int APGVB = 2147483647;
        APGVB=123;
         long Swiss = 9223372036854775807L;

        float marks = 2147483647f;
        double usB = 9223372036854775807d;

        boolean doYouWantToBeSomething = false;
        char ch1 = '1';
//        char ch2 = 'ayu';
        char ch3 = '=';

        // defalut values of variables
        String  ch5 = null;
        int height = 0;
        boolean bool = false;

        byte bite =  -111;

//        System.out.println(ch1);
////        System.out.println(ch2);
//        System.out.println(ch5);
//        System.out.println(ch3);


        byte bitByte = (byte) 712345118;
        System.out.println(bitByte);
        System.out.println(APGVB);
//        System.out.println("Swiss bank  "+ Swiss); // concatination  this is single line comment
        /** *
         * what is variable declaration & assigning?
         *
         *
         * **/

        String practiceProgramming;  // declaration
        practiceProgramming = "yes , i'm practicing programming daily";  // assigning

//        System.out.println(practiceProgramming);


        /***** 18/06/2022 *****/
        /***** Type casting*****/

        double myDouble = 9.78456789d;
//        System.out.println(myDouble);

        int num = 123;
        int myNumber = num;
        int myInt = (int) myDouble;
//        System.out.println(myInt);


        /***** type of Operators *****/

        int num1 = 1000;
        int num2 = 10;

        int result = num1/num2;
        int output = result/10;
        int oPut = output/10;
        int err = oPut/10;
        System.out.println(result);
        System.out.println(output);
        System.out.println(oPut);
        System.out.println(err);

        







    }


}
