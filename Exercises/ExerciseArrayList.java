/***********************************
* Author: Micah L & ...
*
* Practice the use of ArrayList<E>
* and compare lists and arrays
************************************/
import java.util.ArrayList;
import java.util.Arrays;

public class ExerciseArrayList{
   public static void main(String[] args){
      ArrayList<String> colors = new ArrayList<String>();
      
      //Part One
      colors.add("red");
      colors.add("blue");
      colors.add("yellow");
      colors.add("green");
      System.out.println(colors);
      
      colors.remove("blue");
      System.out.println(colors);
      
      System.out.println("Index of green: " + colors.indexOf("green"));
      System.out.println("The list " + 
         (colors.contains("red") ? "does" : "does not") + " contain red.");
      
      System.out.println("Index 0: " + colors.get(0));
      System.out.println("Size: " + colors.size());
      
      //for each loop?
      for (String c : colors){
      System.out.print(c + " ");
      }
      
      //Part Two
      String[] colors2 = {"red", "yellow", "blue"};
      System.out.println("colors2: " + Arrays.toString(colors2));
      
      colors.set(0, "pink");
      System.out.println(colors);
      
      colors2[0] = "pink";
      System.out.println(Arrays.toString(colors2));
      
      System.out.println("Last element of colors: " + colors.get(colors.size()-1));
      System.out.println("Last element of colors2: " + colors2[colors2.length-1]);
      
      System.out.println("colors: " + colors);
      System.out.println("colors2: " + Arrays.toString(colors2));
      
      colors.set(colors.size()-1, colors2[0]);
      colors2[colors2.length-1] = colors.get(0);
      
      System.out.println("colors 2: " + Arrays.toString(colors2));
      System.out.println("colors: " + colors);
   }
}