// Student name
// P2
// Zero Hero
// 9/19/2025

/*
 * DESCRIPTION:
 * The goal of my bakesale is:
 *   for a baker to make a cake,
 *   bake it at a bakery
 *   sell it to a custome
 *   and deliver the money to the PTA
 *
 * INPUT:
 * OUTPUT:
 * EDGE CASE:
 */

package edu.bhscs;

public class Main {

  public static void main(String[] args) {

    String myString = pushup("Garlic");
    System.out.println(myString);

    Awesome steve = new Awesome("Steve");
    String theGoodStuff = "choclate";

    Cake TheOneBestCake = new Cake(theGoodStuff);
    TheOneBestCake.eaten();
  }

  public static String pushup(String food) {
    return "sweat " + food;
  }
}
