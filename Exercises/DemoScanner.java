/****************************************************************************
* Author: Micah L
*
* Demo: Scanner
*
* If we only use nextInt, nextDouble, next, etc. but not nextLine
* no special treatment is needed.
*
* If we use nextLine at the beginning followed by nextInt, nextDouble,
* etc. no special treatment is needed.
*
* However, if we use nextInt, nextDouble, next, etc. followed by nextLine 
* we need to clean up the 'enter' after nextInt,nextDouble, etc. (see part2)
******************************************************************************/

import java.util.Scanner;

public class DemoScanner {
   public static void main (String[] args){
      Scanner input = new Scanner (System.in);
      
      part1(input);
      part2(input);

   }
   
   private static void part1(Scanner input) {
      // nextLine followed by nextInt - works fine
      System.out.println("Part One");
      
      System.out.print("Name: ");
      String name = input.nextLine();
      System.out.print("Favorite number: ");
      int number = input.nextInt();
      
      System.out.printf("%s's favorite number is %d.%n", name, number);
      System.out.println();
   }
   
   private static void part2(Scanner input) {
      System.out.println("Part Two");
      
      // nextInt followed by nextLine - use clean up
      System.out.print("Favorite number: ");
      int number2 = input.nextInt();
      input.nextLine(); // clean up
      
      System.out.print("Name: ");
      String name2 = input.nextLine();
      System.out.printf("%s's favorite number is %d.%n", name2, number2);
     
   }
}