/***************************************
* Author: Micah L + ......
*
* Represents a line that is defined
* by a start point and an end point
* *************************************/

public class Line{

   //fields
   private Point start; // composition
   private Point end;   // composition
   
   //constructors
   public Line(Point start, Point end){
      this.start = start;
      this.end = end;
   }
   
   public double length(){
      return start.distanceTo(end);
   }
   
   //methods
   @Override
   public String toString(){
      return start + "->" + end;
   }
   
   
}