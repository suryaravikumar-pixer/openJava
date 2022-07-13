package openjava.core.overriding.overloading;
/**Application class**/
public class MethodOverriding {
    /**Parent class**/
    public class ParentAccount{
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

    public class ChildTwo extends ParentAccount{
        public void account(){
            System.out.println(" Child TWO Account executed");
        }
    }

}
