package edu.bhscs;

public class Flour {
  // Fields props
  int price;
  int lbs;
  int quality;

  // Constructor
  public Flour(int price, int lbs) {
    System.out.println("Yum, flower...");
    this.price = price;
    this.lbs = lbs;
    this.quality = 5;
    
  }

  // method
  public void goesBad() {
    this.quality = 0;
  }
}
