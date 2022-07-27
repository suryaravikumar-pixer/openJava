package methodoverloading_java;

public class MethodOverloadingJava {

    /**public static void main(String[] a){}**/
    /**public static int sum(int x,int y){}**/
    /**public static String sum(String){}**/

    public static void vehicle(String twoWheels ,String twoSeats ){
        System.out.println("Bike ");
    }

    public static void vehicle(String threeWheels, int numOfPeople) {
        System.out.println("Auto");
    }

    public static void vehicle(String fourWheels, double cost, String brand){
        System.out.println("Car");
    }

    public static void vehicle(){
        System.out.println("Aeroplane");
    }

    public static void main(String[] args) {
        MethodOverloadingJava motor = new MethodOverloadingJava();
        motor.vehicle();
        motor.vehicle("twoWheels","twoSeats");
        motor.vehicle("threeWheels",4);
        motor.vehicle("fourWheels",500000,"Benz");


    }
}
