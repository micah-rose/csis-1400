/*****************
* Author: Micah L
*
******************/
public class AnimalApp {
      // Create a cat and make it stalk
      Cat myCat = new Cat();
      myCat.stalk();
      myCat.catchMouse();
      myCat.catchMouse();
      System.out.printf("mouse count: %s%n", myCat.getMouseCount());
      myCat.catchMouse(3);
      System.out.printf("mouse count: %s%n", myCat.getMouseCount(3));
}