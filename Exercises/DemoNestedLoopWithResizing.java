/********************************************
* Author: Micah L
*
* Resize patterns to practice nested loops,
* building algorithms,and method overloading
*********************************************/

public class DemoNestedLoopWithResizing {
   public static void main(String[] args){   
      pattern(); //draw pattern with default size 4
      System.out.println();
      
      pattern(7); //draw pattern of specified size
   } 
   
   //draws pattern with size specified by user
   private static void pattern(int size){
      for (int i = 0; i < size; i++){
   
         for (int j = 0; j < -2*i+2*size-2; j++){
            System.out.print(". ");
         }
      
         for (int j = 0; j < 2*i; j++){
            System.out.print("* ");
         }
      
         for (int j = 0; j < i+2; j++){
            System.out.print("o ");
         }
      
         System.out.print("@ ");
      
         System.out.println();
      }
   
   } 

   //draws pattern with default size 4
   private static void pattern(){
      pattern(4);
   } 
}