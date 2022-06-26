package coreJava;
//nested if else
public class controlStatements {
    public static void main(String[] args) {
        int age = 25;
        int weight = 48;
        if (age >= 18) {
            if (weight > 50) {
                System.out.println("You are eligible to donate blood");
            } else {
                System.out.println("You are not eligible to donate blood");
            }
        } else {
            System.out.println("Age must be greater than 18");
        }


        //armstrong number
        //  static int number=123;
     //   static int armstrong(int number){
            int number=123, originalNumber, remainder, result = 0;

            originalNumber = number;

            while (originalNumber != 0) {
                remainder = originalNumber % 10;
                result += Math.pow(remainder, 3);
                originalNumber /= 10;
            }

            if (result == number)
                System.out.println(number + " is an Armstrong number.");
            else
                System.out.println(number + " is not an Armstrong number.");
        }
    }


