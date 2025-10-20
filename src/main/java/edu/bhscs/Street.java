package edu.bhscs;

public class Street {
  // fields and properties // parts or essence of the street
  String name;
  Street crossStreet;

  House houseNE;
  House houseSE;
  House houseSW;
  House houseNW;

  // counstructor // makes the street
  public Street() {
    System.out.println("...plowing the dirt....");

    System.out.println("...now I have a street....");
  }

  public Street(String name) {
    this.name = name;

    System.out.println("I just put the name " + name + " on the sign");
  }

  // methods // skills or abilities of the street
  void intersect(Street other) {

    if (this.crossStreet == null) {
      this.crossStreet = other;
    } else return;

    other.intersect(this);
    System.out.println("Let's put a stop sign here!");
    System.out.println("and a street sign for " + other.name);
  }

  House develop(String corner) {
    if (corner.equals("NE")) {

      this.houseNE = new House(corner);
      return this.houseNE;
    }
    if (corner.equals("SE")) {
      this.houseSE = new House(corner);
      return this.houseSE;
    }
    if (corner.equals("SW")) {
      this.houseSW = new House(corner);
      return this.houseSW;
    }
    if (corner.equals("SE")) {
      this.houseSE = new House(corner);
      return this.houseSE;
    }
    this.houseNW = new House(corner);
    return this.houseNW;
  }
}
