/********************************************
* Author: Micah L
* 
* RobotApp solved three challenges where a 
* robot needs to figure out the number
* of rooms in a given grid.
********************************************/

public class RobotApp {
	public static void main(String[] args) { 
      /* DEMO COMMENTED OUT ->
      //square 4x4 grid to demo how the robotcan be controlled
      Robot robot = new Robot(4, 4); 
      demo(robot); */
      
      // square 5x5 grid with the robot in the north west corner
      Robot robot = new Robot(5, 5);        
      challenge1(robot);    
      
      // rectangular grid with width 6 and height 5
      robot = new Robot(6, 5);  
      challenge2(robot);
      
      // rectangular grid with width 7 and height 6
      // robot's starting position: 4 over, 3 down 
      robot = new Robot(7, 6, 4, 3);   
      challenge3(robot);
	}
     
   private static void challenge1(Robot robot) {      
      // TODO: Solve challenge 1 and update the text below
      int x = 1;
      
      while (robot.check('S')) {
       
         if (robot.check('S')) {
			robot.go('S');
         x++;
         }
		}
     
      robot.say(x*x + " rooms " + (x-1) + " moves");
      	
   }
   
   
   private static void challenge2(Robot robot) {      
      // TODO: Solve challenge 2 and update text below
      int x = 1;
      
      while (robot.check('S')){ 
		
         if (robot.check('S')) {
			robot.go('S');
         x++;
         }
		}
      
      int y = 1;
      
      while (robot.check('E')){  
       
         if (robot.check('E')){
         robot.go('E');
         y++;
         }
      
      }

   
      robot.say(x*y + " rooms " + ((x-1)+(y-1)) + " moves");   
   }
   
   private static void challenge3(Robot robot) {   
      // TODO: Solve challenge 3 and update text below
      int x = 4;
      
      while (robot.check('S')){ 
		
         if (robot.check('S')) {
			robot.go('S');
         x++;
         }
		}
      
      int y = 3;
      
      while (robot.check('W')){ 
      
         if (robot.check('W')){
         robot.go('W');
         y++;
         }
      
      }

      robot.say(x*y + " rooms " + ((x-2)+(y-5)) + " moves");   
   }
   
   
   /* DEMO COMMENTED OUT -> 
   //This method briefly demonstrates how the robot
   // can be controlled.
   private static void demo(Robot robot) {
   
		int x = 3;
		robot.go('E');
		if (robot.check('S')) {
			robot.go('S');
         x++;
		}

		robot.go('E');
      robot.go('E'); // uncomment this line and see what happens
      
		robot.say(3 + " rooms 2n + 5 moves");	
   }*/
   
}