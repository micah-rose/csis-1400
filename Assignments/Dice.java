/********************
* Author: Micah L
*
* A09: Dice
********************/

import java.util.Random;

public class Dice{
   public static final int N = 36000;

   public static void main( String[] args){
   
      Random rand = new Random(); 
      int[] diceArray = new int[ 13 ]; 
      int die1;
      int die2;
      int total;

      for(int i = 1; i <=N; i++ ){
         die1 = rand.nextInt(6)+1;
         die2 = rand.nextInt(6)+1;
         total = die1+die2;
         ++diceArray[total];
      }
             
      System.out.printf("%s%10s%12s\n", "Sum", "Frequency", "Percentage");
         

      for (int i = 2; i < diceArray.length; i++ )
      System.out.printf("%2d%10d%12.1f%%\n", i, diceArray[i], 
         ((double)diceArray[i]/N)*100);        
   } 
}