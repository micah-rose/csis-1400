/**************************************
* Author: Micah L + ......
*
* Test client for class Point and Line
* **************************************/

public class LineApp{
   public static void main(String[] args){
      //test class Point
      Point p1 = new Point(2,3);
      System.out.println("p1: " + p1);
      
      //test class Line
      Line l1 = new Line (new Point(2,3), new Point(6,0));
      System.out.println("l1: " + l1);
      System.out.println("Length of l1: " + l1.length());
   }
}