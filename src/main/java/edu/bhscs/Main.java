package edu.bhscs;

public class Main {
  public static void main(String[] args) {

    Baker bob = new Baker("Bob");
    Table t = new Table(3, 50);
    Cake bDay = bob.bakes(15, "Suzzie");
    bDay.draw(t);

    // GOAL OF THE PROGRAM:
    // Fix the errors until you have drawn
    // the cake that Bob backed for Suzzie's birthday
    // on a 3 legged table in the dark.

    /*
     *     \\\\\\\\\\///////////
     *     //////////\\\\\\\\\\\
     *    ///////////\\\\\\\\\\\\
     *   ////////////\\\\\\\\\\\\\
     *   =========================
     * =============================
     * #@#@#@#@#@#@#@#@#@#@#@#@#@#@#
     * @#@#@#@#@#@#@#@#@#@#@#@#@#@#@
     * =============================
     *  ||  ||  ||  ||  ||  ||  ||
     *  ||  ||  ||  ||  ||  ||  ||
     *
     */
  }

  public static void date25() {
    Player user = new Player("Usario P. Player");

    String name = user.giveAnswer("What is your name?");
    String age = user.giveAnswer("How old are you?");

    // new Cake().draw(name, age);
  }
}
