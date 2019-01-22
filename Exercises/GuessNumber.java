/***************************************
* Author: Micah L
*
* Demo: Guess A Number
*****************************************/

import java.util.Scanner;
import java.util.Random;

public class GuessNumber{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      Random rand = new Random();
      
      int number = rand.nextInt(50)+1;
      int guess;
      
      do {
         System.out.print("Number (1-50): ");
         guess = input.nextInt();
         provideFeedback(guess, number);
         
      } while (number != guess);
      
      
      //System.out.print(number);
      
   }
   
   private static void provideFeedback(int guess, int n){
   
      if (guess > n){
            System.out.print("Too big");
      }
         
      else if (guess < n){
            System.out.print("Too small");
      }
         
      else
            System.out.print("Got it");
   
   }
   
}
