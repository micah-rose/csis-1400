/******************************
* Author: Micah L
*
* Pogil Exercise: Ragged Array
*******************************/

public class RaggedArray{
   public static void main(String[] args){
      char[][] ragged = new char[3][];
      ragged[0] = new char[5];
      ragged[1] = new char[9];
      ragged[2] = new char[12];
      int letter = 65;
      //ragged[0][0] = (char)letter;
      //letter++;
      
      for(int i = 0; i < ragged.length; i++){
         for(int j = 0; j < ragged[i].length; j++){
            ragged[i][j] = (char)letter;
            System.out.print(ragged[i][j] + " ");
            letter++;
         }
         System.out.println();
      }
   }
}