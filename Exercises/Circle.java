/***************************************************
* Author: Cris Cooper, Andrew Mclaughlan, Micah Lund
* This represents a Circle
****************************************************/

public class Circle {

   private double radius;
   
   public Circle(double radius){
      setRadius(radius);
   }
   
   public double getRadius() {
      return this.radius;
   }
   
   public void setRadius(double radius) {
      if (radius < 0) {
         this.radius = 0;
      } else {
         this.radius = radius;
      }
   }
   
   public double area() {
      double area = Math.PI * (Math.pow(this.radius, 2));
      return area;
   }
   
   public double circumference() {
      double circumference = 2 * Math.PI * this.radius;
      return circumference;
   }
   
   public static void main(String[] args) {
      Circle myCircle = new Circle(2.0);
      System.out.printf("Area: %f, Circumference: %f%n", 
         myCircle.area(), myCircle.circumference());
   }
   
}