package openjava.core.overriding.overloading;

import openjava.core.MethodOverLOadingOverriding.MethodOverloading;

class CanWeDoOverLoadingFromAnotherClass extends MethodOverloading {

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