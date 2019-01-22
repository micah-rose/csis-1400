/******************************************
* Author: Micah L
*
* Demo: Formatting Output
* %-6s... column width 6 left aligned
* %2d... column width 2 right aligned
* %.1f... one digit after the decimal point
********************************************/

public class DemoFormatting {
   public static void main(String[] args){
      String name1 = "Jim";
      String name2 = "Susan";
      int age1 = 6;
      int age2 = 12;
      double gpa1 = 4.0;
      double gpa2 = 3.9;
      
      System.out.printf("%-6s %2d yrs - %.1f%n", name1, age1, gpa1);
      System.out.printf("%-6s %2d yrs - %.1f%n", name2, age2, gpa2);
   }
}