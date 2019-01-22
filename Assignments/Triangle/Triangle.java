/**********************
* Author: Micah L
*
* Assignment: Triangle
***********************/

public class Triangle{
   
   //fields
   private double side1;
   private double side2;
   private double side3;
   
   
   //constructor
   public Triangle(double side1, double side2, double side3){
   
      boolean t = isTriangle(side1, side2, side3);
   
      if(t == false){
     
         side1 = 1d; side2 = 1d; side3 = 1d;
     
      }
      
      this.side1 = side1;
      this.side2 = side2;
      this.side3 = side3;
   
   }
   
      
   //methods
   
   public double getSide1(){
  
      return this.side1;
   }
  
   public double getSide2(){
      
      return this.side2;
   }
     
   public double getSide3(){
     
      return this.side3;
   }
  
   private boolean isTriangle(double side1, double side2, double side3){
   
      return  !((side1*side2*side3 == 0) || (side1 + side2 < side3) || 
         (side1 + side3 < side2) || (side2 + side3 < side1));
   
  
   }
  
   public boolean isEquilateral(){
  
      return (side1==side2)&&(side2==side3);
   
   }
  
   public boolean isRight(){
  
      return (side1*side1 + side2*side2 == side3*side3)||(side1*side1 + 
         side3*side3 == side2*side2)||(side2*side2 + side3*side3 == side1*side1);
   }
   
}