/*******************************
* Author: Micah L
*
* Midterm 2: Exercise 1
*******************************/
import java.util.Random;

public class Exercise1{
   public static void main (String[] args){
   
   Random rand = new Random();
   int number;
   String romanTen = "X";
   String romanTwenty = "XX";
   String romanThirty = "XXX";
   String romanForty = "XL";
   
      for(int i = 1; i <= 30; i++){
         number = 2 * rand.nextInt(16)+10;

      switch(number){
         case 10:
            System.out.printf("%-5s", romanTen);
            break;
         case 20:
            System.out.printf("%-5s", romanTwenty);
            break;
         case 30:
            System.out.printf("%-5s", romanThirty);
            break;
         case 40:
            System.out.printf("%-5s", romanForty);
            break;
         default:
            System.out.printf("%-5d", number);
            break;
      }
      
         if(i%5 == 0){
            System.out.println();
         }
      }
      System.out.println("all done\n");
   }
}