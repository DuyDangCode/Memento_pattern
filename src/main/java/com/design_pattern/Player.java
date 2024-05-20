package com.design_pattern;

public class Player {
  private int level;
  private int score;
  private String health;
  private int lifeline;

  public Player(int level, int score, String health) {
    this.level = level;
    this.score = score;
    this.health = health;
    this.lifeline = 3;
  }

  public Memento createMarker() {
    return new Memento(this.level, this.score, this.health);
  }

  public void setLevel(int level) {
    this.level = level;
  }

  public void setScore(int score) {
    this.score = score;
  }

  public void setHealth(String health) {
    this.health = health;
  }

  public void restoreLevel(Memento memento) {
    this.level = memento.getLevel();
    this.score = memento.getScore();
    this.health = memento.getHealth();
    this.lifeline -= 1;
  }

  public void displayInfo() {
    System.out.println("level: " + this.level);
    System.out.println("score: " + this.score);
    System.out.println("health: " + this.health);
    System.out.println("lifeline: " + this.lifeline);
  }

  public static class Memento {
    private final int level;
    private final int score;
    private final String health;

    public Memento(int level, int score, String health) {
      this.level = level;
      this.score = score;
      this.health = health;
    }

    public int getLevel() {
      return this.level;
    }

    public int getScore() {
      return this.score;
    }

    public String getHealth() {
      return this.health;
    }
  }
}
