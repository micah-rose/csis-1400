/***********************************************
* Author: Micah L
*
* Exercise: Demo - How to use switch statement
*
* Note: use switch if you have multiple options
* based on distinct values
* 
* If you need multiple options bade on ranges 
* use if-else instead
*************************************************/

import java.util.Scanner;

public class DemoSwitch{
   public static void main(String[] args){
      String trafficLight = "pink";
   
      switch (trafficLight)
      {
         case "green": 
                  System.out.println("Go");
                  break;
         
         case "red":
                  System.out.println("Stop");
                  break;
         
         case "yellow":
                  System.out.println("Slow down");
                  break;
                  
         default: 
                  System.out.println("Traffic light is broke");
                  break;
      }
   }
}