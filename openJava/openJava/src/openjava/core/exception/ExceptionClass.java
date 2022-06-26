package openjava.core.exception;

public class ExceptionClass {
    public static void main(String[] args) {
//        System.out.println(divideTwoNumbers(value1, value2));
        System.out.println(sumTwoNumbers(value1));
        System.out.println(getRemainder(divider,divisor));
    }
   static int value1=100;
   static int value2=0;
    static int result;
    static int divideTwoNumbers(int value1, int value2){
       try{
           result=value1/value2;
       }
       catch (Exception e) {
           e.printStackTrace();
           System.out.println("We are just printing the stack trace.\n"+ "ArithmeticException is handled. But take care of the variable \"value2\"");
       }
        return result;
    }

    static int sumTwoNumbers(int value1){
           int sum=0;
            for (int i = 0; i < value1; i++) {
                 sum=sum+i;
        }

        return sum;

    }
   static int divisor = 6;
    static int divider = 3;

    static int getRemainder(int divisor, int divider) {
         int remainder;
         remainder = divisor % divider;
      return remainder;
     }

}
