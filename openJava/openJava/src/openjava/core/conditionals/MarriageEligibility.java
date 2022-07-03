package openjava.core.conditionals;
//package openjava.core.conditionals;

public class MarriageEligibility {
    String country;
    int age;
    public MarriageEligibility() {
    }

    public MarriageEligibility(String country, int age) {
        this.country = country;
        this.age = age;
    }

    public static void main(String[] args) {
        // just for function calling

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
                      System.out.println("eligible between 18 and 21 in usa ");
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
