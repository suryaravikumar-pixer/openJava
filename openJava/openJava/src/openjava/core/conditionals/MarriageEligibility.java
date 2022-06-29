package openjava.core.conditionals;

public class MarriageEligibility {
    public static void main(String[] args) {
        /******
         * USA  0
         * USA  18
         * USA  20
         * USA  40
         * INDIA 0
         * india 0
         * usa 0
         ******/


        // just for function calling
        int age = 22;
        String country = "USA";
        checkEligibility(country, age);
    }


    static void checkEligibility(String country, int age) {
        // logic building && check base conditions
        if(age == 0){
         System.out.println("enter natural number or enter 1 onwards 2,3,4,");
         }

        if (country == null){
         System.out.println("enter usa or india");
         }


      try {
          switch (country.toLowerCase()) {
              case "india":
                  if (age >= 21) {
                      System.out.println("eligible in india");
                  } else {
                      System.out.println("not eligible india");
                  }
                  break;
              case "usa":
                  if (age < 18) {
                      System.out.println("not eligible less than 18 in usa");
                  } else if (age >= 18 && age < 21) {
                      System.out.println("eligible between 18 and 21 ");
                  } else {
                      System.out.println(" eligible above 21 in usa");
                  }
                  break;
          }
      }
      catch (NullPointerException induraj){
          System.out.println(induraj);

      }
    }
}
