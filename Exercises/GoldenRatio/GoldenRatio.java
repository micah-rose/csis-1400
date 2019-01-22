/*****************************
* Author: Micah L
*
* Calculates the Golden Ratio
******************************/

public class GoldenRatio {
   public static void main(String[] args) {
      int n1 = 377;
      int n2 = 233;
      System.out.printf("%d and %d %s a golden ratio %n", n1, n2,
         isGoldenRatio(n1, n2) ? "is" : "is not");      
   }
   
   private static boolean isGoldenRatio(int n1, int n2) {
      final double GOLDEN_RATIO = 1.618;
      
      int biggerNumber = Math.max(n1, n2);
      int smallerNumber = Math.min(n1, n2);
      double quotient = (double)biggerNumber / smallerNumber; 
      // or can use 1.0 * biggerNumber / smallerNumber;
      
      double roundedQuotient = Math.round(quotient * 1000) / 1000.0;
      return roundedQuotient == GOLDEN_RATIO;
   }
      
}