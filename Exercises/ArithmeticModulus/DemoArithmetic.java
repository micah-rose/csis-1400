/*********************
* Author: Micah L
* 
* Demo: How to use arithmetic and modulus
**********************/

public class DemoArithmetic {
   public static void main(String[] args) {
      int x = 22;
      int y = 54;
      
      //Declare variable and print it
      int sum = x + y;
      System.out.printf("%d + %d = %d%n", x, y, sum);
      
      //Calculate value as it is printed
      System.out.printf("%d - %d = %d%n", x, y, x-y);
      
      //Modulus operator calculates the remainder
      //x % y is the remainder of x/y
      
      int remainder = y%x;
      System.out.printf("The remainder of %d/%d is %d.%n", y, x, remainder);
      
      //Update y, change the value to 33
      y = 33;
      
      System.out.printf("%d/%d = %d%n", y, x, y/x);
      
   }
}