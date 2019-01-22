/**************************
* Author: Micah L
*
* Assignment: A04 Conveyor
***************************/

public class ConveyorApp {
   public static void main(String [] args){
   
   //Create two conveyors
   Conveyor flatBelt = new Conveyor("flat belt", 0.9);
   Conveyor roller = new Conveyor("roller", -0.5);
   
   //Print conveyor1 information
   System.out.printf("Conveyor1: %s conveyor with a speed %.1f m/s%n",
      flatBelt.getType(), flatBelt.getSpeed());
   System.out.printf("Time to transport an item 50m: %.1f s%n", 
      flatBelt.timeToTransport(50));
   System.out.println();
      
   //Print conveyor2 information
   System.out.printf("Conveyor2: %s conveyor with a speed %.1f m/s%n",
      roller.getType(), roller.getSpeed());
   System.out.printf("Time to transport an item 50m: %.1f s%n", 
      roller.timeToTransport(50));
   System.out.println();
   
   //Update the speed of conveyors
   flatBelt.setSpeed(-3);
   roller.setSpeed(0.4);
   System.out.println("... updating speed");
   System.out.println();
   
   //Print updated conveyor1 information
   System.out.printf("Conveyor1: %s conveyor with a speed %.1f m/s%n",
      flatBelt.getType(), flatBelt.getSpeed());
   System.out.printf("Time to transport an item 50m: %.1f s%n", 
      flatBelt.timeToTransport(50));
   System.out.println();
      
   //Print updated conveyor2 information
   System.out.printf("Conveyor2: %s conveyor with a speed %.1f m/s%n",
      roller.getType(), roller.getSpeed());
   System.out.printf("Time to transport an item 50m: %.1f s%n", 
      roller.timeToTransport(50));
   System.out.println();
  
   }
}