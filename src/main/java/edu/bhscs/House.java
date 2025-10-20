package edu.bhscs;

public class House {
  // Proprs
  String corner;

  // const
  public House() {
    System.out.println("digging a foundation....");

    System.out.println(" Framming the house");
  }

  public House(String location) {
    this.corner = location;
    System.out.println("building the house on a corner:" + location);
  }

  // methods
}
