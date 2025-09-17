// Student name
// class period
// project name
// date

/*
 * DESCRIPTION:
 * INPUT:
 * OUTPUT:
 * EDGE CASE:
 */

package edu.bhscs;

public class Main{

  public static final float NAME_OF_THIS_FLOAT = 69.42f;
  public static final char A = 'a';

  public static void main(String[] args){

    String myString = pushup("Garlic");
    System.out.println(myString);

    Awesome steve = new Awesome("Steve");
    Awesome sue   = new Awesome("Sue");
    Awesome linda = new Awesome("L");
    Awesome jhon  = new Awesome("With a JH, dumb-ass!");

    System.out.println( steve.getName() );

  }

  public static String pushup(String food){
    return "sweat " + food;
  }


}