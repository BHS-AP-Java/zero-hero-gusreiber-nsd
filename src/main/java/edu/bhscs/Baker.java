// Name
// P2
// Name of projects
// 10/9/2025

/** */
package edu.bhscs;

public class Baker {
  // PROPERTIES AND FIELDS
  String name;
  Player p;
  Flour f;
  Store placeOfWork;
  int skill;
  int cash;

  // CONSTRUCTOR
  Baker(String name) {
    this.name = name;
  }

  Baker(Player p) {
    this.p = p;
  }

  // methods
  void takeOrder(int price, Customer c) {
    cash += c.pay(price);
    c.takeCake(bakeCake());
  }

  public void learn(int amount) {
    this.skill += amount;
  }

  Cake bakeCake() {
    String answer = this.p.giveAnswer("what cake do you you want?");
    this.skill++;
    return new Cake(answer, this.f, this.skill);
  }

  void takeJob(Store bakery) {
    String doYouWantToWorkHere = this.p.giveAnswer("Do you want to work at " + bakery.getName());
    if (doYouWantToWorkHere.equals("y")) {
      this.placeOfWork = bakery;
      System.out.println(this.name + " now works at " + bakery.getName());
    }
  }
}
