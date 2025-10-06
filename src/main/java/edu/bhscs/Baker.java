package edu.bhscs;

public class Baker {
  // PROPERTIES AND FIELDS
  Player p;
  Flour f;
  int cash;

  // CONSTRUCTOR
  Baker(Player p){
    this.p = p;
  }

  void takeOrder(int price, Customer c){
    cash += c.pay(price);
    c.takeCake(bakeCake());
  }

  // method
  Cake bakeCake(){
    String answer = this.p.giveAnswer("what cake do you you want?");
    return new Cake( answer, this.f );
  }

}
