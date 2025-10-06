package edu.bhscs;

public class Cake {
  // Properties of fields... WHAT IN THE CAKE
  String ingredient;
  String otherIngredient;
  Flour flour;
  int weight;

  // I have to make a constructor
  public Cake(String ingredient, Flour flour) {
    System.out.println("backing the cake with... " + ingredient);
    this.flour = flour;
    this.weight = 10;
  }

  // to be eaten
  public void eaten() {
    this.weight = this.weight - 2;
  }

  // to be weighed
  public int getWeight() {
    return this.weight;
  }
}
