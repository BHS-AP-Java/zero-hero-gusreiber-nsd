package edu.bhscs;

public class Awesome {
  //fields / properties This is the stuff that Awesome HAS!!!!
  String name;


  // We need to CONSTRUCT something AWESOME!!!!!
  public Awesome(String name){
    System.out.println("I am the most Awesome " + name);
    this.name = name;
  }

  // METHODS ARE ABILITIES OF THE CLASS/TYPE
  String getName(){
    return this.name;
  }

}



