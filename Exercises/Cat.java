/**************
* Author: Micah L
*
********************/

public class Cat {
   //fields
   private int mouseCount;
   
   //constructors
   
   //methods
   public int getMouseCount() {
      return mouseCount;
   }
   
   public void catchMouse() {
      mouseCount++;
   }
   
   public void catchMouse(int mouseCount) {
      this.mouseCount += mouseCount;
   }
   
   public void stalk() {
      System.out.println("Stalking");
   }
}