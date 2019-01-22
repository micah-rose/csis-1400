/**************************
* Author: Micah L
*
* Assignment: A04 Conveyor
***************************/

public class Conveyor{

   //fields
   private String type;
   private double speed;
   
   //constructor
   public Conveyor(String type, double speed){
      this.type = type;
      setSpeed(speed);
   }
   
   //methods
   public String getType(){
      return type;
   }
   
   public double getSpeed(){
      return speed;
   }  
   
   public void setSpeed(double s){
      if (s > 0){
      speed = s;
      }
   } 
   
   public double timeToTransport(double distance){
      double timeToTransport = distance/speed;
      return timeToTransport;
   }
   

}