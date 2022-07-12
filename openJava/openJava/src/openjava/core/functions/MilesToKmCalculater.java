package openjava.core.functions;

import java.util.Scanner;

public class MilesToKmCalculater {

    public static void milesToKmCalculator(double miles) {
        System.out.println(miles + "miles = " + miles * 1.6+ "km");

    }

    public static void main(String[] args) {
        double m;
        System.out.println("enter no of miles :");
        Scanner sc = new Scanner(System.in);
        m = sc.nextDouble();
        milesToKmCalculator(m);
    }
}
