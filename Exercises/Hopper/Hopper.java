/********************************
* Author: Eric M. + Micah L.
* Represents a hopper that includes
* balls with n balls that are numbers
* from 1 to n.
********************************/
import java.util.Random;

public class Hopper
{
   //fields
   private int count;
   private final Random rand = new Random();
   private final int MAX_COUNT = 1000;
   
   //constructors
   public Hopper(int count) 
   {
      if (count > 0) 
      {
        this.count = count;
      }
      else
      {
         this.count = 1;
      }
   }
   
   // Assigns the field count with a random count
   // between 1 and MAX_COUNT
   public Hopper()
   {
      this.count = rand.nextInt(MAX_COUNT) + 1;
   }
   
   
   //methods
   public int pullNumber() 
   { 
      return rand.nextInt(count) + 1;
   }
   
   public int getCount()
   {
      return count;
   }
   
   @Override
   public String toString() 
   {
      return "Hopper(" + count + ")";
   }
}