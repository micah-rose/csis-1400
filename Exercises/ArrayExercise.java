/*********************************
* Author: Micah L
*
* Practie arrays and class Arrays
**********************************/

import java.util.Arrays;

public class ArrayExercise{
   public static void main(String[] args){
   
   char[] letters = {'l','i', 's', 't', 'e', 'n'};
   System.out.println(letters); //only works with char arrays
   
   System.out.println(Arrays.toString(letters));
   
   char[] firstThreeLetters = Arrays.copyOf(letters, 3);
   System.out.println(Arrays.toString(firstThreeLetters));
   
   Arrays.sort(letters);
   System.out.println(Arrays.toString(letters));
   
   int index = Arrays.binarySearch(letters, 'n');
   System.out.printf("%c .. %d%n", 'n', Arrays.binarySearch(letters, 'n'));

   }
}