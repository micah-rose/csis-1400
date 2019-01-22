/*********************************
* Author: Micah L
*
* Demo: How to use If-Statements
***********************************/

import java.util.Scanner;

public class DemoIf {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      // Driver's License
      System.out.print("Age: ");
      int age = input.nextInt();
      
      if (age >= 16) {
         System.out.print("You are of legal age to drive.");
      }
      else {
         System.out.println("You are not old enough to drive.");
      }
      
      // Last 2 Digits
      System.out.print("Number: ");
      int number = input.nextInt();
      
      if (number > 100) {
         int lastTwoDigits = number % 100;
         System.out.println("Last 2 digits: " + lastTwoDigits);
      }
      else {
      System.out.print(number);
      }
   } 
}