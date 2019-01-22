/*****************************
* Author: Micah L + ......
*
* Represents a point at the
* Cartesian Coordinate System
* ****************************/

public class Point{

   //fields
   private int x;
   private int y;
   
   //constructors
   public Point(int x, int y) {
      this.x = x;
      this.y = y;
   }
   
   //methods
   public int getX(){
      return x;
   }
   
   public int getY(){
      return y;
   }
   
   public double distanceTo(Point other){
      double x1Tox2 = Math.abs(this.x - other.x); 
      double y1Toy2 = Math.abs(this.y - other.y);
      return Math.hypot(x1Tox2, y1Toy2);
   }
   
   @Override
   public String toString(){
      return "(" + x + "," + y + ")";
   }
}