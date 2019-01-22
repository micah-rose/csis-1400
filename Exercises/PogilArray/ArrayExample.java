/******************************
* Author: Micah L
*
* Tet client for class Circle.
*******************************/
import java.util.Arrays;

public class ArrayExample{
   public static void main(String[] args){
      /*Circle c = new Circle(3.5);
      System.out.println("c: "+ c);*/
      
      Circle[] circleArray = new Circle[10];
      /*circleArray[0] = new Circle(5);
      circleArray[1] = circleArray[0];*/
      
      for(int i=0; i<circleArray.length; i++){
         circleArray[i] = new Circle(5);
         System.out.println(i +": " + circleArray[i]);
      }
      
      //Example for using toString method and importing class Arrays:
      // -- System.out.println(Arrays.toString(circleArray));
      
      /*System.out.println(circleArray[0]);
      System.out.println(circleArray[1]);*/
   }

}