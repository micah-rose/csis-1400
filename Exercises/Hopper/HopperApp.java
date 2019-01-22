/********************************
* Author: Eric M. + Micah L.
* Test client for Hopper
********************************/

public class HopperApp
{
   public static void main(String [] agrs)
   {
      Hopper hopper = new Hopper();
      System.out.println("hoppert: " + hopper);
      System.out.printf("Your chance of winning is 1 of %d.%n", hopper.getCount());
      System.out.print("Numbers pulled: ");
      for(int i = 0; i < 10; i++)
      {
         System.out.print(hopper.pullNumber() + " ");
      }
      System.out.println();
      
   }
 
}