package interviewQ;

public class DoubleMainMethod {

    /**
     * Java Program Illustrating Can we have
     * Multiple main() Methods
     **/

    public static void main(int number) {
        System.out.println(number);
    }

    public static void main(String name) {
        System.out.println(name);
    }

    public static void main(String[] args) {
        main(65);
        main("xiaomi");
    }


}
