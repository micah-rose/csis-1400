/*******************************
* Author: Micah L
*
* Midterm 2: Exercise 2
*******************************/

public class Exercise2{
   public static void main(String[] args){    
      pattern(4); //draw pattern of specified size
   } 
   
   //draws pattern with size specified by user
   private static void pattern(int size){
   
      for (int i = 0; i < size; i++){
         //First column
         System.out.print("@ ");
         
         //Middle
         for (int j = 0; j < -1*i+1; j++){
            System.out.print("@ ");
         }
         System.out.print(". ");
      
         for (int j = 0; j < 2*i-2; j++){
            System.out.print(". ");
         }
         System.out.print(". ");
         
         for (int j = 0; j < -2*i+1; j++){
            System.out.print("@ ");
         }
      
         //Last column
         System.out.print("@ ");
      
         System.out.println();
      }
   
   } 
 
}