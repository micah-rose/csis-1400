/***********************************
* Author: Micah L
*
* Class Circle represents a circle
* that is defined by its radius.
************************************/

public class Circle{
   
   private double radius;
   
   public Circle(double radius){
      this.radius = radius;
   }
   
   public double getRadius(){
      return radius;
   }
   
   @Override
   public String toString(){
      return "radius(" + radius + ")";
   }
}