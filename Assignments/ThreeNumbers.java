/************************
* Author: Micah L
* Date: 01/31/2017
* Assignment: A03
*************************/

import java.util.Scanner;

public class ThreeNumbers {
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter 3 numbers separated by a space: ");
      int n1 = input.nextInt();
      int n2 = input.nextInt();
      int n3 = input.nextInt();
      
    if (n1<=n2) {
            
      if (n2<n3)
      System.out.println("Sorted numbers: "+n1+" "+n2+" "+n3);
      else
      System.out.println("Sorted numbers: "+n1+" "+n3+" "+n2);

      }
      
    else if (n1<=n3){
      
      System.out.println("Sorted numbers: "+n2+" "+n1+" "+n3 );
            
      }
      
    else {
    
      if (n2<n3)
      System.out.println("Sorted numbers: "+n2+" "+n3+" "+n1);
      else
      System.out.println("Sorted numbers: "+n3+" "+n2+" "+n1);
      
      }
    
   }
}