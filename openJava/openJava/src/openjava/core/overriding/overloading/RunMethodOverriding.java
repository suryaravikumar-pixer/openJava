package openjava.core.overriding.overloading;

public class RunMethodOverriding {
    public static void main(String[] args) {
        Child grandParent = new Child();
        grandParent.arithmetic(100,10);
    }
}

class GrandParent{

    void arithmetic(int value1, int value2){
        int result = value1 / value2;
        System.out.println("Grand parents devide the "+value1+"/"+value2+" ="+result);
    }
}

class Parent extends GrandParent{
    @Override
    void arithmetic(int value1, int value2){
        int result = value1 + value2;
        System.out.println(" parents add the "+value1+"+"+value2+" ="+result);
    }
}

class Child extends GrandParent{
    @Override
    void arithmetic(int value1, int value2){
        int result = value1 * value2;
        System.out.println("Child multipluy the wealth the "+value1+"*"+value2+" ="+result);
    }
}
