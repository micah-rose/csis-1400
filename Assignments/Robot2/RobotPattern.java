/****************************************************
* Author: Micah L
* 
* RobotPattern solved three challenges where a 
* robot walks specified patterns in ramdom-sized
* grids.
****************************************************/

import java.util.Random;

public class RobotPattern {
	public static void main(String[] args) { 
      Random rand = new Random();
      int randomGrid = 3 * rand.nextInt(4) + 2;

      // square 6x6 grid with the robot in the north west corner
      Robot robot = new Robot(randomGrid, randomGrid);      
      challenge1(robot);    
      
      robot = new Robot(randomGrid, randomGrid);  
      //challenge2(robot);
      
      robot = new Robot(randomGrid, randomGrid); 
      //challenge3(robot);
	}
     
   private static void challenge1(Robot robot) {      
      // TODO: Make the robot walk the pattern described in challenge 1 
      //       When done it should say the specified message

      do{
      
         while(robot.check('S') == true){
            robot.go('S');
         }
         
         if(robot.check('E') == true){
            robot.go('E');
         }
         
         while(robot.check('N') == true){
            robot.go('N');
         }
         
         if(robot.check('E') == true){
            robot.go('E'); 
         }

         }
         while(robot.check('E') == true);
            robot.say("Done!");                
      }

   private static void challenge2(Robot robot) {      
      // TODO: Make the robot walk the pattern described in challenge 2 
      //       When done it should say the specified message
  
      int x = 1;
      int y = 1;
        
      do{
         
         while(robot.check('S') == true){
            robot.go('S');
            y ++;
         }
        
         while(robot.check('E') == true){
            robot.go('E');
            x++;
         }
         
         while(robot.check('N') == true) {
            robot.go('N');
         }
         
      }
          while(robot.check('E')== true);
        
      do{
        
          for(int i = 2; i < x; i++){
              robot.go('W');
          }
              x--;
            
          for(int j = 2; j < y; j++){
              robot.go('S');
          }
              y--;
       
          for(int i = 2; i < x; i++){
              robot.go('E');     
          }
              x--;
            
          for(int j = 2; j < y; j++){
              robot.go('N');
          }
              y--;
        
       }
       
         while(x > 1 && y > 1);
            robot.say("Did it!");
   }  
   
   private static void challenge3(Robot robot) {   
      // TODO: Make the robot walk the pattern described in challenge 3 
      //       When done it should say the specified message
            
         
      int w = 1;
      int h = 1; 
              
      do{
              
         if(robot.check('S') == true){
            robot.go('S');
         }
         
         if(robot.check('E') == true){
            for(int i = 0; i < w; i++){
               robot.go('E');
            }     
         }
         
         w++;
              
         for(int i = 0; i < h; i++){
            robot.go('N');
         }
         
         h++;
              
         if(robot.check('E') == true){
            robot.go('E');
         }
              
         if(robot.check('E') == true){
            for(int i= 0; i< h; i++){
               robot.go('S');
            }
              
         h++;
         }
              
         if(robot.check('E') == true){
            for(int i = 0; i < w; i ++){
               robot.go('W');
            }
         }
         
         w++;
              
         }
         while(robot.check('E') == true);
             robot.say("Challenges complete!");
         }
}