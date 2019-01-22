/******************
* Author: Micah L
*
* Demo roll die
*******************/

import java.util.Random;

public class DemoDie{
   private static final Random rand = new Random();

   public static void main(String[] args){
      int[] dieCount = new int[7];
      
      for(int i = 0; i < 1000; i++){
        dieCount[rollDie()]++;
        //int randomIndex = rollDie();
        //dieCount[randomIndex] = dieCount[randomIndex] + 1; 
      }
            
      for(int i = 1; i <= 6; i++){
         System.out.printf("%d .. %d%n", i, dieCount[i]);
      } 
      
   }
   
   private static int rollDie(){
      
      return rand.nextInt(6) + 1;
      
   }
}