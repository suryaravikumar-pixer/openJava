package openjava.oop.classes;

public class TypesOfVariablesInJava {
   /*** instance variables stays outside method and inside a method ***/
   String nameBikeModel;
   int engineCC;
   double weight;
   double mileage;
   String warranty;
   String color;

   /*** static variables ***/
   static int noOfWheels;
   static String typeOfFuel;


   /*** block variables ***/
   {
      int engineCC;
      double weight;
      double mileage;
   }

   void sparkPlug(){
      /** local variables **/
      String plugCompany = "krish sparkplug industries.Ltd";
      float costOfPlug = 123.50f;

      System.out.println(plugCompany);
      System.out.println(costOfPlug);
   }

   class ClassFour{
       //instance variables
   }

   /*** object creation of a class ***/
   TypesOfVariablesInJava typesOfVariablesInJava = new TypesOfVariablesInJava();


}
