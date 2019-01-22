/***************************************
* Author: Micah L
*
* Demo: break continue
* Note: use break and continue sparingly
*****************************************/

import java.util.Scanner;

public class DemoBreakContinue{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
                 
      for(int i = 0; i < 25; i++){
         System.out.print("Provide a number: ");
         int n = input.nextInt();
   
         if (n*n > 50)
            break; //exits the loop

         System.out.printf("%2d", n);
         System.out.println(" .. " + (n*n));
         
         if (i < 1)
            continue; //skips rest of loop body and 
                      //continues at for loop header
            
         System.out.printf("      %d - %d = %d%n", n*n, n, n*n-n); 
         System.out.printf("      %d + %d = %d%n", n*n, n, n*n+n);
         
      }
      
   }
}