package com.design_pattern;

import java.util.Stack;

public class Caretaker {
  private Stack<Player.Memento> history;

  public Caretaker() {
    this.history = new Stack<Player.Memento>();
  }

  public Player.Memento getMemento() {
    if (this.history.size() > 1)
      this.history.pop();
    return this.history.lastElement();
  }

  public void saveMemento(Player.Memento memento) {
    this.history.push(memento);
  }
}
