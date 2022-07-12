package openjava.core.functions;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MilesToKmCalculater {
    public static void main(String[] args) {
    double m;
    Scanner sc = new Scanner(System.in);

        System.out.println("enter no of miles :");
        m = sc.nextDouble();
        System.out.println(m + "miles = " +m*1.6+ "km");
        }
    }
