package openjava.core.overriding.overloading;
/**Application class**/

public class MethodOverridingClass {
    /**Parent class**/
    public class ParentAccount{
        /***Overridden method**/
        public void account(){
            System.out.println(" Parent Account executed");
        }
    }
    /** Derived class **/
    public class ChildOne extends ParentAccount{
        public void account(){
            System.out.println(" Child ONE Account executed");
        }
    }

    /** overriding method***/
    public class ChildTwo extends ParentAccount{
        public void account(){
            System.out.println(" Child TWO Account executed");
        }
    }


    /****
     * 1.final and static
     * 2.constructor overriding is not allowed
     * */

    public static void main(String[] args) {
//        ChildOne cOne = new ChildOne();
//        cOne.account();
    }
}
