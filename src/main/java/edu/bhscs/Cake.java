package edu.bhscs;

public class Cake {
  // Properties of fields... WHAT IN THE CAKE
  String ingredient;
  String otherIngredient;
  String frosting;
  Flour flour;
  int weight;
  int price;

  // I have to make a constructor
  public Cake(int weight, String ingredient) {
    this.weight = weight;
    this.ingredient = ingredient;
  }

  public Cake(String ingredient, Flour flour, int weight) {
    this.ingredient = ingredient;
    this.flour = flour;
    this.weight = weight;
  }

  public Cake(String ingredient, Flour flour) {
    System.out.println("backing the cake with... " + ingredient);
    this.flour = flour;
    this.weight = 10;
  }

  // METHODS
  void draw(String icing, int x, int y) {

    for (int count = 0; count < y; count++) {

      for (int i = 0; i < x; i++) {
        System.out.print(icing);
        System.out.print("  " + icing);
      }

      for (int i = 0; i < x; i++) {
        System.out.print("  " + icing);
        System.out.print(icing);
      }

      System.out.println("more cake " + (count * count));
    }
    System.out.println();

    System.out.println("----------!--!---!----!----------");

    System.out.println("I am drawing a cake");
  }

  public void draw(int x, int y, int z, int slope, String name) {

    int transAxis = Math.min(z, y);
    int maxWidth = x + transAxis + 2;

    // --- Top cap ---
    drawTopBorder(maxWidth, slope, transAxis + 1);

    // --- Sloped face ---
    for (int a = 0; a < transAxis; a++) {
      int leftSpace = (transAxis - a) * slope;
      int rightWidth = maxWidth - leftSpace - a;

      printChars(' ', leftSpace - 1, ' ', ' ');
      printChars('^', rightWidth - 1, '/', '/');
      printChars('/', maxWidth - leftSpace - rightWidth - 1, '/', '|');
      System.out.println();
    }

    // --- Mid cap ---
    drawMidBorder(x, transAxis);

    // --- Side walls ---
    for (int a = 0; a < z; a++) {
      printChars(name, x, '|', '|');
      printChars('/', Math.min(z - a, y) - 1, '/', '/');
      System.out.println();
    }

    // --- Bottom cap ---
    drawBottomBorder(x);
  }

  private static void printChars(char c, int count, char start, char end) {
    printChars("" + c, count, start, end);
  }

  // Helper to print a repeated character
  private static void printChars(String c, int count, char start, char end) {
    System.out.print(start);
    for (int i = 0; i < count; i++) System.out.print(c);
    System.out.print(end);
  }

  // Draw top horizontal section
  private static void drawTopBorder(int maxWidth, int slope, int transAxis) {
    printChars(' ', transAxis * slope, ' ', '|');
    printChars('=', maxWidth - transAxis * slope - 1, '=', '|');
    System.out.println();
  }

  // Draw middle (flat) divider
  private static void drawMidBorder(int x, int transAxis) {
    printChars('=', x, '|', '|');
    printChars('/', transAxis + 1, '/', '|');
    System.out.println();
  }

  // Draw bottom border
  private static void drawBottomBorder(int x) {
    printChars('=', x, '|', '|');
    System.out.println("/");
  }

  void setFrosting(String icing) {
    this.frosting = icing;
  }

  // to be eaten
  public void eaten() {
    this.weight = this.weight - 2;
  }

  // to be weighed
  public int getWeight() {
    return this.weight;
  }

  public void draw(String name, String age) {

    draw(17, 7, 7, 3, name);
  }

  public void draw(int surface) {}

  public void draw(Table t) {
    this.draw();
    t.draw();
  }
}
