package edu.bhscs;

import java.util.Scanner;

public class Player {
  // Properties or fields
  String name;
  Scanner s;

  public Player(String name) {
    this.name = name;
    this.s = new Scanner(System.in);
  }

  public void answerQuestions() {
    System.out.println("What's your question?");
    String question = this.s.next();
    System.out.println(question + " is a dumb question!");
  }

  public String giveAnswer( String question ){
    System.out.println(question);
    return s.nextLine();
  };


}
