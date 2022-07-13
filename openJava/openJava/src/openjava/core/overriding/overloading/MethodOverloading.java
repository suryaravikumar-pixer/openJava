package openjava.core.overriding.overloading;

public class MethodOverloading {


    /** Method overloading **/
    public static void account(){
        System.out.println(" Child ONE Account executed");
    }
    public static void account(String accountName){
        System.out.println(" Child ONE Account executed");
    }
    public static void account(int ifscCode){
        System.out.println(" Child ONE Account executed");
    }
    public static void account(int num, int balance){
        System.out.println(" Parent  Account executed");
    }
}
class CanWeDoOverLoadingFromAnotherClass extends MethodOverloading{

    public static void account(int ifscCode, int address){
        System.out.println(" Child  Account executed");
    }

    public static void main(String[] args) {
        CanWeDoOverLoadingFromAnotherClass can = new CanWeDoOverLoadingFromAnotherClass();
        MethodOverloading mo = new MethodOverloading();
        MethodOverloading jam = new CanWeDoOverLoadingFromAnotherClass();
        jam.account(535,97);
        can.account(345,354);


//        CanWeDoOverLoadingFromAnotherClass acc = new MethodOverloading();

    }

}