package openjava.core.functions;
public class SundayMethods {
    // instance variables  |  (global variables)
//    int headCount = 5;
//    float heightOfRoom = 10.5f;
    // static variables
   static int headCount = 5;
  static   float heightOfRoom = 10.5f;

  void konwStatic(){
      System.out.println(headCount);
      System.out.println(heightOfRoom);
  }

    public static void main(String[] args) {
        // about static
        // local variables
//        int headCount = 5;
//        float heightOfRoom = 10.5f;
        class jj {
            static String useFull = "x-data";
            static String common = "Y-data";
        }
//        System.out.println(sundayGreetings(jj.common, jj.useFull));
        /***** calling sumOftwonumbsers******/
        System.out.println(sumOfTwoNumbers(headCount,heightOfRoom));


    }



    // creating a method
    /*** datatype fucntion name followed by () * function block{}*/
    private  void rajKrishna(String java, String gitHub, String collections, String reactJs) {
        System.out.println(gitHub);
        System.out.println(java);
        System.out.println(collections);
        System.out.println(reactJs);
    }
    private static void rajKrishna(String java, String gitHub, String collections) {
        System.out.println(gitHub);
        System.out.println(java);
        System.out.println(collections);
    }
    private static void rajKrishna(String java, String gitHub) {
        System.out.println(gitHub);
        System.out.println(java);
    }
//    before
    private static String rajKrishna() {

        return null;
    }

    public static double sumOfTwoNumbers(int ans1, float ans2) {
        double sum = ans1 + ans2;
        return sum;
    }
}
