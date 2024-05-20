package com.design_pattern;

public class Main {
  public static void main(String[] args) {
    Player player = new Player(10, 10, "Good");
    player.displayInfo();
    Caretaker caretaker = new Caretaker();
    caretaker.saveMemento(player.createMarker());
    System.out.println();

    player.setLevel(5);
    player.setScore(100);
    caretaker.saveMemento(player.createMarker());
    player.displayInfo();

    System.out.println();
    player.restoreLevel(caretaker.getMemento());
    player.displayInfo();
  }
}
