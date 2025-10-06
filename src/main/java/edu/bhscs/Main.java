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

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Player steve = new Player("stever");
    Baker BakerSteve = new Baker(steve);
    BakerSteve.bakeCake();

    System.out.println("I don'tknow, but I'm done now!!!!");


  }
}
