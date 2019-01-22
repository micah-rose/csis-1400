/**************************
* Author: Micah L
* Date: 01/23/2017
* Assignment: Ski Tickets
***************************/


import java.util.Scanner;

public class SkiTickets {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
   
      System.out.print("Number of adult tickets: ");
      int atix = input.nextInt();
      System.out.print("Number of youth tickets: ");
      int ytix = input.nextInt();
      input.nextLine();
      System.out.print("Name: ");
      String name = input.nextLine();
      System.out.println();
      System.out.println();
      
      double acost = (atix * 93);
      double ycost = (ytix * 47);
      double total = acost + ycost;
      String currency = "$";
      
      System.out.printf("Invoice for %s:%n", name);
      System.out.println();
      System.out.printf("Adult tickets %-2d .. %4s %4.2f%n", atix, currency, acost);
      System.out.printf("Youth tickets %-2d .. %4s %4.2f%n", ytix, currency, ycost);
      System.out.println("-------------------------------");
      System.out.printf("%24s %.2f%n", currency, total);
      System.out.println("\t\t\t\t\t\t\t  ========");
   }
}