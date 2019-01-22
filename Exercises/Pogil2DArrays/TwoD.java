/**************************
* Author: Micah L
*
* Pogil Exercise: 2D Array
****************************/
import java.util.Arrays;

public class TwoD{
   public static void main(String[] args){
      int[][] table = new int[3][2];
      System.out.println(table.length);
      System.out.println(table[0].length);
      System.out.println(table[0]);
      
      for(int i = 0; i < table[0].length; i++){
         for (int j = 0; j < table[i].length; j++){
            System.out.print(table[i][j] + " ");
         }
         System.out.println();
      }
   }
}