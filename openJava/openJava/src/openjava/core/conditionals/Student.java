package openjava.core.conditionals;
import openjava.core.conditionals.MarriageEligibility;
public class Student {
    String nameOfStudent;
    String rollNumber;
    String branch;
    float percentage;
    //  int year;
    boolean dayScholar;

    public Student(String nameOfStudent, String rollNumber, String branch, float percentage, boolean dayScholar) {
        this.nameOfStudent = nameOfStudent;
        this.rollNumber = rollNumber;
        this.branch = branch;
        this.percentage = percentage;
        this.dayScholar = dayScholar;
    }
    public static void main(String[] args) {


        MarriageEligibility check = new MarriageEligibility();
        check.checkEligibility("usa",20);

    }
    static void student() {


    }
}