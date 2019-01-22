/*****************************************
* Author: Micah L
*
* Draw a pattern to practice nested loops
******************************************/

public class DemoNestedLoop {
   public static void main(String[] args){
      for (int i = 0; i < 3; i++){ //for each of my rows, do the following
         //draw o
         System.out.print("o o o o ");
         
         //draw *
         System.out.print("* * ");
         
         //draw _
         for (int j = 0; j < i+2; j++){
            System.out.print("_ ");
         }
         
         //draw @
         for (int j = 0; j < -2*i+6; j++){
            System.out.print("@ ");
         }
         
         //draw .
         System.out.print(". ");
         
         //new line
         System.out.println();
      }
   }
}