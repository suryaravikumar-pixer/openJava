package openjava.core.conditionals;

public class DividedByTwoUsingForLoop {
    public static void main(String[] args) {
        int number=100;
        int divider = 2;
        int baseValue=0;
        divideByTwo(number, divider,baseValue);
        System.out.println("***********************************");
        divideByTwo(number, divider,baseValue);

    }
    /***
     * divide a 100 by 2 using for loop
     */

    static void divideByTwo(int number, int divider, int baseValue){
        for (double iterator = number; iterator > baseValue; iterator=iterator/divider) {
            System.out.println(iterator);

        }
    }
}
